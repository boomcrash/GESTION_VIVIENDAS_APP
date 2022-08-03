package com.example.gestion_viviendas;

import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection conexion=null;
    public static final String URL="jdbc:mysql://204.2.195.100:17059/gestion_locales?connectTimeout=3000";
    public static final String USUARIO="boom";
    public static final String CONTRASEÑA="12345678";

    public Conexion() {

    }

    public Connection getconection ()
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            System.out.println("conectado");

        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR, "+ex);
        }
        catch (SQLException ex)
        {
            System.err.println("ERROR, "+ex);
        }
        return conexion;
    }
}
