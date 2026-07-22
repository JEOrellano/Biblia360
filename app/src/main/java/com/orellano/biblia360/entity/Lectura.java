package com.orellano.biblia360.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lectura {
    private Version version_ltr;
    private Integer codLectura_ltr;
    private String titulo_ltr;
    private LocalDate fecha_ltr;
    private String iframe_ltr;
    private Boolean completado_ltr;
    private LocalDate fechaProgreso_ltr;
    private List<Versiculo> versos_ltr;

    public Lectura() {
        this.versos_ltr = new ArrayList<>();
    }

    public Lectura(Version version_ltr, Integer codLectura_ltr, String titulo_ltr, LocalDate fecha_ltr, String iframe_ltr, Boolean completado_ltr, LocalDate fechaProgreso_ltr, List<Versiculo> versos_ltr) {
        this.version_ltr = version_ltr;
        this.codLectura_ltr = codLectura_ltr;
        this.titulo_ltr = titulo_ltr;
        this.fecha_ltr = fecha_ltr;
        this.iframe_ltr = iframe_ltr;
        this.completado_ltr = completado_ltr;
        this.fechaProgreso_ltr = fechaProgreso_ltr;
        this.versos_ltr = versos_ltr;
    }

    public Version getVersion() {
        return version_ltr;
    }

    public void setVersion(Version version_ltr) {
        this.version_ltr = version_ltr;
    }

    public Integer getCodigo() {
        return codLectura_ltr;
    }

    public void setCodigo(Integer codLectura_ltr) {
        this.codLectura_ltr = codLectura_ltr;
    }

    public String getTitulo() {
        return titulo_ltr;
    }

    public void setTitulo(String titulo_ltr) {
        this.titulo_ltr = titulo_ltr;
    }

    public LocalDate getFecha() {
        return fecha_ltr;
    }

    public void setFecha(LocalDate fecha_ltr) {
        this.fecha_ltr = fecha_ltr;
    }

    public String getIframe() {
        return iframe_ltr;
    }

    public void setIframe(String iframe_ltr) {
        this.iframe_ltr = iframe_ltr;
    }

    public Boolean getCompletado() {
        return completado_ltr;
    }

    public void setCompletado(Boolean completado_ltr) {
        this.completado_ltr = completado_ltr;
    }

    public LocalDate getFechaProgreso() {
        return fechaProgreso_ltr;
    }

    public void setFechaProgreso(LocalDate fechaProgreso_ltr) {
        this.fechaProgreso_ltr = fechaProgreso_ltr;
    }

    public List<Versiculo> getVersos() {
        return versos_ltr;
    }

    public void setVersos(List<Versiculo> versos_ltr) {
        this.versos_ltr = versos_ltr;
    }

    @Override
    public String toString() {
        // 1. Parte inicial con datos básicos y la versión (solo su código para evitar recursividad)
        String mensaje = "Lectura [codLectura_ltr=" + codLectura_ltr +
                ", titulo_ltr=" + titulo_ltr +
                ", fecha_ltr=" + fecha_ltr +
                ", completado=" + completado_ltr +
                ", version={" + (version_ltr != null ? version_ltr.getCodigo() : "null");

        // 2. Procesamiento de la lista de Versículos
        String auxVersos = "}, Versiculos: {";
        if (versos_ltr != null) {
            for (Versiculo verso : versos_ltr) {
                // Mostramos un resumen del versículo (Libro, Capítulo:Versículo)
                // Asumiendo que Versiculo tiene acceso a su número y a su capítulo/libro
                auxVersos += "[" + verso.getCodigo() + "]";
            }
        }
        auxVersos += "}";

        // 3. Cierre del bloque principal
        return mensaje + auxVersos + "]";
    }
}
