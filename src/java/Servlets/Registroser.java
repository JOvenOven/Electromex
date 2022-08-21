package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpSession;
import static sun.security.jgss.GSSUtil.login;

@WebServlet(name = "Registroser", urlPatterns = {"/Registroser"})
public class Registroser extends HttpServlet {
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
		String fec = "";
		String usu = "";
                String cont = "";
                String confcont = "";
                String tar = "";
                String del = "";
                String pro = "";
                String nom = "";

boolean flag = true;
                if(request.getParameter("nombre") != null){
			nom = request.getParameter("nombre");
		}
		if(request.getParameter("confirmarcontra") != null){
                   
			confcont = request.getParameter("confirmarcontra");
		}
                  if(request.getParameter("fechanacimiento") != null){
			fec = request.getParameter("fechanacimiento");
		}
		if(request.getParameter("usu") != null){                
			usu = request.getParameter("usu");
		}
		if(request.getParameter("contra") != null){
                     
			cont = request.getParameter("contra");
		}
		
		
		//revisar que sean validos
		if(nom == ""){
                    request.setAttribute("a1", "<font color='white'>(Ingresa tu nombre)</font>");
                flag = false;
                }
                if(usu == ""){
                    request.setAttribute("a2", "<font color='white'>(Ingresa tu nombre  usuario)</font>");
                flag=false;
                }
                if(cont == ""){
                request.setAttribute("a3", "<font color='white'>(Ingresa tu contraseña)</font>");
                }
                if(confcont == ""){
                request.setAttribute("a4", "<font color='white'>(Ingresa nuevamente tu contraseña)</font>");
                }
        
		if(cont.length() < 4){
                    request.setAttribute("a3", "<font color='white'>(El minimo de digitos ingresados debe ser de 4)</font>");
			flag=false;
                }
                if(confcont.length() < 4){
                    request.setAttribute("a4", "<font color='white'>(El minimo de digitos ingresados debe ser de 4)</font>");
                    flag=false;
                }
                if(nom.length() <2){
                    request.setAttribute("a2", "<font color='white'>(El minimo de digitos ingresados debe ser de 2)</font>");
                flag=false;
                }
                if(usu.length() <4){
                    request.setAttribute("a2", "<font color='white'>(El minimo de digitos ingresados debe ser de 4)</font>");
                flag=false;
                }
                if(cont.length() > 20){
                    request.setAttribute("a3", "<font color='white'>(El maximo digitos que se puede ingresar es de 20)</font>");
                flag=false;
                
                }
                if(confcont.length() > 20){
                    request.setAttribute("a4", "<font color='white'>(El maximo digitos que se puede ingresar es de 20)</font>");
                flag=false;
                }
                if(nom.length() >20){
                    request.setAttribute("a1", "<font color='white'>(El maximo de digitos ingresados debe ser de 20)</font>");
                flag=false;
                }
                if(usu.length() >20){
                    request.setAttribute("a2", "<font color='white'>(El maximo de digitos ingresados debe ser de 20)</font>");
                flag=false;
                }
                if(!cont.contentEquals(confcont)){
                    request.setAttribute("a3", "<font color='white'>(Las contraseñas no coinciden)</font>");
                flag=false;
                }
                if(!validarNom(nom)){
                    request.setAttribute("a1", "<font color='white'>(Ingresa solamente letras en tu nombre)</font>");
			flag=false;
                }
                
            if(flag==true){
            Connection con=Conexion.iniciar();
               
                
                
                System.out.println("Entra 1");
            st=con.createStatement();
            st.executeUpdate("INSERT INTO tipousuario (nom_usu, con_usu, id_priv) values ('"+usu+"', '"+cont+"', '2')");
       System.out.println("Entra 2");
            PreparedStatement stmt=con.prepareStatement("SELECT id_usu FROM tipousuario WHERE nom_usu='"+ usu +"'");
 System.out.println("Entra 3");
            ResultSet rs=stmt.executeQuery("SELECT id_usu FROM tipousuario WHERE nom_usu='"+ usu +"'");
 System.out.println("Entra 4");
            int prov=0;
            while(rs.next()){
            prov = rs.getInt("id_usu");
            }
 System.out.println("Entra 5");
                System.out.println(prov);
                
            st.executeUpdate("INSERT INTO persona(`nom_per`,`fec_per`,`id_usu`) values('"+nom+"','"+fec+"','"+prov+"')");
 System.out.println("Entra 6");
            st.close();
            con.close();
                  Consultas op= new Consultas();
            HttpSession sesion=request.getSession();
             System.out.println("Entra 7");
            sesion.setAttribute("usuario",prov);
            sesion.setAttribute("usuario","2");
           
   
            response.sendRedirect("propiedades.jsp");
            }
            else{
            RequestDispatcher rd = request.getRequestDispatcher("registro.jsp"); 
             rd.forward(request,response);
            }
            }
            catch (SQLException ex) {
			Logger.getLogger(Registroser.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
            Logger.getLogger(Registroser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Registroser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Registroser.class.getName()).log(Level.SEVERE, null, ex);
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

