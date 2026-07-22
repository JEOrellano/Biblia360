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
import com.orellano.biblia360.entity.Versiculo;
import com.orellano.biblia360.entity.Version;

import java.util.ArrayList;
import java.util.List;

public class DaoHelperVersiculo {
    // DAOS
    public static List<Versiculo> obtenerTodosCapitulo(Context context, Capitulo cptl) {
        Log.d("DAOVERSICULO", "PREVIO A ABRIR CONEXIÓN: " + cptl.getLibro().getVersion().getLengua().getCodigo() + " - " + cptl.getLibro().getVersion().getCodigo() + " - " + cptl.getLibro().getCodigo() + " - " + cptl.getCodigo());
        List<Versiculo> lista = new ArrayList<>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            Log.d("DAOVERSICULO", "PREVIO QUERY: " + cptl.getLibro().getVersion().getLengua().getCodigo() + " - " + cptl.getLibro().getVersion().getCodigo() + " - " + cptl.getLibro().getCodigo() + " - " + cptl.getCodigo());
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_VERSICULO,
                null,
                ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_CPTL + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_CPTL + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL + " = ?",
                new String[]{cptl.getLibro().getVersion().getLengua().getCodigo(),
                    cptl.getLibro().getVersion().getCodigo(),
                    cptl.getLibro().getCodigo(),
                    String.valueOf(cptl.getCodigo())},
                null,
                null,
                null)
            ) {
                Log.d("DAOVERSICULO", "PREVIO WHILE: " + cptl.getLibro().getVersion().getLengua().getCodigo() + " - " + cptl.getLibro().getVersion().getCodigo() + " - " + cptl.getLibro().getCodigo() + " - " + cptl.getCodigo());
                Log.d("DAOVERSICULO", "CURSOR COUNT: " + cursor.getCount());
                while (cursor.moveToNext()) {
                    Versiculo v = new Versiculo();
                    v.setCapitulo(cptl);
                    v.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_COD)));
                    v.setEncabezado(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_ENCABEZADO)));
                    v.setContenido(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CONTENIDO)));
                    v.setParrafo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_PARRAFO)) == 1);
                    v.setReferencias(DaoHelperReferencia.obtenerTodosVersiculo(context, v));
                    lista.add(v);
                }
            } catch (Exception e) {
                Log.d("DAOVERSICULO", "ERROR: " + e.getMessage());
                e.printStackTrace();
            } finally {
                Log.d("DAOVERSICULO", "Lista retornada: " + lista);
                return lista;
            }
        }
    }

    public static List<Versiculo> obtenerTodosReferencia(Context context, Referencia ref) {
        List<Versiculo> lista = new ArrayList<Versiculo>();
        // 1. Verificación de seguridad para evitar el error de "index 1 is null"
        if (ref.getVersiculo() == null || ref.getVersiculo().getCapitulo() == null) {
            return lista;
        }
        // Consulta con JOIN para traer los datos del versículo destino directamente
        String query = "SELECT v.* FROM " + ConectSQLiteHelperDB.T_VERSICULO + " v " +
            "INNER JOIN " + ConectSQLiteHelperDB.T_VERSICULO_REF + " vr ON " +
            "v." + ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_CPTL + " = vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_LENGUA_COD_VSCL + " AND " +
            "v." + ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_CPTL + " = vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_VERSION_COD_VSCL + " AND " +
            "v." + ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL + " = vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_LIBRO_COD_VSCL + " AND " +
            "v." + ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL + " = vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_CAPITULO_COD_VSCL + " AND " +
            "v." + ConectSQLiteHelperDB.C_VERSICULO_COD + " = vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_VERSICULO_COD_VSCL + " " +
            "WHERE vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_LENGUA_COD_RFRC + " = ? AND " +
            "vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_VERSION_COD_RFRC + " = ? AND " +
            "vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_LIBRO_COD_RFRC + " = ? AND " +
            "vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_CAPITULO_COD_RFRC + " = ? AND " +
            "vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_VERSICULO_COD_RFRC + " = ? AND " +
            "vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_TIPO_REF_COD_RFRC + " = ? AND " +
            "vr." + ConectSQLiteHelperDB.C_VERSICULO_REF_COD_RFRC + " = ?";
        String[] args = {ref.getVersiculo().getCapitulo().getLibro().getVersion().getLengua().getCodigo(),
            ref.getVersiculo().getCapitulo().getLibro().getVersion().getCodigo(),
            ref.getVersiculo().getCapitulo().getLibro().getCodigo(),
            String.valueOf(ref.getVersiculo().getCapitulo().getCodigo()),
            String.valueOf(ref.getVersiculo().getCodigo()),
            String.valueOf(ref.getTipo().getCodigo()),
            String.valueOf(ref.getCodigo())};

        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.rawQuery(query, args)) {
                while (cursor.moveToNext()) {
                    Versiculo v = new Versiculo();
                    Lengua l = new Lengua();
                    Version vrs = new Version();
                    Libro lb = new Libro();
                    Capitulo c = new Capitulo();

                    l.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_CPTL)));
                    vrs.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_CPTL)));
                    lb.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL)));
                    c.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL)));

                    vrs.setLengua(l);
                    lb.setVersion(vrs);
                    c.setLibro(lb);

                    v.setCapitulo(c);
                    v.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_COD)));
                    v.setEncabezado(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_ENCABEZADO)));
                    v.setContenido(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CONTENIDO)));
                    v.setParrafo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_PARRAFO)) == 1);
                    //v.setReferencias(DaoHelperReferencia.obtenerTodosVersiculo(context, v));
                    lista.add(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return lista;
        }
    }

    public static List<Versiculo> obtenerTodosLectura(Context context, Lectura ltr) {
        List<Versiculo> lista = new ArrayList<Versiculo>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_VERSICULO,
                null,
                ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_LTR + " = ? AND " +
                        ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_LTR + " = ? AND " +
                    ConectSQLiteHelperDB.C_VERSICULO_LECTURA_COD_LTR + " = ?",
                new String[] { ltr.getVersion().getLengua().getCodigo(),
                        ltr.getVersion().getCodigo(),
                        String.valueOf(ltr.getCodigo()) },
                null,
                null,
                null)) {
                while (cursor.moveToNext()) {
                    Versiculo v = new Versiculo();
                    Lengua l = new Lengua();
                    Version vrs = new Version();
                    Libro lb = new Libro();
                    Capitulo c = new Capitulo();

                    l.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_LENGUA_COD_CPTL)));
                    vrs.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_VERSION_COD_CPTL)));
                    lb.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_LIBRO_COD_CPTL)));
                    c.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CAPITULO_COD_CPTL)));

                    vrs.setLengua(l);
                    lb.setVersion(vrs);
                    c.setLibro(lb);

                    v.setCapitulo(c);
                    v.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_COD)));
                    v.setEncabezado(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_ENCABEZADO)));
                    v.setContenido(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_CONTENIDO)));
                    v.setParrafo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_VERSICULO_PARRAFO)) == 1);
                    v.setReferencias(DaoHelperReferencia.obtenerTodosVersiculo(context, v));
                    lista.add(v);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return lista;
        }
    }
}
