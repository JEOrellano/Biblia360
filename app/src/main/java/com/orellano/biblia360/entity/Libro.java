package com.orellano.biblia360.entity;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private Version version_lb;
    private String codLibro_lb;
    private Integer numero_lb;
    private String nombre_lb;
    private List<Capitulo> capitulos_lb;

    public Libro() {
        this.capitulos_lb = new ArrayList<>();
    }

    public Libro(Version version_lb, String codLibro_lb, Integer numero_lb, String nombre_lb, List<Capitulo> capitulos_lb) {
        this.version_lb = version_lb;
        this.codLibro_lb = codLibro_lb;
        this.numero_lb = numero_lb;
        this.nombre_lb = nombre_lb;
        this.capitulos_lb = capitulos_lb;
    }

    public Version getVersion() {
        return version_lb;
    }

    public void setVersion(Version version_lb) {
        this.version_lb = version_lb;
    }

    public String getCodigo() {
        return codLibro_lb;
    }

    public void setCodigo(String codLibro_lb) {
        this.codLibro_lb = codLibro_lb;
    }

    public Integer getNumero() {
        return numero_lb;
    }

    public void setNumero(Integer numero_lb) {
        this.numero_lb = numero_lb;
    }

    public String getNombre() {
        return nombre_lb;
    }

    public void setNombre(String nombre_lb) {
        this.nombre_lb = nombre_lb;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos_lb;
    }

    public void setCapitulos(List<Capitulo> capitulos_lb) {
        this.capitulos_lb = capitulos_lb;
    }

    @Override
    public String toString() {
        String mensaje = "Libro [codLibro_lb=" + codLibro_lb +
                ", numero_lb=" + numero_lb +
                ", nombre_lb=" + nombre_lb +
                ", version={" + (version_lb != null ? version_lb.getCodigo() : "null");

        String auxCapitulos = "}, capitulos: {";
        if (capitulos_lb != null) {
            for (Capitulo capitulo : capitulos_lb) {
                auxCapitulos += "[" + capitulo.getCodigo() + "]";
            }
        }
        auxCapitulos += "}";

        return mensaje + auxCapitulos + "]";
    }
}
