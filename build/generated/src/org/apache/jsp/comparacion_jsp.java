package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class comparacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Comparaciones</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/comparacion.css\" />\n");
      out.write("    <script src=\"JS/comparacionv.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <table id=\"cinta\" width=100%>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"whatiselectromx\"><a href=\"queeselectromex.jsp\"><center>¿Qué es ElectroMex?</center></a></td>\n");
      out.write("                    <td><center>|</center></td>\n");
      out.write("                    <td id=\"whatiselectromx\"><a href=\"propiedadesusu.jsp\"><center>Mis propiedades</center></a></td>\n");
      out.write("            <td><center>|</center></td>\n");
      out.write("                    <td id=\"findtarif\"><a href=\"ejemplotarifa.jsp\"><center>Encuentra tu Tipo de Tarifa</center></a></td>\n");
      out.write("                    <td><center>|</center></td>\n");
      out.write("                    <td id=\"registrareq\"><a href=\"regequipos.jsp\"><center>Registro de Equipos</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    \n");
      out.write("                    <td id=\"proyectar\"><a href=\"proyeccion.jsp\"><center>Proyecciones</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"cuenta\"><a href=\"micuenta.jsp\"><center>Mi cuenta</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"logout\"><a href=\"index.jsp\"><center>Cerrar Sesión</center></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <header id=\"encabezadocomparacion\"><center>Comparaciones</center></header>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
