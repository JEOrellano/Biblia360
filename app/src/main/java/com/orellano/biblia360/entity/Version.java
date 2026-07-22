package com.orellano.biblia360.entity;

import java.util.ArrayList;
import java.util.List;

public class Version {
    private Lengua lengua_vs;
    private String codVersion_vs;
    private String nombre_vs;
    private List<Libro> libros_vs;
    private List<Lectura> lecturas_vs;

    public Version() {
        this.libros_vs = new ArrayList<>();
        this.lecturas_vs = new ArrayList<>();
    }

    public Version(Lengua lengua_vs, String codVersion_vs, String nombre_vs, List<Libro> libros_vs, List<Lectura> lecturas_vs) {
        this.lengua_vs = lengua_vs;
        this.codVersion_vs = codVersion_vs;
        this.nombre_vs = nombre_vs;
        this.libros_vs = libros_vs;
        this.lecturas_vs = lecturas_vs;
    }

    public Lengua getLengua() {
        return lengua_vs;
    }

    public void setLengua(Lengua lengua_vs) {
        this.lengua_vs = lengua_vs;
    }

    public String getCodigo() {
        return codVersion_vs;
    }

    public void setCodigo(String codVersion_vs) {
        this.codVersion_vs = codVersion_vs;
    }

    public String getNombre() {
        return nombre_vs;
    }

    public void setNombre(String nombre_vs) {
        this.nombre_vs = nombre_vs;
    }

    public List<Libro> getLibros() {
        return libros_vs;
    }

    public void setLibros(List<Libro> libros_vs) {
        this.libros_vs = libros_vs;
    }

    public List<Lectura> getLecturas() {
        return lecturas_vs;
    }

    public void setLecturas(List<Lectura> lecturas_vs) {
        this.lecturas_vs = lecturas_vs;
    }

    @Override
    public String toString() {
        String mensaje = "Version [lengua={" + (lengua_vs != null ? lengua_vs.getCodigo() : "null") + "}, codVersion_vs=" + codVersion_vs +", nombre_vs=" + nombre_vs;

        String auxLibros = ", Libros: {";
        if (libros_vs != null) {
            for (Libro libro : libros_vs) {
                auxLibros += "[" + libro.getCodigo() + ", " + libro.getNombre() + "]";
            }
        }
        auxLibros += "}";

        String auxLecturas = ", Lecturas: {";
        if (lecturas_vs != null) {
            for (Lectura lectura : lecturas_vs) {
                auxLecturas += "[" + lectura.getCodigo() + ", " + lectura.getTitulo() + "]";
            }
        }
        auxLecturas += "}";

        return mensaje + auxLibros + auxLecturas + "]";
    }
}
