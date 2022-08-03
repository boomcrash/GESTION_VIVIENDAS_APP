package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {
Button registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        registrar=findViewById(R.id.btnAvanzar);
        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DatosActivity.this, "REGISTRO EXITOSO \n PROCEDE A INGRESAR", Toast.LENGTH_SHORT).show();
                Intent login = new Intent(DatosActivity.this, loginActivity.class);
                startActivity(login);
            }
        });
    }
}