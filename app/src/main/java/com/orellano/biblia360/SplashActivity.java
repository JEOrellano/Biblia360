package com.orellano.biblia360;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.orellano.biblia360.daoSQLite.ConectSQLiteHelperDB;
import com.orellano.biblia360.daoSQLite.DaoHelperVersion;
import com.orellano.biblia360.entity.BibliaApp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SplashActivity extends AppCompatActivity {
    private long startTime;
    private final int MIN_TIEMPO_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        startTime = System.currentTimeMillis();
        iniciarCargaDosFases();
    }

    private void iniciarCargaDosFases() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Handler handler = new Handler(Looper.getMainLooper());

        executor.execute(() -> {
            try {
                // FASE 1: Carga ligera (solo metadatos + lecturas sin versos)
                // ~3 consultas SQL, debe tomar < 1 segundo
                Log.d("SPLASH", "FASE 1: Iniciando carga ligera...");
                long t1 = System.currentTimeMillis();

                BibliaApp.versionCargada = DaoHelperVersion.obtenerUnoLight(this, "spa", "RVR1960");
                BibliaApp.isFullyLoaded = false;

                long t2 = System.currentTimeMillis();
                Log.d("SPLASH", "FASE 1: Completa en " + (t2 - t1) + "ms");

                if (BibliaApp.versionCargada == null) {
                    Log.e("SPLASH_ERROR", "No se pudo cargar la versión ligera");
                }

                long endTime = System.currentTimeMillis();
                long tiempoTranscurrido = endTime - startTime;
                long tiempoRestante = MIN_TIEMPO_SPLASH - tiempoTranscurrido;

                if (tiempoRestante > 0) {
                    try {
                        Thread.sleep(tiempoRestante);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                Log.e("SPLASH_CRASH", "Error fatal en FASE 1: " + e.getMessage());
                e.printStackTrace();
            }

            // Navegar a MainActivity inmediatamente después de FASE 1
            handler.post(() -> {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            });

            // FASE 2: Carga completa optimizada en segundo plano
            try {
                Log.d("SPLASH", "FASE 2: Iniciando carga completa optimizada...");
                long t3 = System.currentTimeMillis();

                BibliaApp.versionCargada = DaoHelperVersion.obtenerUnoCompletoOptimizado(
                    this, "spa", "RVR1960");
                BibliaApp.isFullyLoaded = true;

                long t4 = System.currentTimeMillis();
                Log.d("SPLASH", "FASE 2: Completa en " + (t4 - t3) + "ms");
                Log.d("SPLASH", "Cache global completamente cargado: " +
                    BibliaApp.versionCargada.getLecturas().size() + " lecturas, " +
                    BibliaApp.versionCargada.getLibros().size() + " libros");
            } catch (Exception e) {
                Log.e("SPLASH_CRASH", "Error en FASE 2: " + e.getMessage());
                e.printStackTrace();
                // Si falla FASE 2, la app sigue funcionando con FASE 1 + cargas bajo demanda
            }
        });
    }
}
