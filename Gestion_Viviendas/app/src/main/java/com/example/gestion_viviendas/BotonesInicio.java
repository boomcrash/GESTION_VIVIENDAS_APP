package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BotonesInicio extends AppCompatActivity {
    Button admin,ver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones_inicio);
        ver=findViewById(R.id.ver);
        admin=findViewById(R.id.administrar);
        ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(BotonesInicio.this, PostActivity.class);
                startActivity(login);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(BotonesInicio.this, AdminActivity.class);
                startActivity(login);
            }
        });
    }
}