/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Elieth
 */
public class Database {
    public static Connection Conectar(){
           String conexionURL="jdbc:sqlserver://localhost:1433;databaseName=Farmacia_Rosales_DB;"+
            "integratedSecurity=true;"+"encrypt=true;trustServerCertificate=true;";
 
           try {
            Connection cn = DriverManager.getConnection(conexionURL);
            System.out.println("¡Conexión exitosa!");
            return cn;
        } catch (SQLException e) {
            System.out.println("¡Error al conectar a la base de datos " + e);
            return null;
        }
    }
}
