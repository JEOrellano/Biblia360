package com.orellano.biblia360.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.orellano.biblia360.R;
import com.orellano.biblia360.entity.Lectura;
import com.orellano.biblia360.utility.Constant;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class DaysAdapter extends RecyclerView.Adapter<DaysAdapter.DayViewHolder> {

    private List<Lectura> lecturas;
    private int selectedPosition = 0; // Por defecto el primer día
    private final OnDayClickListener listener;

    // Definimos la interfaz para el click
    public interface OnDayClickListener {
        void onDayClick(Lectura lectura, int position);
    }

    public DaysAdapter(List<Lectura> lecturas, OnDayClickListener listener) {
        this.lecturas = lecturas;
        this.listener = listener;
    }

    // Agrega este método público
    public void setSelectedPosition(int position) {
        int previous = this.selectedPosition;
        this.selectedPosition = position;
        notifyItemChanged(previous);
        notifyItemChanged(selectedPosition);
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_day_selectable, parent, false);
        return new DayViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {
        Lectura lectura = lecturas.get(position);

        // Seteamos el número de día (codLectura_ltr)
        holder.tvDayNumber.setText(String.valueOf(lectura.getCodigo()));

        // Seteamos la fecha formateada (fecha_ltr)
        if (lectura.getFecha() != null) {
            holder.tvDayDate.setText(lectura.getFecha().format(DateTimeFormatter.ofPattern(Constant.FORMAT_DATE_MD)));
        } else {
            holder.tvDayDate.setText("-");
        }

        // Lógica visual de selección (Background y Colores)
        boolean isSelected = (position == selectedPosition);
        holder.tvDayNumber.setSelected(isSelected);

        // Cambiamos el color del texto según la selección
        int colorText = isSelected ?
                holder.itemView.getContext().getColor(android.R.color.white) :
                holder.itemView.getContext().getColor(R.color.black);

        holder.tvDayNumber.setTextColor(colorText);

        // Evento Click
        holder.itemView.setOnClickListener(v -> {
            int previousPosition = selectedPosition;
            selectedPosition = holder.getAdapterPosition();

            // Refrescar los items para que cambie el fondo/color
            notifyItemChanged(previousPosition);
            notifyItemChanged(selectedPosition);

            // Notificar al Fragment
            if (listener != null) {
                listener.onDayClick(lectura, selectedPosition);
            }
        });
    }

    @Override
    public int getItemCount() {
        return lecturas != null ? lecturas.size() : 0;
    }

    static class DayViewHolder extends RecyclerView.ViewHolder {
        TextView tvDayNumber, tvDayDate;

        public DayViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDayNumber = itemView.findViewById(R.id.tv_day_number);
            tvDayDate = itemView.findViewById(R.id.tv_day_date);
        }
    }
}
