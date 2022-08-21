package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quees_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"stylein.css\">\n");
      out.write("    </head>\n");
      out.write("    <body id=\"iniciar-sesion\">\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <img src=\"logotipo2.png\">\n");
      out.write("            <div class=\"barranav\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Iniciar Sesión</a></li>\n");
      out.write("                    <li><a href=\"registro.jsp\">Registrarse</a></li>\n");
      out.write("                    <li><a href=\"quees.jsp\">¿Qué es ElectroMex?</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"cabeza\">\n");
      out.write("                <h1>¿Qué es ElectroMex?</h1>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"inises\">\n");
      out.write("                <form method=\"get\" action=\"validarregistro\"> \n");
      out.write("                    <div class=\"field-wrap\">\n");
      out.write("                        ElectroMex es una página web que te permite conocer el estimado del precio de la luz eléctrica en un futuro, todo esto, tomando en cuenta los datos previamente ingresados, como el tipo de tarifa con la que cuenta, el uso y frecuencia de los aparatos electrónicos estableciendo cuantos kilowatts-hora usa cada aparato y el tiempo de uso. Una vez hecho esto, el usuario seleccionará la prioridad de cada equipo electrónico (alta, media o baja). También deberá ingresar la zona de la Ciudad de México del usuario que está ingresando al sistema. Todo esto hace más preciso el funcionamiento de ElectroMex.\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\n");
      out.write("    \n");
      out.write("    <script  src=\"index.js\"></script>\n");
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
