package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regequipos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Registro de Equipos</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/regequipos.css\" />\n");
      out.write("    <script src=\"JS/regequiposv.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <table id=\"cinta\" width=100%>\n");
      out.write("                <tr>\n");
      out.write("                    <td id=\"whatiselectromx\"><a href=\"queeselectromex.jsp\"><center>¿Qué es ElectroMex?</center></a></td>\n");
      out.write("                    <td><center>|</center></td>\n");
      out.write("                    <td id=\"findtarif\"><a href=\"ejemplotarifa.jsp\"><center>Encuentra tu Tipo de Tarifa</center></a></td>\n");
      out.write("                    <td><center>|</center></td>\n");
      out.write("                    <td id=\"registrareq\"><a href=\"regequipos.jsp\"><center>Registro de Equipos</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"eliminareq\"><a href=\"eliminarequipos.jsp\"><center>Eliminar Equipos</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"proyectar\"><a href=\"proyeccion.jsp\"><center>Proyecciones</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"cuenta\"><a href=\"micuenta.jsp\"><center>Mi cuenta</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"logout\"><a href=\"index.jsp\"><center>Cerrar Sesión</center></a></td>\n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("        <br>\n");
      out.write("        <header id=\"encabezadoregistro\"><center>Registro de Equipos Electrónicos</center></header>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <form name=\"formulario\" method=\"post\" action=\"regequiposser\">\n");
      out.write("        <table align=center id=\"registrodeequipos\">\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"9\" height=\"35px\" align=center>Registre los apratos electrónicos con los que cuenta su hogar</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"9\" height=\"20px\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td id=\"equipo\" align=center>Equipo</td>\n");
      out.write("                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                <td id=\"KWpH\" align=center>Kilowatt por Hora (Estimado)</td>\n");
      out.write("                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                <td id=\"horasuso\" align=center>Horas de Uso Diario</td>\n");
      out.write("                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                <td id=\"cantidad\" align=center>Cantidad de equipos</td>\n");
      out.write("                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                <td id=\"prioridad\" align=center>Prioridad</td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"9\" height=\"20px\"></td>\n");
      out.write("             </tr>\n");
      out.write("            <tr>\n");
      out.write("                    <td align=center><select id=\"selectequipo\" name=\"selequipo\">\n");
      out.write("                            <option value=\"vacio\">Seleccione su Equipo</option>\n");
      out.write("                            <option value=\"Television\">Televisión</option>\n");
      out.write("                            <option value=\"Computadora\">Computadora de Escritorio</option>\n");
      out.write("                            <option value=\"Laptop\">Laptop</option>\n");
      out.write("                            <option value=\"Consola\">Consola de VideoJuegos</option>\n");
      out.write("                            <option value=\"Estereo\">Estéreo</option>\n");
      out.write("                            <option value=\"Telefono\">Teléfono</option>\n");
      out.write("                            <option value=\"Modem\">Módem</option>\n");
      out.write("                            <option value=\"Impresora\">Impresora</option> \n");
      out.write("                            <option value=\"Estufa\">Estufa</option> \n");
      out.write("                            <option value=\"Refrigerador\">Refrigerador</option> \n");
      out.write("                            <option value=\"Microondas\">Horno de Microondas</option>\n");
      out.write("                            <option value=\"Lavadora\">Lavadora</option>\n");
      out.write("                            <option value=\"Secadora\">Secadora de Ropa</option>\n");
      out.write("                          </select>\n");
      out.write("                    </td>\n");
      out.write("                    <td align=center></td>\n");
      out.write("                    <td align=center><input type=\"text\" id=\"kilowatthora\" name=\"kilo\" value=\"\" onKeyPress=\"return validars(event)\"required onpaste=\"return false\"></td>\n");
      out.write("                    <td align=center></td>\n");
      out.write("                    <td align=center><input type=\"text\" id=\"horasdeuso\" value=\"horas\" name=\"hora\" onKeyPress=\"return validars(event)\"required onpaste=\"return false\" onclick=\"if(this.value=='horas') this.value=''\" onblur=\"if(this.value=='') this.value='horas'\"><input type=\"text\" id=\"minutosdeuso\" value=\"minutos\" name=\"min\" onKeyPress=\"return validars(event)\"required onpaste=\"return false\" onclick=\"if(this.value=='minutos') this.value=''\" onblur=\"if(this.value=='') this.value='minutos'\"></td>\n");
      out.write("                    <td align=center></td>\n");
      out.write("                    <td align=center><input type=\"text\" id=\"cantidaddequipos\" value=\"\" onKeyPress=\"return validars(event)\"required onpaste=\"return false\" name=\"can\"></td>\n");
      out.write("                    <td align=center></td>\n");
      out.write("                    <td align=center><select id=\"selectprioridad\" name=\"prioridad\">\n");
      out.write("                            <option value=\"vacio\"></option>\n");
      out.write("                            <option value=\"Alta\">Alta</option>\n");
      out.write("                            <option value=\"Media\">Media</option>\n");
      out.write("                            <option value=\"Baja\">Baja</option>\n");
      out.write("                          </select></td>\n");
      out.write("                </tr>\n");
      out.write("        </table>\n");
      out.write("        <br><br>\n");
      out.write("        <table align=center width=\"80%\" id=\"noloencuentro\"> \n");
      out.write("                <tr>\n");
      out.write("                    <td>¿No encuentras tu equipo? Da click <a href=\"regequnodef.html\">aquí</a></td>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        <br><br><br><br>\n");
      out.write("        <table align=center width=\"30%\" id=\"botonciños\"> \n");
      out.write("            <tr>\n");
      out.write("                <td align=center><input type=\"button\" id=\"agregar\" name=\"add\" value=\"Agregar Nuevo Equipo\" onclick=\"prueba()\"></td>\n");
      out.write("                <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                <td align=center><input type=\"button\" id=\"guardarcambios\" name=\"guardar\" value=\"Guardar Cambios\" onclick=\"guardar()\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <center><table id=\"tablita\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("              <th>Equipo</th>\n");
      out.write("              <th>Kilowatthora</th>\n");
      out.write("              <th>Horas de uso</th>\n");
      out.write("              <th>Minutos de uso</th>\n");
      out.write("            <th>Cantidad de equipos</th>\n");
      out.write("            <th>prioridad</th>\n");
      out.write("            <th>Eliminar equipos</th>\n");
      out.write("            </tr>\n");
      out.write("          </table> </center>\n");
      out.write("    </form>\n");
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
