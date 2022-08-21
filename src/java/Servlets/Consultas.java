/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servlets;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author 
 */
public class Consultas extends Conexion2{
   ResultSet rs;
    
    public Consultas(){
        Conectar();
        System.out.println("conectado 2");
    }
    
    public int Login(String usuario,String contra) throws SQLException{
     
        int nivel=0;
        System.out.println("conectado 3");
        try{
        String sql="select id_priv from tipousuario where nom_usu='"+usuario+"' and con_usu='"+contra+"'";
        PreparedStatement ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
            System.out.println(rs);
        while(rs.next()){
            System.out.println("p1");
            nivel=rs.getInt("id_priv");
            
            System.out.println(nivel);
        }
            
        }catch(SQLException e){
            System.out.println("error"+e);
        }
        
        System.out.println(nivel);
        return nivel;
    }      
}
