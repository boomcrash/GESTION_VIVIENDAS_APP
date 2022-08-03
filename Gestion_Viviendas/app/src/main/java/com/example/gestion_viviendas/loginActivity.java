package com.example.gestion_viviendas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class loginActivity extends AppCompatActivity {
Button ingresar;
EditText user,pass;
static String tipo_usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ingresar=findViewById(R.id.ingresar);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Conexion connect = new Conexion();
                connect.getconection();
                Intent login = new Intent(loginActivity.this, BotonesInicio.class);
                startActivity(login);
                //Toast.makeText(loginActivity.this, "INGRESO EXITOSO !", Toast.LENGTH_SHORT).show();

            }
        });
    }
}


    /*
    public void ingresar()
    {
        Conexion conect= new Conexion();
        com.mysql.jdbc.Connection conexion2=(com.mysql.jdbc.Connection) conect.getconection();
        PreparedStatement buscador = null,buscador2=null;
        ResultSet dato = null;
        ResultSet dato2 = null;
        try{
            buscador= (PreparedStatement) conexion2.prepareStatement("select * from cuenta where usuario=? and contraseña=?");
            buscador.setString(1,user.getText().toString());
            buscador.setString(2,pass.getText().toString());
            dato=buscador.executeQuery();
            if(dato.next())
            {
                String id=dato.getString("id_cuenta");

                if(user.getText().equals(dato.getString("usuario"))&&pass.getText().equals(dato.getString("contraseña")))
                {
                    Toast.makeText(this, "INGRESO EXITOSO", Toast.LENGTH_SHORT).show();

                    try{
                        String sql="select `tipo` from cuenta where id_cuenta=?";
                        buscador2= (PreparedStatement) conexion2.prepareStatement(sql);
                        buscador2.setString(1, id);
                        dato2=buscador2.executeQuery();

                        if(dato2.next()){
                            tipo_usuario=dato2.getString("tipo");
                            System.out.println(tipo_usuario);
                            /*try{
                                if(tipo_usuario.equalsIgnoreCase("empresa")){
                                    String sql2="select `id_empresa` from empresa where usuario_id=?";
                                    buscador2= (PreparedStatement) conexion2.prepareStatement(sql2);
                                    buscador2.setString(1, id);
                                    dato2=buscador2.executeQuery();
                                    if(dato2.next()){
                                        id_persona=dato2.getInt("id_empresa");}
                                    System.out.println(id);
                                }else if(tipo_usuario.equalsIgnoreCase("cliente")){
                                    String sql3="select `id_cliente` from cliente where usuario_id=?";
                                    buscador2= (PreparedStatement) conexion2.prepareStatement(sql3);
                                    buscador2.setString(1, id);
                                    dato2=buscador2.executeQuery();
                                    if(dato2.next()){
                                        id_persona=dato2.getInt("id_cliente");}
                                    System.out.println(id);
                                }

                            }catch(Exception e){
                                System.out.println("error de obtener id");
                            }


                            if(tipo_usuario.equalsIgnoreCase("empresa")){
                                interfaz_locales x=new interfaz_locales();
                                x.setVisible(true);
                            }else if(tipo_usuario.equalsIgnoreCase("cliente")){
                                interfaz_usuario x=new interfaz_usuario();
                                x.setVisible(true);
                            }
                        }
                    }catch(SQLException ex)
                    {
                        System.err.println("ERROR EN OBTENER DATOS 2");
                    }
                }
            }

        }catch(SQLException ex)
        {
            System.err.println("ERROR EN OBTENER DATOS");
        }finally{
            try{buscador.close();} catch (Exception e){}
            try{buscador2.close();} catch (Exception e){}
            try{dato.close();} catch (Exception e){}
            try{dato2.close();} catch (Exception e){}
            try{conexion2.close();} catch (Exception e){}
        }*/


