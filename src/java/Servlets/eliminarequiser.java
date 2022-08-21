
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


@WebServlet(name = "eliminarequiser", urlPatterns = {"/eliminarequiser"})
public class eliminarequiser extends HttpServlet {
private Statement st;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        processRequest(request, response);
        try{
            
            
		String equi = "";

            boolean flag = true;
		if(request.getParameter("equi") != null){
			equi = request.getParameter("equi");
		}
		
		//revisar que sean validos
		
		if(equi == ""){
			flag=false;
                }
                
            if(flag){
                response.setContentType("text/html;charset=UTF-8");
			
			Connection con = Conexion.iniciar();
			st=con.createStatement();
			//st.executeUpdate("delete from producto where id_pro = "+equi);
			
			con.close();
			st.close();
            response.sendRedirect("eliminarequiser.jsp");
            }
            else{
            RequestDispatcher rd = request.getRequestDispatcher("registro.jsp"); 
             rd.forward(request,response);
            }
        }
        catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
			Logger.getLogger(eliminarequiser.class.getName()).log(Level.SEVERE, null, ex);
		}
      
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
    }

public boolean validarNom(String nom){
		String reg = "[A-Za-záéíóúÁÉÍÓÚñÑ ]*";
		if(!contieneNum(nom) && nom.length() < 40 && nom.length() > 3 && nom.matches(reg)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean contieneNum(String num){
		for(int i = 0; i < num.length(); i++){
			char c = num.charAt(i);
			if(Character.isDigit(c)){
				return true;
			}
		}
		return false;
	}
	
	public boolean validarNomUsr(String nomUsr){
		String reg = "[A-Za-zá-úÁ-Ú0-9 ]*";
		if(nomUsr.length() < 10 && nomUsr.length() > 3 && nomUsr.matches(reg)){
			return true;
		}else{
			return false;
		}
	}
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
