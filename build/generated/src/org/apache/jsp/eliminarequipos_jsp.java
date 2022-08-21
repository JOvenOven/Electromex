package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlets.consultaequi;
import javax.servlet.http.HttpServletRequest;
import java.sql.Connection;
import Servlets.Conexion;
import java.sql.Statement;

public final class eliminarequipos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Eliminar Equipos</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/eliminarequipos.css\" />\n");
      out.write("    <script src=\"JS/eliminarequiposv.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <table id=\"cinta\" width=100%>\n");
      out.write("                <td id=\"controlarusuarios\"><a href=\"gestionusuarios.jsp\"><center>Gestión de Usuarios</center></a></td>\n");
      out.write("                    <td><center>|</center></td>\n");
      out.write("                    <td id=\"definiraparatos\"><a href=\"regeqadmin.jsp\"><center>Definir Equipos</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("<td id=\"eliminareq\"><a href=\"eliminarequipos.jsp\"><center>Eliminar Equipos</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"proyectar\"><a href=\"valoreshistoricos.jsp\"><center>Ingreso de Valores Históricos</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"modifvariables\"><a href=\"variablesadmin.jsp\"><center>Modificar Variables</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"logoutadmin\"><a href=\"index.jsp\"><center>Cerrar Sesión</center></a></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <header id=\"encabezadoeliminar\"><center>Eliminar Equipos Electrónicos</center></header>\n");
      out.write("            <br><br><br><br>\n");
      out.write("            <form method=\"post\" action=\"eliminarequiser\">\n");
      out.write("\n");
      out.write("                <center><table align=\"center\"><tr><td><h2>Ingresa el nombre del equipo</h2></td><td><input type=\"text\" name=\"equi\"></td></tr></table>\n");
      out.write("            <table id=\"paraeliminar\" align=center width=\"80%\">\n");
      out.write("                <tr>\n");
      out.write("                        \n");
      out.write("                        <td id=\"equipo\" align=center>Equipo</td>\n");
      out.write("                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td id=\"KWpH\" align=center>Kilowatt por Hora (Estimado)</td>\n");
      out.write("                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td id=\"horasuso\" align=center>Horas de Uso Diario</td>\n");
      out.write("                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td id=\"cantidad\" align=center>Cantidad de equipos</td>\n");
      out.write("                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td id=\"prioridad\" align=center>Prioridad</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"11\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                   \n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>Televisión</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>80 KW/h</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>4 horas</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>4</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>Media</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"11\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>Refrigerador</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>150 KW/h</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>24 horas</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>1</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>Alta</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"11\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>Consola de Videojuegos</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>95 KW/h</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>3 horas</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>1</td>\n");
      out.write("                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=center>Baja</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <br><br><br><br>\n");
      out.write("        <table align=center width=\"30%\" id=\"botonciños\"> \n");
      out.write("            <tr>\n");
      out.write("                <td align=center><input type=\"submit\" id=\"guardarcambios\" name=\"eli\" value=\"Eliminar Equipo\"></td>\n");
      out.write("            </tr>\n");
      out.write("            </form>\n");
      out.write("        </table>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
