package com.orellano.biblia360.entity;

import java.util.ArrayList;
import java.util.List;

public class Versiculo {
    private Capitulo capitulo_vscl;
    private Integer codVersiculo_vscl;
    private String encabezado_vscl;
    private String contenido_vscl;
    private Boolean parrafo_vscl;
    private List<Referencia> referencias_vscl;

    public Versiculo() {
        this.referencias_vscl = new ArrayList<>();
    }

    public Versiculo(Capitulo capitulo_vscl, Integer codVersiculo_vscl, String encabezado_vscl, String contenido_vscl, Boolean parrafo_vscl, List<Referencia> referencias_vscl) {
        this.capitulo_vscl = capitulo_vscl;
        this.codVersiculo_vscl = codVersiculo_vscl;
        this.encabezado_vscl = encabezado_vscl;
        this.contenido_vscl = contenido_vscl;
        this.parrafo_vscl = parrafo_vscl;
        this.referencias_vscl = referencias_vscl;
    }

    public Capitulo getCapitulo() {
        return capitulo_vscl;
    }

    public void setCapitulo(Capitulo capitulo_vscl) {
        this.capitulo_vscl = capitulo_vscl;
    }

    public Integer getCodigo() {
        return codVersiculo_vscl;
    }

    public void setCodigo(Integer codVersiculo_vscl) {
        this.codVersiculo_vscl = codVersiculo_vscl;
    }

    public String getEncabezado() {
        return encabezado_vscl;
    }

    public void setEncabezado(String encabezado_vscl) {
        this.encabezado_vscl = encabezado_vscl;
    }

    public String getContenido() {
        return contenido_vscl;
    }

    public void setContenido(String contenido_vscl) {
        this.contenido_vscl = contenido_vscl;
    }

    public Boolean getParrafo() {
        return parrafo_vscl;
    }

    public void setParrafo(Boolean parrafo_vscl) {
        this.parrafo_vscl = parrafo_vscl;
    }

    public List<Referencia> getReferencias() {
        return referencias_vscl;
    }

    public void setReferencias(List<Referencia> referencias_vscl) {
        this.referencias_vscl = referencias_vscl;
    }

    @Override
    public String toString() {
        String mensaje = "Versiculo [codVersiculo_vscl=" + codVersiculo_vscl +
                ", encabezado=" + encabezado_vscl +
                ", contenido=" + contenido_vscl +
                ", parrafo=" + parrafo_vscl +
                ", libro={" + (capitulo_vscl != null ? capitulo_vscl.getLibro().getCodigo() : "null") +
                ", capitulo={" + (capitulo_vscl != null ? capitulo_vscl.getCodigo() : "null");

        String auxReferencias = "}, referencias: {";
        if (referencias_vscl != null) {
            for (Referencia ref : referencias_vscl) {
                auxReferencias += "[" + ref.getCodigo() + " " +
                        (ref.getTipo() != null ? ref.getTipo().getNombre() : "N/A") + "]";
            }
        }
        auxReferencias += "}";

        return mensaje + auxReferencias + "]";
    }
}
