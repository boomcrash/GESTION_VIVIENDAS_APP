package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminActivity extends AppCompatActivity {
    Button administrar,consulta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        administrar=findViewById(R.id.añadir);
        consulta=findViewById(R.id.consulta);
        administrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(AdminActivity.this, IngresarVivienda.class);
                startActivity(login);
            }
        });
        consulta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(AdminActivity.this, ConsultarVivienda.class);
                startActivity(login);
            }
        });
    }
}