package com.jcv.tresenraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Bundle jugadores = getIntent().getExtras();


        setTitle("TURNO DE "+jugadores.getString("jugador1"));

        Toast.makeText(this, jugadores.getString("jugador1"),Toast.LENGTH_LONG).show();
        Toast.makeText(this, jugadores.getString("jugador2"),Toast.LENGTH_LONG).show();
    }
}
