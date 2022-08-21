package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class micuenta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Mi Cuenta</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/style.css\" />\n");
      out.write("    <script src=\"JS/micuentav.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        </head>\n");
      out.write("<body>\n");
      out.write("   <header>\n");
      out.write("            <img src=\"CSS/logotipo3.png\">\n");
      out.write("            <div class=\"menu_bar\">\n");
      out.write("                <a href=\"#\" class=\"bt-menu\"><i class=\"icono fas fa-bars\"></i></a>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Electromex<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                            <li><a href=\"queeselectromex.jsp\">¿Qué es ElectroMex?</a></li>\n");
      out.write("                            <li><a href=\"ejemplotarifa.jsp\">Encuentra tu Tipo de Tarifa</a></li>\n");
      out.write("                            \n");
      out.write("                        </ul>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Equipos<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                            <li><a href=\"propiedadesusu.jsp\">Mis propiedades</a></li>\n");
      out.write("                            <li><a href=\"regequipos.jsp\">Registro de Equipos</a></li>\n");
      out.write("                            <li><a href=\"eliminarequipos.jsp\">Eliminar Equipos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Usuario<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                            <li><a href=\"proyeccion.jsp\">Proyecciones</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Cuenta<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                           \n");
      out.write("                            <li><a href=\"micuenta.jsp\">Mi cuenta</a></li>\n");
      out.write("                            <li><a href=\"index.jsp\">Cerrar Sesión</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("            <br>\n");
      out.write("        \n");
      out.write("        <header id=\"encabezadomicuenta\"><center>Mi Cuenta</center></header>\n");
      out.write("        \n");
      out.write("        <br><br><br><br>\n");
      out.write("\n");
      out.write("        <form name=\"formulario\" method=\"post\" action=\"micuentaser\">\n");
      out.write("                <table id=\"tabladatosuser\" align=center>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"nombredeusuario\">Nombre de Usuario &nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td><input type=\"text\" id=\"nombreusuario\" value=\"\" onKeyPress=\"return validarn(event)\" required onpaste=\"return false\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=20px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"password\">Contraseña</td>\n");
      out.write("                            <td><input type=\"text\" id=\"contraseña\" value=\"\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=20px ></td></tr>\n");
      out.write("                    \n");
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
      out.write("                    <tr><td colspan=\"2\" height=20px ></td></tr>\n");
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
      out.write("                        <td id=\"fechanac\">Fecha de Nacimiento</td>\n");
      out.write("                        <td><input id=\"datenac\" type=\"date\" name=\"fechanacimiento\" min=\"1900-01-01\"\n");
      out.write("                            max=\"2019-03-31\" step=\"1\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=40px ></td></tr>\n");
      out.write("            \n");
      out.write("                </table>\n");
      out.write("            <br> <br>\n");
      out.write("                    <center><a href=\"modificarcu.jsp\" >MODIFICAR MI CUENTA</a></center>\n");
      out.write("        </form>\n");
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
