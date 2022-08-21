
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


@WebServlet(name = "regequiponodefser", urlPatterns = {"/regequiponodefser"})
public class regequiponodefser extends HttpServlet {

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
            
		String equi = "";
		int kilo = -1;
                int hora = -1;
                int min = -1;
                int can = -1;
                String prio = "";

boolean flag = true;
//Validaciones
		if(request.getParameter("equi") != null){
			equi = request.getParameter("equi");
		}
		if(request.getParameter("kilo") != null){
			kilo= parseInt(request.getParameter("kilo"));
		}
                  if(request.getParameter("hora") != null){
			hora = parseInt(request.getParameter("hora"));
		}
		if(request.getParameter("min") != null){
			min = parseInt(request.getParameter("min"));
		}
		if(request.getParameter("prioridad") != null){
			prio = request.getParameter("prioridad");
		}
		if(request.getParameter("can") != null){
			can = parseInt(request.getParameter("can"));
		}
		if(request.getParameter("kilo") == ""){
			flag=false;
                }
                if(request.getParameter("min") == ""){
			flag=false;
                }
                if(request.getParameter("hora") == ""){
			flag=false;
                }
                if(request.getParameter("can") == ""){
			flag=false;
                }
                if(prio == ""){
			flag=false;
                }
                if(equi == ""){
			flag=false;
                }
		if(hora > 24 || hora<0 || min<0 || min >60){
			flag=false;
                }
		if(hora == 24 && min>0){
                flag=false;
                }
                
            if(flag){
                Connection con=Conexion.iniciar();
            st=con.createStatement();
            st.executeUpdate("INSERT INTO equipo(`nom_equ`,`kw_equ`) values('"+equi+"','"+kilo+"')");
            st.executeUpdate("INSERT INTO prioridaduso(`nom_pri`) values('"+prio+"')");
            st.executeUpdate("INSERT INTO descripcionconsumoequipo(`id_tie`) values('"+hora+"')");
            st.close();
            con.close();
            response.sendRedirect("regequiposer.jsp");
            }
            else{
                //EN CASO DE QUE HAYA UN ERROR
            RequestDispatcher rd = request.getRequestDispatcher("regequiposer.jsp"); 
             rd.forward(request,response);
            }
        }
        catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(regequiposser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
