/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EL LOL
 */
public class Conexion {

    static Connection cnx = null;
    
   // public static void main(String[] args) {
        
    
    public static Connection conectar() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:Mysql://localhost/taller2?user=root&password=");
            //JOptionPane.showMessageDialog(null, "Conectado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectar");
        }
        return cnx;
    }
            }
