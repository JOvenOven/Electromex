/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Profesor
 */
public class Conexion {

    public static Connection iniciar() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
        
        String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        // Database name to access 
        String dbName = "electromex"; 
        String dbUsername = "root"; 
        String dbPassword = "n0m3l0"; 
  
        Class.forName(dbDriver).newInstance(); 
        Connection con = DriverManager.getConnection(dbURL + dbName, 
                                                     dbUsername,  
                                                     dbPassword); 
        System.out.println("se conecto");
        return con; 
        }
    
}


