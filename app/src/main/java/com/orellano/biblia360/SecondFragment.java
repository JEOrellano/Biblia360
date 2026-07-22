package com.orellano.biblia360;

import android.media.AudioManager;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.orellano.biblia360.adapter.VersiculoAdapter;
import com.orellano.biblia360.daoSQLite.DaoHelperLectura;
import com.orellano.biblia360.daoSQLite.DaoHelperVersiculo;
import com.orellano.biblia360.databinding.FragmentSecondBinding;
import com.orellano.biblia360.entity.BibliaApp;
import com.orellano.biblia360.entity.Lectura;
import com.orellano.biblia360.entity.Versiculo;

import java.util.List;
import java.util.Locale;

public class SecondFragment extends Fragment implements TextToSpeech.OnInitListener{

    private FragmentSecondBinding binding;
    private VersiculoAdapter adapter;
    private int posicionActual = 0; // Rastreamos la posición actual del plan
    private TextToSpeech tts;
    private boolean estaReproduciendo = false;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Deshabilitar botón inicialmente para evitar toques en frío
        binding.btnAudioPlay.setEnabled(false);
        binding.btnAudioPlay.setAlpha(0.5f);

        // Inicializar el narrador
        tts = new TextToSpeech(getContext(), this);
        // 1. Obtener posición inicial desde los argumentos
        if (getArguments() != null) {
            posicionActual = getArguments().getInt("posicion_lectura", 0);
        }
        binding.btnAudioPlay.setOnClickListener(v -> hablarLectura());

        // 2. Configurar el RecyclerView (solo una vez)
        binding.rvReadingContent.setLayoutManager(new LinearLayoutManager(getContext()));

        // --- AQUÍ VA LA LÓGICA DEL SCROLL ---
        binding.rvReadingContent.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                // Si el usuario scrollea hacia abajo (dy > 0)
                if (dy <= 0) return;

                LinearLayoutManager layoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    int totalItems = layoutManager.getItemCount();
                    int lastVisibleItem = layoutManager.findLastVisibleItemPosition();

                    // Si llegó al final de la lista, marcamos como leída
                    if (lastVisibleItem >= totalItems - 1) {
                        marcarLecturaComoLeida();
                    }
                }
            }
        });
        // ------------------------------------

        // 3. Cargar la lectura inicial
        cargarLectura(posicionActual);

        // 4. Configurar listeners de los botones de navegación
        setupNavigationButtons();
    }

    private void asegurarVersosCargados(Lectura lectura) {
        if (!BibliaApp.isFullyLoaded && getContext() != null &&
            (lectura.getVersos() == null || lectura.getVersos().isEmpty())) {
            List<Versiculo> versos = DaoHelperVersiculo.obtenerTodosLectura(getContext(), lectura);
            lectura.setVersos(versos);
        }
    }

    private void cargarLectura(int posicion) {
        if (BibliaApp.versionCargada != null && posicion >= 0 &&
            posicion < BibliaApp.versionCargada.getLecturas().size()) {

            this.posicionActual = posicion;

            // --- NUEVA LÓGICA DE SINCRONIZACIÓN ---
            // Guardamos la posición actual en el estado de la pantalla anterior
            if (NavHostFragment.findNavController(this).getPreviousBackStackEntry() != null) {
                NavHostFragment.findNavController(this)
                    .getPreviousBackStackEntry()
                    .getSavedStateHandle()
                    .set("posicion_retorno", posicion);
            }
            // --------------------------------------

            Lectura lecturaActual = BibliaApp.versionCargada.getLecturas().get(posicion);
            asegurarVersosCargados(lecturaActual);

            // Actualizar textos de cabecera
            binding.tvTitleReadingDay.setText("Día " + lecturaActual.getCodigo() + " " + lecturaActual.getTitulo());

            // Actualizar el rango del pasaje (Gn 1:1...)
            actualizarListaVersiculos(lecturaActual.getVersos());

            // Refrescar el Adaptador con los nuevos versículos
            adapter = new VersiculoAdapter(lecturaActual.getVersos(), getContext());
            binding.rvReadingContent.setAdapter(adapter);

            // Scroll al inicio para que no quede en la posición del día anterior
            binding.rvReadingContent.scrollToPosition(0);

            // Actualizar estado de los botones (Habilitar/Deshabilitar)
            updateButtonStates();
        }
    }

    private void setupNavigationButtons() {
        // Botón Día Anterior
        binding.ibPreviousDaySecond.setOnClickListener(v -> {
            if (posicionActual > 0) {
                cargarLectura(posicionActual - 1);
            }
        });

        // Botón Día Siguiente
        binding.ibNextDaySecond.setOnClickListener(v -> {
            if (posicionActual < BibliaApp.versionCargada.getLecturas().size() - 1) {
                cargarLectura(posicionActual + 1);
            }
        });
    }

    private void updateButtonStates() {
        if (BibliaApp.versionCargada == null) return;

        int totalLecturas = BibliaApp.versionCargada.getLecturas().size();

        // Lógica para Deshabilitar/Habilitar visualmente
        // Día 1 (posicion 0): Deshabilitar anterior
        if (posicionActual == 0) {
            binding.ibPreviousDaySecond.setEnabled(false);
            binding.ibPreviousDaySecond.setAlpha(0.3f); // Se ve gris opaco
        } else {
            binding.ibPreviousDaySecond.setEnabled(true);
            binding.ibPreviousDaySecond.setAlpha(1.0f);
        }

        // Último día: Deshabilitar siguiente
        if (posicionActual == totalLecturas - 1) {
            binding.ibNextDaySecond.setEnabled(false);
            binding.ibNextDaySecond.setAlpha(0.3f);
        } else {
            binding.ibNextDaySecond.setEnabled(true);
            binding.ibNextDaySecond.setAlpha(1.0f);
        }
    }

    private void actualizarListaVersiculos(List<Versiculo> versos) {
        if (versos == null || versos.isEmpty()) {
            binding.tvPasajeReadingDay.setText("");
            binding.tvReadingNavLabel.setText("");
            return;
        }

        // 1. Obtener primer y último versículo de forma compatible (get(index))
        Versiculo vFirst = versos.get(0);
        Versiculo vLast = versos.get(versos.size() - 1);

        // 2. Extraer datos para comparar
        String libroInicio = vFirst.getCapitulo().getLibro().getCodigo();
        int capInicio = vFirst.getCapitulo().getCodigo();
        int verInicio = vFirst.getCodigo();

        String libroFin = vLast.getCapitulo().getLibro().getCodigo();
        int capFin = vLast.getCapitulo().getCodigo();
        int verFin = vLast.getCodigo();

        // 3. Construir el String del rango
        StringBuilder sb = new StringBuilder();

        // Siempre empezamos con: "Libro Capitulo:Versiculo"
        sb.append(libroInicio).append(" ").append(capInicio).append(":").append(verInicio);

        // Si hay más de un versículo, añadimos el final del rango
        if (versos.size() > 1) {
            sb.append("-");

            // Caso A: El rango termina en un LIBRO diferente
            if (!libroInicio.equals(libroFin)) {
                sb.append(libroFin).append(" ").append(capFin).append(":").append(verFin);
            }
            // Caso B: Mismo libro, pero diferente CAPÍTULO
            else if (capInicio != capFin) {
                sb.append(capFin).append(":").append(verFin);
            }
            // Caso C: Mismo libro, mismo capítulo, solo cambia el VERSÍCULO
            else {
                sb.append(verFin);
            }
        }

        binding.tvPasajeReadingDay.setText(sb);
        binding.tvReadingNavLabel.setText(sb);
    }

    private void hablarLectura() {
        if (tts == null && BibliaApp.versionCargada == null) return;

        if (estaReproduciendo) {
            pararAudio();
            return;
        }

        Lectura lecturaActual = BibliaApp.versionCargada.getLecturas().get(posicionActual);
        asegurarVersosCargados(lecturaActual);
        List<Versiculo> listaVersos = lecturaActual.getVersos();

        // VALIDACIÓN CRÍTICA: ¿Hay texto?
        if (listaVersos == null || listaVersos.isEmpty()) return;

        // Configurar el listener ANTES de hablar
        configurarListenerFinalizacion();
        estaReproduciendo = true;
        binding.btnAudioPlay.setImageResource(R.drawable.ic_outline_autostop_24);

        // Parámetros de audio (Para asegurar que el sistema lo trate como multimedia)
        Bundle params = new Bundle();
        params.putInt(TextToSpeech.Engine.KEY_PARAM_STREAM, AudioManager.STREAM_MUSIC);

        // --- ESTRATEGIA DE DIVISIÓN ---
        // 1. Decimos el título primero (Limpiando la cola anterior)
        String encabezado = "Lectura del día " + lecturaActual.getTitulo();
        tts.speak(encabezado, TextToSpeech.QUEUE_FLUSH, params, "ID_HEADER");

        // 2. Añadimos cada versículo a la cola uno tras otro
        for (int i = 0; i < listaVersos.size(); i++) {
            String contenido = listaVersos.get(i).getContenido();
            if (contenido != null && !contenido.trim().isEmpty()) {
                // Usamos QUEUE_ADD para que se encolen sin borrarse
                // El ID de última pieza servirá para el listener onDone
                // Usamos un ID que NO sea el final
                // IMPORTANTE: El ID debe ser exacto "VERSO_X" para que onStart lo capture
                tts.speak(contenido, TextToSpeech.QUEUE_ADD, params, "VERSO_" + i);
            }
        }
        // 3. El ANCLA final: Solo este dispara el cambio de icono
        tts.playSilentUtterance(300, TextToSpeech.QUEUE_ADD, "ID_LECTURA");
    }

    private void pararAudio() {
        if (tts != null) {
            tts.stop();
        }
        estaReproduciendo = false;
        binding.btnAudioPlay.setImageResource(R.drawable.ic_outline_autoplay_24);

        // Limpiamos el resaltado inmediatamente
        if (adapter != null) {
            adapter.resaltarVersiculo(-1);
        }
    }

    private void configurarListenerFinalizacion() {
        tts.setOnUtteranceProgressListener(new android.speech.tts.UtteranceProgressListener() {
            @Override
            public void onStart(String utteranceId) {
                // Si el ID empieza con "VERSO_", es que empezó un versículo
                if (utteranceId.startsWith("VERSO_")) {
                    try {
                        int index = Integer.parseInt(utteranceId.replace("VERSO_", ""));

                        if (getActivity() != null) {
                            getActivity().runOnUiThread(() -> {
                                // 1. Scroll automático
                                binding.rvReadingContent.smoothScrollToPosition(index);

                                // 2. Resaltado visual en el Adapter
                                if (adapter != null) {
                                    adapter.resaltarVersiculo(index);
                                }
                            });
                        }
                    } catch (Exception e) {
                        Log.e("TTS_DEBUG", "Error al parsear ID: " + utteranceId);
                    }
                }
            }

            @Override
            public void onDone(String utteranceId) {
                // CRÍTICO: Solo volvemos al icono Play si el ID es el del final
                if (utteranceId.equals("ID_LECTURA")) {
                    if (getActivity() != null) {
                        getActivity().runOnUiThread(() -> {
                            estaReproduciendo = false;
                            binding.btnAudioPlay.setImageResource(R.drawable.ic_outline_autoplay_24);
                            // Opcional: Limpiar resaltado al terminar
                            if (adapter != null) {
                                adapter.resaltarVersiculo(-1);
                            }
                            // --- NUEVA LÓGICA DE COMPLETADO ---
                            marcarLecturaComoLeida();
                        });
                    }
                }
            }

            @Override
            public void onError(String utteranceId) {
                Log.e("TTS_ERROR", "Error en fragmento: " + utteranceId);
            }
        });
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            // Samsung es caprichoso con Locale("es", "ES"), prueba con Locale("es") si falla
            /// BibliaApp.versionCargada.getLengua().getCodigo() {spa : Español} URL con idimas ISO https://omegat.sourceforge.io/manual-latest/es/appendix.languages.html
            Locale loc;
            if (BibliaApp.versionCargada != null && BibliaApp.versionCargada.getLengua() != null) {
                loc = new Locale(BibliaApp.versionCargada.getLengua().getCodigo());
            } else {
                loc = new Locale("es"); // Fallback a español genérico
            }
            int result = tts.setLanguage(loc);

            if (result != TextToSpeech.LANG_MISSING_DATA && result != TextToSpeech.LANG_NOT_SUPPORTED) {
                if (binding != null) {
                    binding.btnAudioPlay.setEnabled(true);
                    binding.btnAudioPlay.setAlpha(1.0f);
                }
            }
        }
    }

    private void marcarLecturaComoLeida() {
        if (BibliaApp.versionCargada == null) return;

        Lectura lecturaActual = BibliaApp.versionCargada.getLecturas().get(posicionActual);

        // Evitamos duplicar el guardado si ya está marcado
        if (!lecturaActual.getCompletado()) {
            lecturaActual.setCompletado(true);

            // Actualización en Base de Datos SQLite (Directo)
            DaoHelperLectura.actualizarEstadoLectura(requireContext(), lecturaActual, true);

            // Feedback al usuario
            Snackbar.make(binding.getRoot(),
                    "¡Día " + lecturaActual.getTitulo() + " completado!",
                    Snackbar.LENGTH_SHORT)
                .setAnchorView(binding.btnAudioPlay)
                .show();

            Log.d("BIBLIA_LOG", "Estado guardado en DB para día: " + lecturaActual.getCodigo());
        }
    }

    @Override
    public void onPause() {
        if (tts != null && tts.isSpeaking()) {
            tts.stop();
        }
        super.onPause();
    }

    @Override
    public void onDestroyView() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroyView();
        binding = null;
    }

}