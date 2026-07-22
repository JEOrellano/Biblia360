package com.orellano.biblia360.daoSQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.orellano.biblia360.entity.Referencia;
import com.orellano.biblia360.entity.Versiculo;

import java.util.ArrayList;
import java.util.List;

public class DaoHelperReferencia {
    // DAOS
    public static List<Referencia> obtenerTodosVersiculo(Context context, Versiculo v) {
        List<Referencia> lista = new ArrayList<Referencia>();
        try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
            try (Cursor cursor = con.query(
                ConectSQLiteHelperDB.T_REFERENCIA,
                null,
                ConectSQLiteHelperDB.C_REFERENCIA_LENGUA_COD_VSCL + " = ? AND " +
                ConectSQLiteHelperDB.C_REFERENCIA_VERSION_COD_VSCL + " = ? AND " +
                ConectSQLiteHelperDB.C_REFERENCIA_LIBRO_COD_VSCL + " = ? AND " +
                ConectSQLiteHelperDB.C_REFERENCIA_CAPITULO_COD_VSCL + " = ? AND " +
                ConectSQLiteHelperDB.C_REFERENCIA_VERSICULO_COD_VSCL + " = ?",
                new String[] {v.getCapitulo().getLibro().getVersion().getLengua().getCodigo(),
                    v.getCapitulo().getLibro().getVersion().getCodigo(),
                    v.getCapitulo().getLibro().getCodigo(),
                    String.valueOf(v.getCapitulo().getCodigo()),
                    String.valueOf(v.getCodigo())},
                null,
                null,
                null)) {
                while (cursor.moveToNext()) {
                    Referencia ref = new Referencia();
                    ref.setVersiculo(v);
                    // 1. Datos básicos de la referencia
                    int codTipo = cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_TIPO_REF_COD_TPRFRC));
                    ref.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_REFERENCIA_COD)));


                    // 2. Cargar el objeto TipoReferencia
                    ref.setTipo(DaoHelperTipoReferencia.obtenerUno(context, codTipo));

                    // 3. CARGA EN CASCADA (N:M): Buscar los versículos a los que apunta esta referencia
                    // Pasamos toda la PK de la referencia para buscar en VersiculoReferencia
                    ref.setVersos(DaoHelperVersiculo.obtenerTodosReferencia(context, ref));

                    lista.add(ref);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return lista;
        }
    }
}
