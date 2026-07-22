package com.orellano.biblia360.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.orellano.biblia360.R;
import com.orellano.biblia360.entity.Versiculo;
import com.orellano.biblia360.entity.Referencia;

import java.util.ArrayList;
import java.util.List;

public class VersiculoAdapter extends RecyclerView.Adapter<VersiculoAdapter.ViewHolder> {

  private List<Versiculo> listaVersiculos;
  private Context context;
  private int positionResaltada = -1;

  public VersiculoAdapter(List<Versiculo> listaVersiculos, Context context) {
    this.listaVersiculos = listaVersiculos;
    this.context = context;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_versiculo, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Versiculo v = listaVersiculos.get(position);

    // --- LÓGICA DE PÁRRAFO ---
    // Ajustamos el margen superior del contenedor del cuerpo dependiendo de si es inicio de párrafo o tiene encabezado
    ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) holder.clVerseBodyContainer.getLayoutParams();
    if (v.getParrafo() || (v.getEncabezado() != null && !v.getEncabezado().isEmpty())) {
      params.topMargin = dpToPx(24); // Espacio para nuevo párrafo o bajo encabezado
    } else {
      params.topMargin = dpToPx(4);  // Espacio reducido si es continuación de párrafo
    }
    holder.clVerseBodyContainer.setLayoutParams(params);

    // --- ENCABEZADOS Y PARALELAS ---
    if (v.getEncabezado() != null && !v.getEncabezado().isEmpty()) {
      holder.tvVerseHeader.setVisibility(View.VISIBLE);
      holder.tvVerseHeader.setText(v.getEncabezado());

      // Lógica para Referencias Paralelas (Si existen en tu modelo)
      // Aquí un ejemplo buscando si alguna referencia es de tipo "Paralela"
      String paralela = obtenerReferenciaParalela(v);
      if (paralela != null) {
        holder.tvParallelRef.setVisibility(View.VISIBLE);
        holder.tvParallelRef.setText(paralela);
      } else {
        holder.tvParallelRef.setVisibility(View.GONE);
      }
    } else {
      holder.tvVerseHeader.setVisibility(View.GONE);
      holder.tvParallelRef.setVisibility(View.GONE);
    }

    // --- CUERPO ---
    holder.tvVerseNumber.setText(String.valueOf(v.getCodigo())); // Asumiendo que es String o requiere conversión
    holder.tvVerseBody.setText(v.getContenido());

    // --- ICONO REFERENCIA CRUZADA ---
    boolean tieneCruzadas = v.getReferencias() != null && v.getReferencias().stream()
        .anyMatch(ref -> "Cruzada".equalsIgnoreCase(ref.getTipo().getNombre()));

    if (tieneCruzadas) {
      holder.ivCrossRefIcon.setVisibility(View.VISIBLE);
      holder.ivCrossRefIcon.setOnClickListener(view -> abrirBottomSheetReferencias(v));
    } else {
      holder.ivCrossRefIcon.setVisibility(View.GONE);
    }

    // Ejemplo rápido de lógica dentro del onBindViewHolder del adaptador:
    if (position == positionResaltada) {
      holder.itemView.setBackgroundColor(Color.parseColor("#FFF9C4")); // Amarillo suave
    } else {
      holder.itemView.setBackgroundColor(Color.TRANSPARENT);
    }
  }

  @Override
  public int getItemCount() {
    return listaVersiculos.size();
  }

  private String obtenerReferenciaParalela(Versiculo v) {
    if (v.getReferencias() == null) return null;

    List<String> fragmentosParalelos = new ArrayList<>();
    for (Referencia ref : v.getReferencias()) {
      // Asumiendo que tienes un ID o nombre para diferenciar Cruzadas de Paralelas
      if ("Paralela".equalsIgnoreCase(ref.getTipo().getNombre())) {
        fragmentosParalelos.add(formatearRango(ref.getVersos()));
      }
    }
    if (fragmentosParalelos.isEmpty()) return null;

    return "(" + String.join(";", fragmentosParalelos) + ")";
  }

  private String formatearRango(List<Versiculo> versos) {
    if (versos == null || versos.isEmpty()) return "";

    Versiculo vFirst = versos.get(0);
    Versiculo vLast = versos.get(versos.size() - 1);

    String libroInicio = vFirst.getCapitulo().getLibro().getCodigo();
    int capInicio = vFirst.getCapitulo().getCodigo();
    int verInicio = vFirst.getCodigo();

    String libroFin = vLast.getCapitulo().getLibro().getCodigo();
    int capFin = vLast.getCapitulo().getCodigo();
    int verFin = vLast.getCodigo();

    StringBuilder sb = new StringBuilder();
    sb.append(libroInicio).append(" ").append(capInicio).append(":").append(verInicio);

    if (versos.size() > 1) {
      sb.append("-");
      if (!libroInicio.equals(libroFin)) {
        sb.append(libroFin).append(" ").append(capFin).append(":").append(verFin);
      } else if (capInicio != capFin) {
        sb.append(capFin).append(":").append(verFin);
      } else {
        sb.append(verFin);
      }
    }
    return sb.toString();
  }

  private void abrirBottomSheetReferencias(Versiculo v) {
    BottomSheetDialog dialog = new BottomSheetDialog(context);
    View view = LayoutInflater.from(context).inflate(R.layout.layout_popup_referencias, null);

    RecyclerView rv = view.findViewById(R.id.rv_popup_references);
    TextView tvTitle = view.findViewById(R.id.tv_title_popup);

    String citaOrigen = v.getCapitulo().getLibro().getCodigo() + " " + v.getCapitulo().getCodigo() + ":" + v.getCodigo();
    tvTitle.setText(String.format("%s %s ", context.getString(R.string.referencias_de_VsclAdapter), citaOrigen));

    // Obtenemos todos los versículos de todas las referencias cruzadas de este verso
    List<Versiculo> todosLosVersosDestino = new ArrayList<>();
    for (Referencia ref : v.getReferencias()) {
      if("Cruzada".equalsIgnoreCase(ref.getTipo().getNombre())){
        todosLosVersosDestino.addAll(ref.getVersos());
      }
    }

    rv.setLayoutManager(new LinearLayoutManager(context));
    rv.setAdapter(new ReferenciaDetalleAdapter(todosLosVersosDestino));

    dialog.setContentView(view);
    dialog.show();
  }

  // Utilidad para convertir DP a Pixeles para los márgenes dinámicos
  private int dpToPx(int dp) {
    float density = context.getResources().getDisplayMetrics().density;
    return Math.round((float) dp * density);
  }

  public void resaltarVersiculo(int pos) {
    int posicionAnterior = this.positionResaltada;
    this.positionResaltada = pos;

    // Solo notificamos los cambios en las posiciones afectadas
    if (posicionAnterior != -1) {
      notifyItemChanged(posicionAnterior);
    }
    if (this.positionResaltada != -1) {
      notifyItemChanged(this.positionResaltada);
    }
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView tvVerseHeader, tvParallelRef, tvVerseNumber, tvVerseBody;
    ImageView ivCrossRefIcon;
    ConstraintLayout clVerseBodyContainer;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      tvVerseHeader = itemView.findViewById(R.id.tv_verse_header);
      tvParallelRef = itemView.findViewById(R.id.tv_parallel_ref);
      tvVerseNumber = itemView.findViewById(R.id.tv_verse_number);
      tvVerseBody = itemView.findViewById(R.id.tv_verse_body);
      ivCrossRefIcon = itemView.findViewById(R.id.iv_cross_ref_icon);
      clVerseBodyContainer = itemView.findViewById(R.id.cl_verse_body_container);
    }
  }
}