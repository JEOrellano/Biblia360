package com.orellano.biblia360;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;

import com.google.android.material.snackbar.Snackbar;
import com.orellano.biblia360.adapter.DaysAdapter;
import com.orellano.biblia360.daoSQLite.DaoHelperLectura;
import com.orellano.biblia360.daoSQLite.DaoHelperVersion;
import com.orellano.biblia360.daoSQLite.DaoHelperVersiculo;
import com.orellano.biblia360.databinding.FragmentFirstBinding;
import com.orellano.biblia360.entity.BibliaApp;
import com.orellano.biblia360.entity.Lectura;
import com.orellano.biblia360.entity.Versiculo;
import com.orellano.biblia360.entity.Version;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.FullscreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private YouTubePlayer activeYouTubePlayer; // Para controlar el cambio de video
    private float tiempoActualVideo = 0f;
    private boolean isFullscreenManual = false;
    private int posicionSeleccionada = 0;
    // Variable para rastrear el estado real (puedes inicializarla con el valor de la DB)
    private boolean isReadingChecked = false;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // --- RECUPERAR POSICIÓN GUARDADA SI EXISTE ---
        if (savedInstanceState != null) {
            this.posicionSeleccionada = savedInstanceState.getInt("posicion_guardada");
        }

        // Verificamos que el binding no sea nulo por seguridad
        if (binding == null) return;

        Version versionSeleccionada = BibliaApp.versionCargada;

        // 1. Configurar Reproductor YouTube
        YouTubePlayerView youTubePlayerView = binding.wvYtFirst;
        getLifecycle().addObserver(youTubePlayerView);

        // Añade esto para habilitar el botón en la UI del reproductor
        youTubePlayerView.addFullscreenListener(new FullscreenListener() {
            @Override
            public void onEnterFullscreen(@NonNull View fullscreenView, @NonNull Function0<Unit> exitFullscreen) {
                isFullscreenManual = true; // Marcamos que es manual

                // NO ocultes el binding.getRoot() aquí,
                // solo añade el fullscreenView para que tape lo demás.
                ViewGroup root = (ViewGroup) requireActivity().findViewById(android.R.id.content);
                fullscreenView.setVisibility(View.VISIBLE);
                root.addView(fullscreenView);

                // Forzar landscape para el modo cine
                requireActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

                // Pantalla completa inmersiva
                requireActivity().getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
            }

            @Override
            public void onExitFullscreen() {
                isFullscreenManual = false; // Ya no es manual

                // Volver a la orientación del sensor para recuperar las 2 columnas si sigue de lado
                requireActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);

                ViewGroup root = (ViewGroup) requireActivity().findViewById(android.R.id.content);
                View fullscreenView = root.getChildAt(root.getChildCount() - 1);
                if (fullscreenView != null) {
                    root.removeView(fullscreenView);
                }

                requireActivity().getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_VISIBLE);
            }
        });

        // Dentro de onViewCreated, busca donde creas las opciones:
        if (getContext() == null) return; // Si no hay contexto, no iniciamos nada

        IFramePlayerOptions options = new IFramePlayerOptions.Builder(getContext())
            .controls(1)
            .autoplay(0)
            .fullscreen(1)
            .mute(0)
            .build();

        // Usamos el listener para cargar el video cuando esté listo
        youTubePlayerView.initialize(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                // IMPORTANTE: Verificar que el fragmento siga vivo
                if (!isAdded() || binding == null) return;

                activeYouTubePlayer = youTubePlayer; // AQUÍ deja de ser nulo
                Log.d("YOUTUBE", "Player listo, cargando video inicial...");

                if (versionSeleccionada != null) {
                    Lectura lecturaActual = versionSeleccionada.getLecturas().get(posicionSeleccionada);
                    String videoId = lecturaActual.getIframe();

                    float startSeconds = (savedInstanceState != null) ? savedInstanceState.getFloat("tiempo_video", 0f) : 0f;
                    activeYouTubePlayer.cueVideo(videoId, startSeconds);

                    if (tieneInternet()) {
                        if (videoId != null) {
                            activeYouTubePlayer.cueVideo(videoId, startSeconds);
                        }
                    } else {
                        // MOSTRAR SOLO SI NO HAY RED
                        Toast.makeText(getContext(), "Sin conexión: Video no disponible", Toast.LENGTH_SHORT).show();
                    }
                }

                // Añadimos un listener para rastrear el tiempo constantemente
                youTubePlayer.addListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onCurrentSecond(@NonNull YouTubePlayer youTubePlayer, float second) {
                        tiempoActualVideo = second;
                    }
                });
            }
        }, options);

        // 2. Configurar Carrusel de Días
        if (versionSeleccionada != null && !versionSeleccionada.getLecturas().isEmpty()) {
            List<Lectura> listaLecturas = versionSeleccionada.getLecturas();

            // --- NUEVA LÓGICA: Determinar posición de arranque ---
            // SOLO calculamos la posición inicial si NO venimos de una restauración (savedInstanceState == null)
            if (savedInstanceState == null) {
                this.posicionSeleccionada = calcularPosicionInicial(listaLecturas);
            }
            // ----------------------------------------------------

            DaysAdapter daysAdapter = new DaysAdapter(listaLecturas, (lectura, position) -> {
                seleccionarLectura(lectura, position); // Refactoricé esto a un método aparte
            });

            // IMPORTANTE: Decirle al adaptador qué posición nace seleccionada
            daysAdapter.setSelectedPosition(posicionSeleccionada);
            binding.rvDaysCarousel.setAdapter(daysAdapter);

            // Mover el carrusel a la posición inicial calculada
            binding.rvDaysCarousel.post(() ->
                binding.rvDaysCarousel.scrollToPosition(posicionSeleccionada));

            // --- LÓGICA DE CARGA INICIAL INTELIGENTE ---
            // Solo llamamos a seleccionarLectura (que refresca el video) si NO es una rotación.
            if (savedInstanceState == null) {
                seleccionarLectura(listaLecturas.get(posicionSeleccionada), posicionSeleccionada);
            } else {
                // Si venimos de rotar, cargamos textos y estado pero NO tocamos el video
                // para que el onReady use startSeconds y no se resetee.
                Lectura lecturaActual = listaLecturas.get(posicionSeleccionada);
                asegurarVersosCargados(lecturaActual);

                binding.tvDayFirst.setText(String.format("%d %s", lecturaActual.getCodigo(), lecturaActual.getTitulo()));
                actualizarListaVersiculos(lecturaActual.getVersos());

                isReadingChecked = lecturaActual.getCompletado();
                binding.rbDayFirst.setChecked(isReadingChecked);

                refrescarProgresoGeneral();
            }
        }

        // 3. Magia para que se sienta como un carrusel (Snapping)
        // En onViewCreated, antes de configurar el adaptador:
        if (binding.rvDaysCarousel.getOnFlingListener() == null) {
            LinearSnapHelper snapHelper = new LinearSnapHelper();
            snapHelper.attachToRecyclerView(binding.rvDaysCarousel);
        }

        // Lógica del RadioButton (Marcar como leído)
        configurarClickRadioButton();

        // Unificar navegación (Botón "Siguiente" y Flecha)
        View.OnClickListener navigateNext = v ->{
            if (BibliaApp.versionCargada == null) return;

            // Obtenemos la lectura actual para cualquier validación extra si fuera necesaria
            Lectura lecturaActual = BibliaApp.versionCargada.getLecturas().get(posicionSeleccionada);

            Bundle bundle = new Bundle();
            // Pasamos la posición. El SecondFragment usará:
            // BibliaApp.versionCargada.getLecturas().get(posicion_lectura)
            // De ahí ya tiene acceso a lectura.getCodigo() y lectura.getVersion().getCodigo()
            bundle.putInt("posicion_lectura", posicionSeleccionada);
            NavHostFragment.findNavController(FirstFragment.this)
                .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        };
        binding.btnFirst.setOnClickListener(navigateNext);
        binding.ibDayFirst.setOnClickListener(navigateNext);

        // --- LÓGICA DE ESCUCHA DE RETORNO ---
        NavHostFragment.findNavController(this)
            .getCurrentBackStackEntry()
            .getSavedStateHandle()
            .getLiveData("posicion_retorno")
            .observe(getViewLifecycleOwner(), posicion -> {
                int p = (int) posicion;
                this.posicionSeleccionada = p;

                // 1. Sincronizar el Adaptador del carrusel
                if (binding.rvDaysCarousel.getAdapter() != null) {
                    ((DaysAdapter) binding.rvDaysCarousel.getAdapter()).setSelectedPosition(p);
                }

                // 2. Mover el carrusel visualmente a esa posición
                binding.rvDaysCarousel.scrollToPosition(p);

                // 3. Actualizar la UI del FirstFragment con la nueva lectura
                Lectura lecturaRegreso = BibliaApp.versionCargada.getLecturas().get(p);
                seleccionarLectura(lecturaRegreso, p);
            });

        refrescarProgresoGeneral();
    }

    // Carga versos bajo demanda si el cache global aún no está completo
    private void asegurarVersosCargados(Lectura lectura) {
        if (!BibliaApp.isFullyLoaded && getContext() != null &&
            (lectura.getVersos() == null || lectura.getVersos().isEmpty())) {
            List<Versiculo> versos = DaoHelperVersiculo.obtenerTodosLectura(getContext(), lectura);
            lectura.setVersos(versos);
        }
    }

    // Método auxiliar para mantener el código limpio
    // Método auxiliar para no repetir código de actualización de UI
    private void seleccionarLectura(Lectura lectura, int position) {
        // 1. Verificación de nulidad absoluta
        if (binding == null || lectura == null || !isAdded()) return;

        // Si el cache global no está completo, cargar versos bajo demanda
        asegurarVersosCargados(lectura);

        this.posicionSeleccionada = position;
        binding.tvDayFirst.setText(String.format("%d %s", lectura.getCodigo(), lectura.getTitulo()));

        // 2. Manejo de red
        if (activeYouTubePlayer != null) {
            if (tieneInternet()) {
                actualizarReproductor(lectura.getIframe());
            } else {
                activeYouTubePlayer.pause();
                // Opcional: mostrar un placeholder o imagen si no hay internet
                // Usamos requireContext() para asegurar que el Toast tenga donde anclarse
                if (getContext() != null) {
                    Toast.makeText(requireContext(), "Sin conexión: Video no disponible", Toast.LENGTH_SHORT).show();
                }
            }
        } else if (!tieneInternet()) {
            if (getContext() != null) {
                Toast.makeText(getContext(), "Sin conexión: Video no disponible", Toast.LENGTH_SHORT).show();
            }
        }

        actualizarListaVersiculos(lectura.getVersos());
        // 3. Estado del RadioButton (Sincronizado con el objeto Lectura)
        isReadingChecked = lectura.getCompletado();
        binding.rbDayFirst.setChecked(isReadingChecked);
        refrescarProgresoGeneral();
    }

    private void configurarClickRadioButton() {
        binding.rbDayFirst.setOnClickListener(v -> {
            if (BibliaApp.versionCargada == null) return;

            Lectura lecturaActual = BibliaApp.versionCargada.getLecturas().get(posicionSeleccionada);

            // 1. Invertir estado lógicamente
            isReadingChecked = !isReadingChecked;
            binding.rbDayFirst.setChecked(isReadingChecked);

            // 2. Sincronizar objeto y DB
            lecturaActual.setCompletado(isReadingChecked);
            DaoHelperLectura.actualizarEstadoLectura(getContext(), lecturaActual, isReadingChecked);

            // 3. ¡IMPORTANTE! Refrescar el progreso general de la Biblia
            refrescarProgresoGeneral();

            // 4. Actualizar visualmente el carrusel si es necesario
            if (binding.rvDaysCarousel.getAdapter() != null) {
                binding.rvDaysCarousel.getAdapter().notifyItemChanged(posicionSeleccionada);
            }
        });
    }
    private int calcularPosicionInicial(List<Lectura> lecturas) {
        LocalDate hoy = LocalDate.now();
        int primeraPendiente = -1;
        int posicionPorFecha = -1;

        for (int i = 0; i < lecturas.size(); i++) {
            Lectura l = lecturas.get(i);

            // 1. Encontrar la primera pendiente (completado_ltr == false)
            if (primeraPendiente == -1 && !l.getCompletado()) {
                primeraPendiente = i;
            }

            // 2. Encontrar si hay una lectura que coincida con la fecha de hoy
            if (l.getFecha() != null && l.getFecha().isEqual(hoy)) {
                posicionPorFecha = i;
            }
        }

        // Lógica de decisión:
        // A. Si hay una lectura para HOY, esa tiene prioridad.
        if (posicionPorFecha != -1) return posicionPorFecha;

        // B. Si no hay para hoy (o la fecha ya pasó), vamos a la primera pendiente.
        if (primeraPendiente != -1) return primeraPendiente;

        // C. Si todo está completado o no hay fechas válidas, empezar desde el día 1.
        return 0;
    }

    private void actualizarReproductor(String videoId) {
        if (activeYouTubePlayer != null && videoId != null) {
            // "cueVideo" lo carga sin reproducir automáticamente, "loadVideo" empieza el play
            activeYouTubePlayer.cueVideo(videoId, 0f);
        }else {
            Log.w("YOUTUBE", "El reproductor aún no está listo o el videoId es nulo");
        }
    }
    private void actualizarListaVersiculos(List<Versiculo> versos) {
        if (versos == null || versos.isEmpty()) {
            binding.tvReadingFirst.setText("");
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

        binding.tvReadingFirst.setText(sb);
    }
    private void refrescarProgresoGeneral() {
        Version v = BibliaApp.versionCargada;
        if (v == null || getContext() == null || binding == null) return;

        // Obtenemos cuántas de las 365 lecturas están marcadas como 1
        int completados = DaoHelperLectura.obtenerConteoCompletados(getContext(), v);
        int total = v.getLecturas().size(); // Debería ser 365

        float relacion = (completados / (float) total) * 100;

        // Opción A: Redondeo normal para el indicador (0, 1, 2...)
        int porcentajeEntero = Math.round(relacion);

        // Opción B: Si quieres que SIEMPRE muestre al menos 1% si hay algo hecho
        if (completados > 0 && porcentajeEntero == 0) {
            porcentajeEntero = 1;
        }

        binding.cpReadingProgress.setProgress(porcentajeEntero, true);

        // Mostrar 1 decimal en el texto para que el usuario vea el cambio real
        // Ejemplo: "0.3%", "1.5%"
        binding.tvProgressPercent.setText(String.format("%.1f%%", relacion));
    }

    private boolean tieneInternet() {
        try {
            if (getContext() == null) return false;

            android.net.ConnectivityManager cm = (android.net.ConnectivityManager)
                getContext().getSystemService(android.content.Context.CONNECTIVITY_SERVICE);

            if (cm == null) return false;

            android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
            return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
        } catch (Exception e) {
            // Si hay cualquier error al consultar la red, asumimos que no hay
            return false;
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        // Guardamos la posición que el usuario tiene seleccionada actualmente
        outState.putInt("posicion_guardada", posicionSeleccionada);

        // Si el reproductor existe, intentamos obtener el segundo actual
        if (activeYouTubePlayer != null) {
            // Nota: La librería suele manejar el estado interno,
            // pero guardarlo aquí asegura que tengamos el dato fresco.
            outState.putFloat("tiempo_video", tiempoActualVideo);
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (binding == null) return;

        if (isInPictureInPictureMode) {
            // OCULTAR absolutamente todo excepto el video
            binding.rvDaysCarousel.setVisibility(View.GONE);
            binding.tvDayFirst.setVisibility(View.GONE);
            binding.lyTxtDayFirst.setVisibility(View.GONE);
            binding.flowProgresiveFirst.setVisibility(View.GONE);
            binding.btnFirst.setVisibility(View.GONE);

            // Ajustar el margen/padding del contenedor si es necesario para que sea solo video
            binding.mcWvYtFirst.setCardElevation(0);
        } else {
            // Restaurar visibilidad
            binding.rvDaysCarousel.setVisibility(View.VISIBLE);
            binding.tvDayFirst.setVisibility(View.VISIBLE);
            binding.lyTxtDayFirst.setVisibility(View.VISIBLE);
            binding.flowProgresiveFirst.setVisibility(View.VISIBLE);
            binding.btnFirst.setVisibility(View.VISIBLE);
            binding.mcWvYtFirst.setCardElevation(4);
        }
    }

    @Override
    public void onDestroyView() {
        // Liberar el player antes de que el binding sea nulo
        if (binding != null) {
            binding.wvYtFirst.release();
        }
        super.onDestroyView();
        binding = null;
    }

}