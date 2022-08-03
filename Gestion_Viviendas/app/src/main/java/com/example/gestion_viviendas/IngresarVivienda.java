package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class IngresarVivienda extends AppCompatActivity {
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar_vivienda);
        Spinner spinner=findViewById(R.id.spinner);
        ingresar=findViewById(R.id.ingresar);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.categorias, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IngresarVivienda.this, "SE HA INGRESADO LA VIVIENDA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}