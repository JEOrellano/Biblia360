package com.orellano.biblia360.entity;

import java.util.ArrayList;
import java.util.List;

public class Lengua {
    private String codLengua_lg;
    private String nombre_lg;
    private List<Version> versiones_lg;

    public Lengua() {
        this.versiones_lg = new ArrayList<>();
    }

    public Lengua(String codLengua_lg, String nombre_lg, List<Version> versiones_lg) {
        this.codLengua_lg = codLengua_lg;
        this.nombre_lg = nombre_lg;
        this.versiones_lg = versiones_lg;
    }

    public String getCodigo() {
        return codLengua_lg;
    }

    public void setCodigo(String codLengua_lg) {
        this.codLengua_lg = codLengua_lg;
    }

    public String getNombre() {
        return nombre_lg;
    }

    public void setNombre(String nombre_lg) {
        this.nombre_lg = nombre_lg;
    }

    public List<Version> getVersiones() {
        return versiones_lg;
    }

    public void setVersiones(List<Version> versiones_lg) {
        this.versiones_lg = versiones_lg;
    }

    @Override
    public String toString() {
        String mensaje = "Lengua [codLengua_lg=" + codLengua_lg + ", nombre_lg=" + nombre_lg + ", versiones=";
        String auxMensaje = "{";
        if (versiones_lg != null) {
            for (Version version : versiones_lg) {
                auxMensaje += "[" + version.getCodigo() + ", " + version.getNombre() + "]";
            }
        }
        auxMensaje += "}";

        return mensaje + auxMensaje + "]";
    }
}
