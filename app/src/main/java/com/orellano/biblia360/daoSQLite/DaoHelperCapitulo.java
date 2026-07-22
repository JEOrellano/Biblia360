package com.orellano.biblia360.daoSQLite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.orellano.biblia360.entity.Capitulo;
import com.orellano.biblia360.entity.Libro;

import java.util.ArrayList;
import java.util.List;

public class DaoHelperCapitulo {
  // DAOS
  public static List<Capitulo> obtenerTodosLibro(Context context, Libro lb) {
    Log.d("DAOCAPITULO", "PREVIO A ABRIR CONEXIÓN: " + lb.getVersion().getLengua().getCodigo() + " - " + lb.getVersion().getCodigo() + " - " + lb.getCodigo());
    List<Capitulo> lista = new ArrayList<Capitulo>();
    try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
      Log.d("DAOCAPITULO", "PREVIO QUERY: " + lb.getVersion().getLengua().getCodigo() + " - " + lb.getVersion().getCodigo() + " - " + lb.getCodigo());
      try (Cursor cursor = con.query(
          ConectSQLiteHelperDB.T_CAPITULO,
          null,
          ConectSQLiteHelperDB.C_CAPITULO_LIBRO_COD_LG + " = ? AND " +
              ConectSQLiteHelperDB.C_CAPITULO_VERSION_COD_LG + " = ? AND " +
              ConectSQLiteHelperDB.C_CAPITULO_LENGUA_COD_LG + " = ?",
          new String[]{lb.getCodigo(),
              lb.getVersion().getCodigo(),
              lb.getVersion().getLengua().getCodigo()},
          null,
          null,
          ConectSQLiteHelperDB.C_CAPITULO_COD + " ASC",
          null)
      ) {
        Log.d("DAOCAPITULO", "PREVIO WHILE: " + lb.getVersion().getLengua().getCodigo() + " - " + lb.getVersion().getCodigo() + " - " + lb.getCodigo());
        Log.d("DAOCAPITULO", "CURSOR COUNT: " + cursor.getCount());
        while (cursor.moveToNext()) {
          Capitulo cptl = new Capitulo();
          cptl.setLibro(lb);
          cptl.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_CAPITULO_COD)));
          cptl.setVersiculos(DaoHelperVersiculo.obtenerTodosCapitulo(context, cptl));
          lista.add(cptl);
        }
      } catch (Exception e) {
        Log.d("DAOCAPITULO", "ERROR: " + e.getMessage());
        e.printStackTrace();
      } finally {
        Log.d("DAOCAPITULO", "Lista retornada: " + lista);
        return lista;
      }
    }
  }

  public static Capitulo obtenerUno(Context context, String cdLg, String cdVs, String csLb, int cdCp) {
    Log.d("DAOCAPITULO", "PREVIO A ABRIR CONEXIÓN: " + cdLg + " - " + cdVs + " - " + csLb + " - " + cdCp);
    Capitulo cptl = new Capitulo();
    try (SQLiteDatabase con = new ConectSQLiteHelperDB(context).getReadableDatabase()) {
      Log.d("DAOCAPITULO", "PREVIO QUERY: " + cdLg + " - " + cdVs + " - " + csLb + " - " + cdCp);
      try (Cursor cursor = con.query(
          ConectSQLiteHelperDB.T_CAPITULO,
          null,
          ConectSQLiteHelperDB.C_CAPITULO_LENGUA_COD_LG + " = ? AND " +
              ConectSQLiteHelperDB.C_CAPITULO_VERSION_COD_LG + " = ? AND " +
              ConectSQLiteHelperDB.C_CAPITULO_LIBRO_COD_LG + " = ? AND " +
              ConectSQLiteHelperDB.C_CAPITULO_COD + " = ?",
          new String[]{cdLg,
              cdVs,
              csLb,
              String.valueOf(cdCp)},
          null,
          null,
          null,
          null)) {
        Log.d("DAOCAPITULO", "PREVIO WHILE: " + cdLg + " - " + cdVs + " - " + csLb + " - " + cdCp);
        Log.d("DAOCAPITULO", "CURSOR COUNT: " + cursor.getCount());
        while (cursor.moveToNext()) {
          cptl.setLibro(DaoHelperLibro.obtenerUno(context, cdLg, cdVs, csLb));
          cptl.setCodigo(cursor.getInt(cursor.getColumnIndexOrThrow(ConectSQLiteHelperDB.C_CAPITULO_COD)));
          cptl.setVersiculos(DaoHelperVersiculo.obtenerTodosCapitulo(context, cptl));
        }
      }
    } catch (Exception e) {
      Log.d("DAOCAPITULO", "ERROR: " + e.getMessage());
      e.printStackTrace();
    } finally {
      Log.d("DAOCAPITULO", "Objeto retornada: " + cptl);
      return cptl;
    }
  }
}
