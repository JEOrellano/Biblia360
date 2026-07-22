package com.orellano.biblia360.daoSQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.orellano.biblia360.entity.Lectura;
import com.orellano.biblia360.entity.Version;
import com.orellano.biblia360.utility.Constant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DaoHelperLectura {
    // DAOS
    public static List<Lectura> obtenerTodosVersion(Context context, Version v) {
        List<Lectura> lista = new ArrayList<Lectura>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_LECTURA,
                null,
                ConectSQLiteHelperDB.C_LECTURA_LENGUA_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LECTURA_VERSION_COD_VS + " = ?",
                new String[] { v.getLengua().getCodigo(),
                    v.getCodigo() },
                null,
                null,
                ConectSQLiteHelperDB.C_LECTURA_COD + " ASC",
                null
                )
            ) {
                while (cursor.moveToNext()) {
                    Lectura ltr = new Lectura();
                    ltr.setVersion(v);
                    ltr.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_COD)));
                    ltr.setTitulo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_TITULO)));
                    String fechaStr = cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_FECHA));
                    if (fechaStr != null) {
                        ltr.setFecha(LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern(Constant.FORMAT_DATE)));
                    }
                    ltr.setIframe(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_IFRAME)));
                    ltr.setCompletado(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_COMPLETADO)) == 1);
                    String fechaProgStr = cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_FECHAPROG));
                    if (fechaProgStr != null) {
                        ltr.setFechaProgreso(LocalDate.parse(fechaProgStr, DateTimeFormatter.ofPattern(Constant.FORMAT_DATE)));
                    } else {
                        ltr.setFechaProgreso(null); // Opcional, ya que por defecto es null
                    }
                    ltr.setVersos(DaoHelperVersiculo.obtenerTodosLectura(context, ltr));
                    lista.add(ltr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return lista;
        }
    }

    public static List<Lectura> obtenerTodosVersionLight(Context context, Version v) {
        List<Lectura> lista = new ArrayList<Lectura>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_LECTURA,
                null,
                ConectSQLiteHelperDB.C_LECTURA_LENGUA_COD_VS + " = ? AND " +
                    ConectSQLiteHelperDB.C_LECTURA_VERSION_COD_VS + " = ?",
                new String[] { v.getLengua().getCodigo(),
                    v.getCodigo() },
                null,
                null,
                ConectSQLiteHelperDB.C_LECTURA_COD + " ASC",
                null
                )
            ) {
                while (cursor.moveToNext()) {
                    Lectura ltr = new Lectura();
                    ltr.setVersion(v);
                    ltr.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_COD)));
                    ltr.setTitulo(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_TITULO)));
                    String fechaStr = cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_FECHA));
                    if (fechaStr != null) {
                        ltr.setFecha(LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern(Constant.FORMAT_DATE)));
                    }
                    ltr.setIframe(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_IFRAME)));
                    ltr.setCompletado(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_COMPLETADO)) == 1);
                    String fechaProgStr = cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LECTURA_FECHAPROG));
                    if (fechaProgStr != null) {
                        ltr.setFechaProgreso(LocalDate.parse(fechaProgStr, DateTimeFormatter.ofPattern(Constant.FORMAT_DATE)));
                    } else {
                        ltr.setFechaProgreso(null);
                    }
                    // NO cargamos versos aquí (versos_ltr se queda como ArrayList vacío del constructor)
                    lista.add(ltr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return lista;
        }
    }

    public static boolean actualizarEstadoLectura(Context context, Lectura lectura, boolean completado) {
        boolean resultado = false;
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getWritableDatabase()) {
            ContentValues values = new ContentValues();
            values.put(ConectSQLiteHelperDB.C_LECTURA_COMPLETADO, completado ? 1 : 0);

            // Criterio de actualización: Llave primaria compuesta
            String whereClause = ConectSQLiteHelperDB.C_LECTURA_LENGUA_COD_VS + " = ? AND " +
                ConectSQLiteHelperDB.C_LECTURA_VERSION_COD_VS + " = ? AND " +
                ConectSQLiteHelperDB.C_LECTURA_COD + " = ?";

            String[] whereArgs = {
                lectura.getVersion().getLengua().getCodigo(),
                lectura.getVersion().getCodigo(),
                String.valueOf(lectura.getCodigo())
            };

            int count = con.update(ConectSQLiteHelperDB.T_LECTURA, values, whereClause, whereArgs);

            if (count > 0) {
                resultado = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return resultado;
        }
    }

    public static int obtenerConteoCompletados(Context context, Version v) {
        int conteo = 0;
        String sql = "SELECT COUNT(*) FROM " + ConectSQLiteHelperDB.T_LECTURA +
            " WHERE " + ConectSQLiteHelperDB.C_LECTURA_LENGUA_COD_VS + " = ? AND " +
            ConectSQLiteHelperDB.C_LECTURA_VERSION_COD_VS + " = ? AND " +
            ConectSQLiteHelperDB.C_LECTURA_COMPLETADO + " = 1";
        String[] selectionArgs = new String[]{v.getLengua().getCodigo(), v.getCodigo()};

        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.rawQuery(sql, selectionArgs)) {
                if (cursor.moveToFirst()) {
                    conteo = cursor.getInt(0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return conteo;
        }
    }
}
