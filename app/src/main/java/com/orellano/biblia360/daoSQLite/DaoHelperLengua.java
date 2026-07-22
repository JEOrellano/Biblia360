package com.orellano.biblia360.daoSQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.orellano.biblia360.entity.Lengua;

import java.util.ArrayList;
import java.util.List;

public class DaoHelperLengua {
    //  DAOS
    public static Lengua obtenerUno(Context context, String cod) {
        Lengua lengua = new Lengua();
        // Abrimos la conexión UNA sola vez aquí
        Log.d("DAOLENGUA", "PREVIO A ABRIR CONEXIÓN: " + cod);
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            Log.d("DAOLENGUA", "PREVIO QUERY: " + cod);
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_LENGUA,
                null,
                ConectSQLiteHelperDB.C_LENGUA_COD + " = ?",
                new String[]{cod},
                null,
                null,
                null)
            ) {
                Log.d("DAOLENGUA", "PREVIO WHILE: " + cod);
                Log.d("DAOLENGUA", "CURSOR COUNT: " + cursor.getCount());
                while (cursor.moveToNext()) {
                    Log.d("DAOLENGUA", "Lengua encontrada: " + cod);
                    lengua.setCodigo(cod);
                    lengua.setNombre(cursor.getString(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_LENGUA_NOMBRE)));
                    lengua.setVersiones(DaoHelperVersion.obtenerTodosLengua(context, lengua));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Log.d("DAOLENGUA", "Lengua retornada: " + lengua);
            return lengua;
        }
    }
}
