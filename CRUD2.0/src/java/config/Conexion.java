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

    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:Mysql://localhost/taller2?user=root&password=");            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    public Connection getConnection(){
        return con;
    }
            }
