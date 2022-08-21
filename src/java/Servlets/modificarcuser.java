/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "modificarcuser", urlPatterns = {"/modificarcuser"})
public class modificarcuser extends HttpServlet {


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
        String fec = "";
		String usu = "";
                String cont = "";
                String confcont = "";
                String tar = "";
                String del = "";
                String pro = "";

boolean flag = true;
		if(request.getParameter("confirmarcontra") != null){
			confcont = request.getParameter("confirmarcontra");
		}
		if(request.getParameter("ttarifa") != null){
			tar = request.getParameter("ttarifa");
		}
                  if(request.getParameter("fechanacimiento") != null){
			fec = request.getParameter("fechanacimiento");
		}
		if(request.getParameter("delegacionza") != null){
			del = request.getParameter("delegacionza");
		}
		if(request.getParameter("usu") != null){
			usu = request.getParameter("usu");
		}
		if(request.getParameter("contra") != null){
			cont = request.getParameter("contra");
		}
		if(request.getParameter("propiedadza") != null){
			pro = request.getParameter("propiedadza");
		}
		
		//revisar que sean validos
		
		if(tar == ""){
			flag=false;
                }
                if(del == ""){
			flag=false;
                }
		if(cont.length() < 4){
			flag=false;
                }
		
		if(cont.length() < 4){
			flag=false;
                }
                if(confcont.length() < 4){
                    flag=false;
                }
                if(usu.length() <4){
                flag=false;
                }
                if(cont.length() > 20){
                flag=false;
                
                }
                if(confcont.length() > 20){  
                flag=false;
                }
                if(cont != confcont){
                    
                flag=false;
                }
                
            if(flag){
                
            response.sendRedirect("micuenta.jsp");
            }
            else{
            RequestDispatcher rd = request.getRequestDispatcher("modificarcu.jsp"); 
             rd.forward(request,response);
            }
         
    }



    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
