package com.orellano.biblia360;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.orellano.biblia360.databinding.ActivityMainBinding;
import com.orellano.biblia360.utility.WhatsAppDialog;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WhatsAppDialog.showWhatsAppDialog(MainActivity.this,"Día " );
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    // Esto VA en MainActivity.java, NO en FirstFragment.java
    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            // Definimos un ratio de 16:9 para que la ventana sea alargada como un video
            android.util.Rational aspectRatio = new android.util.Rational(16, 9);
            android.app.PictureInPictureParams params = new android.app.PictureInPictureParams.Builder()
                .setAspectRatio(aspectRatio) // <--- Esto ajusta la forma de la ventana
                .build();
            enterPictureInPictureMode(params);
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, android.content.res.Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);

        if (isInPictureInPictureMode) {
            // Ocultar la Toolbar para que no robe espacio al video
            if (getSupportActionBar() != null) getSupportActionBar().hide();
            binding.fab.setVisibility(View.GONE);
        } else {
            if (getSupportActionBar() != null) getSupportActionBar().show();
            binding.fab.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onConfigurationChanged(@NonNull android.content.res.Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Esto evita que la actividad se reinicie, pero permite que
        // el modo PiP funcione sin detener el video.

        // Si no estás en PiP, puedes forzar la actualización de la UI si ves que no cambia
        if (!isInPictureInPictureMode()) {
            // Opcional: refrescar layout si es necesario
        }
    }
}