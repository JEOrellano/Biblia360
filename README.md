<div align="center">
  <h1>Biblia360</h1>
  <p><strong>Lee la Biblia en un año — con videos, narración y seguimiento de progreso</strong></p>
  <p>
    <img src="https://img.shields.io/badge/versión-1.1-blue.svg" alt="Versión">
    <img src="https://img.shields.io/badge/minSdk-24-brightgreen.svg" alt="minSdk">
    <img src="https://img.shields.io/badge/targetSdk-36-brightgreen.svg" alt="targetSdk">
    <img src="https://img.shields.io/badge/licencia-MIT-green.svg" alt="Licencia">
    <img src="https://img.shields.io/badge/estado-prueba_cerrada-yellow.svg" alt="Estado">
  </p>
</div>

---

## Descripción

Biblia360 es una aplicación Android nativa que guía al usuario a través de un plan de lectura de la **Biblia completa en 365 días**. Cada día incluye:

- El **pasaje bíblico** correspondiente (texto completo).
- Un **video devocional** integrado desde YouTube.
- **Narración por voz** (TTS) con resaltado automático de versículos.
- **Seguimiento de progreso** circular animado.

Actualmente disponible en **Google Play (prueba cerrada)** con la versión **Reina-Valera 1960 (RVR1960)** en español.

---

## Características

- **Plan 365** — Recorrido cronológico por toda la Biblia en un año.
- **Video por día** — Reproductor YouTube integrado con soporte **Picture-in-Picture**.
- **Narración TTS** — Escucha la lectura con resaltado de versículo en tiempo real.
- **Auto-marcado** — El día se marca como completado al llegar al final del texto o al terminar el audio.
- **Progreso visual** — Indicador circular con porcentaje de avance.
- **Carrusel de días** — Navegación horizontal rápida entre los 365 días.
- **Compartir por WhatsApp** — Botón flotante para compartir el versículo del día.
- **Arquitectura multi-idioma** — Preparado para soportar otros idiomas y versiones bíblicas.
- **Carga inteligente** — La app arranca en segundos con carga en dos fases (metadata ligera + datos completos en segundo plano).

---

## Stack Tecnológico

| Componente         | Tecnología                          |
|--------------------|--------------------------------------|
| Lenguaje           | Java                                 |
| SDK mínimo         | 24 (Android 7.0)                     |
| SDK objetivo       | 36 (Android 16)                      |
| Base de datos      | SQLite (local, embebida)             |
| Navegación         | Jetpack Navigation Component         |
| Binding            | ViewBinding                          |
| Video              | AndroidYouTubePlayer                 |
| Animaciones        | dotLottie (Lottie)                   |
| Narración          | Android TextToSpeech (TTS)           |
| UI                 | Material Design, ConstraintLayout    |

---

## Arquitectura

```
SplashActivity ──carga en 2 fases──► MainActivity
                                       ├── FirstFragment  (carrusel + video + progreso)
                                       └── SecondFragment (lectura + TTS)
```

- **SplashActivity**: Carga la versión bíblica en dos fases: (1) metadatos ligeros para arranque rápido, (2) datos completos en segundo plano.
- **MainActivity**: Host de navegación, Toolbar, FAB de WhatsApp y soporte PiP.
- **FirstFragment**: Carrusel horizontal de 365 días, reproductor YouTube, indicador de progreso circular, RadioButton para marcar día completado.
- **SecondFragment**: Vista de lectura completa con scroll, versículos numerados, narración TTS con resaltado, marcación automática al finalizar.

---

## Estructura del Proyecto

```
Biblia360/
├── app/
│   └── src/main/
│       ├── java/com/orellano/biblia360/
│       │   ├── entity/               # Modelos de datos
│       │   │   ├── BibliaApp.java     # Cache en memoria
│       │   │   ├── Lengua.java
│       │   │   ├── Version.java
│       │   │   ├── Lectura.java
│       │   │   ├── Libro.java
│       │   │   ├── Capitulo.java
│       │   │   ├── Versiculo.java
│       │   │   ├── TipoReferencia.java
│       │   │   └── Referencia.java
│       │   ├── daoSQLite/             # Capa de datos
│       │   │   ├── ConectSQLiteHelperDB.java
│       │   │   ├── DaoHelper*.java    # DAOs por entidad
│       │   │   └── sql/spa/           # Scripts de carga (1 por libro)
│       │   ├── adapter/               # Adaptadores RecyclerView
│       │   │   ├── DaysAdapter.java
│       │   │   ├── VersiculoAdapter.java
│       │   │   └── ReferenciaDetalleAdapter.java
│       │   ├── utility/               # Utilidades
│       │   │   ├── Constant.java
│       │   │   └── WhatsAppDialog.java
│       │   ├── SplashActivity.java
│       │   ├── MainActivity.java
│       │   ├── FirstFragment.java
│       │   └── SecondFragment.java
│       └── res/layout/                # Layouts XML (10 archivos)
├── docs/diagrams/                     # Diagramas del modelo de datos
│   ├── casos_de_uso.png
│   ├── clases.png
│   ├── logico.png
│   ├── der_chen.png
│   └── fisico.png
└── AGENTS.md                          # Documentación técnica detallada
```

---

## Modelo de Datos

El esquema SQLite contiene **8 tablas principales** que modelan toda la estructura bíblica:

```
Lengua (1) ──► Version (N) ──┬──► Lectura (N)  [plan 365]
                             └──► Libro (N) ──► Capitulo (N) ──► Versiculo (N)
                                                                   │
                                                                   └──► Referencia (N) ──► TipoReferencia (N)
```

Cada **Lectura** del plan de 365 días se vincula a un rango de versículos (campos `alfa`/`beta`). La relación **Versiculo ↔ Lectura** se resuelve mediante una FK opcional (`ON DELETE SET NULL`).

Las **Referencias** entre versículos (cruzadas, paralelas) se almacenan en una relación N:M pura a través de la tabla `VersiculoReferencia`.

Los diagramas del modelo de datos se encuentran en [`docs/diagrams/`](docs/diagrams/):
- [Casos de Uso](docs/diagrams/casos_de_uso.png)
- [Diagrama de Clases](docs/diagrams/clases.png)
- [Diagrama Lógico](docs/diagrams/logico.png)
- [DER (Chen)](docs/diagrams/der_chen.png)
- [Diagrama Físico](docs/diagrams/fisico.png)

---

## Requisitos

- Android Studio Hedgehog (2023.1.1) o superior
- JDK 11+
- Gradle 8.x

## Cómo Empezar

```bash
# Clonar el repositorio
git clone https://github.com/JEOrellano/Biblia360.git

# Abrir en Android Studio
cd Biblia360
studio .  # o abre la carpeta desde Android Studio

# Sincronizar Gradle y ejecutar
# (La base de datos SQLite con el texto bíblico completo se genera automáticamente en primera ejecución)
```

---

## Play Store

Biblia360 se encuentra actualmente en **prueba cerrada** en Google Play.

> Enlace a la prueba: _[https://play.google.com/apps/testing/com.orellano.biblia360]_

---

## Desarrollador

Desarrollado por **@jeorellano**.

---

## Licencia

```
MIT License

Copyright (c) 2026 jeorellano

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files...
```
