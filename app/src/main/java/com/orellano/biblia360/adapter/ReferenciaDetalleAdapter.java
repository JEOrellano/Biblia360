package com.orellano.biblia360.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.orellano.biblia360.R;
import com.orellano.biblia360.entity.Versiculo;

import java.util.List;

public class ReferenciaDetalleAdapter extends RecyclerView.Adapter<ReferenciaDetalleAdapter.ViewHolder> {
  private List<Versiculo> versos;

  public ReferenciaDetalleAdapter(List<Versiculo> versos) {
    this.versos = versos;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_referencia_detalle, parent, false);
    return new ViewHolder(v);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Versiculo v = versos.get(position);
    // Armamos la cita: Libro + Cap + Verso
    String cita = v.getCapitulo().getLibro().getCodigo() + " " +
        v.getCapitulo().getCodigo() + ":" + v.getCodigo();

    holder.tvLabel.setText(cita);
    holder.tvText.setText(v.getContenido());
  }

  @Override public int getItemCount() { return versos.size(); }

  class ViewHolder extends RecyclerView.ViewHolder {
    TextView tvLabel, tvText;
    ViewHolder(View v) {
      super(v);
      tvLabel = v.findViewById(R.id.tv_ref_label);
      tvText = v.findViewById(R.id.tv_ref_text);
    }
  }
}