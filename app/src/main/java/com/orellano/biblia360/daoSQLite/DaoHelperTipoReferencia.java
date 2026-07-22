package com.orellano.biblia360.daoSQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.orellano.biblia360.entity.TipoReferencia;

public class DaoHelperTipoReferencia {
    // DAOS
    public static TipoReferencia obtenerUno(Context context, int codTipo) {
        TipoReferencia tipo = null;
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_TIPO_REF,
                null,
                ConectSQLiteHelperDB.C_TIPO_REF_COD + " = ?",
                new String[] { String.valueOf(codTipo) },
                null,
                null,
                null)) {
                if (cursor.moveToFirst()) {
                    tipo = new TipoReferencia();
                    tipo.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_TIPO_REF_COD)));
                    tipo.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_TIPO_REF_NOMBRE)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return tipo;
        }
    }
}
