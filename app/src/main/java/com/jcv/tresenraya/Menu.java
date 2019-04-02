package com.jcv.tresenraya;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    Button btnSiguienteJugar;
    EditText jugadorUno;
    EditText jugadorDos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnSiguienteJugar = (Button) findViewById(R.id.btnJugar);
        jugadorUno = (EditText) findViewById(R.id.editText);
        jugadorDos = (EditText) findViewById(R.id.editText2);

        btnSiguienteJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel:992314521");

                //Intent intent = new Intent(Intent.ACTION_CALL, uri);
                Intent intent = new Intent(getApplicationContext(), Inicio.class);

                intent.putExtra("jugador1", jugadorUno.getText().toString());
                intent.putExtra("jugador2", jugadorDos.getText().toString());
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this,"Pausa",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this,"Pausa",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this,"Pausa",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this,"Pausa",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this,"Pausa",Toast.LENGTH_LONG).show();
    }

}
