
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


@WebServlet(name = "gestionususer", urlPatterns = {"/gestionususer"})
public class gestionususer extends HttpServlet {
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
		String usu = "";


boolean flag = true;
                if(request.getParameter("usu") != null){
			usu = request.getParameter("usu");
		}
                if(usu == ""){
                    request.setAttribute("a2", "<font color='white'>(Ingresa un nombre de usuario)</font>");
                flag=false;
                }
                if(usu.length() >20){
                    request.setAttribute("a2", "<font color='white'>(El maximo de digitos ingresados debe ser de 20)</font>");
                flag=false;
                }
            Connection con=Conexion.iniciar();
            System.out.println("no entra0");
            PreparedStatement stmt1=con.prepareStatement("SELECT nom_usu from tipousuario where nom_usu="+usu);
            System.out.println("no entra0.1");
            ResultSet rs1=stmt1.executeQuery("SELECT nom_usu from tipousuario where nom_usu="+usu);
            System.out.println("no entra0.2");
            String aux = "";
            boolean vali = true;
            System.out.println("no entra1");
            if(!rs1.next()){
                System.out.println("no entra3");
            request.setAttribute("a1", "<font color='red'>(El usuario ingresado no existe)</font>");
               flag = false;
            }
           
                 
                System.out.println("no entra3");
      if(flag){  
          System.out.println("aqui entra");
            st=con.createStatement();       
            PreparedStatement stmt=con.prepareStatement("SELECT * from tipousuario where nom_usu="+usu);
            ResultSet rs=stmt.executeQuery("SELECT * from tipousuario where nom_usu="+usu);
            System.out.println("aqui entra2");
            int aux2 = 0;
            aux2=rs.getInt("id_usu");
            PreparedStatement stmt2=con.prepareStatement("SELECT nom_per,con_per,fec_per from persona where id_usu="+aux2);
            ResultSet rs2=stmt.executeQuery("SELECT nom_per,con_per,fec_per from persona where id_usu="+aux2);
            System.out.println("aqui entra3");
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
            aux = "";
            
            while(rs2.next()){
                System.out.println("aqui entra4");
                   out.println("<tr><td id=\"nombreusuario\">"+ rs2.getInt("id_usu") +"</td><td id=\"nombreusuario\">"+ rs.getString("nom_per") +"</td><td id=\"nombreusuario\">"+ rs.getString("nom_usu") +"</td><td id=\"nombreusuario\">"+ rs.getString("fec_per") +"</td><td id=\"nombreusuario\">"+ rs2.getString("con_usu") +"</td>"
                    + "<td id=\"nombreusuario\">"+ rs.getString("usu_usu") +"</td><td id=\"nombreusuario\">"+ rs.getString("con_usu") +"</td></tr>");               
               System.out.println("aqui entra4.1");
            }

            out.println("</table></center>");
            out.println("<center>");
            out.println("<a href=\"gestionusuarios.jsp\" >Volver</a>" );
            out.println("</center>");
            out.println("</body>");
            out.println("</html>"); 
            System.out.println("aqui entra 5");
            con.close();
            st.close();
            System.out.println("aqui entra6");
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
