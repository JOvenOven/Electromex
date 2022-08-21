/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Profesor
 */
@WebServlet(name = "propiedadesser", urlPatterns = {"/propiedadesser"})
public class propiedadesser extends HttpServlet {
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
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            try{
		
                String tar = "";
                String del = "";
                String pro = "";
                String tip = "";

boolean flag = true;
                if(request.getParameter("propiedadza") != null){
			tip = request.getParameter("propiedadza");
		}
		
		if(request.getParameter("ttarifa") != null){
			tar = request.getParameter("ttarifa");
		}
                 
		if(request.getParameter("delegacionza") != null){
			del = request.getParameter("delegacionza");
		}
		
		if(request.getParameter("pro") != null){
			pro = request.getParameter("pro");
		}
		if(request.getParameter("propiedadza") != ""){
			flag = false;
		}
		
		if(request.getParameter("ttarifa") != ""){
			flag = false;
		}
                 
		if(request.getParameter("delegacionza") != ""){
                        flag = false;
                }
		
		if(request.getParameter("pro") != ""){
			flag = false;
		}
		
            if(flag==true){
                System.out.println("Entra 1");
            HttpSession sesion=request.getSession();
            String user = (String)sesion.getAttribute("usuario");
            Connection con=Conexion.iniciar();
            st=con.createStatement();
            st.executeUpdate("INSERT INTO propiedad(`nom_pro`,`id_del`,`id_usu`,`id_cla`) values('"+pro+"','"+del+"','"+user+"','"+tip+"')");
            st.close();
            con.close();
            
                sesion.invalidate();
            response.sendRedirect("index.jsp");
            }
            else{
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp"); 
             rd.forward(request,response);
            }
            }
            catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
			Logger.getLogger(propiedadesser.class.getName()).log(Level.SEVERE, null, ex);
		}
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}