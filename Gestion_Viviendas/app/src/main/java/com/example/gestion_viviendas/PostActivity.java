package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PostActivity extends AppCompatActivity {
    ImageView unos,doss,tress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        unos=findViewById(R.id.unos);
        doss=findViewById(R.id.doss);
        tress=findViewById(R.id.tress);
        unos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(PostActivity.this, ReservacionActivity.class);
                startActivity(login);
            }
        });
        doss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(PostActivity.this, ReservacionActivity.class);
                startActivity(login);
            }
        });
        tress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(PostActivity.this, ReservacionActivity.class);
                startActivity(login);
            }
        });
    }
}