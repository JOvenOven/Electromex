/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author halo_
 */
@WebServlet(name = "gestionusu2ser", urlPatterns = {"/gestionusu2ser"})
public class gestionusu2ser extends HttpServlet {
    private Statement st;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        processRequest(request, response);
        processRequest(request, response);
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            try{
		int id = 0;

boolean flag = true;

		if(request.getParameter("id") != null){
                   
			id = parseInt(request.getParameter("id"));
		}
                else{
                    request.setAttribute("a2", "<font color='white'>(Ingresa el id del usuario)</font>");
                flag=false;
                }
                 Connection con=Conexion.iniciar();
            PreparedStatement stmt1=con.prepareStatement("SELECT nom_usu from tipousuario");
            ResultSet rs1=stmt1.executeQuery("SELECT nom_usu from tipousuario");
            int aux = -1;
                while(rs1.next()){
               aux = rs1.getInt("id_usu");
               if(id == aux){
                   flag = true;
               }
               else{
                   request.setAttribute("a2", "<font color='red'>(El usuario no existe)</font>");
               flag = false;
               }
            } 

      if(flag){         
            st=con.createStatement();       
            PreparedStatement stmt=con.prepareStatement("SELECT * from usuario");
            ResultSet rs=stmt.executeQuery("SELECT * from usuario");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"decoracion.css\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center>Usuario </center></h1>" );
            out.println("<center><table>");
            out.println("<tr>");
            out.println("<th id=\"nombreusuario\">id usuario</th>");
            out.println("<th id=\"nombreusuario\">Nombre</th>");
            out.println("<th id=\"nombreusuario\">Nombre Usuario</th>");
            out.println("<th id=\"nombreusuario\">fecha</th>");
            out.println("<th id=\"nombreusuario\">Contraseña</th></tr>");
            aux = -1;
            while(rs.next()){
               aux = rs.getInt("id_usu");
               if(id == aux){
                   out.println("<tr><td id=\"nombreusuario\">"+ rs.getInt("id_usu") +"</td><td id=\"nombreusuario\">"+ rs.getString("nom_per") +"</td><td id=\"nombreusuario\">"+ rs.getString("ape_pat") +"</td><td id=\"nombreusuario\">"+ rs.getString("ape_mat") +"</td><td id=\"nombreusuario\">"+ rs.getString("fec_usu") +"</td>"
                    + "<td id=\"nombreusuario\">"+ rs.getString("usu_usu") +"</td><td id=\"nombreusuario\">"+ rs.getString("con_usu") +"</td></tr>");               
               }
            }

            out.println("</table></center>");
            out.println("<center>");
            out.println("<a href=\"gestionusuarios.jsp\" >Volver</a>" );
            out.println("</center>");
            out.println("</body>");
            out.println("</html>"); 
            con.close();
            st.close();
      }
      else{
      RequestDispatcher rd = request.getRequestDispatcher("gestionusuarios.jsp"); 
             rd.forward(request,response);
      }
            }  
         catch (ClassNotFoundException ex) {
            Logger.getLogger(gestionususer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(gestionususer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(gestionususer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(gestionususer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
