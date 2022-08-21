
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static sun.security.jgss.GSSUtil.login;

@WebServlet(name = "iniciarser", urlPatterns = {"/iniciarser"})
public class iniciarser extends HttpServlet {


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
            
		String cont = "";
		String usu = "";
                HttpSession sesion=request.getSession();
boolean flag = true;
		 
		if(request.getParameter("usuario") != null){
			usu = request.getParameter("usuario");
		}
		if(request.getParameter("contra") != null){
			cont = request.getParameter("contra");
		}
	
		if(cont.length() < 4){
			flag=false;
                }
                if(usu.length() <4){
                flag=false;
                }
                if(cont.length() > 20){
                flag=false;
                
                }
                String user = (String)sesion.getAttribute("usuario");
                String neve = (String)sesion.getAttribute("nivel");
                if(user != null){
                flag=false;
                }
               
                 System.out.println("valido");     
                 
            if(flag==true){      
            try {
                Connection con=Conexion.iniciar();
                
                PreparedStatement stmt=con.prepareStatement("SELECT id_usu FROM tipousuario WHERE nom_usu='"+ usu +"'");
                
                ResultSet rs=stmt.executeQuery("SELECT id_usu FROM tipousuario WHERE nom_usu='"+ usu +"'");
                
                int prov=0;
                while(rs.next()){
                    prov = rs.getInt("id_usu");
                }
                con.close();
                Consultas op= new Consultas();
                
                System.out.println(prov);
                System.out.println("sesion progreso");
                try {
            if(op.Login(usu, cont)==1){
                sesion.setAttribute("usuario",prov);
                System.out.println("listo");
                response.sendRedirect("adminwin.jsp");
                }
            else{
                sesion.setAttribute("usuario",prov);
                System.out.println("listo");
                response.sendRedirect("userwin.jsp");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(iniciarser.class.getName()).log(Level.SEVERE, null, ex);
        }
                response.sendRedirect("userwin.jsp");
            } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(iniciarser.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else{
                if(user!=null){response.sendRedirect("userwin.jsp");}
                if(user!=null){response.sendRedirect("adminwin.jsp");}
                else{
            RequestDispatcher rd = request.getRequestDispatcher("registro.jsp"); 
             rd.forward(request,response);
            }}

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
