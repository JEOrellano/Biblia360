package com.orellano.biblia360.entity;

import java.util.List;

public class BibliaApp {
    // Cache en memoria de toda la estructura
    public static List<Lengua> lenguasCargadas;
    public static Lengua lenguaCargada;
    public static Version versionCargada;
    public static volatile boolean isFullyLoaded = false;
}
