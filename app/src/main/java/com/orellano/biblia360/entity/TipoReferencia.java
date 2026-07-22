package com.orellano.biblia360.entity;

public class TipoReferencia {
    private Integer codTipoReferencia_tprfrc;
    private String nombre_tprfrc;

    public TipoReferencia() {
    }

    public TipoReferencia(Integer codTipoReferencia_tprfrc, String nombre_tprfrc) {
        this.codTipoReferencia_tprfrc = codTipoReferencia_tprfrc;
        this.nombre_tprfrc = nombre_tprfrc;
    }

    public Integer getCodigo() {
        return codTipoReferencia_tprfrc;
    }

    public void setCodigo(Integer codTipoReferencia_tprfrc) {
        this.codTipoReferencia_tprfrc = codTipoReferencia_tprfrc;
    }

    public String getNombre() {
        return nombre_tprfrc;
    }

    public void setNombre(String nombre_tprfrc) {
        this.nombre_tprfrc = nombre_tprfrc;
    }

    @Override
    public String toString() {
        return "TipoReferencia [codTipoReferencia_tprfrc=" + codTipoReferencia_tprfrc +
                ", nombre_tprfrc=" + nombre_tprfrc + "]";
    }
}
