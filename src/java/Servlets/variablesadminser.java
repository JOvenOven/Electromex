
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
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


@WebServlet(name = "variablesadminser", urlPatterns = {"/variablesadminser"})
public class variablesadminser extends HttpServlet {
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
        try{
            processRequest(request, response);
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            
		String var = "";
		int pre = -1;
                String elivar = "";

boolean flag = true;
//Validaciones
		if(request.getParameter("namevariable") != null){
			var = request.getParameter("namevariable");
		}
		if(request.getParameter("impactov") != null){
			pre= parseInt(request.getParameter("impactov"));
		}
                  //if(request.getParameter("hora") != null){
		//	elivar = parseInt(request.getParameter("hora"));
		//}
		if(request.getParameter("namevariable") == ""){
			flag=false;
                }
                if(request.getParameter("impactov") == ""){
			flag=false;
                }
		
            if(flag){
                Connection con=Conexion.iniciar();
            st=con.createStatement();
           // st.executeUpdate("INSERT INTO variable(`nom_equ`,`kw_equ`) values('"+equi+"','"+kilo+"')");
            st.close();
            con.close();
            response.sendRedirect("variablesadmin.jsp");
            }
            else{
                //EN CASO DE QUE HAYA UN ERROR
            RequestDispatcher rd = request.getRequestDispatcher("variablesadmin.jsp"); 
             rd.forward(request,response);
            }
        }
        catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(variablesadminser.class.getName()).log(Level.SEVERE, null, ex);
        }
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
