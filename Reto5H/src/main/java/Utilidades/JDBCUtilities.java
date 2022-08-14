/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author hugop
 */
public class JDBCUtilities {
    public static Connection conexion() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:\\Users\\hugop\\Documents\\NetBeansProjects\\Reto5H\\ProyectosConstruccion.db";
            conn = DriverManager.getConnection(url);

        } catch (Exception e) {
            System.out.println(e);
        }
        return conn;

    }
}
