package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class propiedadesusu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Propiedades</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/registro.css\" />\n");
      out.write("    <script src=\"JS/propiedadesusuv.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("                    <td id=\"proyectar\"><a href=\"proyeccion.jsp\"><center>Proyecciones</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"cuenta\"><a href=\"micuenta.jsp\"><center>Mi cuenta</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"logout\"><a href=\"index.jsp\"><center>Cerrar Sesión</center></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        <br><br>\n");
      out.write("        <form name=\"formulario\" method=\"post\" action=\"propiedadesususer\">\n");
      out.write("                <table id=\"tablaregistro\" align=center>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"nombredepropiedad\">Nombre de la propiedad &nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td><input type=\"text\" id=\"nombre\" value=\"\" onKeyPress=\"return validarn(event)\"required onpaste=\"return false\" name=\"pro\"></td>\n");
      out.write("                    </tr>                         \n");
      out.write("                     <tr><td colspan=\"2\" height=20px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"delegacion\">Tipo de propiedad</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"selectpro\" name=\"propidadza\">\n");
      out.write("                                    <option value=\"vacio\"></option>\n");
      out.write("                                    <option value=\"AlvObr\">Domestica</option>\n");
      out.write("                                    <option value=\"Azc\">Industrial</option>\n");
      out.write("                                    <option value=\"BJ\">Comercial</option>          \n");
      out.write("                                  </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=40px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"delegacion\">Delegación</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"selectdel\" name=\"delegacionza\">\n");
      out.write("                                    <option value=\"vacio\"></option>\n");
      out.write("                                    <option value=\"AlvObr\">Álvaro Obregón</option>\n");
      out.write("                                    <option value=\"Azc\">Azcapotzalco</option>\n");
      out.write("                                    <option value=\"BJ\">Benito Juárez</option>\n");
      out.write("                                    <option value=\"Coyo\">Coyoacán</option>\n");
      out.write("                                    <option value=\"Cuaji\">Cuajimalpa</option>\n");
      out.write("                                    <option value=\"Cuauh\">Cuauhtémoc</option>\n");
      out.write("                                    <option value=\"GAM\">Gustavo A. Madero</option>\n");
      out.write("                                    <option value=\"Iztac\">Iztacalco</option>\n");
      out.write("                                    <option value=\"Iztap\">Iztapalapa</option>\n");
      out.write("                                    <option value=\"MagCon\">Magdalena Contreras</option>\n");
      out.write("                                    <option value=\"MH\">Miguel Hidalgo</option>\n");
      out.write("                                    <option value=\"MilAlt\">Milpa Alta</option>\n");
      out.write("                                    <option value=\"Tlah\">Tláhuac</option>\n");
      out.write("                                    <option value=\"Tlal\">Tlalpan</option>\n");
      out.write("                                    <option value=\"VC\">Venustiano Carranza</option>\n");
      out.write("                                    <option value=\"Xoc\">Xochimilco</option>           \n");
      out.write("                                  </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=20px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"tt\">Tipo de Tarifa</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"selecttarifa\" name=\"ttarifa\">\n");
      out.write("                                    <option value=\"vacio\"></option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"1A\">1A</option>\n");
      out.write("                                    <option value=\"1B\">1B</option>\n");
      out.write("                                    <option value=\"1C\">1C</option>\n");
      out.write("                                    <option value=\"1D\">1D</option>\n");
      out.write("                                    <option value=\"1E\">1E</option>\n");
      out.write("                                    <option value=\"1F\">1F</option>\n");
      out.write("                                    <option value=\"DAC\">DAC</option>\n");
      out.write("                                                \n");
      out.write("                                  </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                           <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"submit\" onclick=\"interes()\" name=\"registrar\" value=\"Añadir propiedad\" id=\"botonentrar\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            <br><br>\n");
      out.write("            <center><h1>Mis Propiedades</h1></center>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
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
