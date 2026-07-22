package com.orellano.biblia360.daoSQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.orellano.biblia360.entity.Capitulo;
import com.orellano.biblia360.entity.Lectura;
import com.orellano.biblia360.entity.Lengua;
import com.orellano.biblia360.entity.Libro;
import com.orellano.biblia360.entity.Referencia;
import com.orellano.biblia360.entity.TipoReferencia;
import com.orellano.biblia360.entity.Versiculo;
import com.orellano.biblia360.entity.Version;
import com.orellano.biblia360.utility.Constant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaoHelperVersion {

    public static List<Version> obtenerTodosLengua(Context context, Lengua lengua) {
        Log.d("DAOVERSION", "PREVIO A ABRIR CONEXIÓN: " + lengua.getCodigo());
        List<Version> lista = new ArrayList<Version>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            Log.d("DAOVERSION", "PREVIO QUERY: " + lengua.getCodigo());
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_VERSION,
                null,
                ConectSQLiteHelperDB.C_VERSION_LENGUA_COD_LG + " = ?",
                new String[]{lengua.getCodigo()},
                null,
                null,
                null,
                null)
            ) {
                Log.d("DAOVERSION", "PREVIO WHILE: " + lengua.getCodigo());
                Log.d("DAOVERSION", "CURSOR COUNT: " + cursor.getCount());
                while (cursor.moveToNext()) {
                    Version v = new Version();
                    v.setLengua(lengua);
                    v.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_COD)));
                    v.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_NOMBRE)));
                    v.setLibros(DaoHelperLibro.obtenerTodosVersion(context, v));
                    v.setLecturas(DaoHelperLectura.obtenerTodosVersion(context, v));
                    lista.add(v);
                }
            } catch (Exception e) {
                Log.d("DAOVERSION", "ERROR: " + e.getMessage());
                e.printStackTrace();
            } finally {
                Log.d("DAOVERSION", "Version obtenerTodosLengua: " + lista);
                return lista;
            }
        }
    }

    public static Version obtenerUno(Context context, String cdLg, String cdVs) {
        Version v = new Version();
        Log.d("DAOVERSION", "PREVIO A ABRIR CONEXIÓN: " + cdLg + " - " + cdVs);
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            Log.d("DAOVERSION", "PREVIO QUERY: " + cdLg + " - " + cdVs);
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_VERSION,
                null,
                ConectSQLiteHelperDB.C_VERSION_LENGUA_COD_LG + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSION_COD + " = ?",
                new String[]{cdLg, cdVs},
                null,
                null,
                null,
                null)
            ) {
                Log.d("DAOVERSION", "PREVIO WHILE: " + cdLg + " - " + cdVs);
                Log.d("DAOVERSION", "CURSOR COUNT: " + cursor.getCount());
                while (cursor.moveToNext()) {
                    Log.d("DAOVERSION", "Version encontrada: " + cdLg + " - " + cdVs);
                    v.setLengua(DaoHelperLengua.obtenerUno(context, cdLg));
                    v.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_COD)));
                    v.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_NOMBRE)));
                    v.setLibros(DaoHelperLibro.obtenerTodosVersion(context, v));
                    v.setLecturas(DaoHelperLectura.obtenerTodosVersion(context, v));
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Log.d("DAOVERSION", "Version obtenerUno: " + v);
                return v;
            }
        }
    }

    public static Version obtenerUnoLight(Context context, String cdLg, String cdVs) {
        Version v = new Version();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            Lengua lengua = new Lengua();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_LENGUA, null,
                ConectSQLiteHelperDB.C_LENGUA_COD + " = ?",
                new String[]{cdLg}, null, null, null)) {
                if (c.moveToFirst()) {
                    lengua.setCodigo(cdLg);
                    lengua.setNombre(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LENGUA_NOMBRE)));
                }
            }
            v.setLengua(lengua);

            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_VERSION, null,
                ConectSQLiteHelperDB.C_VERSION_LENGUA_COD_LG + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSION_COD + " = ?",
                new String[]{cdLg, cdVs}, null, null, null)) {
                while (cursor.moveToNext()) {
                    v.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_COD)));
                    v.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_NOMBRE)));
                    v.setLecturas(DaoHelperLectura.obtenerTodosVersionLight(context, v));
                }
            }
        }
        return v;
    }

    public static Version obtenerUnoCompletoOptimizado(Context context, String cdLg, String cdVs) {
        Version version = new Version();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {

            Lengua lengua = new Lengua();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_LENGUA, null,
                ConectSQLiteHelperDB.C_LENGUA_COD + " = ?",
                new String[]{cdLg}, null, null, null)) {
                if (c.moveToFirst()) {
                    lengua.setCodigo(cdLg);
                    lengua.setNombre(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LENGUA_NOMBRE)));
                }
            }
            version.setLengua(lengua);

            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_VERSION, null,
                ConectSQLiteHelperDB.C_VERSION_LENGUA_COD_LG + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSION_COD + " = ?",
                new String[]{cdLg, cdVs}, null, null, null)) {
                if (c.moveToFirst()) {
                    version.setCodigo(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_COD)));
                    version.setNombre(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSION_NOMBRE)));
                }
            }

            Map<String, Libro> libroMap = new HashMap<>();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_LIBRO, null,
                ConectSQLiteHelperDB.C_LIBRO_LENGUA_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LIBRO_VERSION_COD_VS + " = ?",
                new String[]{cdLg, cdVs}, null, null,
                ConectSQLiteHelperDB.C_LIBRO_NUMERO + " ASC")) {
                while (c.moveToNext()) {
                    Libro lb = new Libro();
                    lb.setVersion(version);
                    lb.setCodigo(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_COD)));
                    lb.setNumero(c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_NUMERO)));
                    lb.setNombre(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_NOMBRE)));
                    libroMap.put(lb.getCodigo(), lb);
                    version.getLibros().add(lb);
                }
            }

            Map<String, Capitulo> capMap = new HashMap<>();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_CAPITULO, null,
                ConectSQLiteHelperDB.C_CAPITULO_LENGUA_COD_LG + " = ? AND " +
                    ConectSQLiteHelperDB.C_CAPITULO_VERSION_COD_LG + " = ?",
                new String[]{cdLg, cdVs}, null, null,
                ConectSQLiteHelperDB.C_CAPITULO_LIBRO_COD_LG + " ASC, " +
                    ConectSQLiteHelperDB.C_CAPITULO_COD + " ASC")) {
                while (c.moveToNext()) {
                    String cdLb = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_CAPITULO_LIBRO_COD_LG));
                    int cdCp = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_CAPITULO_COD));
                    Libro lb = libroMap.get(cdLb);
                    if (lb == null) continue;
                    Capitulo cap = new Capitulo();
                    cap.setLibro(lb);
                    cap.setCodigo(cdCp);
                    lb.getCapitulos().add(cap);
                    capMap.put(cdLb + "|" + cdCp, cap);
                }
            }

            Map<String, Versiculo> verMap = new HashMap<>();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_VERSICULO, null,
                ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_CPTL + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_CPTL + " = ?",
                new String[]{cdLg, cdVs}, null, null,
                ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL + " ASC, " +
                    ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL + " ASC, " +
                    ConectSQLiteHelperDB.C_VERSICULO_COD + " ASC")) {
                while (c.moveToNext()) {
                    String cdLb = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL));
                    int cdCp = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL));
                    int cdVscl = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_COD));
                    Capitulo cap = capMap.get(cdLb + "|" + cdCp);
                    if (cap == null) continue;
                    Versiculo v = new Versiculo();
                    v.setCapitulo(cap);
                    v.setCodigo(cdVscl);
                    v.setEncabezado(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_ENCABEZADO)));
                    v.setContenido(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CONTENIDO)));
                    v.setParrafo(c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_PARRAFO)) == 1);
                    cap.getVersiculos().add(v);
                    verMap.put(cdLb + "|" + cdCp + "|" + cdVscl, v);
                }
            }

            Map<Integer, TipoReferencia> tipoRefMap = new HashMap<>();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_TIPO_REF, null, null, null, null, null, null)) {
                while (c.moveToNext()) {
                    TipoReferencia t = new TipoReferencia();
                    t.setCodigo(c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_TIPO_REF_COD)));
                    t.setNombre(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_TIPO_REF_NOMBRE)));
                    tipoRefMap.put(t.getCodigo(), t);
                }
            }

            Map<String, Referencia> refByFullKey = new HashMap<>();
            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_REFERENCIA, null,
                ConectSQLiteHelperDB.C_REFERENCIA_LENGUA_COD_VSCL + " = ? AND " +
                    ConectSQLiteHelperDB.C_REFERENCIA_VERSION_COD_VSCL + " = ?",
                new String[]{cdLg, cdVs}, null, null, null)) {
                while (c.moveToNext()) {
                    String cdLb = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_LIBRO_COD_VSCL));
                    int cdCp = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_CAPITULO_COD_VSCL));
                    int cdVscl = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_VERSICULO_COD_VSCL));
                    int cdTipo = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_TIPO_REF_COD_TPRFRC));
                    int cdRef = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_COD));

                    Versiculo origen = verMap.get(cdLb + "|" + cdCp + "|" + cdVscl);
                    if (origen == null) continue;

                    Referencia ref = new Referencia();
                    ref.setVersiculo(origen);
                    ref.setTipo(tipoRefMap.get(cdTipo));
                    ref.setCodigo(cdRef);

                    origen.getReferencias().add(ref);
                    refByFullKey.put(cdLb + "|" + cdCp + "|" + cdVscl + "|" + cdTipo + "|" + cdRef, ref);
                }
            }

            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_VERSICULO_REF, null,
                ConectSQLiteHelperDB.C_VERSICULO_REF_LENGUA_COD_VSCL + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_REF_VERSION_COD_VSCL + " = ?",
                new String[]{cdLg, cdVs}, null, null, null)) {
                while (c.moveToNext()) {
                    String cdLbOri = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_LIBRO_COD_VSCL));
                    int cdCpOri = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_CAPITULO_COD_VSCL));
                    int cdVsclOri = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_VERSICULO_COD_VSCL));
                    int cdTipo = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_TIPO_REF_COD_RFRC));
                    int cdRef = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_COD_RFRC));

                    String cdLbDest = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_LIBRO_COD_RFRC));
                    int cdCpDest = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_CAPITULO_COD_RFRC));
                    int cdVsclDest = c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_REF_VERSICULO_COD_RFRC));

                    Referencia ref = refByFullKey.get(cdLbOri + "|" + cdCpOri + "|" + cdVsclOri + "|" + cdTipo + "|" + cdRef);
                    Versiculo destino = verMap.get(cdLbDest + "|" + cdCpDest + "|" + cdVsclDest);
                    if (ref != null && destino != null) {
                        ref.getVersos().add(destino);
                    }
                }
            }

            Map<Integer, List<String>> lecturaVerMap = new HashMap<>();
            try (Cursor c = con.rawQuery(
                "SELECT " + ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL + "," +
                    ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL + "," +
                    ConectSQLiteHelperDB.C_VERSICULO_COD + "," +
                    ConectSQLiteHelperDB.C_VERSICULO_LECTURA_COD_LTR +
                    " FROM " + ConectSQLiteHelperDB.T_VERSICULO +
                    " WHERE " + ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_LTR + "=? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_LTR + "=? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_LECTURA_COD_LTR + " IS NOT NULL" +
                    " ORDER BY " + ConectSQLiteHelperDB.C_VERSICULO_LECTURA_COD_LTR + " ASC," +
                    ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL + " ASC," +
                    ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL + " ASC," +
                    ConectSQLiteHelperDB.C_VERSICULO_COD + " ASC",
                new String[]{cdLg, cdVs})) {
                while (c.moveToNext()) {
                    String cdLb = c.getString(0);
                    int cdCp = c.getInt(1);
                    int cdVscl = c.getInt(2);
                    int cdLtr = c.getInt(3);
                    lecturaVerMap.computeIfAbsent(cdLtr, k -> new ArrayList<>())
                        .add(cdLb + "|" + cdCp + "|" + cdVscl);
                }
            }

            try (Cursor c = con.query(
                ConectSQLiteHelperDB.T_LECTURA, null,
                ConectSQLiteHelperDB.C_LECTURA_LENGUA_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LECTURA_VERSION_COD_VS + " = ?",
                new String[]{cdLg, cdVs}, null, null,
                ConectSQLiteHelperDB.C_LECTURA_COD + " ASC")) {
                while (c.moveToNext()) {
                    Lectura ltr = new Lectura();
                    ltr.setVersion(version);
                    ltr.setCodigo(c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_COD)));
                    ltr.setTitulo(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_TITULO)));
                    String fechaStr = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_FECHA));
                    if (fechaStr != null) {
                        ltr.setFecha(LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern(Constant.FORMAT_DATE)));
                    }
                    ltr.setIframe(c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_IFRAME)));
                    ltr.setCompletado(c.getInt(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_COMPLETADO)) == 1);
                    String fechaProgStr = c.getString(c.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_FECHAPROG));
                    if (fechaProgStr != null) {
                        ltr.setFechaProgreso(LocalDate.parse(fechaProgStr, DateTimeFormatter.ofPattern(Constant.FORMAT_DATE)));
                    }

                    List<String> verKeys = lecturaVerMap.get(ltr.getCodigo());
                    if (verKeys != null) {
                        List<Versiculo> versos = new ArrayList<>();
                        for (String key : verKeys) {
                            Versiculo v = verMap.get(key);
                            if (v != null) versos.add(v);
                        }
                        ltr.setVersos(versos);
                    }
                    version.getLecturas().add(ltr);
                }
            }
        }
        return version;
    }
}
