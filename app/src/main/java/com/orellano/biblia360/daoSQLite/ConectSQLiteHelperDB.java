package com.orellano.biblia360.daoSQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.orellano.biblia360.daoSQLite.sql.spa.Load1Corintios;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Cronicas;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Juan;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Pedro;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Reyes;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Samuel;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Tesalonisenses;
import com.orellano.biblia360.daoSQLite.sql.spa.Load1Timoteo;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Corintios;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Cronicas;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Juan;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Pedro;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Reyes;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Samuel;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Tesalonisenses;
import com.orellano.biblia360.daoSQLite.sql.spa.Load2Timoteo;
import com.orellano.biblia360.daoSQLite.sql.spa.Load3Juan;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadAbdias;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadAmos;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadApocalipsis;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadCantares;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadColosenses;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadDaniel;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadDeuteronomio;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadEclesiastes;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadEfesios;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadEsdras;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadEster;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadExodo;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadEzequiel;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadFilemon;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadFilipenses;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadGalatas;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadGenesis;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadHabacuc;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadHageo;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadHebreos;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadHechos;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadIsaias;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJeremias;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJob;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJoel;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJonas;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJosue;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJuan;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJudas;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadJueces;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadLamentaciones;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadLevitico;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadLucas;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadMalaquias;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadMarcos;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadMateo;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadMiqueas;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadNahum;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadNehemias;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadNumeros;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadOseas;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadProverbios;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadReferencia;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadRomanos;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadRut;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadSalmos;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadSantiago;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadSofonias;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadTito;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadVersiculoReferenciaAT;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadVersiculoReferenciaNT;
import com.orellano.biblia360.daoSQLite.sql.spa.LoadZacarias;

public class ConectSQLiteHelperDB extends SQLiteOpenHelper {
  public static final String DATABASE_NAME = "database_biblia360.db";
  public static final int DATABASE_VERSION = 3;

  // --- CONSTANTES DE TABLAS Y COLUMNAS ---

  // Tabla Lengua
  public static final String T_LENGUA = "Lengua";
  public static final String C_LENGUA_COD = "codLengua_lg";
  public static final String C_LENGUA_NOMBRE = "nombre_lg";
  private static final String DROP_TABLE_LENGUA = "DROP TABLE IF EXISTS " + T_LENGUA + ";";
  private static final String CREATE_TABLE_LENGUA = "CREATE TABLE IF NOT EXISTS " +
    T_LENGUA + "(" +
    C_LENGUA_COD + " TEXT NOT NULL," +
    C_LENGUA_NOMBRE + " TEXT NOT NULL," +
    "CONSTRAINT PK_Lengua PRIMARY KEY (" + C_LENGUA_COD +")" +
    ")";

  // Tabla Version
  public static final String T_VERSION = "Version";
  public static final String C_VERSION_LENGUA_COD_LG = "codLengua_vs";
  public static final String C_VERSION_COD = "codVersion_vs";
  public static final String C_VERSION_NOMBRE = "nombre_vs";
  private static final String DROP_TABLE_VERSION = "DROP TABLE IF EXISTS " + T_VERSION + ";";
  private static final String CREATE_TABLE_VERSION = "CREATE TABLE IF NOT EXISTS " +
    T_VERSION + "(" +
    C_VERSION_LENGUA_COD_LG + " TEXT NOT NULL," +
    C_VERSION_COD + " TEXT NOT NULL," +
    C_VERSION_NOMBRE + " TEXT NOT NULL," +
    "CONSTRAINT PK_Version PRIMARY KEY (" + C_VERSION_LENGUA_COD_LG + "," + C_VERSION_COD + ")," +
    "CONSTRAINT FK_Version_Lengua FOREIGN KEY (" + C_VERSION_LENGUA_COD_LG + ") " +
    "REFERENCES Lengua(" + C_LENGUA_COD + ") ON DELETE CASCADE" +
    ")";

  // Tabla Lectura
  public static final String T_LECTURA = "Lectura";
  public static final String C_LECTURA_LENGUA_COD_VS = "codLengua_ltr";
  public static final String C_LECTURA_VERSION_COD_VS = "codVersion_ltr";
  public static final String C_LECTURA_COD = "codLectura_ltr";
  public static final String C_LECTURA_TITULO = "titulo_ltr";
  public static final String C_LECTURA_FECHA = "fecha_ltr";
  public static final String C_LECTURA_IFRAME = "iframe_ltr";
  public static final String C_LECTURA_COMPLETADO = "completado_ltr";
  public static final String C_LECTURA_FECHAPROG = "fechaProgreso_ltr";
  public static final String C_LECTURA_ALFASIGLALIB = "alfaSiglaLibro_ltr";
  public static final String C_LECTURA_ALFACAPITULO = "alfaCapitulo_ltr";
  public static final String C_LECTURA_ALFAVESERSO = "alfaVerso_ltr";
  public static final String C_LECTURA_BETASIGLALIB = "betaSiglaLibro_ltr";
  public static final String C_LECTURA_BETACAPITULO = "betaCapitulo_ltr";
  public static final String C_LECTURA_BETAVESERSO = "betaVerso_ltr";
  private static final String DROP_TABLE_LECTURA = "DROP TABLE IF EXISTS " + T_LECTURA + ";";
  private static final String CREATE_TABLE_LECTURA = "CREATE TABLE IF NOT EXISTS " +
    T_LECTURA + "(" +
    C_LECTURA_LENGUA_COD_VS + " TEXT NOT NULL," +
    C_LECTURA_VERSION_COD_VS + " TEXT NOT NULL," +
    C_LECTURA_COD + " INTEGER NOT NULL CHECK (" + C_LECTURA_COD + " BETWEEN 1 AND 365)," +
    C_LECTURA_TITULO + " TEXT NOT NULL," +
    C_LECTURA_FECHA + " DATE," +
    C_LECTURA_IFRAME + " TEXT NOT NULL DEFAULT '9bWzrFcGPRo'," +
    C_LECTURA_COMPLETADO + " INTEGER DEFAULT 0 CHECK (" + C_LECTURA_COMPLETADO + " IN (0, 1))," +
    C_LECTURA_FECHAPROG + " DATE," +
    C_LECTURA_ALFASIGLALIB + " TEXT NOT NULL," +
    C_LECTURA_ALFACAPITULO + " INTEGER NOT NULL," +
    C_LECTURA_ALFAVESERSO + " INTEGER NOT NULL," +
    C_LECTURA_BETASIGLALIB + " TEXT NOT NULL," +
    C_LECTURA_BETACAPITULO + " INTEGER NOT NULL," +
    C_LECTURA_BETAVESERSO + " INTEGER NOT NULL," +
    "CONSTRAINT PK_Lectura PRIMARY KEY (" + C_LECTURA_LENGUA_COD_VS + "," + C_LECTURA_VERSION_COD_VS + "," + C_LECTURA_COD + ")," +
    "CONSTRAINT FK_Lectura_Version FOREIGN KEY (" + C_LECTURA_LENGUA_COD_VS + "," + C_LECTURA_VERSION_COD_VS + ") " +
    "REFERENCES Version(" + C_VERSION_LENGUA_COD_LG + "," + C_VERSION_COD + ") ON DELETE CASCADE" +
    ")";

  // Tabla Libro
  public static final String T_LIBRO = "Libro";
  public static final String C_LIBRO_LENGUA_COD_VS = "codLengua_lb";
  public static final String C_LIBRO_VERSION_COD_VS = "codVersion_lb";
  public static final String C_LIBRO_COD = "codLibro_lb";
  public static final String C_LIBRO_NUMERO = "numero_lb";
  public static final String C_LIBRO_NOMBRE = "nombre_lb";
  private static final String DROP_TABLE_LIBRO = "DROP TABLE IF EXISTS " + T_LIBRO + ";";
  private static final String CREATE_TABLE_LIBRO = "CREATE TABLE IF NOT EXISTS " +
    T_LIBRO + "(" +
    C_LIBRO_LENGUA_COD_VS + " TEXT NOT NULL," +
    C_LIBRO_VERSION_COD_VS + " TEXT NOT NULL," +
    C_LIBRO_COD + " TEXT NOT NULL," +
    C_LIBRO_NUMERO + " INTEGER NOT NULL," +
    C_LIBRO_NOMBRE + " TEXT NOT NULL," +
    "CONSTRAINT PK_Libro PRIMARY KEY (" + C_LIBRO_LENGUA_COD_VS + "," + C_LIBRO_VERSION_COD_VS + "," + C_LIBRO_COD + ")," +
    "CONSTRAINT FK_Libro_Version FOREIGN KEY (" + C_LIBRO_LENGUA_COD_VS + "," + C_LIBRO_VERSION_COD_VS + ") " +
    "REFERENCES Version(" + C_VERSION_LENGUA_COD_LG + "," + C_VERSION_COD + ") ON DELETE CASCADE" +
    ")";

  // Tabla Capitulo
  public static final String T_CAPITULO = "Capitulo";
  public static final String C_CAPITULO_LENGUA_COD_LG = "codLengua_cptl";
  public static final String C_CAPITULO_VERSION_COD_LG = "codVersion_cptl";
  public static final String C_CAPITULO_LIBRO_COD_LG = "codLibro_cptl";
  public static final String C_CAPITULO_COD = "codCapitulo_cptl";
  private static final String DROP_TABLE_CAPITULO = "DROP TABLE IF EXISTS " + T_CAPITULO + ";";
  private static final String CREATE_TABLE_CAPITULO = "CREATE TABLE IF NOT EXISTS " +
    T_CAPITULO + "(" +
    C_CAPITULO_LENGUA_COD_LG + " TEXT NOT NULL," +
    C_CAPITULO_VERSION_COD_LG + " TEXT NOT NULL," +
    C_CAPITULO_LIBRO_COD_LG + " TEXT NOT NULL," +
    C_CAPITULO_COD + " INTEGER NOT NULL," +
    "CONSTRAINT PK_Capitulo PRIMARY KEY (" + C_CAPITULO_LENGUA_COD_LG + "," + C_CAPITULO_VERSION_COD_LG + "," + C_CAPITULO_LIBRO_COD_LG + "," + C_CAPITULO_COD + ")," +
    "CONSTRAINT FK_Capitulo_Libro FOREIGN KEY (" + C_CAPITULO_LENGUA_COD_LG + "," + C_CAPITULO_VERSION_COD_LG + "," + C_CAPITULO_LIBRO_COD_LG + ") " +
    "REFERENCES Libro(" + C_LIBRO_LENGUA_COD_VS + "," + C_LIBRO_VERSION_COD_VS + "," + C_LIBRO_COD + ") ON DELETE CASCADE" +
    ")";

  // Tabla Versiculo
  public static final String T_VERSICULO = "Versiculo";
  public static final String C_VERSICULO_LENGUA_COD_CPTL = "codLengua_vscl";
  public static final String C_VERSICULO_VERSION_COD_CPTL = "codVersion_vscl";
  public static final String C_VERSICULO_LIBRO_COD_CPTL = "codLibro_vscl";
  public static final String C_VERSICULO_CAPITULO_COD_CPTL = "codCapitulo_vscl";
  public static final String C_VERSICULO_COD = "codVersiculo_vscl";
  public static final String C_VERSICULO_ENCABEZADO = "encabezado_vscl";
  public static final String C_VERSICULO_CONTENIDO = "contenido_vscl";
  public static final String C_VERSICULO_PARRAFO = "parrafo_vscl";
  public static final String C_VERSICULO_LENGUA_COD_LTR = "codLengua_vscl_ltr";
  public static final String C_VERSICULO_VERSION_COD_LTR = "codVersion_vscl_ltr";
  public static final String C_VERSICULO_LECTURA_COD_LTR = "codLectura_vscl_ltr";
  private static final String DROP_TABLE_VERSICULO = "DROP TABLE IF EXISTS " + T_VERSICULO + ";";
  private static final String CREATE_TABLE_VERSICULO = "CREATE TABLE IF NOT EXISTS " +
    T_VERSICULO + "(" +
    C_VERSICULO_LENGUA_COD_CPTL + " TEXT NOT NULL," +
    C_VERSICULO_VERSION_COD_CPTL + " TEXT NOT NULL," +
    C_VERSICULO_LIBRO_COD_CPTL + " TEXT NOT NULL," +
    C_VERSICULO_CAPITULO_COD_CPTL + " INTEGER NOT NULL," +
    C_VERSICULO_COD + " INTEGER NOT NULL," +
    C_VERSICULO_ENCABEZADO + " TEXT," +
    C_VERSICULO_CONTENIDO + " TEXT NOT NULL," +
    C_VERSICULO_PARRAFO + " INTEGER DEFAULT 0," +
    C_VERSICULO_LENGUA_COD_LTR + " TEXT," +
    C_VERSICULO_VERSION_COD_LTR + " TEXT," +
    C_VERSICULO_LECTURA_COD_LTR + " INTEGER," +
    "CONSTRAINT PK_Versiculo PRIMARY KEY (" + C_VERSICULO_LENGUA_COD_CPTL + "," + C_VERSICULO_VERSION_COD_CPTL + "," + C_VERSICULO_LIBRO_COD_CPTL + "," + C_VERSICULO_CAPITULO_COD_CPTL + "," + C_VERSICULO_COD + ")," +
    "CONSTRAINT FK_Versiculo_Capitulo FOREIGN KEY (" + C_VERSICULO_LENGUA_COD_CPTL + "," + C_VERSICULO_VERSION_COD_CPTL + "," + C_VERSICULO_LIBRO_COD_CPTL + "," + C_VERSICULO_CAPITULO_COD_CPTL + ") " +
    "REFERENCES Capitulo(" + C_CAPITULO_LENGUA_COD_LG + "," + C_CAPITULO_VERSION_COD_LG + "," + C_CAPITULO_LIBRO_COD_LG + "," + C_CAPITULO_COD + ") " +
    "ON DELETE CASCADE," +
    "CONSTRAINT FK_Versiculo_Lectura FOREIGN KEY (" + C_VERSICULO_LENGUA_COD_LTR + "," + C_VERSICULO_VERSION_COD_LTR + "," + C_VERSICULO_LECTURA_COD_LTR + ") " +
    "REFERENCES Lectura(" + C_LECTURA_LENGUA_COD_VS + "," + C_LECTURA_VERSION_COD_VS + "," + C_LECTURA_COD + ") " +
    "ON DELETE SET NULL" +
    ");";

  // Tabla TipoReferencia
  public static final String T_TIPO_REF = "TipoReferencia";
  public static final String C_TIPO_REF_COD = "codTipoReferencia_tprfrc";
  public static final String C_TIPO_REF_NOMBRE = "nombre_tprfrc";
  private static final String DROP_TABLE_TIPO_REF = "DROP TABLE IF EXISTS " + T_TIPO_REF + ";";
  private static final String CREATE_TABLE_TIPO_REF = "CREATE TABLE IF NOT EXISTS " +
    T_TIPO_REF + "(" +
    C_TIPO_REF_COD + " INTEGER CONSTRAINT PK_TipoReferencia PRIMARY KEY AUTOINCREMENT," +
    C_TIPO_REF_NOMBRE + " TEXT NOT NULL" +
    ");";

  // Tabla Referencia
  public static final String T_REFERENCIA = "Referencia";
  public static final String C_REFERENCIA_LENGUA_COD_VSCL = "codLengua_rfrc_vscl";
  public static final String C_REFERENCIA_VERSION_COD_VSCL = "codVersion_rfrc_vscl";
  public static final String C_REFERENCIA_LIBRO_COD_VSCL = "codLibro_rfrc_vscl";
  public static final String C_REFERENCIA_CAPITULO_COD_VSCL = "codCapitulo_rfrc_vscl";
  public static final String C_REFERENCIA_VERSICULO_COD_VSCL = "codVersiculo_rfrc_vscl";
  public static final String C_REFERENCIA_TIPO_REF_COD_TPRFRC = "codTipoReferencia_rfrc_tprfrc";
  public static final String C_REFERENCIA_COD = "codReferencia_rfrc";
  private static final String DROP_TABLE_REFERENCIA = "DROP TABLE IF EXISTS " + T_REFERENCIA + ";";
  private static final String CREATE_TABLE_REFERENCIA = "CREATE TABLE IF NOT EXISTS " +
    T_REFERENCIA + "(" +
    C_REFERENCIA_LENGUA_COD_VSCL + " TEXT NOT NULL," +
    C_REFERENCIA_VERSION_COD_VSCL + " TEXT NOT NULL," +
    C_REFERENCIA_LIBRO_COD_VSCL + " TEXT NOT NULL," +
    C_REFERENCIA_CAPITULO_COD_VSCL + " INTEGER NOT NULL," +
    C_REFERENCIA_VERSICULO_COD_VSCL + " INTEGER NOT NULL," +
    C_REFERENCIA_TIPO_REF_COD_TPRFRC + " INTEGER NOT NULL," +
    C_REFERENCIA_COD + " INTEGER NOT NULL," +
    "CONSTRAINT PK_Referencia PRIMARY KEY (" + C_REFERENCIA_LENGUA_COD_VSCL + "," + C_REFERENCIA_VERSION_COD_VSCL + "," + C_REFERENCIA_LIBRO_COD_VSCL + "," + C_REFERENCIA_CAPITULO_COD_VSCL + "," + C_REFERENCIA_VERSICULO_COD_VSCL + "," + C_REFERENCIA_TIPO_REF_COD_TPRFRC + "," + C_REFERENCIA_COD + ")," +
    "CONSTRAINT FK_Referencia_Versiculo FOREIGN KEY (" + C_REFERENCIA_LENGUA_COD_VSCL + "," + C_REFERENCIA_VERSION_COD_VSCL + "," + C_REFERENCIA_LIBRO_COD_VSCL + "," + C_REFERENCIA_CAPITULO_COD_VSCL + "," + C_REFERENCIA_VERSICULO_COD_VSCL + ") " +
    "REFERENCES Versiculo(" + C_VERSICULO_LENGUA_COD_CPTL + "," + C_VERSICULO_VERSION_COD_CPTL + "," + C_VERSICULO_LIBRO_COD_CPTL + "," + C_VERSICULO_CAPITULO_COD_CPTL + "," + C_VERSICULO_COD + ") " +
    "ON DELETE CASCADE," +
    "CONSTRAINT FK_Referencia_TipoReferencia FOREIGN KEY (" + C_REFERENCIA_TIPO_REF_COD_TPRFRC + ") " +
    "REFERENCES TipoReferencia(" + C_TIPO_REF_COD + ") " +
    "ON DELETE CASCADE" +
    ");";

  // Tabla VersiculoReferencia
  public static final String T_VERSICULO_REF = "VersiculoReferencia";
  public static final String C_VERSICULO_REF_LENGUA_COD_VSCL = "codLengua_vsclrfrc_vscl";
  public static final String C_VERSICULO_REF_VERSION_COD_VSCL = "codVersion_vsclrfrc_vscl";
  public static final String C_VERSICULO_REF_LIBRO_COD_VSCL = "codLibro_vsclrfrc_vscl";
  public static final String C_VERSICULO_REF_CAPITULO_COD_VSCL = "codCapitulo_vsclrfrc_vscl";
  public static final String C_VERSICULO_REF_VERSICULO_COD_VSCL = "codVersiculo_vsclrfrc_vscl";
  public static final String C_VERSICULO_REF_LENGUA_COD_RFRC = "codLengua_vsclrfrc_rfrc";
  public static final String C_VERSICULO_REF_VERSION_COD_RFRC = "codVersion_vsclrfrc_rfrc";
  public static final String C_VERSICULO_REF_LIBRO_COD_RFRC = "codLibro_vsclrfrc_rfrc";
  public static final String C_VERSICULO_REF_CAPITULO_COD_RFRC = "codCapitulo_vsclrfrc_rfrc";
  public static final String C_VERSICULO_REF_VERSICULO_COD_RFRC = "codVersiculo_vsclrfrc_rfrc";
  public static final String C_VERSICULO_REF_TIPO_REF_COD_RFRC = "codTipoReferencia_vsclrfrc_rfrc";
  public static final String C_VERSICULO_REF_COD_RFRC = "codReferencia_vsclrfrc_rfrc";
  private static final String DROP_TABLE_VERSICULO_REF = "DROP TABLE IF EXISTS " + T_VERSICULO_REF + ";";
  private static final String CREATE_TABLE_VERSICULO_REF = "CREATE TABLE IF NOT EXISTS " +
    T_VERSICULO_REF + "(" +
    C_VERSICULO_REF_LENGUA_COD_VSCL + " TEXT NOT NULL," +
    C_VERSICULO_REF_VERSION_COD_VSCL + " TEXT NOT NULL," +
    C_VERSICULO_REF_LIBRO_COD_VSCL + " TEXT NOT NULL," +
    C_VERSICULO_REF_CAPITULO_COD_VSCL + " INTEGER NOT NULL," +
    C_VERSICULO_REF_VERSICULO_COD_VSCL + " INTEGER NOT NULL," +
    C_VERSICULO_REF_LENGUA_COD_RFRC + " TEXT NOT NULL," +
    C_VERSICULO_REF_VERSION_COD_RFRC + " TEXT NOT NULL," +
    C_VERSICULO_REF_LIBRO_COD_RFRC + " TEXT NOT NULL," +
    C_VERSICULO_REF_CAPITULO_COD_RFRC + " INTEGER NOT NULL," +
    C_VERSICULO_REF_VERSICULO_COD_RFRC + " INTEGER NOT NULL," +
    C_VERSICULO_REF_TIPO_REF_COD_RFRC + " INTEGER NOT NULL," +
    C_VERSICULO_REF_COD_RFRC + " INTEGER NOT NULL," +
    "CONSTRAINT PK_VersiculoReferencia PRIMARY KEY (" + C_VERSICULO_REF_LENGUA_COD_VSCL + "," + C_VERSICULO_REF_VERSION_COD_VSCL + "," + C_VERSICULO_REF_LIBRO_COD_VSCL + "," + C_VERSICULO_REF_CAPITULO_COD_VSCL + "," + C_VERSICULO_REF_VERSICULO_COD_VSCL + "," + C_VERSICULO_REF_LENGUA_COD_RFRC + "," + C_VERSICULO_REF_VERSION_COD_RFRC + "," + C_VERSICULO_REF_LIBRO_COD_RFRC + "," + C_VERSICULO_REF_CAPITULO_COD_RFRC + "," + C_VERSICULO_REF_VERSICULO_COD_RFRC + "," + C_VERSICULO_REF_TIPO_REF_COD_RFRC + "," + C_VERSICULO_REF_COD_RFRC + ")," +
    "CONSTRAINT FK_VersiculoReferencia_Versiculo FOREIGN KEY (" + C_VERSICULO_REF_LENGUA_COD_VSCL + "," + C_VERSICULO_REF_VERSION_COD_VSCL + "," + C_VERSICULO_REF_LIBRO_COD_VSCL + "," + C_VERSICULO_REF_CAPITULO_COD_VSCL + "," + C_VERSICULO_REF_VERSICULO_COD_VSCL + ") " +
    "REFERENCES Versiculo(" + C_VERSICULO_LENGUA_COD_CPTL + "," + C_VERSICULO_VERSION_COD_CPTL + "," + C_VERSICULO_LIBRO_COD_CPTL + "," + C_VERSICULO_CAPITULO_COD_CPTL + "," + C_VERSICULO_COD + ") " +
    "ON DELETE CASCADE," +
    "CONSTRAINT FK_VersiculoReferencia_Referencia FOREIGN KEY (" + C_VERSICULO_REF_LENGUA_COD_RFRC + "," + C_VERSICULO_REF_VERSION_COD_RFRC + "," + C_VERSICULO_REF_LIBRO_COD_RFRC + "," + C_VERSICULO_REF_CAPITULO_COD_RFRC + "," + C_VERSICULO_REF_VERSICULO_COD_RFRC + "," + C_VERSICULO_REF_TIPO_REF_COD_RFRC + "," + C_VERSICULO_REF_COD_RFRC + ") " +
    "REFERENCES Referencia(" + C_REFERENCIA_LENGUA_COD_VSCL + "," + C_REFERENCIA_VERSION_COD_VSCL + "," + C_REFERENCIA_LIBRO_COD_VSCL + "," + C_REFERENCIA_CAPITULO_COD_VSCL + "," + C_REFERENCIA_VERSICULO_COD_VSCL + "," + C_REFERENCIA_TIPO_REF_COD_TPRFRC + "," + C_REFERENCIA_COD + ") " +
    "ON DELETE CASCADE" +
    ");";

  // --- TRIGGER ---
  // Este trigger actualiza fechaProgreso_ltr a la fecha actual cuando se marca como completado (1)
  private static final String TR_REFERENCIA_INSERT = "TR_ReferenciaInsert";
  private static final String DROP_TR_REFERENCIA_INSERT = "DROP TRIGGER IF EXISTS TR_ReferenciaInsert;";
  private static final String CREATE_TR_REFERENCIA_INSERT = "CREATE TRIGGER IF NOT EXISTS " + TR_REFERENCIA_INSERT +
    " AFTER INSERT ON " + T_REFERENCIA +
    " FOR EACH ROW WHEN NEW." + C_REFERENCIA_COD + " IS NULL OR NEW." + C_REFERENCIA_COD + " <= 0" +
    " BEGIN" +
    "    UPDATE " + T_REFERENCIA +
    "    SET " + C_REFERENCIA_COD + " = (" +
    "        SELECT COALESCE(MAX(" + C_REFERENCIA_COD + "), 0) + 1" +
    "        FROM " + T_REFERENCIA +
    "        WHERE " + C_REFERENCIA_LENGUA_COD_VSCL + " = NEW." + C_REFERENCIA_LENGUA_COD_VSCL +
    "          AND " + C_REFERENCIA_VERSION_COD_VSCL + " = NEW." + C_REFERENCIA_VERSION_COD_VSCL +
    "          AND " + C_REFERENCIA_LIBRO_COD_VSCL + " = NEW." + C_REFERENCIA_LIBRO_COD_VSCL +
    "          AND " + C_REFERENCIA_CAPITULO_COD_VSCL + " = NEW." + C_REFERENCIA_CAPITULO_COD_VSCL +
    "          AND " + C_REFERENCIA_VERSICULO_COD_VSCL + " = NEW." + C_REFERENCIA_VERSICULO_COD_VSCL +
    "          AND " + C_REFERENCIA_TIPO_REF_COD_TPRFRC + " = NEW." + C_REFERENCIA_TIPO_REF_COD_TPRFRC +
    "    )" +
    "    WHERE rowid = NEW.rowid;" +
    " END;";

  // ---- Cargar Tablas ----
  // Tabla Lengua
  private static final String LOAD_TABLE_LENGUA = "INSERT INTO Lengua (codLengua_lg, nombre_lg)\n" +
    "VALUES\n" +
    "('spa', 'Español');";

    // Tabla Version
  private static final String LOAD_TABLE_VERSION = "INSERT INTO Version (codLengua_vs, codVersion_vs, nombre_vs)\n" +
    "VALUES\n" +
    "('spa', 'RVR1960', 'Reina-Valera 1960');";

  // Tabla Lectura
  private static final String LOAD_TABLE_LECTURA = "INSERT INTO Lectura (codLengua_ltr, codVersion_ltr, codLectura_ltr, titulo_ltr, fecha_ltr, completado_ltr,\n" +
    "\talfaSiglaLibro_ltr, alfaCapitulo_ltr, alfaVerso_ltr, betaSiglaLibro_ltr, betaCapitulo_ltr, betaVerso_ltr)\n" +
    "VALUES\n" +
    "\n" +
    "-- GÉNESIS Y ÉXODO (Días 1-30)\n" +
    "('spa', 'RVR1960', 1, 'Dios crea', date('now'), 0, 'Gn', 1, 1, 'Gn', 2, 25),\n" +
    "('spa', 'RVR1960', 2, 'La gente peca', date('now', '+1 day'), 0, 'Gn', 3, 1, 'Gn', 5, 32),\n" +
    "('spa', 'RVR1960', 3, 'El diluvio', date('now', '+2 days'), 0, 'Gn', 6, 1, 'Gn', 9, 29),\n" +
    "('spa', 'RVR1960', 4, 'La torre', date('now', '+3 days'), 0, 'Gn', 10, 1, 'Gn', 11, 26),\n" +
    "('spa', 'RVR1960', 5, 'Abraham obedece el llamado de Dios', date('now', '+4 days'), 0, 'Gn', 11, 27, 'Gn', 14, 24),\n" +
    "('spa', 'RVR1960', 6, 'Dios hace un pacto con Abraham', date('now', '+5 days'), 0, 'Gn', 15, 1, 'Gn', 18, 15),\n" +
    "('spa', 'RVR1960', 7, 'Sodoma y Gomorra', date('now', '+6 days'), 0, 'Gn', 18, 16, 'Gn', 19, 38),\n" +
    "('spa', 'RVR1960', 8, 'La fe de Abraham es probada', date('now', '+7 days'), 0, 'Gn', 20, 1, 'Gn', 23, 20),\n" +
    "('spa', 'RVR1960', 9, 'Isaac: La familia se expande', date('now', '+8 days'), 0, 'Gn', 24, 1, 'Gn', 25, 26),\n" +
    "('spa', 'RVR1960', 10, 'Jacob engaña a Isaac y roba la bendición', date('now', '+9 days'), 0, 'Gn', 25, 27, 'Gn', 28, 9),\n" +
    "('spa', 'RVR1960', 11, 'Jacob: La familia se expande', date('now', '+10 days'), 0, 'Gn', 28, 10, 'Gn', 30, 43),\n" +
    "('spa', 'RVR1960', 12, 'Jacob huye de Labán y lucha con Dios', date('now', '+11 days'), 0, 'Gn', 31, 1, 'Gn', 33, 20),\n" +
    "('spa', 'RVR1960', 13, 'Jacob se re-asienta en Canaán', date('now', '+12 days'), 0, 'Gn', 34, 1, 'Gn', 36, 43),\n" +
    "('spa', 'RVR1960', 14, 'José el soñador sufre dificultades', date('now', '+13 days'), 0, 'Gn', 37, 1, 'Gn', 40, 23),\n" +
    "('spa', 'RVR1960', 15, 'José el Intérprete es Exaltado', date('now', '+14 days'), 0, 'Gn', 41, 1, 'Gn', 41, 57),\n" +
    "('spa', 'RVR1960', 16, 'Los Hermanos de José Buscan Comida en Egipto', date('now', '+15 days'), 0, 'Gn', 42, 1, 'Gn', 43, 34),\n" +
    "('spa', 'RVR1960', 17, 'José se reúne con su familia', date('now', '+16 days'), 0, 'Gn', 44, 1, 'Gn', 47, 26),\n" +
    "('spa', 'RVR1960', 18, 'Los Últimos Días de Jacob y José', date('now', '+17 days'), 0, 'Gn', 47, 27, 'Gn', 50, 26),\n" +
    "('spa', 'RVR1960', 19, 'Los Israelitas son esclavizados y Moisés es llamado', date('now', '+18 days'), 0, 'Ex', 1, 1, 'Ex', 4, 31),\n" +
    "('spa', 'RVR1960', 20, 'Moisés regresa a Egipto y se enfrenta al Faraón', date('now', '+19 days'), 0, 'Ex', 5, 1, 'Ex', 7, 13),\n" +
    "('spa', 'RVR1960', 21, 'Las Nueve Plagas', date('now', '+20 days'), 0, 'Ex', 7, 14, 'Ex', 10, 29),\n" +
    "('spa', 'RVR1960', 22, 'La Pascua', date('now', '+21 days'), 0, 'Ex', 11, 1, 'Ex', 13, 16),\n" +
    "('spa', 'RVR1960', 23, 'Israelitas salen de Egipto cruzan el Mar Rojo', date('now', '+22 days'), 0, 'Ex', 13, 17, 'Ex', 15, 21),\n" +
    "('spa', 'RVR1960', 24, 'El viaje por el Desierto al Sinaí', date('now', '+23 days'), 0, 'Ex', 15, 22, 'Ex', 18, 27),\n" +
    "('spa', 'RVR1960', 25, 'Los Diez Mandamientos', date('now', '+24 days'), 0, 'Ex', 19, 1, 'Ex', 20, 21),\n" +
    "('spa', 'RVR1960', 26, 'Las Leyes del Pacto', date('now', '+25 days'), 0, 'Ex', 20, 22, 'Ex', 23, 33),\n" +
    "('spa', 'RVR1960', 27, 'Instrucciones para el Tabernáculo 1', date('now', '+26 days'), 0, 'Ex', 24, 1, 'Ex', 27, 21),\n" +
    "('spa', 'RVR1960', 28, 'Instrucciones para los Sacerdotes', date('now', '+27 days'), 0, 'Ex', 28, 1, 'Ex', 29, 46),\n" +
    "('spa', 'RVR1960', 29, 'Instrucciones para el Tabernáculo 2', date('now', '+28 days'), 0, 'Ex', 30, 1, 'Ex', 31, 18),\n" +
    "('spa', 'RVR1960', 30, 'Idolatría de Israel y Misericordia de Dios', date('now', '+29 days'), 0, 'Ex', 32, 1, 'Ex', 34, 35),\n" +
    "('spa', 'RVR1960', 31, 'Construcción del Tabernáculo Comienza', date('now', '+30 days'), 0, 'Ex', 35, 1, 'Ex', 38, 31),\n" +
    "('spa', 'RVR1960', 32, 'Tabernáculo Terminado lleno de la Gloria de Dios', date('now', '+31 days'), 0, 'Ex', 39, 1, 'Ex', 40, 38),\n" +
    "\n" +
    "-- LEVÍTICO, NÚMEROS Y DEUTERONOMIO (Días 33-68)\n" +
    "('spa', 'RVR1960', 33, 'Las ofrendas 1', date('now', '+32 days'), 0, 'Lv', 1, 1, 'Lv', 4, 35),\n" +
    "('spa', 'RVR1960', 34, 'Las ofrendas 2', date('now', '+33 days'), 0, 'Lv', 5, 1, 'Lv', 7, 38),\n" +
    "('spa', 'RVR1960', 35, 'La ordenación de Sacerdotes', date('now', '+34 days'), 0, 'Lv', 8, 1, 'Lv', 10, 20),\n" +
    "('spa', 'RVR1960', 36, 'Lo puro y lo impuro 1', date('now', '+35 days'), 0, 'Lv', 11, 1, 'Lv', 13, 59),\n" +
    "('spa', 'RVR1960', 37, 'Lo puro y lo impuro 2', date('now', '+36 days'), 0, 'Lv', 14, 1, 'Lv', 15, 33),\n" +
    "('spa', 'RVR1960', 38, 'La Expiación y la Purificación', date('now', '+37 days'), 0, 'Lv', 16, 1, 'Lv', 17, 16),\n" +
    "('spa', 'RVR1960', 39, 'Sed Santos porque Yo Soy Santo', date('now', '+38 days'), 0, 'Lv', 18, 1, 'Lv', 20, 27),\n" +
    "('spa', 'RVR1960', 40, 'Las Leyes para los Sacerdotes', date('now', '+39 days'), 0, 'Lv', 21, 1, 'Lv', 22, 33),\n" +
    "('spa', 'RVR1960', 41, 'Los Días Especiales', date('now', '+40 days'), 0, 'Lv', 23, 1, 'Lv', 24, 23),\n" +
    "('spa', 'RVR1960', 42, 'Los Años Especiales', date('now', '+41 days'), 0, 'Lv', 25, 1, 'Lv', 25, 55),\n" +
    "('spa', 'RVR1960', 43, 'Las Bendiciones y las Maldiciones', date('now', '+42 days'), 0, 'Lv', 26, 1, 'Lv', 27, 34),\n" +
    "('spa', 'RVR1960', 44, 'El Primer Censo', date('now', '+43 days'), 0, 'Nm', 1, 1, 'Nm', 2, 34),\n" +
    "('spa', 'RVR1960', 45, 'Los Levitas Enumerados y Apartados', date('now', '+44 days'), 0, 'Nm', 3, 1, 'Nm', 4, 49),\n" +
    "('spa', 'RVR1960', 46, 'Pureza, Consagración y Bendición', date('now', '+45 days'), 0, 'Nm', 5, 1, 'Nm', 6, 27),\n" +
    "('spa', 'RVR1960', 47, 'La Celebración y Preparación para el Viaje', date('now', '+46 days'), 0, 'Nm', 7, 1, 'Nm', 8, 26),\n" +
    "('spa', 'RVR1960', 48, 'Salida y Quejas en el Desierto', date('now', '+47 days'), 0, 'Nm', 9, 1, 'Nm', 12, 16),\n" +
    "('spa', 'RVR1960', 49, 'Tierra P Explorada y Herencia Rechazada', date('now', '+48 days'), 0, 'Nm', 13, 1, 'Nm', 15, 31),\n" +
    "('spa', 'RVR1960', 50, 'La Rebelión en el Desierto', date('now', '+49 days'), 0, 'Nm', 15, 32, 'Nm', 18, 32),\n" +
    "('spa', 'RVR1960', 51, 'Provisión y Victorias en el Desierto', date('now', '+50 days'), 0, 'Nm', 19, 1, 'Nm', 21, 35),\n" +
    "('spa', 'RVR1960', 52, 'Balaam', date('now', '+51 days'), 0, 'Nm', 22, 1, 'Nm', 25, 18),\n" +
    "('spa', 'RVR1960', 53, 'El Segundo Censo', date('now', '+52 days'), 0, 'Nm', 26, 1, 'Nm', 27, 23),\n" +
    "('spa', 'RVR1960', 54, 'Ofrendas y Votos', date('now', '+53 days'), 0, 'Nm', 28, 1, 'Nm', 30, 16),\n" +
    "('spa', 'RVR1960', 55, 'Guerras y Viajes', date('now', '+54 days'), 0, 'Nm', 31, 1, 'Nm', 33, 49),\n" +
    "('spa', 'RVR1960', 56, 'Preparándose para la Tierra Prometida', date('now', '+55 days'), 0, 'Nm', 33, 50, 'Nm', 36, 13),\n" +
    "('spa', 'RVR1960', 57, 'Recordando el Viaje de 40 Años', date('now', '+56 days'), 0, 'Dt', 1, 1, 'Dt', 3, 20),\n" +
    "('spa', 'RVR1960', 58, 'Escuchar y Obedecer', date('now', '+57 days'), 0, 'Dt', 3, 21, 'Dt', 4, 43),\n" +
    "('spa', 'RVR1960', 59, 'El Corazón del Pacto', date('now', '+58 days'), 0, 'Dt', 4, 44, 'Dt', 7, 26),\n" +
    "('spa', 'RVR1960', 60, 'La meta del Pacto', date('now', '+59 days'), 0, 'Dt', 8, 1, 'Dt', 11, 32),\n" +
    "('spa', 'RVR1960', 61, 'Las Leyes del Pacto 1', date('now', '+60 days'), 0, 'Dt', 12, 1, 'Dt', 14, 29),\n" +
    "('spa', 'RVR1960', 62, 'Las Leyes del Pacto 2', date('now', '+61 days'), 0, 'Dt', 15, 1, 'Dt', 18, 22),\n" +
    "('spa', 'RVR1960', 63, 'Las Leyes del Pacto 3', date('now', '+62 days'), 0, 'Dt', 19, 1, 'Dt', 22, 12),\n" +
    "('spa', 'RVR1960', 64, 'Las Leyes del Pacto 4', date('now', '+63 days'), 0, 'Dt', 22, 13, 'Dt', 26, 19),\n" +
    "('spa', 'RVR1960', 65, 'Bendiciones y Maldiciones', date('now', '+64 days'), 0, 'Dt', 27, 1, 'Dt', 28, 68),\n" +
    "('spa', 'RVR1960', 66, 'La Vida y la Muerte', date('now', '+65 days'), 0, 'Dt', 29, 1, 'Dt', 30, 20),\n" +
    "('spa', 'RVR1960', 67, 'Josué Designado y Canto de Moisés', date('now', '+66 days'), 0, 'Dt', 31, 1, 'Dt', 32, 52),\n" +
    "('spa', 'RVR1960', 68, 'Bendición y Muerte de Moisés', date('now', '+67 days'), 0, 'Dt', 33, 1, 'Dt', 34, 12),\n" +
    "\n" +
    "-- JOSUÉ, JUECES Y RUT (Días 69-85)\n" +
    "('spa', 'RVR1960', 69, 'Preparándose para Heredar la Tierra', date('now', '+68 days'), 0, 'Jos', 1, 1, 'Jos', 5, 1),\n" +
    "('spa', 'RVR1960', 70, 'La Victoria en Jericó', date('now', '+69 days'), 0, 'Jos', 5, 2, 'Jos', 6, 27),\n" +
    "('spa', 'RVR1960', 71, 'La Derrota en Hai', date('now', '+70 days'), 0, 'Jos', 7, 1, 'Jos', 8, 35),\n" +
    "('spa', 'RVR1960', 72, 'Conquistando la herencia', date('now', '+71 days'), 0, 'Jos', 9, 1, 'Jos', 12, 24),\n" +
    "('spa', 'RVR1960', 73, 'La Herencia 1', date('now', '+72 days'), 0, 'Jos', 13, 1, 'Jos', 15, 63),\n" +
    "('spa', 'RVR1960', 74, 'La Herencia 2', date('now', '+73 days'), 0, 'Jos', 16, 1, 'Jos', 19, 51),\n" +
    "('spa', 'RVR1960', 75, 'La Herencia 3', date('now', '+74 days'), 0, 'Jos', 20, 1, 'Jos', 22, 34),\n" +
    "('spa', 'RVR1960', 76, 'Palabras de despedida de Josué', date('now', '+75 days'), 0, 'Jos', 23, 1, 'Jos', 24, 33),\n" +
    "('spa', 'RVR1960', 77, 'Pecado, Esclavitud, Súplica y Salvación', date('now', '+76 days'), 0, 'Jue', 1, 1, 'Jue', 3, 6),\n" +
    "('spa', 'RVR1960', 78, 'Otoniel, Aod, Samgar y Deborah', date('now', '+77 days'), 0, 'Jue', 3, 7, 'Jue', 5, 31),\n" +
    "('spa', 'RVR1960', 79, 'Gedeón', date('now', '+78 days'), 0, 'Jue', 6, 1, 'Jue', 8, 32),\n" +
    "('spa', 'RVR1960', 80, 'Abimelec, Tola y Jair', date('now', '+79 days'), 0, 'Jue', 8, 33, 'Jue', 10, 5),\n" +
    "('spa', 'RVR1960', 81, 'Jefté, Ibzán, Elón y Abdón', date('now', '+80 days'), 0, 'Jue', 10, 6, 'Jue', 12, 15),\n" +
    "('spa', 'RVR1960', 82, 'Samsón', date('now', '+81 days'), 0, 'Jue', 13, 1, 'Jue', 16, 31),\n" +
    "('spa', 'RVR1960', 83, 'Haciendo lo Recto Delante de Sus Ojos 1', date('now', '+82 days'), 0, 'Jue', 17, 1, 'Jue', 18, 31),\n" +
    "('spa', 'RVR1960', 84, 'Haciendo lo Recto Delante de Sus Ojos 2', date('now', '+83 days'), 0, 'Jue', 19, 1, 'Jue', 21, 25),\n" +
    "('spa', 'RVR1960', 85, 'Una Sorprendente Historia de Amor', date('now', '+84 days'), 0, 'Rt', 1, 1, 'Rt', 4, 22),\n" +
    "\n" +
    "-- 1 Y 2 SAMUEL (Días 86-104)\n" +
    "('spa', 'RVR1960', 86, 'Dios está con Samuel', date('now', '+85 days'), 0, '1 S', 1, 1, '1 S', 4, 1),\n" +
    "('spa', 'RVR1960', 87, 'Israel Demanda un Rey', date('now', '+86 days'), 0, '1 S', 4, 1, '1 S', 8, 22),\n" +
    "('spa', 'RVR1960', 88, 'Saúl se convierte en Rey', date('now', '+87 days'), 0, '1 S', 9, 1, '1 S', 12, 25),\n" +
    "('spa', 'RVR1960', 89, 'La Insensatez de Saúl', date('now', '+88 days'), 0, '1 S', 13, 1, '1 S', 14, 52),\n" +
    "('spa', 'RVR1960', 90, 'Dios rechaza a Saúl y Samuel unge a David', date('now', '+89 days'), 0, '1 S', 15, 1, '1 S', 16, 23),\n" +
    "('spa', 'RVR1960', 91, 'Saúl disminuye y David aumenta 1', date('now', '+90 days'), 0, '1 S', 17, 1, '1 S', 18, 30),\n" +
    "('spa', 'RVR1960', 92, 'Saúl disminuye y David aumenta 2', date('now', '+91 days'), 0, '1 S', 19, 1, '1 S', 20, 42),\n" +
    "('spa', 'RVR1960', 93, 'Saúl disminuye y David aumenta 3', date('now', '+92 days'), 0, '1 S', 21, 1, '1 S', 23, 29),\n" +
    "('spa', 'RVR1960', 94, 'Saúl Disminuye y David aumenta 4', date('now', '+93 days'), 0, '1 S', 24, 1, '1 S', 27, 12),\n" +
    "('spa', 'RVR1960', 95, 'Saúl Disminuye y David aumenta 5', date('now', '+94 days'), 0, '1 S', 28, 1, '1 S', 30, 31),\n" +
    "('spa', 'RVR1960', 96, 'La Muerte de Saúl y el Lamento de David', date('now', '+95 days'), 0, '1 S', 31, 1, '2 S', 2, 7),\n" +
    "('spa', 'RVR1960', 97, 'David se convierte en Rey', date('now', '+96 days'), 0, '2 S', 2, 8, '2 S', 5, 25),\n" +
    "('spa', 'RVR1960', 98, 'Dios hace un pacto con David', date('now', '+97 days'), 0, '2 S', 6, 1, '2 S', 7, 29),\n" +
    "('spa', 'RVR1960', 99, 'Las Victorias de David', date('now', '+98 days'), 0, '2 S', 8, 1, '2 S', 10, 19),\n" +
    "('spa', 'RVR1960', 100, 'Los fracasos de David', date('now', '+99 days'), 0, '2 S', 11, 1, '2 S', 13, 39),\n" +
    "('spa', 'RVR1960', 101, 'El Golpe Militar de Absalón 1', date('now', '+100 days'), 0, '2 S', 14, 1, '2 S', 16, 14),\n" +
    "('spa', 'RVR1960', 102, 'El Golpe Militar de Absalón 2', date('now', '+101 days'), 0, '2 S', 16, 15, '2 S', 19, 8),\n" +
    "('spa', 'RVR1960', 103, 'David Restaurado como Rey', date('now', '+102 days'), 0, '2 S', 19, 8, '2 S', 21, 14),\n" +
    "('spa', 'RVR1960', 104, 'Reinado Tardío de David', date('now', '+103 days'), 0, '2 S', 21, 15, '2 S', 24, 25),\n" +
    "\n" +
    "-- 1 Y 2 REYES (Días 105-124)\n" +
    "('spa', 'RVR1960', 105, 'Salomón se convierte en Rey', date('now', '+104 days'), 0, '1 R', 1, 1, '1 R', 2, 46),\n" +
    "('spa', 'RVR1960', 106, 'Los comienzos sabios de Salomón', date('now', '+105 days'), 0, '1 R', 3, 1, '1 R', 6, 38),\n" +
    "('spa', 'RVR1960', 107, 'Salomón termina el Templo', date('now', '+106 days'), 0, '1 R', 7, 1, '1 R', 7, 51),\n" +
    "('spa', 'RVR1960', 108, 'Salomón dedica el Templo', date('now', '+107 days'), 0, '1 R', 8, 1, '1 R', 9, 1),\n" +
    "('spa', 'RVR1960', 109, 'El Final Insensato de Salomón', date('now', '+108 days'), 0, '1 R', 9, 2, '1 R', 11, 43),\n" +
    "('spa', 'RVR1960', 110, '¡Reino Dividido! Roboam de Judá; Jeroboam I de Israel', date('now', '+109 days'), 0, '1 R', 12, 1, '1 R', 14, 20),\n" +
    "('spa', 'RVR1960', 111, 'Jeroboam, Ahías y Asa de Judá; Nadab, Baasa, Ela, Zimri & Omri de Israel', date('now', '+110 days'), 0, '1 R', 14, 21, '1 R', 16, 28),\n" +
    "('spa', 'RVR1960', 112, 'El Profeta Elías y Acab de Israel 1', date('now', '+111 days'), 0, '1 R', 16, 29, '1 R', 18, 46),\n" +
    "('spa', 'RVR1960', 113, 'El Profeta Elías y Acab de Israel 2', date('now', '+112 days'), 0, '1 R', 19, 1, '1 R', 20, 43),\n" +
    "('spa', 'RVR1960', 114, 'El Profeta Elías y Acab de Israel 3', date('now', '+113 days'), 0, '1 R', 21, 1, '1 R', 22, 40),\n" +
    "('spa', 'RVR1960', 115, 'Josafat de Judá; Ocozías y Joram de Israel', date('now', '+114 days'), 0, '1 R', 22, 41, '2 R', 3, 27),\n" +
    "('spa', 'RVR1960', 116, 'El Ministerio de Eliseo a Individuos', date('now', '+115 days'), 0, '2 R', 4, 1, '2 R', 6, 7),\n" +
    "('spa', 'RVR1960', 117, 'El Ministerio de Eliseo a Naciones', date('now', '+116 days'), 0, '2 R', 6, 8, '2 R', 8, 15),\n" +
    "('spa', 'RVR1960', 118, 'Joram y Ocozías de Judá; Jehú de Israel', date('now', '+117 days'), 0, '2 R', 8, 16, '2 R', 10, 36),\n" +
    "('spa', 'RVR1960', 119, 'Atalía y Joás de Judá; Joacaz y Joás de Israel', date('now', '+118 days'), 0, '2 R', 11, 1, '2 R', 13, 25),\n" +
    "('spa', 'RVR1960', 120, 'Amasías y Uzías de Judá; Jeroboam II, Zacarías, Salum, Manahem, Pekaía y Peka de Israel', date('now', '+119 days'), 0, '2 R', 14, 1, '2 R', 15, 31),\n" +
    "('spa', 'RVR1960', 121, 'Jotam a Acaz de Judá; Oseas de Israel', date('now', '+120 days'), 0, '2 R', 15, 32, '2 R', 17, 41),\n" +
    "('spa', 'RVR1960', 122, 'Ezequías de Judá', date('now', '+121 days'), 0, '2 R', 18, 1, '2 R', 20, 21),\n" +
    "('spa', 'RVR1960', 123, 'Manasés, Amón y Josías de Judá', date('now', '+122 days'), 0, '2 R', 21, 1, '2 R', 23, 30),\n" +
    "('spa', 'RVR1960', 124, 'Joacaz, Joacim, Joaquín y Sedequías de Judá', date('now', '+123 days'), 0, '2 R', 23, 31, '2 R', 25, 30),\n" +
    "\n" +
    "-- 1 Y 2 CRÓNICAS (Días 125-144)\n" +
    "('spa', 'RVR1960', 125, 'Genealogía desde Adán hasta los Exiliados Retornados 1', date('now', '+124 days'), 0, '1 Cr', 1, 1, '1 Cr', 4, 23),\n" +
    "('spa', 'RVR1960', 126, 'Genealogía desde Adán hasta los Exiliados Retornados 2', date('now', '+125 days'), 0, '1 Cr', 4, 24, '1 Cr', 6, 81),\n" +
    "('spa', 'RVR1960', 127, 'Genealogía desde Adán hasta los Exiliados Retornados 3', date('now', '+126 days'), 0, '1 Cr', 7, 1, '1 Cr', 9, 44),\n" +
    "('spa', 'RVR1960', 128, 'Saúl es asesinado y David pasa a ser Rey', date('now', '+127 days'), 0, '1 Cr', 10, 1, '1 Cr', 12, 40),\n" +
    "('spa', 'RVR1960', 129, 'David trae el Arca a Jerusalén', date('now', '+128 days'), 0, '1 Cr', 13, 1, '1 Cr', 16, 43),\n" +
    "('spa', 'RVR1960', 130, 'El Pacto de Dios; Las Victorias de David', date('now', '+129 days'), 0, '1 Cr', 17, 1, '1 Cr', 20, 8),\n" +
    "('spa', 'RVR1960', 131, 'El Censo y los preparativos del Templo', date('now', '+130 days'), 0, '1 Cr', 21, 1, '1 Cr', 23, 1),\n" +
    "('spa', 'RVR1960', 132, 'David Organiza Estructuras Religiosas', date('now', '+131 days'), 0, '1 Cr', 23, 2, '1 Cr', 26, 32),\n" +
    "('spa', 'RVR1960', 133, 'David Organiza Estructuras Gubernamentales', date('now', '+132 days'), 0, '1 Cr', 27, 1, '1 Cr', 29, 30),\n" +
    "('spa', 'RVR1960', 134, 'Salomón construye el Templo', date('now', '+133 days'), 0, '2 Cr', 1, 1, '2 Cr', 5, 1),\n" +
    "('spa', 'RVR1960', 135, 'Salomón dedica el Templo', date('now', '+134 days'), 0, '2 Cr', 5, 2, '2 Cr', 7, 22),\n" +
    "('spa', 'RVR1960', 136, 'Los Logros de Salomón', date('now', '+135 days'), 0, '2 Cr', 8, 1, '2 Cr', 9, 31),\n" +
    "('spa', 'RVR1960', 137, 'Roboam de Judá', date('now', '+136 days'), 0, '2 Cr', 10, 1, '2 Cr', 12, 16),\n" +
    "('spa', 'RVR1960', 138, 'Abías y Asa de Judá', date('now', '+137 days'), 0, '2 Cr', 13, 1, '2 Cr', 16, 14),\n" +
    "('spa', 'RVR1960', 139, 'Josafat de Judá', date('now', '+138 days'), 0, '2 Cr', 17, 1, '2 Cr', 20, 37),\n" +
    "('spa', 'RVR1960', 140, 'Joram, Ocozías, Atalía y Joás de Judá', date('now', '+139 days'), 0, '2 Cr', 21, 1, '2 Cr', 24, 27),\n" +
    "('spa', 'RVR1960', 141, 'Amasías, Uzías, Jotam a Acaz de Judá', date('now', '+140 days'), 0, '2 Cr', 25, 1, '2 Cr', 28, 27),\n" +
    "('spa', 'RVR1960', 142, 'Ezequías (Parte 1) de Judá', date('now', '+141 days'), 0, '2 Cr', 29, 1, '2 Cr', 31, 21),\n" +
    "('spa', 'RVR1960', 143, 'Ezequías (Parte 2), Manasés y Amón de Judá', date('now', '+142 days'), 0, '2 Cr', 32, 1, '2 Cr', 33, 25),\n" +
    "('spa', 'RVR1960', 144, 'Josías, Joacaz, Joacim, Joaquín y Sedequías de Judá', date('now', '+143 days'), 0, '2 Cr', 34, 1, '2 Cr', 36, 23),\n" +
    "\n" +
    "-- ESDRAS, NEHEMÍAS, ESTER Y JOB (Días 145-161)\n" +
    "('spa', 'RVR1960', 145, 'El Primer Retorno de los Exiliados: Zorobabel', date('now', '+144 days'), 0, 'Esd', 1, 1, 'Esd', 3, 13),\n" +
    "('spa', 'RVR1960', 146, 'La Oposición y Reconstrucción del Templo', date('now', '+145 days'), 0, 'Esd', 4, 1, 'Esd', 6, 22),\n" +
    "('spa', 'RVR1960', 147, 'Segundo Retorno de los Exiliados: Esdras', date('now', '+146 days'), 0, 'Esd', 7, 1, 'Esd', 8, 36),\n" +
    "('spa', 'RVR1960', 148, 'La Desobediencia y el Arrepentimiento del Pueblo', date('now', '+147 days'), 0, 'Esd', 9, 1, 'Esd', 10, 44),\n" +
    "('spa', 'RVR1960', 149, 'Nehemias comienza la reconstrucción del Muro', date('now', '+148 days'), 0, 'Neh', 1, 1, 'Neh', 3, 32),\n" +
    "('spa', 'RVR1960', 150, 'El Muro se Reconstruye en medio de la oposición', date('now', '+149 days'), 0, 'Neh', 4, 1, 'Neh', 7, 73),\n" +
    "('spa', 'RVR1960', 151, 'La gente es restaurada', date('now', '+150 days'), 0, 'Neh', 7, 73, 'Neh', 10, 39),\n" +
    "('spa', 'RVR1960', 152, 'El Muro y la Gente son re-dedicados', date('now', '+151 days'), 0, 'Neh', 11, 1, 'Neh', 13, 31),\n" +
    "('spa', 'RVR1960', 153, 'Ester pasa a ser Reina', date('now', '+152 days'), 0, 'Est', 1, 1, 'Est', 4, 17),\n" +
    "('spa', 'RVR1960', 154, 'Ester salva a su gente', date('now', '+153 days'), 0, 'Est', 5, 1, 'Est', 10, 3),\n" +
    "('spa', 'RVR1960', 155, 'Un Desafío Cósmico: Job Habla', date('now', '+154 days'), 0, 'Job', 1, 1, 'Job', 3, 26),\n" +
    "('spa', 'RVR1960', 156, 'Elifaz y Bildad Hablan; Job Responde', date('now', '+155 days'), 0, 'Job', 4, 1, 'Job', 10, 22),\n" +
    "('spa', 'RVR1960', 157, 'Zofar y Elifaz hablan; Job responde', date('now', '+156 days'), 0, 'Job', 11, 1, 'Job', 17, 16),\n" +
    "('spa', 'RVR1960', 158, 'Bildad, Zofar y Elifaz Hablan; Job Responde', date('now', '+157 days'), 0, 'Job', 18, 1, 'Job', 24, 25),\n" +
    "('spa', 'RVR1960', 159, 'Bildad Habla; Job Responde', date('now', '+158 days'), 0, 'Job', 25, 1, 'Job', 31, 40),\n" +
    "('spa', 'RVR1960', 160, 'Eliú Habla', date('now', '+159 days'), 0, 'Job', 32, 1, 'Job', 37, 24),\n" +
    "('spa', 'RVR1960', 161, 'Dios Habla; Job Responde', date('now', '+160 days'), 0, 'Job', 38, 1, 'Job', 42, 17),\n" +
    "\n" +
    "-- SALMOS (Días 162-179)\n" +
    "('spa', 'RVR1960', 162, 'Libro 1: Cantos de Alabanza y Oraciones de Fe 1', date('now', '+161 days'), 0, 'Sal', 1, 1, 'Sal', 13, 6),\n" +
    "('spa', 'RVR1960', 163, 'Libro 1: Cantos de Alabanza y Oraciones de Fe 2', date('now', '+162 days'), 0, 'Sal', 14, 1, 'Sal', 22, 31),\n" +
    "('spa', 'RVR1960', 164, 'Libro 1: Cantos de Alabanza y Oraciones de Fe 3', date('now', '+163 days'), 0, 'Sal', 23, 1, 'Sal', 33, 22),\n" +
    "('spa', 'RVR1960', 165, 'Libro 1: Cantos de Alabanza y Oraciones de Fe 4', date('now', '+164 days'), 0, 'Sal', 34, 1, 'Sal', 41, 13),\n" +
    "('spa', 'RVR1960', 166, 'Libro 2: Cantos de conflicto y salvación 1', date('now', '+165 days'), 0, 'Sal', 42, 1, 'Sal', 51, 19),\n" +
    "('spa', 'RVR1960', 167, 'Libro 2: Cantos de conflicto y salvación 2', date('now', '+166 days'), 0, 'Sal', 52, 1, 'Sal', 64, 10),\n" +
    "('spa', 'RVR1960', 168, 'Libro 2: Cantos de Conflicto y Salvación 3', date('now', '+167 days'), 0, 'Sal', 65, 1, 'Sal', 72, 20),\n" +
    "('spa', 'RVR1960', 169, 'Libro 3: Cantos de Asaf 1', date('now', '+168 days'), 0, 'Sal', 73, 1, 'Sal', 77, 20),\n" +
    "('spa', 'RVR1960', 170, 'Libro 3: Cantos de Asaf 2', date('now', '+169 days'), 0, 'Sal', 78, 1, 'Sal', 83, 18),\n" +
    "('spa', 'RVR1960', 171, 'Libro 3: Cantos de Muchos Salmistas', date('now', '+170 days'), 0, 'Sal', 84, 1, 'Sal', 89, 52),\n" +
    "('spa', 'RVR1960', 172, 'Libro 4: Dios nuestro Dios y refugio', date('now', '+171 days'), 0, 'Sal', 90, 1, 'Sal', 100, 5),\n" +
    "('spa', 'RVR1960', 173, 'Libro 4: Dios nuestro Libertador', date('now', '+172 days'), 0, 'Sal', 101, 1, 'Sal', 106, 48),\n" +
    "('spa', 'RVR1960', 174, 'Libro 5: Dios nuestro Libertador', date('now', '+173 days'), 0, 'Sal', 107, 1, 'Sal', 112, 10),\n" +
    "('spa', 'RVR1960', 175, 'Libro 5: El Halel Egipcio', date('now', '+174 days'), 0, 'Sal', 113, 1, 'Sal', 118, 29),\n" +
    "('spa', 'RVR1960', 176, 'Libro 5: La Palabra de Dios', date('now', '+175 days'), 0, 'Sal', 119, 1, 'Sal', 119, 176),\n" +
    "('spa', 'RVR1960', 177, 'Libro 5: El Gran Halel', date('now', '+176 days'), 0, 'Sal', 120, 1, 'Sal', 136, 26),\n" +
    "('spa', 'RVR1960', 178, 'Libro 5: Oraciones de Liberación', date('now', '+177 days'), 0, 'Sal', 137, 1, 'Sal', 145, 21),\n" +
    "('spa', 'RVR1960', 179, 'Libro 5: El Halel Final', date('now', '+178 days'), 0, 'Sal', 146, 1, 'Sal', 150, 6),\n" +
    "\n" +
    "-- PROVERBIOS, ECLESIASTÉS Y CANTARES (Días 180-189)\n" +
    "('spa', 'RVR1960', 180, 'Los Proverbios revelan sabiduría e insensatez 1', date('now', '+179 days'), 0, 'Pr', 1, 1, 'Pr', 5, 23),\n" +
    "('spa', 'RVR1960', 181, 'Los Proverbios revelan sabiduría e insensatez 2', date('now', '+180 days'), 0, 'Pr', 6, 1, 'Pr', 9, 18),\n" +
    "('spa', 'RVR1960', 182, 'Los Proverbios de Salomón 1', date('now', '+181 days'), 0, 'Pr', 10, 1, 'Pr', 15, 33),\n" +
    "('spa', 'RVR1960', 183, 'Los Proverbios de Salomón 2', date('now', '+182 days'), 0, 'Pr', 16, 1, 'Pr', 22, 16),\n" +
    "('spa', 'RVR1960', 184, 'Los Proverbios de los Sabios 1', date('now', '+183 days'), 0, 'Pr', 22, 17, 'Pr', 24, 34),\n" +
    "('spa', 'RVR1960', 185, 'Los Proverbios de Salomón 3', date('now', '+184 days'), 0, 'Pr', 25, 1, 'Pr', 29, 27),\n" +
    "('spa', 'RVR1960', 186, 'Los Proverbios de los Sabios 2', date('now', '+185 days'), 0, 'Pr', 30, 1, 'Pr', 31, 31),\n" +
    "('spa', 'RVR1960', 187, 'La Vida Bajo el Sol', date('now', '+186 days'), 0, 'Ec', 1, 1, 'Ec', 6, 12),\n" +
    "('spa', 'RVR1960', 188, 'Disfruta la vida y teme a Dios', date('now', '+187 days'), 0, 'Ec', 7, 1, 'Ec', 12, 14),\n" +
    "('spa', 'RVR1960', 189, 'Lo mejor del amor romántico', date('now', '+188 days'), 0, 'Cnt', 1, 1, 'Cnt', 8, 14),\n" +
    "\n" +
    "-- ISAÍAS Y JEREMÍAS (Días 190-224)\n" +
    "('spa', 'RVR1960', 190, 'Isaías profetizó durante el reinado de Uzías', date('now', '+189 days'), 0, 'Is', 1, 1, 'Is', 5, 30),\n" +
    "('spa', 'RVR1960', 191, 'Isaías se ofrece; Dios promete a Emanuel', date('now', '+190 days'), 0, 'Is', 6, 1, 'Is', 9, 7),\n" +
    "('spa', 'RVR1960', 192, 'Los Enemigos de Judá son Juzgados; El Reino venidero de Emanuel', date('now', '+191 days'), 0, 'Is', 9, 8, 'Is', 12, 6),\n" +
    "('spa', 'RVR1960', 193, 'Profecías para Babilonia, Asiria, Filistea, Moab, Siria e Israel', date('now', '+192 days'), 0, 'Is', 13, 1, 'Is', 17, 14),\n" +
    "('spa', 'RVR1960', 194, 'Profecías para Etiopía, Egipto, Babilonia, Edom, Arabia, Judá y Tiro', date('now', '+193 days'), 0, 'Is', 18, 1, 'Is', 23, 18),\n" +
    "('spa', 'RVR1960', 195, 'Juicio y Salvación Venideros 1', date('now', '+194 days'), 0, 'Is', 24, 1, 'Is', 27, 13),\n" +
    "('spa', 'RVR1960', 196, 'Juicio y salvación venideros 2', date('now', '+195 days'), 0, 'Is', 28, 1, 'Is', 30, 33),\n" +
    "('spa', 'RVR1960', 197, 'Juicio y salvación venideros 3', date('now', '+196 days'), 0, 'Is', 31, 1, 'Is', 35, 10),\n" +
    "('spa', 'RVR1960', 198, 'El Reinado de Ezequías: Una liberación milagrosa y errores desastrosos', date('now', '+197 days'), 0, 'Is', 36, 1, 'Is', 39, 8),\n" +
    "('spa', 'RVR1960', 199, 'El Evangelio proclamado; Dios e ídolos contrastados', date('now', '+198 days'), 0, 'Is', 40, 1, 'Is', 41, 29),\n" +
    "('spa', 'RVR1960', 200, 'El Primer Canto del Siervo; Dios e ídolos contrastados', date('now', '+199 days'), 0, 'Is', 42, 1, 'Is', 44, 23),\n" +
    "('spa', 'RVR1960', 201, 'Ciro el Siervo de Dios; Dios e ídolos contrastados', date('now', '+200 days'), 0, 'Is', 44, 24, 'Is', 48, 22),\n" +
    "('spa', 'RVR1960', 202, 'Dos cantos de siervos', date('now', '+201 days'), 0, 'Is', 49, 1, 'Is', 52, 12),\n" +
    "('spa', 'RVR1960', 203, 'Un canto final del siervo - El Camino de salvación de Dios', date('now', '+202 days'), 0, 'Is', 52, 13, 'Is', 57, 21),\n" +
    "('spa', 'RVR1960', 204, 'Preparándose para el reinado y salvación de Dios', date('now', '+203 days'), 0, 'Is', 58, 1, 'Is', 62, 12),\n" +
    "('spa', 'RVR1960', 205, 'Juicio y salvación venideros 4', date('now', '+204 days'), 0, 'Is', 63, 1, 'Is', 66, 24),\n" +
    "('spa', 'RVR1960', 206, 'Jeremías llamado a profetizar; Judá llamado al arrepentimiento', date('now', '+205 days'), 0, 'Jer', 1, 1, 'Jer', 4, 2),\n" +
    "('spa', 'RVR1960', 207, '¿No debería castigar? ¡Judá tiene que ser castigada!', date('now', '+206 days'), 0, 'Jer', 4, 3, 'Jer', 6, 30),\n" +
    "('spa', 'RVR1960', 208, '¿No debería castigar? ¡Judá será castigada!', date('now', '+207 days'), 0, 'Jer', 7, 1, 'Jer', 10, 25),\n" +
    "('spa', 'RVR1960', 209, 'El pacto quebrantado', date('now', '+208 days'), 0, 'Jer', 11, 1, 'Jer', 12, 17),\n" +
    "('spa', 'RVR1960', 210, 'Dios reacio a ceder', date('now', '+209 days'), 0, 'Jer', 13, 1, 'Jer', 15, 21),\n" +
    "('spa', 'RVR1960', 211, 'Dios dispuesto a ceder', date('now', '+210 days'), 0, 'Jer', 16, 1, 'Jer', 17, 27),\n" +
    "('spa', 'RVR1960', 212, 'Jeremías profetiza y sufre persecución 1', date('now', '+211 days'), 0, 'Jer', 18, 1, 'Jer', 20, 18),\n" +
    "('spa', 'RVR1960', 213, 'Juicio sobre líderes civiles y religiosos', date('now', '+212 days'), 0, 'Jer', 21, 1, 'Jer', 24, 10),\n" +
    "('spa', 'RVR1960', 214, 'Jeremías profetiza y sufre persecución 2', date('now', '+213 days'), 0, 'Jer', 25, 1, 'Jer', 28, 17),\n" +
    "('spa', 'RVR1960', 215, 'Cartas a los exiliados en Babilonia: Un nuevo pacto es prometido', date('now', '+214 days'), 0, 'Jer', 29, 1, 'Jer', 31, 40),\n" +
    "('spa', 'RVR1960', 216, 'La esperanza del pacto inspira a Jeremías a comprar un terreno', date('now', '+215 days'), 0, 'Jer', 32, 1, 'Jer', 33, 26),\n" +
    "('spa', 'RVR1960', 217, 'El pacto quebrantado de Sedequías; el pacto inquebrantable de Jonadab', date('now', '+216 days'), 0, 'Jer', 34, 1, 'Jer', 35, 19),\n" +
    "('spa', 'RVR1960', 218, 'Jeremías profetiza y sufre persecución 3', date('now', '+217 days'), 0, 'Jer', 36, 1, 'Jer', 38, 28),\n" +
    "('spa', 'RVR1960', 219, '¡Jerusalén cae!', date('now', '+218 days'), 0, 'Jer', 39, 1, 'Jer', 41, 18),\n" +
    "('spa', 'RVR1960', 220, 'La huida inútil a Egipto', date('now', '+219 days'), 0, 'Jer', 42, 1, 'Jer', 45, 5),\n" +
    "('spa', 'RVR1960', 221, 'Babilonia: Un agente del Juicio de Dios 1', date('now', '+220 days'), 0, 'Jer', 46, 1, 'Jer', 48, 47),\n" +
    "('spa', 'RVR1960', 222, 'Babilonia: Un agente del Juicio de Dios 2', date('now', '+221 days'), 0, 'Jer', 49, 1, 'Jer', 49, 39),\n" +
    "('spa', 'RVR1960', 223, 'Babilonia: Un receptor del Juicio de Dios', date('now', '+222 days'), 0, 'Jer', 50, 1, 'Jer', 51, 64),\n" +
    "('spa', 'RVR1960', 224, '¡Jerusalén cae!', date('now', '+223 days'), 0, 'Jer', 52, 1, 'Jer', 52, 34),\n" +
    "\n" +
    "-- LAMENTACIONES, EZEQUIEL Y DANIEL (Días 225-248)\n" +
    "('spa', 'RVR1960', 225, 'Toda esperanza es perdida debido al juicio de Dios', date('now', '+224 days'), 0, 'Lm', 1, 1, 'Lm', 2, 22),\n" +
    "('spa', 'RVR1960', 226, 'La esperanza recuperada debido a la misericordia de Dios', date('now', '+225 days'), 0, 'Lm', 3, 1, 'Lm', 5, 22),\n" +
    "('spa', 'RVR1960', 227, 'Una Visión de la Gloria del Señor', date('now', '+226 days'), 0, 'Ez', 1, 1, 'Ez', 3, 15),\n" +
    "('spa', 'RVR1960', 228, 'La Destrucción Venidera Dramatizada', date('now', '+227 days'), 0, 'Ez', 3, 16, 'Ez', 7, 27),\n" +
    "('spa', 'RVR1960', 229, 'La Gloria del Señor Se Retira', date('now', '+228 days'), 0, 'Ez', 8, 1, 'Ez', 11, 25),\n" +
    "('spa', 'RVR1960', 230, 'El Exilio Venidero Dramatizado', date('now', '+229 days'), 0, 'Ez', 12, 1, 'Ez', 14, 23),\n" +
    "('spa', 'RVR1960', 231, 'La Viña Inservible y la Mujer Infiel', date('now', '+230 days'), 0, 'Ez', 15, 1, 'Ez', 16, 63),\n" +
    "('spa', 'RVR1960', 232, 'Águilas y Funerales: Justicia y misericordia', date('now', '+231 days'), 0, 'Ez', 17, 1, 'Ez', 19, 14),\n" +
    "('spa', 'RVR1960', 233, 'La idolatría lleva al juicio', date('now', '+232 days'), 0, 'Ez', 20, 1, 'Ez', 21, 32),\n" +
    "('spa', 'RVR1960', 234, 'Alegoría de Ahola y Aholibá', date('now', '+233 days'), 0, 'Ez', 22, 1, 'Ez', 24, 27),\n" +
    "('spa', 'RVR1960', 235, 'Juicio Sobre Amnón, Moab, Edom, Filistea, Tiro y Sidón', date('now', '+234 days'), 0, 'Ez', 25, 1, 'Ez', 28, 26),\n" +
    "('spa', 'RVR1960', 236, 'Juicio sobre Egipto y Etiopía', date('now', '+235 days'), 0, 'Ez', 29, 1, 'Ez', 32, 32),\n" +
    "('spa', 'RVR1960', 237, 'El Centinela Se Entera de la Caída de Jerusalén', date('now', '+236 days'), 0, 'Ez', 33, 1, 'Ez', 33, 33),\n" +
    "('spa', 'RVR1960', 238, 'El Buen Pastor Restaura a Su Pueblo', date('now', '+237 days'), 0, 'Ez', 34, 1, 'Ez', 36, 38),\n" +
    "('spa', 'RVR1960', 239, 'Profecía de esperanza y restauración', date('now', '+238 days'), 0, 'Ez', 37, 1, 'Ez', 39, 29),\n" +
    "('spa', 'RVR1960', 240, 'Una Visión del Templo Medido', date('now', '+239 days'), 0, 'Ez', 40, 1, 'Ez', 42, 20),\n" +
    "('spa', 'RVR1960', 241, 'La Gloria del Señor Regresa', date('now', '+240 days'), 0, 'Ez', 43, 1, 'Ez', 44, 31),\n" +
    "('spa', 'RVR1960', 242, 'Una Visión de la Tierra Santa y las Fiestas', date('now', '+241 days'), 0, 'Ez', 45, 1, 'Ez', 46, 24),\n" +
    "('spa', 'RVR1960', 243, 'El Río de Vida y la Ciudad de la Presencia de Dios', date('now', '+242 days'), 0, 'Ez', 47, 1, 'Ez', 48, 35),\n" +
    "('spa', 'RVR1960', 244, 'Fiel a Dios en Una Nación Pagana', date('now', '+243 days'), 0, 'Dn', 1, 1, 'Dn', 2, 49),\n" +
    "('spa', 'RVR1960', 245, 'Compañeros Salvados; Nabucodonosor humillado', date('now', '+244 days'), 0, 'Dn', 3, 1, 'Dn', 4, 37),\n" +
    "('spa', 'RVR1960', 246, 'Beltsasar Humillado: Daniel Salvado', date('now', '+245 days'), 0, 'Dn', 5, 1, 'Dn', 6, 28),\n" +
    "('spa', 'RVR1960', 247, 'Tres Visiones del Gobierno de Dios Futuro', date('now', '+246 days'), 0, 'Dn', 7, 1, 'Dn', 9, 27),\n" +
    "('spa', 'RVR1960', 248, 'Una Visión de los Reyes del Norte y los del Sur', date('now', '+247 days'), 0, 'Dn', 10, 1, 'Dn', 12, 13),\n" +
    "\n" +
    "-- PROFETAS MENORES (Días 249-265)\n" +
    "('spa', 'RVR1960', 249, 'Oseas Ama a una Esposa Descarriada', date('now', '+248 days'), 0, 'Os', 1, 1, 'Os', 6, 11),\n" +
    "('spa', 'RVR1960', 250, 'Dios ama a un pueblo descarriado', date('now', '+249 days'), 0, 'Os', 7, 1, 'Os', 14, 9),\n" +
    "('spa', 'RVR1960', 251, 'El Día del Señor se acerca', date('now', '+250 days'), 0, 'Jl', 1, 1, 'Jl', 3, 21),\n" +
    "('spa', 'RVR1960', 252, 'Profecías de Juicio', date('now', '+251 days'), 0, 'Am', 1, 1, 'Am', 6, 14),\n" +
    "('spa', 'RVR1960', 253, 'Visiones de juicio y restauración', date('now', '+252 days'), 0, 'Am', 7, 1, 'Am', 9, 15),\n" +
    "('spa', 'RVR1960', 254, 'Justicia poética', date('now', '+253 days'), 0, 'Abd', 1, 1, 'Abd', 1, 21),\n" +
    "('spa', 'RVR1960', 255, 'Ninive es perdonada', date('now', '+254 days'), 0, 'Jon', 1, 1, 'Jon', 4, 11),\n" +
    "('spa', 'RVR1960', 256, 'Destellos de un Dios Incomparable', date('now', '+255 days'), 0, 'Miq', 1, 1, 'Miq', 4, 8),\n" +
    "('spa', 'RVR1960', 257, 'No hay Dios como Nuestro Dios', date('now', '+256 days'), 0, 'Miq', 4, 9, 'Miq', 7, 20),\n" +
    "('spa', 'RVR1960', 258, 'La ruina de Ninive', date('now', '+257 days'), 0, 'Nah', 1, 1, 'Nah', 3, 19),\n" +
    "('spa', 'RVR1960', 259, 'Un fascinante enfrentamiento con Dios', date('now', '+258 days'), 0, 'Hab', 1, 1, 'Hab', 3, 19),\n" +
    "('spa', 'RVR1960', 260, 'De la Tristeza al Júbilo', date('now', '+259 days'), 0, 'Sof', 1, 1, 'Sof', 3, 20),\n" +
    "('spa', 'RVR1960', 261, 'Un profeta que obtuvo resultados', date('now', '+260 days'), 0, 'Hag', 1, 1, 'Hag', 2, 23),\n" +
    "('spa', 'RVR1960', 262, 'Un llamado a construir el Templo (9 visiones)', date('now', '+261 days'), 0, 'Zac', 1, 1, 'Zac', 6, 15),\n" +
    "('spa', 'RVR1960', 263, 'Un llamado a la santidad (2 Profecías)', date('now', '+262 days'), 0, 'Zac', 7, 1, 'Zac', 8, 23),\n" +
    "('spa', 'RVR1960', 264, 'El Rey pastor venidero', date('now', '+263 days'), 0, 'Zac', 9, 1, 'Zac', 14, 21),\n" +
    "('spa', 'RVR1960', 265, 'Preguntas cruciales para líderes espirituales', date('now', '+264 days'), 0, 'Mal', 1, 1, 'Mal', 4, 6),\n" +
    "\n" +
    "-- MATEO (Días 266-276)\n" +
    "('spa', 'RVR1960', 266, 'La Inauguración del Reino', date('now', '+265 days'), 0, 'Mt', 1, 1, 'Mt', 4, 25),\n" +
    "('spa', 'RVR1960', 267, 'Principios para Vivir el Reino', date('now', '+266 days'), 0, 'Mt', 5, 1, 'Mt', 7, 29),\n" +
    "('spa', 'RVR1960', 268, 'Preparados para extender el Reino', date('now', '+267 days'), 0, 'Mt', 8, 1, 'Mt', 11, 1),\n" +
    "('spa', 'RVR1960', 269, 'El Rey Actúa: Fe y oposición', date('now', '+268 days'), 0, 'Mt', 13, 54, 'Mt', 17, 27),\n" +
    "('spa', 'RVR1960', 270, 'Historias del Reino', date('now', '+269 days'), 0, 'Mt', 11, 2, 'Mt', 13, 53),\n" +
    "('spa', 'RVR1960', 271, 'Valores Prácticos del Reino', date('now', '+270 days'), 0, 'Mt', 18, 1, 'Mt', 18, 35),\n" +
    "('spa', 'RVR1960', 272, 'El Rey se acerca a Jerusalén', date('now', '+271 days'), 0, 'Mt', 19, 1, 'Mt', 20, 34),\n" +
    "('spa', 'RVR1960', 273, 'El Rey entra a Jerusalén', date('now', '+272 days'), 0, 'Mt', 21, 1, 'Mt', 22, 46),\n" +
    "('spa', 'RVR1960', 274, 'El Rey Advierte y Anima', date('now', '+273 days'), 0, 'Mt', 23, 1, 'Mt', 25, 46),\n" +
    "('spa', 'RVR1960', 275, 'Los Días Finales del Rey', date('now', '+274 days'), 0, 'Mt', 26, 1, 'Mt', 27, 26),\n" +
    "('spa', 'RVR1960', 276, 'El Rey: muerte y vida', date('now', '+275 days'), 0, 'Mt', 27, 27, 'Mt', 28, 20),\n" +
    "\n" +
    "-- MARCOS (Días 277-284)\n" +
    "('spa', 'RVR1960', 277, 'Las Buenas Nuevas de Jesucristo', date('now', '+276 days'), 0, 'Mr', 1, 1, 'Mr', 3, 6),\n" +
    "('spa', 'RVR1960', 278, 'Sirviendo en hecho y palabra', date('now', '+277 days'), 0, 'Mr', 3, 7, 'Mr', 5, 43),\n" +
    "('spa', 'RVR1960', 279, 'Poder, servicio y persecución', date('now', '+278 days'), 0, 'Mr', 6, 1, 'Mr', 7, 37),\n" +
    "('spa', 'RVR1960', 280, 'Jesús es el Cristo', date('now', '+279 days'), 0, 'Mr', 8, 1, 'Mr', 9, 50),\n" +
    "('spa', 'RVR1960', 281, 'Jesús vino a servir', date('now', '+280 days'), 0, 'Mr', 10, 1, 'Mr', 11, 26),\n" +
    "('spa', 'RVR1960', 282, 'Desafiado por líderes religiosos', date('now', '+281 days'), 0, 'Mr', 11, 27, 'Mr', 13, 37),\n" +
    "('spa', 'RVR1960', 283, 'Traición, arresto y negación', date('now', '+282 days'), 0, 'Mr', 14, 1, 'Mr', 14, 72),\n" +
    "('spa', 'RVR1960', 284, 'Juicio, crucifixión y resurrección', date('now', '+283 days'), 0, 'Mr', 15, 1, 'Mr', 16, 20),\n" +
    "\n" +
    "-- LUCAS (Días 285-297)\n" +
    "('spa', 'RVR1960', 285, 'Dos nacimientos milagrosos', date('now', '+284 days'), 0, 'Lc', 1, 1, 'Lc', 2, 40),\n" +
    "('spa', 'RVR1960', 286, 'Preparándose para la misión en galilea', date('now', '+285 days'), 0, 'Lc', 2, 41, 'Lc', 4, 44),\n" +
    "('spa', 'RVR1960', 287, 'Llamado, Sanidad y enseñanza', date('now', '+286 days'), 0, 'Lc', 5, 1, 'Lc', 6, 49),\n" +
    "('spa', 'RVR1960', 288, 'Poder, milagros y fe', date('now', '+287 days'), 0, 'Lc', 7, 1, 'Lc', 8, 56),\n" +
    "('spa', 'RVR1960', 289, 'Culminando con la Misión en Galilea', date('now', '+288 days'), 0, 'Lc', 9, 1, 'Lc', 9, 50),\n" +
    "('spa', 'RVR1960', 290, 'Jesús Afirma su rostro para ir a Jerusalén', date('now', '+289 days'), 0, 'Lc', 9, 51, 'Lc', 11, 54),\n" +
    "('spa', 'RVR1960', 291, 'Enseñanza sobre el Verdadero Discipulado', date('now', '+290 days'), 0, 'Lc', 12, 1, 'Lc', 13, 9),\n" +
    "('spa', 'RVR1960', 292, 'Poder y Parábolas', date('now', '+291 days'), 0, 'Lc', 13, 10, 'Lc', 15, 32),\n" +
    "('spa', 'RVR1960', 293, 'Más Enseñanza sobre el Verdadero Discipulado', date('now', '+292 days'), 0, 'Lc', 16, 1, 'Lc', 17, 10),\n" +
    "('spa', 'RVR1960', 294, 'Más poder y parábolas', date('now', '+293 days'), 0, 'Lc', 17, 11, 'Lc', 19, 27),\n" +
    "('spa', 'RVR1960', 295, 'Jesús entró en Jerusalén', date('now', '+294 days'), 0, 'Lc', 19, 28, 'Lc', 21, 38),\n" +
    "('spa', 'RVR1960', 296, 'Traición, arresto y negación', date('now', '+295 days'), 0, 'Lc', 22, 1, 'Lc', 22, 71),\n" +
    "('spa', 'RVR1960', 297, 'Juicio, crucifixión y resurrección', date('now', '+296 days'), 0, 'Lc', 23, 1, 'Lc', 24, 53),\n" +
    "\n" +
    "-- JUAN (Días 298-307)\n" +
    "('spa', 'RVR1960', 298, 'Dios vino a nosotros', date('now', '+297 days'), 0, 'Jn', 1, 1, 'Jn', 1, 51),\n" +
    "('spa', 'RVR1960', 299, 'La primera señal', date('now', '+298 days'), 0, 'Jn', 2, 1, 'Jn', 4, 42),\n" +
    "('spa', 'RVR1960', 300, 'Cuatro señales más', date('now', '+299 days'), 0, 'Jn', 4, 43, 'Jn', 6, 71),\n" +
    "('spa', 'RVR1960', 301, '¿Quién es este Hacedor de Señales?', date('now', '+300 days'), 0, 'Jn', 7, 1, 'Jn', 8, 59),\n" +
    "('spa', 'RVR1960', 302, 'La Señal Seis', date('now', '+301 days'), 0, 'Jn', 9, 1, 'Jn', 10, 42),\n" +
    "('spa', 'RVR1960', 303, 'La Señal Siete', date('now', '+302 days'), 0, 'Jn', 11, 1, 'Jn', 12, 50),\n" +
    "('spa', 'RVR1960', 304, 'La Última Cena: Servicio e Identidad', date('now', '+303 days'), 0, 'Jn', 13, 1, 'Jn', 14, 31),\n" +
    "('spa', 'RVR1960', 305, 'La Última Cena: Fruto y Unidad', date('now', '+304 days'), 0, 'Jn', 15, 1, 'Jn', 17, 26),\n" +
    "('spa', 'RVR1960', 306, 'Juicio, crucifixión y sepultura', date('now', '+305 days'), 0, 'Jn', 18, 1, 'Jn', 19, 42),\n" +
    "('spa', 'RVR1960', 307, 'La Señal Final: La Resurrección Vivificadora de Cristo', date('now', '+306 days'), 0, 'Jn', 20, 1, 'Jn', 21, 25),\n" +
    "\n" +
    "-- HECHOS (Días 308-319)\n" +
    "('spa', 'RVR1960', 308, 'Ascensión y Pentecostés', date('now', '+307 days'), 0, 'Hch', 1, 1, 'Hch', 2, 47),\n" +
    "('spa', 'RVR1960', 309, 'Crecimiento y persecución', date('now', '+308 days'), 0, 'Hch', 3, 1, 'Hch', 5, 11),\n" +
    "('spa', 'RVR1960', 310, 'Multiplicación y martirio', date('now', '+309 days'), 0, 'Hch', 5, 12, 'Hch', 8, 4),\n" +
    "('spa', 'RVR1960', 311, 'La conversión de Pablo', date('now', '+310 days'), 0, 'Hch', 8, 5, 'Hch', 9, 31),\n" +
    "('spa', 'RVR1960', 312, 'La Conversión de Cornelio', date('now', '+311 days'), 0, 'Hch', 9, 32, 'Hch', 12, 25),\n" +
    "('spa', 'RVR1960', 313, 'El Primer Viaje Misionero', date('now', '+312 days'), 0, 'Hch', 13, 1, 'Hch', 14, 28),\n" +
    "('spa', 'RVR1960', 314, 'El Concilio de Jerusalén', date('now', '+313 days'), 0, 'Hch', 15, 1, 'Hch', 15, 36),\n" +
    "('spa', 'RVR1960', 315, 'El Segundo Viaje Misionero', date('now', '+314 days'), 0, 'Hch', 15, 37, 'Hch', 18, 22),\n" +
    "('spa', 'RVR1960', 316, 'El Tercer Viaje Misionero', date('now', '+315 days'), 0, 'Hch', 18, 23, 'Hch', 21, 16),\n" +
    "('spa', 'RVR1960', 317, 'El arresto de Pablo en Jerusalén', date('now', '+316 days'), 0, 'Hch', 21, 17, 'Hch', 23, 1),\n" +
    "('spa', 'RVR1960', 318, 'El Juicio de Pablo en Cesarea', date('now', '+317 days'), 0, 'Hch', 23, 12, 'Hch', 26, 32),\n" +
    "('spa', 'RVR1960', 319, 'Pablo es enviado a Roma', date('now', '+318 days'), 0, 'Hch', 27, 1, 'Hch', 28, 31),\n" +
    "\n" +
    "-- EPÍSTOLAS DE PABLO (Días 320-346)\n" +
    "('spa', 'RVR1960', 320, 'Judíos y gentiles pecaron', date('now', '+319 days'), 0, 'Ro', 1, 1, 'Ro', 3, 20),\n" +
    "('spa', 'RVR1960', 321, 'Judíos y gentiles justificados por Fe', date('now', '+320 days'), 0, 'Ro', 3, 21, 'Ro', 5, 21),\n" +
    "('spa', 'RVR1960', 322, 'Hijos de Dios adoptados por el Espíritu', date('now', '+321 days'), 0, 'Ro', 6, 1, 'Ro', 8, 39),\n" +
    "('spa', 'RVR1960', 323, 'La historia de la misericordia redentora', date('now', '+322 days'), 0, 'Ro', 9, 1, 'Ro', 11, 36),\n" +
    "('spa', 'RVR1960', 324, 'El fruto de la gracia transformacional', date('now', '+323 days'), 0, 'Ro', 12, 1, 'Ro', 15, 23),\n" +
    "('spa', 'RVR1960', 325, 'Planes de Viaje y Saludos', date('now', '+324 days'), 0, 'Ro', 15, 14, 'Ro', 16, 27),\n" +
    "('spa', 'RVR1960', 326, 'Respecto a la unidad', date('now', '+325 days'), 0, '1 Co', 1, 1, '1 Co', 4, 21),\n" +
    "('spa', 'RVR1960', 327, 'Respecto al sexo y el matrimonio', date('now', '+326 days'), 0, '1 Co', 5, 1, '1 Co', 7, 40),\n" +
    "('spa', 'RVR1960', 328, 'Respecto a la libertad', date('now', '+327 days'), 0, '1 Co', 8, 1, '1 Co', 11, 1),\n" +
    "('spa', 'RVR1960', 329, 'Respecto al amor y la adoración', date('now', '+328 days'), 0, '1 Co', 11, 2, '1 Co', 14, 40),\n" +
    "('spa', 'RVR1960', 330, 'Respecto a la Resurrección y la Generosidad', date('now', '+329 days'), 0, '1 Co', 15, 1, '1 Co', 16, 24),\n" +
    "('spa', 'RVR1960', 331, 'Ministros del evangelio', date('now', '+330 days'), 0, '2 Co', 1, 1, '2 Co', 3, 18),\n" +
    "('spa', 'RVR1960', 332, 'Ministros de la gracia', date('now', '+331 days'), 0, '2 Co', 4, 1, '2 Co', 7, 16),\n" +
    "('spa', 'RVR1960', 333, 'Practica la generosidad', date('now', '+332 days'), 0, '2 Co', 8, 1, '2 Co', 9, 15),\n" +
    "('spa', 'RVR1960', 334, 'Ministros: verdadero y falso', date('now', '+333 days'), 0, '2 Co', 10, 1, '2 Co', 13, 14),\n" +
    "('spa', 'RVR1960', 335, '¿Cómo reveló Dios el Evangelio?', date('now', '+334 days'), 0, 'Ga', 1, 1, 'Ga', 2, 21),\n" +
    "('spa', 'RVR1960', 336, 'Los Cimientos y el Fruto del Evangelio', date('now', '+335 days'), 0, 'Ga', 3, 1, 'Ga', 6, 18),\n" +
    "('spa', 'RVR1960', 337, 'Adoptados en la Familia de Dios', date('now', '+336 days'), 0, 'Ef', 1, 1, 'Ef', 3, 21),\n" +
    "('spa', 'RVR1960', 338, 'Viviendo como Familia de Dios', date('now', '+337 days'), 0, 'Ef', 4, 1, 'Ef', 6, 24),\n" +
    "('spa', 'RVR1960', 339, 'Un Gozo Victorioso', date('now', '+338 days'), 0, 'Fil', 1, 1, 'Fil', 4, 23),\n" +
    "('spa', 'RVR1960', 340, 'Completamente Dios, Completamente Humano', date('now', '+339 days'), 0, 'Col', 1, 1, 'Col', 4, 18),\n" +
    "('spa', 'RVR1960', 341, 'Viviendo en Santidad, Esperando su Venida', date('now', '+340 days'), 0, '1 Ts', 1, 1, '1 Ts', 5, 28),\n" +
    "('spa', 'RVR1960', 342, 'Persevera', date('now', '+341 days'), 0, '2 Ts', 1, 1, '2 Ts', 3, 18),\n" +
    "('spa', 'RVR1960', 343, 'Mentoreando a un Líder Joven', date('now', '+342 days'), 0, '1 Tim', 1, 1, '1 Tim', 6, 21),\n" +
    "('spa', 'RVR1960', 344, 'Carta de un Sentenciado a Muerte', date('now', '+343 days'), 0, '2 Tim', 1, 1, '2 Tim', 4, 22),\n" +
    "('spa', 'RVR1960', 345, 'El Evangelio en pocas palabras', date('now', '+344 days'), 0, 'Tit', 1, 1, 'Tit', 3, 15),\n" +
    "('spa', 'RVR1960', 346, '¡Reconciliate!', date('now', '+345 days'), 0, 'Flm', 1, 1, 'Flm', 1, 25),\n" +
    "\n" +
    "-- HEBREOS, EPÍSTOLAS GENERALES Y APOCALIPSIS (Días 347-365)\n" +
    "('spa', 'RVR1960', 347, 'Mejor que los ángeles, Moisés y Josué', date('now', '+346 days'), 0, 'Heb', 1, 1, 'Heb', 4, 13),\n" +
    "('spa', 'RVR1960', 348, 'Mejor que Melquisedec, Aarón y los sacerdotes', date('now', '+347 days'), 0, 'Heb', 4, 14, 'Heb', 7, 28),\n" +
    "('spa', 'RVR1960', 349, 'Un mejor pacto, promesa y sacrificio', date('now', '+348 days'), 0, 'Heb', 8, 1, 'Heb', 10, 18),\n" +
    "('spa', 'RVR1960', 350, 'Mejor que Todos los héroes de la Fe', date('now', '+349 days'), 0, 'Heb', 10, 19, 'Heb', 12, 13),\n" +
    "('spa', 'RVR1960', 351, 'Es Mejor a la Manera de Jesús', date('now', '+350 days'), 0, 'Heb', 12, 14, 'Heb', 13, 25),\n" +
    "('spa', 'RVR1960', 352, 'Fe en acción', date('now', '+351 days'), 0, 'St', 1, 1, 'St', 5, 20),\n" +
    "('spa', 'RVR1960', 353, 'Qué hacer en tiempos difíciles', date('now', '+352 days'), 0, '1 P', 1, 1, '1 P', 5, 14),\n" +
    "('spa', 'RVR1960', 354, 'Testigos de su majestad', date('now', '+353 days'), 0, '2 P', 1, 1, '2 P', 3, 18),\n" +
    "('spa', 'RVR1960', 355, 'Comunión genuina con Dios', date('now', '+354 days'), 0, '1 Jn', 1, 1, '1 Jn', 5, 21),\n" +
    "('spa', 'RVR1960', 356, 'Cierra la puerta', date('now', '+355 days'), 0, '2 Jn', 1, 1, '2 Jn', 1, 13),\n" +
    "('spa', 'RVR1960', 357, 'Abre la puerta', date('now', '+356 days'), 0, '3 Jn', 1, 1, '3 Jn', 1, 14),\n" +
    "('spa', 'RVR1960', 358, 'Contiende por la fe', date('now', '+357 days'), 0, 'Jud', 1, 1, 'Jud', 1, 25),\n" +
    "('spa', 'RVR1960', 359, 'Las siete Iglesias', date('now', '+358 days'), 0, 'Ap', 1, 1, 'Ap', 3, 22),\n" +
    "('spa', 'RVR1960', 360, 'Los siete sellos', date('now', '+359 days'), 0, 'Ap', 4, 1, 'Ap', 8, 1),\n" +
    "('spa', 'RVR1960', 361, 'Las Siete trompetas', date('now', '+360 days'), 0, 'Ap', 8, 2, 'Ap', 11, 18),\n" +
    "('spa', 'RVR1960', 362, 'Perseverancia en medio de la dificultad', date('now', '+361 days'), 0, 'Ap', 11, 19, 'Ap', 14, 20),\n" +
    "('spa', 'RVR1960', 363, 'Las Siete Copas', date('now', '+362 days'), 0, 'Ap', 15, 1, 'Ap', 16, 21),\n" +
    "('spa', 'RVR1960', 364, 'La Ciudad Pecadora Ha Caído', date('now', '+363 days'), 0, 'Ap', 17, 1, 'Ap', 20, 3),\n" +
    "('spa', 'RVR1960', 365, 'La Ciudad Santa viene', date('now', '+364 days'), 0, 'Ap', 20, 4, 'Ap', 22, 21);";

  // Tabla Libro
  private static final String LOAD_TABLE_LIBRO = "INSERT INTO Libro (codLengua_lb, codVersion_lb, codLibro_lb, numero_lb, nombre_lb)\n" +
    "VALUES\n" +
    "\n" +
    "-- PENTATEUCO Y HISTÓRICOS\n" +
    "('spa', 'RVR1960', 'Gn', 1, 'Génesis'),\n" +
    "('spa', 'RVR1960', 'Ex', 2, 'Éxodo'),\n" +
    "('spa', 'RVR1960', 'Lv', 3, 'Levítico'),\n" +
    "('spa', 'RVR1960', 'Nm', 4, 'Números'),\n" +
    "('spa', 'RVR1960', 'Dt', 5, 'Deuteronomio'),\n" +
    "('spa', 'RVR1960', 'Jos', 6, 'Josué'),\n" +
    "('spa', 'RVR1960', 'Jue', 7, 'Jueces'),\n" +
    "('spa', 'RVR1960', 'Rt', 8, 'Rut'),\n" +
    "('spa', 'RVR1960', '1 S', 9, '1 Samuel'),\n" +
    "('spa', 'RVR1960', '2 S', 10, '2 Samuel'),\n" +
    "('spa', 'RVR1960', '1 R', 11, '1 Reyes'),\n" +
    "('spa', 'RVR1960', '2 R', 12, '2 Reyes'),\n" +
    "('spa', 'RVR1960', '1 Cr', 13, '1 Crónicas'),\n" +
    "('spa', 'RVR1960', '2 Cr', 14, '2 Crónicas'),\n" +
    "('spa', 'RVR1960', 'Esd', 15, 'Esdras'),\n" +
    "('spa', 'RVR1960', 'Neh', 16, 'Nehemías'),\n" +
    "('spa', 'RVR1960', 'Est', 17, 'Ester'),\n" +
    "\n" +
    "-- POÉTICOS Y PROFETAS MAYORES\n" +
    "('spa', 'RVR1960', 'Job', 18, 'Job'),\n" +
    "('spa', 'RVR1960', 'Sal', 19, 'Salmos'),\n" +
    "('spa', 'RVR1960', 'Pr', 20, 'Proverbios'),\n" +
    "('spa', 'RVR1960', 'Ec', 21, 'Eclesiastés'),\n" +
    "('spa', 'RVR1960', 'Cnt', 22, 'Cantares'),\n" +
    "('spa', 'RVR1960', 'Is', 23, 'Isaías'),\n" +
    "('spa', 'RVR1960', 'Jer', 24, 'Jeremías'),\n" +
    "('spa', 'RVR1960', 'Lm', 25, 'Lamentaciones'),\n" +
    "('spa', 'RVR1960', 'Ez', 26, 'Ezequiel'),\n" +
    "('spa', 'RVR1960', 'Dn', 27, 'Daniel'),\n" +
    "\n" +
    "-- PROFETAS MENORES\n" +
    "('spa', 'RVR1960', 'Os', 28, 'Oseas'),\n" +
    "('spa', 'RVR1960', 'Jl', 29, 'Joel'),\n" +
    "('spa', 'RVR1960', 'Am', 30, 'Amós'),\n" +
    "('spa', 'RVR1960', 'Abd', 31, 'Abdías'),\n" +
    "('spa', 'RVR1960', 'Jon', 32, 'Jonás'),\n" +
    "('spa', 'RVR1960', 'Miq', 33, 'Miqueas'),\n" +
    "('spa', 'RVR1960', 'Nah', 34, 'Nahúm'),\n" +
    "('spa', 'RVR1960', 'Hab', 35, 'Habacuc'),\n" +
    "('spa', 'RVR1960', 'Sof', 36, 'Sofonías'),\n" +
    "('spa', 'RVR1960', 'Hag', 37, 'Hageo'),\n" +
    "('spa', 'RVR1960', 'Zac', 38, 'Zacarías'),\n" +
    "('spa', 'RVR1960', 'Mal', 39, 'Malaquías'),\n" +
    "\n" +
    "-- NUEVO TESTAMENTO: EVANGELIOS Y HECHOS\n" +
    "('spa', 'RVR1960', 'Mt', 40, 'Mateo'),\n" +
    "('spa', 'RVR1960', 'Mr', 41, 'Marcos'),\n" +
    "('spa', 'RVR1960', 'Lc', 42, 'Lucas'),\n" +
    "('spa', 'RVR1960', 'Jn', 43, 'Juan'),\n" +
    "('spa', 'RVR1960', 'Hch', 44, 'Hechos'),\n" +
    "\n" +
    "-- EPÍSTOLAS PAULINAS\n" +
    "('spa', 'RVR1960', 'Ro', 45, 'Romanos'),\n" +
    "('spa', 'RVR1960', '1 Co', 46, '1 Corintios'),\n" +
    "('spa', 'RVR1960', '2 Co', 47, '2 Corintios'),\n" +
    "('spa', 'RVR1960', 'Ga', 48, 'Gálatas'),\n" +
    "('spa', 'RVR1960', 'Ef', 49, 'Efesios'),\n" +
    "('spa', 'RVR1960', 'Fil', 50, 'Filipenses'),\n" +
    "('spa', 'RVR1960', 'Col', 51, 'Colosenses'),\n" +
    "('spa', 'RVR1960', '1 Ts', 52, '1 Tesalonicenses'),\n" +
    "('spa', 'RVR1960', '2 Ts', 53, '2 Tesalonicenses'),\n" +
    "('spa', 'RVR1960', '1 Tim', 54, '1 Timoteo'),\n" +
    "('spa', 'RVR1960', '2 Tim', 55, '2 Timoteo'),\n" +
    "('spa', 'RVR1960', 'Tit', 56, 'Tito'),\n" +
    "('spa', 'RVR1960', 'Flm', 57, 'Filemón'),\n" +
    "\n" +
    "-- EPÍSTOLAS GENERALES Y APOCALIPSIS\n" +
    "('spa', 'RVR1960', 'Heb', 58, 'Hebreos'),\n" +
    "('spa', 'RVR1960', 'St', 59, 'Santiago'),\n" +
    "('spa', 'RVR1960', '1 P', 60, '1 Pedro'),\n" +
    "('spa', 'RVR1960', '2 P', 61, '2 Pedro'),\n" +
    "('spa', 'RVR1960', '1 Jn', 62, '1 Juan'),\n" +
    "('spa', 'RVR1960', '2 Jn', 63, '2 Juan'),\n" +
    "('spa', 'RVR1960', '3 Jn', 64, '3 Juan'),\n" +
    "('spa', 'RVR1960', 'Jud', 65, 'Judas'),\n" +
    "('spa', 'RVR1960', 'Ap', 66, 'Apocalipsis');";

  // Tabla Capitulo
  private static final String LOAD_TABLE_CAPITULO = "INSERT INTO Capitulo (codLengua_cptl, codVersion_cptl, codLibro_cptl, codCapitulo_cptl)\n" +
    "WITH RECURSIVE\n" +
    "  -- 1. Definimos los límites basados en la POSICIÓN CANÓNICA (1 al 66)\n" +
    "  -- Así no importa si se llama 'Gn', 'Gen' o '創世記' (Génesis en japonés)\n" +
    "  Limites(posicion, total) AS (\n" +
    "    VALUES\n" +
    "    (1, 50), (2, 40), (3, 27), (4, 36), (5, 34), (6, 24), (7, 21), (8, 4), (9, 31), (10, 24),\n" +
    "    (11, 22), (12, 25), (13, 29), (14, 36), (15, 10), (16, 13), (17, 10), (18, 42), (19, 150),\n" +
    "    (20, 31), (21, 12), (22, 8), (23, 66), (24, 52), (25, 5), (26, 48), (27, 12), (28, 14),\n" +
    "    (29, 3), (30, 9), (31, 1), (32, 4), (33, 7), (34, 3), (35, 3), (36, 3), (37, 2), (38, 14), (39, 4),\n" +
    "    (40, 28), (41, 16), (42, 24), (43, 21), (44, 28), (45, 16), (46, 16), (47, 13), (48, 6), (49, 6),\n" +
    "    (50, 4), (51, 4), (52, 5), (53, 3), (54, 6), (55, 4), (56, 3), (57, 1), (58, 13), (59, 5),\n" +
    "    (60, 5), (61, 3), (62, 5), (63, 1), (64, 1), (65, 1), (66, 22)\n" +
    "  ),\n" +
    "  -- 2. Generador de números (auxiliar)\n" +
    "  Generador(n) AS (\n" +
    "    SELECT 1 UNION ALL SELECT n + 1 FROM Generador WHERE n < 150\n" +
    "  )\n" +
    "-- 3. Unión por posición: Recuperamos las siglas reales de la tabla Libro\n" +
    "SELECT\n" +
    "    L.codLengua_lb,\n" +
    "    L.codVersion_lb,\n" +
    "    L.codLibro_lb, -- Aquí se insertará 'Gn', 'Ps', 'Mr', etc. según la versión\n" +
    "    G.n\n" +
    "FROM Libro L\n" +
    "JOIN Limites Lim ON L.numero_lb = Lim.posicion\n" +
    "JOIN Generador G ON G.n <= Lim.total\n" +
    "WHERE L.codVersion_lb = 'RVR1960'  -- <--- Parámetro de Versión\n" +
    "  AND L.codLengua_lb = 'spa'      -- <--- Parámetro de Idioma\n" +
    "ORDER BY L.numero_lb, G.n;";

  // Tabla Versiculo
  private static final String ACTUALIZAR_VERSICULO_CON_LECTURA = "UPDATE\n" +
    "\tVersiculo\n" +
    "SET\n" +
    "\tcodLengua_vscl_ltr = l.codLengua_ltr,\n" +
    "\tcodVersion_vscl_ltr = l.codVersion_ltr,\n" +
    "\tcodLectura_vscl_ltr = l.codLectura_ltr\n" +
    "FROM\n" +
    "\tLectura l\n" +
    "WHERE\n" +
    "\tVersiculo.codLengua_vscl = l.codLengua_ltr\n" +
    "\tAND Versiculo.codVersion_vscl = l.codVersion_ltr\n" +
    "\tAND (\n" +
    "\t-- Caso 1: Lectura dentro del mismo libro\n" +
    "\t(l.alfaSiglaLibro_ltr = l.betaSiglaLibro_ltr\n" +
    "\t\tAND Versiculo.codLibro_vscl = l.alfaSiglaLibro_ltr\n" +
    "\t\tAND (Versiculo.codCapitulo_vscl > l.alfaCapitulo_ltr\n" +
    "\t\t\tOR (Versiculo.codCapitulo_vscl = l.alfaCapitulo_ltr\n" +
    "\t\t\t\tAND Versiculo.codVersiculo_vscl >= l.alfaVerso_ltr))\n" +
    "\t\tAND (Versiculo.codCapitulo_vscl < l.betaCapitulo_ltr\n" +
    "\t\t\tOR (Versiculo.codCapitulo_vscl = l.betaCapitulo_ltr\n" +
    "\t\t\t\tAND Versiculo.codVersiculo_vscl <= l.betaVerso_ltr)))\n" +
    "\tOR\n" +
    "\t-- Caso 2: Lectura que cruza entre dos libros diferentes\n" +
    "\t(l.alfaSiglaLibro_ltr <> l.betaSiglaLibro_ltr\n" +
    "\t\tAND ((Versiculo.codLibro_vscl = l.alfaSiglaLibro_ltr\n" +
    "\t\t\tAND (Versiculo.codCapitulo_vscl > l.alfaCapitulo_ltr\n" +
    "\t\t\t\tOR (Versiculo.codCapitulo_vscl = l.alfaCapitulo_ltr\n" +
    "\t\t\t\t\tAND Versiculo.codVersiculo_vscl >= l.alfaVerso_ltr)))\n" +
    "\t\tOR (Versiculo.codLibro_vscl = l.betaSiglaLibro_ltr\n" +
    "\t\t\tAND (Versiculo.codCapitulo_vscl < l.betaCapitulo_ltr\n" +
    "\t\t\t\tOR (Versiculo.codCapitulo_vscl = l.betaCapitulo_ltr\n" +
    "\t\t\t\t\tAND Versiculo.codVersiculo_vscl <= l.betaVerso_ltr))))));";

  private void actualizarVersiculosConLectura(SQLiteDatabase db) {
    Cursor c = db.rawQuery("SELECT * FROM Lectura", null);
    while (c.moveToNext()) {
      String codLengua = c.getString(c.getColumnIndex("codLengua_ltr"));
      String codVersion = c.getString(c.getColumnIndex("codVersion_ltr"));
      int codLectura = c.getInt(c.getColumnIndex("codLectura_ltr"));
      String alfaLibro = c.getString(c.getColumnIndex("alfaSiglaLibro_ltr"));
      int alfaCap = c.getInt(c.getColumnIndex("alfaCapitulo_ltr"));
      int alfaVer = c.getInt(c.getColumnIndex("alfaVerso_ltr"));
      String betaLibro = c.getString(c.getColumnIndex("betaSiglaLibro_ltr"));
      int betaCap = c.getInt(c.getColumnIndex("betaCapitulo_ltr"));
      int betaVer = c.getInt(c.getColumnIndex("betaVerso_ltr"));

      // Caso 1: mismo libro
      if (alfaLibro.equals(betaLibro)) {
        db.execSQL("UPDATE Versiculo SET " +
                "codLengua_vscl_ltr = ?, codVersion_vscl_ltr = ?, codLectura_vscl_ltr = ? " +
                "WHERE codLengua_vscl = ? AND codVersion_vscl = ? AND codLibro_vscl = ? " +
                "AND (codCapitulo_vscl > ? OR (codCapitulo_vscl = ? AND codVersiculo_vscl >= ?)) " +
                "AND (codCapitulo_vscl < ? OR (codCapitulo_vscl = ? AND codVersiculo_vscl <= ?))",
            new String[]{
                codLengua, codVersion, String.valueOf(codLectura),
                codLengua, codVersion, alfaLibro,
                String.valueOf(alfaCap), String.valueOf(alfaCap), String.valueOf(alfaVer),
                String.valueOf(betaCap), String.valueOf(betaCap), String.valueOf(betaVer)
            });
      } else {
        // Caso 2: libros diferentes
        db.execSQL("UPDATE Versiculo SET " +
                "codLengua_vscl_ltr = ?, codVersion_vscl_ltr = ?, codLectura_vscl_ltr = ? " +
                "WHERE codLengua_vscl = ? AND codVersion_vscl = ? AND ( " +
                "(codLibro_vscl = ? AND (codCapitulo_vscl > ? OR (codCapitulo_vscl = ? AND codVersiculo_vscl >= ?))) " +
                "OR (codLibro_vscl = ? AND (codCapitulo_vscl < ? OR (codCapitulo_vscl = ? AND codVersiculo_vscl <= ?))) )",
            new String[]{
                codLengua, codVersion, String.valueOf(codLectura),
                codLengua, codVersion,
                alfaLibro, String.valueOf(alfaCap), String.valueOf(alfaCap), String.valueOf(alfaVer),
                betaLibro, String.valueOf(betaCap), String.valueOf(betaCap), String.valueOf(betaVer)
            });
      }
    }
    c.close();
  }

  // Tabla TipoReferencia
  private static final String LOAD_TABLE_TIPO_REF = "INSERT INTO TipoReferencia (nombre_tprfrc)\n" +
    "VALUES\n" +
    "('Cruzada'),\n" +
    "('Paralela');";

  // Tabla Referencia

  // Tabla VersiculoReferencia

  public ConectSQLiteHelperDB(@Nullable Context context) {
      super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  @Override
  public void onConfigure(SQLiteDatabase db) {
      super.onConfigure(db);
      // Habilitar claves foráneas para que respete el SET NULL del plan de lectura
      db.setForeignKeyConstraintsEnabled(true);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE_LENGUA);
    db.execSQL(CREATE_TABLE_VERSION);
    db.execSQL(CREATE_TABLE_LECTURA);
    db.execSQL(CREATE_TABLE_LIBRO);
    db.execSQL(CREATE_TABLE_CAPITULO);
    db.execSQL(CREATE_TABLE_VERSICULO);
    db.execSQL(CREATE_TABLE_TIPO_REF);
    db.execSQL(CREATE_TABLE_REFERENCIA);
    db.execSQL(CREATE_TABLE_VERSICULO_REF);
    // Trigger (Se crea después de las tablas)
    db.execSQL(CREATE_TR_REFERENCIA_INSERT);
    // Carga de tablas
    db.execSQL(LOAD_TABLE_LENGUA);
    db.execSQL(LOAD_TABLE_VERSION);
    db.execSQL(LOAD_TABLE_LECTURA);
    db.execSQL(LOAD_TABLE_LIBRO);
    db.execSQL(LOAD_TABLE_CAPITULO);
    db.execSQL(LoadGenesis.SQL_PARTE_1);
    db.execSQL(LoadGenesis.SQL_PARTE_2);
    db.execSQL(LoadGenesis.SQL_PARTE_3);
    db.execSQL(LoadGenesis.SQL_PARTE_4);
    db.execSQL(LoadGenesis.SQL_PARTE_5);
    db.execSQL(LoadGenesis.SQL_PARTE_6);
    db.execSQL(LoadExodo.SQL_PARTE_1);
    db.execSQL(LoadExodo.SQL_PARTE_2);
    db.execSQL(LoadExodo.SQL_PARTE_3);
    db.execSQL(LoadExodo.SQL_PARTE_4);
    db.execSQL(LoadExodo.SQL_PARTE_5);
    db.execSQL(LoadLevitico.SQL_PARTE_1);
    db.execSQL(LoadLevitico.SQL_PARTE_2);
    db.execSQL(LoadLevitico.SQL_PARTE_3);
    db.execSQL(LoadLevitico.SQL_PARTE_4);
    db.execSQL(LoadNumeros.SQL_PARTE_1);
    db.execSQL(LoadNumeros.SQL_PARTE_2);
    db.execSQL(LoadNumeros.SQL_PARTE_3);
    db.execSQL(LoadNumeros.SQL_PARTE_4);
    db.execSQL(LoadNumeros.SQL_PARTE_5);
    db.execSQL(LoadNumeros.SQL_PARTE_6);
    db.execSQL(LoadDeuteronomio.SQL_PARTE_1);
    db.execSQL(LoadDeuteronomio.SQL_PARTE_2);
    db.execSQL(LoadDeuteronomio.SQL_PARTE_3);
    db.execSQL(LoadDeuteronomio.SQL_PARTE_4);
    db.execSQL(LoadDeuteronomio.SQL_PARTE_5);
    db.execSQL(LoadJosue.SQL_PARTE_1);
    db.execSQL(LoadJosue.SQL_PARTE_2);
    db.execSQL(LoadJosue.SQL_PARTE_3);
    db.execSQL(LoadJueces.SQL_PARTE_1);
    db.execSQL(LoadJueces.SQL_PARTE_2);
    db.execSQL(LoadJueces.SQL_PARTE_3);
    db.execSQL(LoadRut.SQL_PARTE_1);
    db.execSQL(Load1Samuel.SQL_PARTE_1);
    db.execSQL(Load1Samuel.SQL_PARTE_2);
    db.execSQL(Load1Samuel.SQL_PARTE_3);
    db.execSQL(Load1Samuel.SQL_PARTE_4);
    db.execSQL(Load2Samuel.SQL_PARTE_1);
    db.execSQL(Load2Samuel.SQL_PARTE_2);
    db.execSQL(Load2Samuel.SQL_PARTE_3);
    db.execSQL(Load2Samuel.SQL_PARTE_4);
    db.execSQL(Load1Reyes.SQL_PARTE_1);
    db.execSQL(Load1Reyes.SQL_PARTE_2);
    db.execSQL(Load1Reyes.SQL_PARTE_3);
    db.execSQL(Load1Reyes.SQL_PARTE_4);
    db.execSQL(Load2Reyes.SQL_PARTE_1);
    db.execSQL(Load2Reyes.SQL_PARTE_2);
    db.execSQL(Load2Reyes.SQL_PARTE_3);
    db.execSQL(Load2Reyes.SQL_PARTE_4);
    db.execSQL(Load1Cronicas.SQL_PARTE_1);
    db.execSQL(Load1Cronicas.SQL_PARTE_2);
    db.execSQL(Load1Cronicas.SQL_PARTE_3);
    db.execSQL(Load1Cronicas.SQL_PARTE_4);
    db.execSQL(Load2Cronicas.SQL_PARTE_1);
    db.execSQL(Load2Cronicas.SQL_PARTE_2);
    db.execSQL(Load2Cronicas.SQL_PARTE_3);
    db.execSQL(Load2Cronicas.SQL_PARTE_4);
    db.execSQL(LoadEsdras.SQL_PARTE_1);
    db.execSQL(LoadEsdras.SQL_PARTE_2);
    db.execSQL(LoadNehemias.SQL_PARTE_1);
    db.execSQL(LoadNehemias.SQL_PARTE_2);
    db.execSQL(LoadEster.SQL_PARTE_1);
    db.execSQL(LoadJob.SQL_PARTE_1);
    db.execSQL(LoadJob.SQL_PARTE_2);
    db.execSQL(LoadJob.SQL_PARTE_3);
    db.execSQL(LoadJob.SQL_PARTE_4);
    db.execSQL(LoadSalmos.SQL_PARTE_1);
    db.execSQL(LoadSalmos.SQL_PARTE_2);
    db.execSQL(LoadSalmos.SQL_PARTE_3);
    db.execSQL(LoadSalmos.SQL_PARTE_4);
    db.execSQL(LoadSalmos.SQL_PARTE_5);
    db.execSQL(LoadSalmos.SQL_PARTE_6);
    db.execSQL(LoadSalmos.SQL_PARTE_7);
    db.execSQL(LoadSalmos.SQL_PARTE_8);
    db.execSQL(LoadProverbios.SQL_PARTE_1);
    db.execSQL(LoadProverbios.SQL_PARTE_2);
    db.execSQL(LoadProverbios.SQL_PARTE_3);
    db.execSQL(LoadEclesiastes.SQL_PARTE_1);
    db.execSQL(LoadCantares.SQL_PARTE_1);
    db.execSQL(LoadIsaias.SQL_PARTE_1);
    db.execSQL(LoadIsaias.SQL_PARTE_2);
    db.execSQL(LoadIsaias.SQL_PARTE_3);
    db.execSQL(LoadIsaias.SQL_PARTE_4);
    db.execSQL(LoadIsaias.SQL_PARTE_5);
    db.execSQL(LoadIsaias.SQL_PARTE_6);
    db.execSQL(LoadJeremias.SQL_PARTE_1);
    db.execSQL(LoadJeremias.SQL_PARTE_2);
    db.execSQL(LoadJeremias.SQL_PARTE_3);
    db.execSQL(LoadJeremias.SQL_PARTE_4);
    db.execSQL(LoadJeremias.SQL_PARTE_5);
    db.execSQL(LoadJeremias.SQL_PARTE_6);
    db.execSQL(LoadJeremias.SQL_PARTE_7);
    db.execSQL(LoadLamentaciones.SQL_PARTE_1);
    db.execSQL(LoadEzequiel.SQL_PARTE_1);
    db.execSQL(LoadEzequiel.SQL_PARTE_2);
    db.execSQL(LoadEzequiel.SQL_PARTE_3);
    db.execSQL(LoadEzequiel.SQL_PARTE_4);
    db.execSQL(LoadEzequiel.SQL_PARTE_5);
    db.execSQL(LoadEzequiel.SQL_PARTE_6);
    db.execSQL(LoadDaniel.SQL_PARTE_1);
    db.execSQL(LoadDaniel.SQL_PARTE_2);
    db.execSQL(LoadOseas.SQL_PARTE_1);
    db.execSQL(LoadJoel.SQL_PARTE_1);
    db.execSQL(LoadAmos.SQL_PARTE_1);
    db.execSQL(LoadAbdias.SQL_PARTE_1);
    db.execSQL(LoadJonas.SQL_PARTE_1);
    db.execSQL(LoadMiqueas.SQL_PARTE_1);
    db.execSQL(LoadNahum.SQL_PARTE_1);
    db.execSQL(LoadHabacuc.SQL_PARTE_1);
    db.execSQL(LoadSofonias.SQL_PARTE_1);
    db.execSQL(LoadHageo.SQL_PARTE_1);
    db.execSQL(LoadZacarias.SQL_PARTE_1);
    db.execSQL(LoadMalaquias.SQL_PARTE_1);
    db.execSQL(LoadMateo.SQL_PARTE_1);
    db.execSQL(LoadMateo.SQL_PARTE_2);
    db.execSQL(LoadMateo.SQL_PARTE_3);
    db.execSQL(LoadMateo.SQL_PARTE_4);
    db.execSQL(LoadMarcos.SQL_PARTE_1);
    db.execSQL(LoadMarcos.SQL_PARTE_2);
    db.execSQL(LoadMarcos.SQL_PARTE_3);
    db.execSQL(LoadLucas.SQL_PARTE_1);
    db.execSQL(LoadLucas.SQL_PARTE_2);
    db.execSQL(LoadLucas.SQL_PARTE_3);
    db.execSQL(LoadLucas.SQL_PARTE_4);
    db.execSQL(LoadLucas.SQL_PARTE_5);
    db.execSQL(LoadJuan.SQL_PARTE_1);
    db.execSQL(LoadJuan.SQL_PARTE_2);
    db.execSQL(LoadJuan.SQL_PARTE_3);
    db.execSQL(LoadJuan.SQL_PARTE_4);
    db.execSQL(LoadHechos.SQL_PARTE_1);
    db.execSQL(LoadHechos.SQL_PARTE_2);
    db.execSQL(LoadHechos.SQL_PARTE_3);
    db.execSQL(LoadHechos.SQL_PARTE_4);
    db.execSQL(LoadHechos.SQL_PARTE_5);
    db.execSQL(LoadRomanos.SQL_PARTE_1);
    db.execSQL(LoadRomanos.SQL_PARTE_2);
    db.execSQL(Load1Corintios.SQL_PARTE_1);
    db.execSQL(Load1Corintios.SQL_PARTE_2);
    db.execSQL(Load2Corintios.SQL_PARTE_1);
    db.execSQL(Load2Corintios.SQL_PARTE_2);
    db.execSQL(LoadGalatas.SQL_PARTE_1);
    db.execSQL(LoadEfesios.SQL_PARTE_1);
    db.execSQL(LoadFilipenses.SQL_PARTE_1);
    db.execSQL(LoadColosenses.SQL_PARTE_1);
    db.execSQL(Load1Tesalonisenses.SQL_PARTE_1);
    db.execSQL(Load2Tesalonisenses.SQL_PARTE_1);
    db.execSQL(Load1Timoteo.SQL_PARTE_1);
    db.execSQL(Load2Timoteo.SQL_PARTE_1);
    db.execSQL(LoadTito.SQL_PARTE_1);
    db.execSQL(LoadFilemon.SQL_PARTE_1);
    db.execSQL(LoadHebreos.SQL_PARTE_1);
    db.execSQL(LoadHebreos.SQL_PARTE_2);
    db.execSQL(LoadSantiago.SQL_PARTE_1);
    db.execSQL(Load1Pedro.SQL_PARTE_1);
    db.execSQL(Load2Pedro.SQL_PARTE_1);
    db.execSQL(Load1Juan.SQL_PARTE_1);
    db.execSQL(Load2Juan.SQL_PARTE_1);
    db.execSQL(Load3Juan.SQL_PARTE_1);
    db.execSQL(LoadJudas.SQL_PARTE_1);
    db.execSQL(LoadApocalipsis.SQL_PARTE_1);
    db.execSQL(LoadApocalipsis.SQL_PARTE_2);
    //db.execSQL(ACTUALIZAR_VERSICULO_CON_LECTURA);
    actualizarVersiculosConLectura(db);
    db.execSQL(LOAD_TABLE_TIPO_REF);
    db.execSQL(LoadReferencia.SQL_PARTE_1);
    db.execSQL(LoadReferencia.SQL_PARTE_2);
    db.execSQL(LoadReferencia.SQL_PARTE_3);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_1);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_2);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_3);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_4);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_5);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_6);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_7);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_8);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_9);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_10);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_11);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_12);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_13);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_14);
    db.execSQL(LoadVersiculoReferenciaAT.SQL_PARTE_15);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_1);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_2);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_3);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_4);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_5);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_6);
    db.execSQL(LoadVersiculoReferenciaNT.SQL_PARTE_7);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    if (oldVersion < 2) {
      // v1 → v2+: esquema nuevo con todos los datos bíblicos (versículos, referencias, etc.)
      db.execSQL(DROP_TABLE_LENGUA);
      db.execSQL(DROP_TABLE_VERSION);
      db.execSQL(DROP_TABLE_LECTURA);
      db.execSQL(DROP_TABLE_LIBRO);
      db.execSQL(DROP_TABLE_CAPITULO);
      db.execSQL(DROP_TABLE_VERSICULO);
      db.execSQL(DROP_TABLE_TIPO_REF);
      db.execSQL(DROP_TABLE_REFERENCIA);
      db.execSQL(DROP_TABLE_VERSICULO_REF);
      db.execSQL(DROP_TR_REFERENCIA_INSERT);
      onCreate(db);
      return;
    }
    if (oldVersion < 3) {
      // v2 → v3: corregir alfas erróneos (preserva progreso del usuario)
      db.execSQL("UPDATE Lectura SET alfaSiglaLibro_ltr = 'Mr' " +
          "WHERE codLengua_ltr = 'spa' AND codVersion_ltr = 'RVR1960' " +
          "AND codLectura_ltr = 282 AND alfaSiglaLibro_ltr = 'Mc'");
      db.execSQL("UPDATE Lectura SET alfaSiglaLibro_ltr = '1 Co' " +
          "WHERE codLengua_ltr = 'spa' AND codVersion_ltr = 'RVR1960' " +
          "AND codLectura_ltr = 328 AND alfaSiglaLibro_ltr = '1Co'");
      actualizarVersiculosConLectura(db);
    }
  }
}
