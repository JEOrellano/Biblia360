package com.orellano.biblia360.entity;

import java.util.ArrayList;
import java.util.List;

public class Capitulo {
    private Libro libro_cptl;
    private Integer codCapitulo_cptl;
    private List<Versiculo> versiculos_cptl;

    public Capitulo() {
        this.versiculos_cptl = new ArrayList<>();
    }

    public Capitulo(Libro libro_cptl, Integer codCapitulo_cptl, List<Versiculo> versiculos_cptl) {
        this.libro_cptl = libro_cptl;
        this.codCapitulo_cptl = codCapitulo_cptl;
        this.versiculos_cptl = versiculos_cptl;
    }

    public Libro getLibro() {
        return libro_cptl;
    }

    public void setLibro(Libro libro_cptl) {
        this.libro_cptl = libro_cptl;
    }

    public Integer getCodigo() {
        return codCapitulo_cptl;
    }

    public void setCodigo(Integer codCapitulo_cptl) {
        this.codCapitulo_cptl = codCapitulo_cptl;
    }

    public List<Versiculo> getVersiculos() {
        return versiculos_cptl;
    }

    public void setVersiculos(List<Versiculo> versiculos_cptl) {
        this.versiculos_cptl = versiculos_cptl;
    }

    @Override
    public String toString() {
        String mensaje = "Capitulo [codCapitulo_cptl=" + codCapitulo_cptl +
                ", libro={" + (libro_cptl != null ? libro_cptl.getCodigo() : "null");

        String auxVersos = "}, versiculos: {";
        if (versiculos_cptl != null) {
            for (Versiculo versiculo : versiculos_cptl) {
                auxVersos += "[" + versiculo.getCodigo() + "]";
            }
        }
        auxVersos += "}";

        return mensaje + auxVersos + "]";
    }
}
