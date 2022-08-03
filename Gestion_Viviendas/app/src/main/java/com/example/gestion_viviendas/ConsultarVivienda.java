package com.example.gestion_viviendas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.gestion_viviendas.adapters.OportunidadesAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConsultarVivienda extends AppCompatActivity {

    private ExpandableListView list;
    private OportunidadesAdapter adapter;
    private ArrayList<String> listCategorias;
    private Map<String,ArrayList<String>> mapchild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_vivienda);
        list=findViewById(R.id.prioridades2);
        listCategorias=new ArrayList<>();
        mapchild=new HashMap<>();
        list=findViewById(R.id.prioridades2);
        listCategorias=new ArrayList<>();
        mapchild=new HashMap<>();
        ArrayList<String> vivienda =new ArrayList<>();
        listCategorias.add("VIVIENDAS");
        mapchild.put(listCategorias.get(0),vivienda);
        for (int i=1;i<10;i++){
            vivienda.add("# habitaciones: " +i +"\n" + "disponibles: "+(i-1)+"\n" );
        }
        adapter=new OportunidadesAdapter(listCategorias,mapchild, ConsultarVivienda.this);
        list.setAdapter(adapter);
}
}