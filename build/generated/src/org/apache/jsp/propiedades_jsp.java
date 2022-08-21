package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class propiedades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Registro</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("   <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/stylein.css\">\n");
      out.write("    <script src=\"JS/registrov.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body id=\"cuerpo\">\n");
      out.write("        <br><br>\n");
      out.write("\n");
      out.write("        <header id=\"encabezadoregistro\"><center>ElectroMex</center></header>\n");
      out.write("        <br><br><br><br>\n");
      out.write("\n");
      out.write("        <form name=\"formulario\" method=\"post\" action=\"propiedadesser\">\n");
      out.write("                <table id=\"tablaregistro\" align=center>\n");
      out.write("                    <tr>\n");
      out.write("                        <td id=\"nombredepropiedad\">Nombre de la propiedad &nbsp&nbsp&nbsp</td>\n");
      out.write("                        <td><input type=\"text\" id=\"pro\" value=\"\" onKeyPress=\"return validarn(event)\"required onpaste=\"return false\" name=\"pro\"></td>\n");
      out.write("                    </tr>                         \n");
      out.write("                     <tr><td colspan=\"2\" height=20px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"delegacion\">Tipo de propiedad</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"propidadza\" name=\"propidadza\">\n");
      out.write("                                    <option value=\"vacio\"></option>\n");
      out.write("                                    <option value=\"1\">Domestica</option>\n");
      out.write("                                    <option value=\"2\">Industrial</option>\n");
      out.write("                                    <option value=\"3\">Comercial</option>          \n");
      out.write("                                  </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=40px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"delegacion\">Delegación</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"delegacionza\" name=\"delegacionza\">\n");
      out.write("                                    <option value=\"vacio\"></option>\n");
      out.write("                                    <option value=\"1\">Álvaro Obregón</option>\n");
      out.write("                                    <option value=\"2\">Azcapotzalco</option>\n");
      out.write("                                    <option value=\"3\">Benito Juárez</option>\n");
      out.write("                                    <option value=\"4\">Coyoacán</option>\n");
      out.write("                                    <option value=\"5\">Cuajimalpa</option>\n");
      out.write("                                    <option value=\"6\">Cuauhtémoc</option>\n");
      out.write("                                    <option value=\"7\">Gustavo A. Madero</option>\n");
      out.write("                                    <option value=\"8\">Iztacalco</option>\n");
      out.write("                                    <option value=\"9\">Iztapalapa</option>\n");
      out.write("                                    <option value=\"10\">Magdalena Contreras</option>\n");
      out.write("                                    <option value=\"11\">Miguel Hidalgo</option>\n");
      out.write("                                    <option value=\"12\">Milpa Alta</option>\n");
      out.write("                                    <option value=\"13\">Tláhuac</option>\n");
      out.write("                                    <option value=\"14\">Tlalpan</option>\n");
      out.write("                                    <option value=\"15\">Venustiano Carranza</option>\n");
      out.write("                                    <option value=\"16\">Xochimilco</option>           \n");
      out.write("                                  </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=20px ></td></tr>\n");
      out.write("                    <tr>\n");
      out.write("                            <td id=\"tt\">Tipo de Tarifa</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"ttarifa\" name=\"ttarifa\">\n");
      out.write("                                    <option value=\"vacio\"></option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"2\">1A</option>\n");
      out.write("                                    <option value=\"3\">1B</option>\n");
      out.write("                                    <option value=\"4\">1C</option>\n");
      out.write("                                    <option value=\"5\">1D</option>\n");
      out.write("                                    <option value=\"6\">1E</option>\n");
      out.write("                                    <option value=\"7\">1F</option>\n");
      out.write("                                    <option value=\"8\">DAC</option>\n");
      out.write("                                                \n");
      out.write("                                  </select>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                           <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"submit\" onclick=\"interes()\" name=\"registrar\" value=\"Añadir propiedad\" id=\"botonentrar\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        \n");
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
