
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


@WebServlet(name = "propiedadesususer", urlPatterns = {"/propiedadesususer"})
public class propiedadesususer extends HttpServlet {

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
		if(pro == ""){
                flag = false;
                }
		if(tar == ""){
			flag=false;
                }
                if(del == ""){
			flag=false;
                }
                if(tip == ""){
                flag=false;
                }
		if(pro.length()>20 ){
                flag=false;
                }
            if(flag){
            Connection con=Conexion.iniciar();
            st=con.createStatement();
            //st.executeUpdate("INSERT INTO usuario(`nom_usu`,`ape_pat`,`ape_mat`,`fec_usu`,`usu_usu`,`con_usu`) values('"+nom+"','"+pat+"','"+mat+"','"+fec+"','"+usu+"','"+cont+"')");
            st.close();
            con.close();
                
            response.sendRedirect("propiedadesusu.jsp");
            }
            else{
            RequestDispatcher rd = request.getRequestDispatcher("propiedadesusu.jsp"); 
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
    }// </editor-fold>

}
