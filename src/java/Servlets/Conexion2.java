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
 * @author KIKA
 */
public class Conexion2 {
  
protected Connection con;
         public Statement stmt;
         private String errString;
        private String dbDriver = "com.mysql.jdbc.Driver"; 
        private String dbURL = "jdbc:mysql://localhost:3306/"; 
        private String dbName = "electromex"; 
        private String dbUsername = "root"; 
        private String dbPassword = "n0m3l0"; 
   
        
        
        

      public Conexion2()
      {

      }
        private String getConnectionUrl()
     {
         return dbURL;
     }


     public Connection Conectar(){
        con=null;
         try{
            
         Class.forName(dbDriver).newInstance(); 
         con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword); 
             
              System.out.println("Conectado");
         }catch(Exception e){
             errString= "Error conexion a la Base de Datos";
             System.out.println(errString);
             return null;
         }
          return con;
     }

     public void Desconectar()
     {
         try{
              stmt.close();
              con.close();
         }catch(SQLException e){
             errString= "Error Mientras se Cerraba la Conexion a la Base de Datos";
         }
     }
       public Statement getStmt()
       {
           return this.stmt;
           
       }
  
}
