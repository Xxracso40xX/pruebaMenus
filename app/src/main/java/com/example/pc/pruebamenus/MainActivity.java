package com.example.pc.pruebamenus;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje = "";
        switch (item.getItemId()) {
            case R.id.item1:
                mensaje = "Opción 1 pulsada!";
                break;
            case R.id.item2:
                mensaje = "Opción 2 pulsada!";
                break;
            case R.id.item3:
                mensaje = "Opción 3 pulsada!";
                break;
        }
        TextView lblMensaje = findViewById(R.id.withText);
        lblMensaje.setText(mensaje);
        return true;
    }
}
