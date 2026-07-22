package com.orellano.biblia360.entity;

import java.util.ArrayList;
import java.util.List;

public class Referencia {
    private Versiculo versiculo_rfrc;
    private TipoReferencia tipo_rfrc;
    private Integer codReferencia_rfrc;
    private List<Versiculo> versos_rfrc;

    public Referencia() {
        this.versos_rfrc = new ArrayList<>();
    }

    public Referencia(Versiculo versiculo_rfrc, TipoReferencia tipo_rfrc, Integer codReferencia_rfrc, List<Versiculo> versos_rfrc) {
        this.versiculo_rfrc = versiculo_rfrc;
        this.tipo_rfrc = tipo_rfrc;
        this.codReferencia_rfrc = codReferencia_rfrc;
        this.versos_rfrc = versos_rfrc;
    }

    public Versiculo getVersiculo() {
        return versiculo_rfrc;
    }

    public void setVersiculo(Versiculo versiculo_rfrc) {
        this.versiculo_rfrc = versiculo_rfrc;
    }

    public TipoReferencia getTipo() {
        return tipo_rfrc;
    }

    public void setTipo(TipoReferencia tipo_rfrc) {
        this.tipo_rfrc = tipo_rfrc;
    }

    public Integer getCodigo() {
        return codReferencia_rfrc;
    }

    public void setCodigo(Integer codReferencia_rfrc) {
        this.codReferencia_rfrc = codReferencia_rfrc;
    }

    public List<Versiculo> getVersos() {
        return versos_rfrc;
    }

    public void setVersos(List<Versiculo> versos_rfrc) {
        this.versos_rfrc = versos_rfrc;
    }

    @Override
    public String toString() {
        String mensaje = "Referencia [codReferencia_rfrc=" + codReferencia_rfrc +
                ", tipo={" + (tipo_rfrc != null ? tipo_rfrc.getNombre() : "null") +
                "}, origen={" + (versiculo_rfrc != null ? versiculo_rfrc.getCodigo() : "null");

        // 2. Procesamiento de la lista de Versículos Destino (auxMensaje)
        String auxVersos = "}, destinos: {";
        if (versos_rfrc != null) {
            for (Versiculo v : versos_rfrc) {
                // Mostramos el código del versículo destino
                auxVersos += "[" + v.getCodigo() + "]";
            }
        }
        auxVersos += "}";

        // 3. Cierre del bloque principal
        return mensaje + auxVersos + "]";
    }
}
