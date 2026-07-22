# Contexto del Proyecto Biblia360

## Base de Datos
- El esquema de la base de datos se encuentra en `app/src/main/assets/database_biblia360.sql`.
- La base de datos sigue el plan de lectura de 365 días.
- Se utiliza SQLite con claves foráneas activas (`PRAGMA foreign_keys = ON`).
- La carga inicial de datos (población) se realiza mediante código Java para evitar desbordamientos en la ejecución de scripts SQL extensos.
- La asignación de versículos a cada lectura se realiza mediante un proceso de actualización post-carga que vincula los versículos (FK) basándose en los rangos definidos por los campos alfa y beta de la tabla Lectura.

## Documentación Técnica Visual (Diagramas SVG)

### Diagrama de Casos de Uso
![Casos de Uso Principales](docs/diagrams/casos_de_uso.png)

### Diagrama de Clases
![Arquitectura de Clases y Entidades](docs/diagrams/clases.png)

### Diagrama Lógico
![Diagrama Lógico](docs/diagrams/logico.png)

### Diagrama Conceptual Entidad-Relación Chen (DER Chen)
![DER Chen](docs/diagrams/der_chen.png)

### Diagrama Físico
![Diagrama Físico](docs/diagrams/fisico.png)

## Diagramas Mermaid (Código)

### Diagrama de Casos de Uso
```mermaid
graph LR
    User((User))
    
    %% Casos de Uso Principales
    User --> UC01(01 ActualizarFechaInicio)
    User --> UC02(02 ListarIdiomas)
    User --> UC03(03 ListarLecturas)
    User --> UC04(04 ListarCorto)
    User --> UC05(05 ListarProgreso)
    
    %% Relaciones de Idiomas y Versiones
    UC06(06 SeleccionarIdioma) -.-> |extend| UC02
    UC07(07 ListarVersiones) -.-> |extend| UC02
    UC10(10 SeleccionarVersion) -.-> |extend| UC07
    
    %% Relaciones de Lecturas
    UC03 -.-> |include| UC07
    UC08(08 ListarLecturaDetalle) -.-> |extend| UC03
    UC11(11 MarcarDiaCompletado) -.-> |extend| UC08
    
    %% Relaciones de Corto
    UC09(09 SeleccionarCorto) -.-> |extend| UC04
    
    style User fill:#f9f,stroke:#333,stroke-width:2px
```

### Diagrama de Clases (Arquitectura de Entidades)
```mermaid
classDiagram
    class Lengua {
        -String codLengua_lg
        -String nombre_lg
        -List~Version~ versiones_lg
        +Lengua() Void
        +getCodigo() String
        +setCodigo(String) Void
        +getNombre() String
        +setNombre(String) Void
        +getVersiones() List~Version~
        +setVersiones(List~Version~) Void
        +toString() String
    }
    class Version {
        -Lengua lengua_vs
        -String codVersion_vs
        -String nombre_vs
        -List~Libro~ libros_vs
        -List~Lectura~ lecturas_vs
        +Version() Void
        +getLengua() Lengua
        +setLengua(Lengua) Void
        +getCodigo() String
        +setCodigo(String) Void
        +getNombre() String
        +setNombre(String) Void
        +getLibros() List~Libro~
        +setLibros(List~Libro~) Void
        +getLecturas() List~Lectura~
        +setLecturas(List~Lectura~) Void
        +toString() String
    }
    class Libro {
        -Version version_lb
        -String codLibro_lb
        -Integer numero_lb
        -String nombre_lb
        -List~Capitulo~ capitulos_lb
        +Libro() Void
        +getVersion() Version
        +setVersion(Version) Void
        +getCodigo() String
        +setCodigo(String) Void
        +getNumero() Integer
        +setNumero(Integer) Void
        +getNombre() String
        +setNombre(String) Void
        +getCapitulos() List~Capitulo~
        +setCapitulos(List~Capitulo~) Void
        +toString() String
    }
    class Capitulo {
        -Libro libro_cptl
        -Integer codCapitulo_cptl
        -List~Versiculo~ versiculos_cptl
        +Capitulo() Void
        +getLibro() Libro
        +setLibro(Libro) Void
        +getCodigo() Integer
        +setCodigo(Integer) Void
        +getVersiculos() List~Versiculo~
        +setVersiculos(List~Versiculo~) Void
        +toString() String
    }
    class Versiculo {
        -Capitulo capitulo_vscl
        -Integer codVersiculo_vscl
        -String encabezado_vscl
        -String contenido_vscl
        -Boolean parrafo_vscl
        -List~Referencia~ referencias_vscl
        +Versiculo() Void
        +getCapitulo() Capitulo
        +setCapitulo(Capitulo) Void
        +getCodigo() Integer
        +setCodigo(Integer) Void
        +setEncabezado(String) Void
        +getContenido() String
        +setContenido(String) Void
        +getParrafo() Boolean
        +setParrafo(Boolean) Void
        +getReferencias() List~Referencia~
        +setReferencias(List~Referencia~) Void
        +toString() String
    }
    class Lectura {
        -Version version_ltr
        -Integer codLectura_ltr
        -String titulo_ltr
        -LocalDate fecha_ltr
        -String iframe_ltr
        -Boolean completado_ltr
        -LocalDate fechaProgreso_ltr
        -List~Versiculo~ versos_ltr
        +Lectura() Void
        +getVersion() Version
        +setVersion(Version) Void
        +getCodigo() Integer
        +setCodigo(Integer) Void
        +getTitulo() String
        +setTitulo(String) Void
        +getFecha() LocalDate
        +setFecha(LocalDate) Void
        +getIframe() String
        +setIframe(String) Void
        +getCompletado() Boolean
        +setCompletado(Boolean) Void
        +getFechaProgreso() LocalDate
        +setFechaProgreso(LocalDate) Void
        +getVersos() List~Versiculo~
        +setVersos(List~Versiculo~) Void
        +toString() String
    }
    class TipoReferencia {
        -Integer codTipoReferencia_tprfrc
        -String nombre_tprfrc
        +TipoReferencia() Void
        +getCodigo_tprfrc() Integer
        +setCodigo_tprfrc(Integer) Void
        +getNombre() String
        +setNombre(String) Void
        +toString() String
    }
    class Referencia {
        -Versiculo versiculo_rfrc
        -TipoReferencia tipo_rfrc
        -Integer codReferencia_rfrc
        -List~Versiculo~ versos_rfrc
        +Referencia() void
        +getVersiculo() Versiculo
        +setVersiculo(Versiculo) Void
        +getTipo() TipoReferencia
        +setTipo(TipoReferencia) Void
        +setCodigo(Integer) Void
        +getCodigo() Integer
        +getVersos() List~Versiculo~
        +setVersos(List~Versiculo~) Void
        +toString() String
    }

    Version "0..*" *-- "1" Lengua : lengua_vs
    Version "1" *-- "0..*" Lectura : lecturas_vs
    Version "1" *-- "1..*" Libro : libros_vs
    Capitulo "1..*" --> "1" Libro : libro_cptl
    Capitulo "1" *-- "1..*" Versiculo : versiculos_cptl
    Versiculo "1..*" --> "0..1" Lectura : versos
    Referencia "0..*" *-- "1..*" Versiculo : versiculo_rfrc
    Referencia "0..*" --> "1" TipoReferencia : tipo_rfrc
```

### Diagrama Lógico
```mermaid
erDiagram
    Lengua ||--o{ Version : "codLengua_lg"
    Version ||--o{ Lectura : "codLengua, codVersion"
    Version ||--o{ Libro : "codLengua, codVersion"
    Libro ||--o{ Capitulo : "codLengua, codVersion, codLibro"
    Capitulo ||--o{ Versiculo : "codLengua, codVersion, codLibro, codCap"
    Lectura |o--o{ Versiculo : "plan opcional (SET NULL)"
    Versiculo ||--o{ Referencia : "llave completa versiculo"
    TipoReferencia ||--o{ Referencia : "codTipoReferencia"
    VersiculoReferencia }o--|| Versiculo : "FK origen"
    VersiculoReferencia }o--|| Referencia : "FK destino"
```

### Diagrama Conceptual / Entidad-Relación Chen (Mermaid)
```mermaid
erDiagram
    Lengua ||--o{ Version : "tiene"
    Version ||--o{ Lectura : "organiza"
    Version ||--o{ Libro : "contiene"
    Libro ||--o{ Capitulo : "se divide"
    Capitulo ||--o{ Versiculo : "contiene"
    Lectura |o--o{ Versiculo : "asigna plan"
    Versiculo ||--o{ Referencia : "origina"
    TipoReferencia ||--o{ Referencia : "clasifica"
    Versiculo }o--o{ Referencia : "N:M via VersiculoReferencia"
    Versiculo ||--o{ VersiculoReferencia : "apunta a (Origen)"
    Referencia ||--o{ VersiculoReferencia : "es referenciada en (Destino)"

    Lengua {
        CHAR codLengua_lg PK "ID Idioma (es, en)"
        VARCHAR nombre_lg
    }
    Version {
        CHAR codLengua_vs PK, FK "ID Idioma"
        CHAR codVersion_vs PK "Sigla Versión (RV60)"
        VARCHAR nombre_vs
    }
    Lectura {
        CHAR codLengua_ltr PK, FK
        CHAR codVersion_ltr PK, FK
        INT codLectura_ltr PK "Día (1-365)"
        VARCHAR titulo_ltr
        DATE fecha_ltr
        VARCHAR iframe_ltr
        TINYINT completado_ltr
        DATE fechaProgreso_ltr
        CHAR alfaSiglaLibro_ltr "Rango Inicio"
        TINYINT alfaCapitulo_ltr
        INT alfaVerso_ltr
        CHAR betaSiglaLibro_ltr "Rango Fin"
        TINYINT betaCapitulo_ltr
        INT betaVerso_ltr
    }
    Libro {
        CHAR codLengua_lb PK, FK
        CHAR codVersion_lb PK, FK
        CHAR codLibro_lb PK "Sigla Libro (Gn)"
        TINYINT numero_lb
        VARCHAR nombre_lb
    }
    Capitulo {
        CHAR codLengua_cptl PK, FK
        CHAR codVersion_cptl PK, FK
        CHAR codLibro_cptl PK, FK
        TINYINT codCapitulo_cptl PK "Número Cap"
    }
    Versiculo {
        CHAR codLengua_vscl PK, FK
        CHAR codVersion_vscl PK, FK
        CHAR codLibro_vscl PK, FK
        TINYINT codCapitulo_vscl PK, FK
        INT codVersiculo_vscl PK "Número Vers"
        VARCHAR encabezado_vscl
        VARCHAR contenido_vscl
        TINYINT parrafo_vscl
    }
    TipoReferencia {
        INT codTipoReferencia_tprfrc PK "ID Autoincrement"
        VARCHAR nombre_tprfrc
    }
    Referencia {
        CHAR codLengua_rfrc_vscl PK, FK "Origen: Idioma"
        CHAR codVersion_rfrc_vscl PK, FK "Origen: Versión"
        CHAR codLibro_rfrc_vscl PK, FK "Origen: Libro"
        TINYINT codCapitulo_rfrc_vscl PK, FK "Origen: Cap"
        INT codVersiculo_rfrc_vscl PK, FK "Origen: Vers"
        INT codTipoReferencia_rfrc_tprfrc PK, FK "Tipo Ref"
        INT codReferencia_rfrc PK "ID Secuencial"
    }
    VersiculoReferencia {
    %% Esta es la tabla N:M pura
        CHAR codLengua_vsclrfrc_vscl PK, FK
        CHAR codVersion_vsclrfrc_vscl PK, FK
        CHAR codLibro_vsclrfrc_vscl PK, FK
        TINYINT codCapitulo_vsclrfrc_vscl PK, FK
        INT codVersiculo_vsclrfrc_vscl PK, FK
        CHAR codLengua_vsclrfrc_rfrc PK, FK
        CHAR codVersion_vsclrfrc_rfrc PK, FK
        CHAR codLibro_vsclrfrc_rfrc PK, FK
        TINYINT codCapitulo_vsclrfrc_rfrc PK, FK
        INT codVersiculo_vsclrfrc_rfrc PK, FK
        INT codTipoReferencia_vsclrfrc_rfrc PK, FK
        INT codReferencia_vsclrfrc_rfrc PK, FK
    }
```

### Diagrama Físico (Mermaid)
```mermaid
erDiagram
    Lengua {
        TEXT codLengua_lg PK
        TEXT nombre_lg
    }
    Version {
        TEXT codLengua_vs PK, FK
        TEXT codVersion_vs PK
        TEXT nombre_vs
    }
    Lectura {
        TEXT codLengua_ltr PK, FK
        TEXT codVersion_ltr PK, FK
        INTEGER codLectura_ltr PK
        TEXT titulo_ltr
        DATE fecha_ltr
        TEXT iframe_ltr
        INTEGER completado_ltr
        DATE fechaProgreso_ltr
        TEXT alfaSiglaLibro_ltr
        INTEGER alfaCapitulo_ltr
        INTEGER alfaVerso_ltr
        TEXT betaSiglaLibro_ltr
        INTEGER betaCapitulo_ltr
        INTEGER betaVerso_ltr
    }
    Libro {
        TEXT codLengua_lb PK, FK
        TEXT codVersion_lb PK, FK
        TEXT codLibro_lb PK
        INTEGER numero_lb
        TEXT nombre_lb
    }
    Capitulo {
        TEXT codLengua_cptl PK, FK
        TEXT codVersion_cptl PK, FK
        TEXT codLibro_cptl PK, FK
        INTEGER codCapitulo_cptl PK
    }
    Versiculo {
        TEXT codLengua_vscl PK, FK
        TEXT codVersion_vscl PK, FK
        TEXT codLibro_vscl PK, FK
        INTEGER codCapitulo_vscl PK, FK
        INTEGER codVersiculo_vscl PK
        TEXT encabezado_vscl
        TEXT contenido_vscl
        INTEGER parrafo_vscl
        TEXT codLengua_vscl_ltr FK
        TEXT codVersion_vscl_ltr FK
        INTEGER codLectura_vscl_ltr FK
    }
    TipoReferencia {
        INTEGER codTipoReferencia_tprfrc PK
        TEXT nombre_tprfrc
    }
    Referencia {
        TEXT codLengua_rfrc_vscl PK, FK
        TEXT codVersion_rfrc_vscl PK, FK
        TEXT codLibro_rfrc_vscl PK, FK
        INTEGER codCapitulo_rfrc_vscl PK, FK
        INTEGER codVersiculo_rfrc_vscl PK, FK
        INTEGER codTipoReferencia_rfrc_tprfrc PK, FK
        INTEGER codReferencia_rfrc PK
    }
    VersiculoReferencia {
        TEXT codLengua_vsclrfrc_vscl PK, FK
        TEXT codVersion_vsclrfrc_vscl PK, FK
        TEXT codLibro_vsclrfrc_vscl PK, FK
        INTEGER codCapitulo_vsclrfrc_vscl PK, FK
        INTEGER codVersiculo_vsclrfrc_vscl PK, FK
        TEXT codLengua_vsclrfrc_rfrc PK, FK
        TEXT codVersion_vsclrfrc_rfrc PK, FK
        TEXT codLibro_vsclrfrc_rfrc PK, FK
        INTEGER codCapitulo_vsclrfrc_rfrc PK, FK
        INTEGER codVersiculo_vsclrfrc_rfrc PK, FK
        INTEGER codTipoReferencia_vsclrfrc_rfrc PK, FK
        INTEGER codReferencia_vsclrfrc_rfrc PK, FK
    }

    Lengua ||--o{ Version : "FK_Version_Lengua"
    Version ||--o{ Lectura : "FK_Lectura_Version"
    Version ||--o{ Libro : "FK_Libro_Version"
    Libro ||--o{ Capitulo : "FK_Capitulo_Libro"
    Capitulo ||--o{ Versiculo : "FK_Versiculo_Capitulo"
    Lectura |o--o{ Versiculo : "FK_Versiculo_Lectura (SET NULL)"
    Versiculo ||--o{ Referencia : "FK_Referencia_Versiculo"
    TipoReferencia ||--o{ Referencia : "FK_Referencia_TipoReferencia"
    Versiculo ||--o{ VersiculoReferencia : "FK_VersiculoReferencia_Versiculo (Apunta a)"
    Referencia ||--o{ VersiculoReferencia : "FK_VersiculoReferencia_Referencia (Es referenciada)"
```

## Diccionario de Datos Detallado

### Entidad: Lengua
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_lg` | CHAR | PK | Identificador único del idioma. Código ISO (ej. "es", "en"). |
| `nombre_lg` | VARCHAR | NOT NULL | Nombre completo (ej. "Español"). |

### Entidad: Version
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_vs` | CHAR | PK, FK (Lengua) | Idioma al que pertenece la versión. Código ISO (ej. "es", "en"). |
| `codVersion_vs` | CHAR | PK | Siglas de la versión (ej. "RV60"). |
| `nombre_vs` | VARCHAR | NOT NULL, UNIQUE | Nombre (ej. "Reina Valera 1960"). |

### Entidad: Lectura (Núcleo del plan de 365 días)
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_ltr` | CHAR | PK, FK (Version) | Versión a la que pertenece la lectura. Código ISO (ej. "es", "en"). |
| `codVersion_ltr` | CHAR | PK, FK (Version) | Versión a la que pertenece la lectura. Siglas (ej. "RV60"). |
| `codLectura_ltr` | INT | PK | Día del plan (1 al 365). |
| `titulo_ltr` | VARCHAR | NOT NULL | Título de la lectura diaria. |
| `fecha_ltr` | DATE | OPTIONAL/NULL | Fecha programada (opcional). |
| `iframe_ltr` | VARCHAR | NOT NULL | Código o URL del video embebido. |
| `completado_ltr` | TINYINT | DEFAULT 0 | Estado de la lectura (0: pendiente, 1: completado). |
| `fechaProgreso_ltr`| DATE | OPTIONAL/NULL | Fecha en la que se marcó como completado. |
| `alfaSiglaLibro_ltr`| CHAR | NOT NULL | Libro donde inicia la lectura (ej. "Gen"). |
| `alfaCapitulo_ltr` | TINYINT | NOT NULL | Capítulo donde inicia la lectura. |
| `alfaVerso_ltr` | INT | NOT NULL | Versículo donde inicia la lectura. |
| `betaSiglaLibro_ltr`| CHAR | NOT NULL | Libro donde finaliza la lectura. |
| `betaCapitulo_ltr` | TINYINT | NOT NULL | Capítulo donde finaliza la lectura. |
| `betaVerso_ltr` | INT | NOT NULL | Versículo donde finaliza la lectura. |

### Entidad: Libro
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_lb` | CHAR | PK, FK (Version) | Versión a la que pertenece el libro. Código ISO (ej. "es", "en"). |
| `codVersion_lb` | CHAR | PK, FK (Version) | Versión a la que pertenece el libro. Siglas (ej. "RV60"). |
| `codLibro_lb` | CHAR | PK | Abreviatura estándar (ej. "Gen"). |
| `numero_lb` | TINYINT | NOT NULL | Orden del libro en la Biblia (1-66). |
| `nombre_lb` | VARCHAR | NOT NULL | Nombre del libro (ej. "Génesis"). |

### Entidad: Capitulo
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_cptl` | CHAR | PK, FK (Libro) | Libro al que pertenece el capítulo. Código ISO (ej. "es", "en"). |
| `codVersion_cptl` | CHAR | PK, FK (Libro) | Libro al que pertenece el capítulo. Siglas (ej. "RV60"). |
| `codLibro_cptl` | CHAR | PK, FK (Libro) | Libro al que pertenece el capítulo. Abreviatura estándar (ej. "Gen"). |
| `codCapitulo_cptl` | TINYINT | PK | Número del capítulo dentro del libro. |

### Entidad: Versiculo
| Campo                | Tipo | Restricciones | Descripción                                                               |
|:---------------------| :--- | :--- |:--------------------------------------------------------------------------|
| `codLengua_vscl`     | CHAR | PK, FK (Capitulo) | Capítulo al que pertenece el versículo. Código ISO (ej. "es", "en").      |
| `codVersion_vscl`    | CHAR | PK, FK (Capitulo) | Capítulo al que pertenece el versículo. Siglas (ej. "RV60").              |
| `codLibro_vscl`      | CHAR | PK, FK (Capitulo) | Capítulo al que pertenece el versículo. Abreviatura estándar (ej. "Gen"). |
| `codCapitulo_vscl`   | TINYINT | PK, FK (Capitulo) | Capítulo al que pertenece el versículo. Número del capítulo.              |
| `codVersiculo_vscl`  | INT | PK | Número del versículo dentro del capítulo.                                 |
| `encabezado_vscl`    | VARCHAR | OPTIONAL/NULL | Título o encabezado de sección.                                           |
| `contenido_vscl`     | VARCHAR | NOT NULL | El texto bíblico perse.                                                   |
| `parrafo_vscl`       | TINYINT | DEFAULT 0 | Indica si el versículo inicia un párrafo.                                 |
| `codLengua_vscl_ltr` | CHAR | FK (Lectura) | Lectura a la que pertenece (Idioma).                                      |
| `codVersion_vscl_ltr`| CHAR | FK (Lectura) | Lectura a la que pertenece (Versión).                                     |
| `codLectura_vscl_ltr`| INT | FK (Lectura) | Lectura a la que pertenece (Día del plan).                                |

### Entidad: TipoReferencia
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codTipoReferencia_tprfrc`| INT | PK | Identificador único del tipo de referencia. |
| `nombre_tprfrc` | VARCHAR | NOT NULL | Nombre (ej. "Cruzada", "Paralela"). |

### Entidad: Referencia
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_rfrc_vscl`| CHAR | PK, FK (Versiculo) | Versículo al que pertenece la referencia (Idioma). |
| `codVersion_rfrc_vscl`| CHAR | PK, FK (Versiculo) | Versículo al que pertenece la referencia (Versión). |
| `codLibro_rfrc_vscl` | CHAR | PK, FK (Versiculo) | Versículo al que pertenece la referencia (Libro). |
| `codCapitulo_rfrc_vscl`| TINYINT | PK, FK (Versiculo) | Versículo al que pertenece la referencia (Capítulo). |
| `codVersiculo_rfrc_vscl`| INT | PK, FK (Versiculo) | Versículo al que pertenece la referencia (Versículo). |
| `codTipoReferencia_rfrc_tprfrc`| INT | PK, FK (TipoReferencia) | Tipo de referencia asociada. |
| `codReferencia_rfrc`| INT | PK | Identificador secuencial de la referencia. |

### Entidad: VersiculoReferencia (N:M)
| Campo | Tipo | Restricciones | Descripción |
| :--- | :--- | :--- | :--- |
| `codLengua_vsclrfrc_vscl` | CHAR | PK, FK (Versiculo) | Versículo origen (Idioma). |
| `codVersion_vsclrfrc_vscl`| CHAR | PK, FK (Versiculo) | Versículo origen (Versión). |
| `codLibro_vsclrfrc_vscl` | CHAR | PK, FK (Versiculo) | Versículo origen (Libro). |
| `codCapitulo_vsclrfrc_vscl`| TINYINT | PK, FK (Versiculo) | Versículo origen (Capítulo). |
| `codVersiculo_vsclrfrc_vscl`| INT | PK, FK (Versiculo) | Versículo origen (Versículo). |
| `codLengua_vsclrfrc_rfrc` | CHAR | PK, FK (Referencia) | Referencia destino (Idioma). |
| `codVersion_vsclrfrc_rfrc`| CHAR | PK, FK (Referencia) | Referencia destino (Versión). |
| `codLibro_vsclrfrc_rfrc` | CHAR | PK, FK (Referencia) | Referencia destino (Libro). |
| `codCapitulo_vsclrfrc_rfrc`| TINYINT | PK, FK (Referencia) | Referencia destino (Capítulo). |
| `codVersiculo_vsclrfrc_rfrc`| INT | PK, FK (Referencia) | Referencia destino (Versículo). |
| `codTipoReferencia_vsclrfrc_rfrc`| INT | PK, FK (Referencia) | Tipo de la referencia destino. |
| `codReferencia_vsclrfrc_rfrc`| INT | PK, FK (Referencia) | ID secuencial de la referencia destino. |

## Reglas de Desarrollo
- El trigger `TR_ReferenciaInsert` asegura que `codReferencia_rfrc` sea secuencial por versículo y tipo.
- La integridad referencial es crítica; siempre usar `ON DELETE CASCADE` en las relaciones jerárquicas (Libro -> Capítulo -> Versículo).
- Para el autoplay de YouTube en `FirstFragment`, el `mute(1)` es obligatorio.
- Los campos Boolean en Java (parrafo, completado) se almacenan como INTEGER (0/1) en SQLite; la conversión debe gestionarse en la capa DAO.
