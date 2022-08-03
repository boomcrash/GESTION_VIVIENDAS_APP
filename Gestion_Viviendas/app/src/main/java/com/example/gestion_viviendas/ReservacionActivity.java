package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ReservacionActivity extends AppCompatActivity {
Button reservar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservacion);

        reservar=findViewById(R.id.reservar);

        reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ReservacionActivity.this, "RESERVACION EXITOSA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}