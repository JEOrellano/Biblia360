package com.orellano.biblia360.daoSQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.orellano.biblia360.entity.Libro;
import com.orellano.biblia360.entity.Version;

import java.util.ArrayList;
import java.util.List;

public class DaoHelperLibro {
    // DAOS
    public static List<Libro> obtenerTodosVersion(Context context, Version v) {
        Log.d("DAOLIBRO", "PREVIO A ABRIR CONEXIÓN: " + v.getLengua().getCodigo() + " - " + v.getCodigo());
        List<Libro> lista = new ArrayList<Libro>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            Log.d("DAOLIBRO", "PREVIO QUERY: " + v.getLengua().getCodigo() + " - " + v.getCodigo());
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_LIBRO,
                null,
                ConectSQLiteHelperDB.C_LIBRO_VERSION_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LIBRO_LENGUA_COD_VS + " = ?",
                new String[] { v.getCodigo(),
                    v.getLengua().getCodigo() },
                null,
                null,
                ConectSQLiteHelperDB.C_LIBRO_NUMERO + " ASC",
                null)
            ) {
                Log.d("DAOLIBRO", "PREVIO WHILE: " + v.getLengua().getCodigo() + " - " + v.getCodigo());
                Log.d("DAOLIBRO", "CURSOR COUNT: " + cursor.getCount());
                while (cursor.moveToNext()) {
                    Libro lb = new Libro();
                    lb.setVersion(v);
                    lb.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_COD)));
                    lb.setNumero(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_NUMERO)));
                    lb.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_NOMBRE)));
                    lb.setCapitulos(DaoHelperCapitulo.obtenerTodosLibro(context, lb));
                    lista.add(lb);
                }
            }
        } catch (Exception e) {
            Log.d("DAOLIBRO", "ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Log.d("DAOLIBRO", "Lista retornada: " + lista);
            return lista;
        }
    }

    public static Libro obtenerUno(Context context, String cdLg, String cdVs, String csLb) {
        Libro lb = new Libro();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_LIBRO,
                null,
                ConectSQLiteHelperDB.C_LIBRO_LENGUA_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LIBRO_VERSION_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LIBRO_COD + " = ?",
                new String[] { cdLg,
                    cdVs,
                    csLb },
                null,
                null,
                null,
                null)) {
                while (cursor.moveToNext()) {
                    lb.setVersion(DaoHelperVersion.obtenerUno(context, cdLg, cdVs));
                    lb.setCodigo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_COD)));
                    lb.setNumero(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_NUMERO)));
                    lb.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LIBRO_NOMBRE)));
                    lb.setCapitulos(DaoHelperCapitulo.obtenerTodosLibro(context, lb));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return lb;
        }
    }
}
