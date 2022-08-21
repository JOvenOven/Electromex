/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class consultaequi  {       
    private Statement st;
 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException   {     
try {
            processRequest(request, response);
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            
            
            
            
            String usu=request.getParameter("usu");
            
             Connection con=Conexion.iniciar();
            
            st=con.createStatement();
           
           
            PreparedStatement stmt=con.prepareStatement("SELECT id FROM usuario WHERE nombre='"+usu+"'");
            ResultSet rs=stmt.executeQuery("SELECT id FROM usuario WHERE nombre='"+usu+"'");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            while(rs.next()){
            out.println("<h1>"+ rs.getInt("id") +" </h1>");
            }                                  
            out.println("</body>");
            out.println("</html>"); 

           
            con.close();
            st.close();
            
            
            
            
            System.out.println("Se registro");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(consultaequi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(consultaequi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(consultaequi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(consultaequi.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}