package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gestionusuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Gestión de Usuarios</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("     <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("     <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/style.css\" />\n");
      out.write("    <script src=\"JS/gestionusuariosv.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <header>\n");
      out.write("            <img src=\"CSS/logotipo3.png\">\n");
      out.write("            <div class=\"menu_bar\">\n");
      out.write("                <a href=\"#\" class=\"bt-menu\"><i class=\"icono fas fa-bars\"></i></a>\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Variables<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                            <li><a href=\"valoreshistoricos.jsp\">Ingreso de Valores Históricos</a></li>\n");
      out.write("                            <li><a href=\"variablesadmin.jsp\">Modificar Variables</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Equipos<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                            <li><a href=\"regeqadmin.jsp\">Definir Equipos</a></li>\n");
      out.write("                            <li><a href=\"eliminarequipos.jsp\">Eliminar Equipos</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Usuario<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                            <li><a href=\"gestionusuarios.jsp\">Gestión de Usuarios</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"submenu\"><a href=\"#\">Cuenta<i class=\"icon fas fa-angle-down\"></i></a>\n");
      out.write("                        <ul class=\"children\">\n");
      out.write("                           \n");
      out.write("                            <li><a href=\"index.jsp\">Cerrar Sesión</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("    <a href=\"http://www.spyber.com/\"><img src=\"http://www.spyber.com/sig-21660.png\" border=\"0\" alt=\"Spyber.com - Who is my ISP\" /></a>    \n");
      out.write("    <br>\n");
      out.write("            <header id=\"encabezadogestion\"><center>Usuarios</center></header>\n");
      out.write("            <br><br><br>\n");
      out.write(" <form name=\"formulario\" action=\"gestionususer\" method=\"post\">\n");
      out.write("            <table id=\"busqueda\"  align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                   <td>Ingresa el nombre del usuario ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </td> \n");
      out.write("                   <td><input type=\"text\" id=\"nombreusuario\" name=\"usu\" value=\"\" onKeyPress=\"return validarn(event)\" required onpaste=\"return false\"></td> \n");
      out.write("                <td colspan=\"3\"></td><td><input type=\"submit\" id=\"buscar\" name=\"buscar\" value=\"Buscar\" onclick=\"interes()\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("  </form>\n");
      out.write("            <form name=\"formulario\" action=\"gestionusu2ser\" method=\"post\">\n");
      out.write("            <table id=\"busqueda\"  align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                        <td> O Ingresa la \"ID\" del usuario ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td> \n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td><input type=\"text\" id=\"idusuario\" value=\"\" name=\"id\" onKeyPress=\"return validars(event)\" required onpaste=\"return false\"></td>  \n");
      out.write("                        <td><input type=\"submit\" id=\"buscar\" name=\"buscar\" value=\"Buscar\" onclick=\"interes()\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("            <br><br>\n");
      out.write("            <table id=\"usuarios\"  align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                       <td>ID Usuario</td> \n");
      out.write("                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                       <td>Nombre del Usuario</td> \n");
      out.write("                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                       <td>Contraseña</td> \n");
      out.write("                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                       <td>Tipo de Tarifa</td> \n");
      out.write("                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                       <td>Delegación</td> \n");
      out.write("                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                       <td>Fecha de Nacimineto</td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr height=\"15px\"><td colspan=\"11\"></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td>1</td>\n");
      out.write("                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>   \n");
      out.write("                            <td>Juan</td>  \n");
      out.write("                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td> \n");
      out.write("                            <td>Furro</td>   \n");
      out.write("                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                            <td>DAC</td>   \n");
      out.write("                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                            <td>Iztacalco</td>   \n");
      out.write("                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                            <td>13/08/2002</td>       \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <br><br><br><br>\n");
      out.write("\n");
      out.write("                <table align=center width=\"50%\" id=\"botonciños\"> \n");
      out.write("                    <tr>\n");
      out.write("                        <td align=center><input type=\"button\" id=\"aplicar\" name=\"aplicarcambios\" value=\"Aplicar Cambios\"></td>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td align=center><input type=\"button\" id=\"deleteuser\" name=\"del\" value=\"Eliminar Usuario\"></td>\n");
      out.write("                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td align=center><input type=\"reset\" id=\"restablecer\" name=\"restablecer\" value=\"Restablecer\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
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
