package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class proyeccion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Proyecciones</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"CSS/proyeccion.css\" />\n");
      out.write("    <script src=\"JS/proyeccionv.js\"></script>\n");
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
      out.write("                    <td id=\"proyeccionest\"><a href=\"proyeccion.jsp\"><center>Proyecciones</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"cuenta\"><a href=\"micuenta.jsp\"><center>Mi cuenta</center></a></td>\n");
      out.write("                    <td><center>|</center></td> \n");
      out.write("                    <td id=\"logout\"><a href=\"index.jsp\"><center>Cerrar Sesión</center></a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("\n");
      out.write("            \n");
      out.write("            <header id=\"encabezadoproyeccion\"><center>¿Cómo sería su consumo y su costo?</center></header>\n");
      out.write("            <br><br><br>\n");
      out.write("            <div class=\"d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom\">\n");
      out.write("                <h1 class=\"h2\">Proyecciones</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <canvas class=\"my-4\" id=\"myChart\" width=\"900\" height=\"380\"></canvas>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </main>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"../../assets/js/vendor/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"bootstrap-4.3.1-dist/js/bootstrap.js\" ></script>\n");
      out.write("\n");
      out.write("        <!-- Icons -->\n");
      out.write("        <script src=\"https://unpkg.com/feather-icons/dist/feather.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            feather.replace()\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <!-- Graphs -->\n");
      out.write("        <script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("    \n");
      out.write("        <script src=\"js/Chart.bundle.js\"></script>\n");
      out.write("        <script src=\"js/utils.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("           $.ajax({\n");
      out.write("        url: 'datos.csv',\n");
      out.write("        datatype: \"text\",\n");
      out.write("        contentType:\"charset=utf-8\"\n");
      out.write("    })\n");
      out.write("            function grafica()\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("    \n");
      out.write("            var ctx = document.getElementById(\"myChart\");\n");
      out.write("var myChart = new Chart(ctx, {\n");
      out.write("    type: 'line',\n");
      out.write("    data: {\n");
      out.write("        labels: [\"2018\", \"2019\", \"2020\", \"2021\", \"2022\", \"2023\", \"2024\"],\n");
      out.write("        datasets: [{\n");
      out.write("            data: [167, 166, 164, 168, 160, 165, 162],\n");
      out.write("            lineTension: 0,\n");
      out.write("            backgroundColor: 'transparent',\n");
      out.write("            borderColor: '#007bff',\n");
      out.write("            borderWidth: 4,\n");
      out.write("            pointBackgroundColor: '#007bff'\n");
      out.write("        }]\n");
      out.write("    },\n");
      out.write("    options: {\n");
      out.write("        scales: {\n");
      out.write("            yAxes: [{\n");
      out.write("                ticks: {\n");
      out.write("                    beginAtZero: false\n");
      out.write("                }\n");
      out.write("            }]\n");
      out.write("        },\n");
      out.write("        legend: {\n");
      out.write("            display: false,\n");
      out.write("        }\n");
      out.write("    }}\n");
      out.write(")};\n");
      out.write("        </script>\n");
      out.write("        <br><br><br>\n");
      out.write("            <form name=\"formulario\" method=\"post\" action=\"proyeccionser\">\n");
      out.write("            <table id=\"datosproyeccion\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <!-- Icons --><td align=\"center\">Indique el número de bimestres a proyectar</td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" id=\"nobimestres\" value=\"\" onKeyPress=\"return validarn(event)\" required onpaste=\"return false\"></td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                    <td align=\"center\"><input type=\"button\" id=\"proyectar\" value=\"Proyectar\" onclick=\"grafica()\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br><br><br>\n");
      out.write("            \n");
      out.write("            <table id=\"doproyection\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">De acuerdo con la información que usted ingresó:</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\">Su tipo de tarifa es ()</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td colspan=\"2\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td align=\"center\">Su consumo dentro de n bimestres será de: </td>\n");
      out.write("                        \n");
      out.write("                        <td align=\"center\"><input type=\"text\" id=\"consumobimestres\" value=\"\">&nbsp&nbsp Kw/h</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td align=\"center\">Su consumo por bimestre será de: </td>\n");
      out.write("                        \n");
      out.write("                        <td align=\"center\"><input type=\"text\" id=\"consumoxbimestre\" value=\"\">&nbsp&nbsp Kw/h</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td align=\"center\">El costo total de su luz eléctrica será de: </td>\n");
      out.write("                        \n");
      out.write("                        <td align=\"center\">$ &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"text\" id=\"costobimestres\" value=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td align=\"center\">El costo de su luz eléctrica por bimestre será de: </td>\n");
      out.write("                        \n");
      out.write("                        <td align=\"center\">$ &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type=\"text\" id=\"costoxbimestre\" value=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"2\" height=\"35px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                        <td colspan=\"2\" align=\"center\">Su Proyección a (n) bimestres</td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            <br><br><br>\n");
      out.write("\n");
      out.write("            <table id=\"quefue\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" colspan=\"3\" style=color:#3ADF00>¿Qué fué lo que tomamos en cuenta?</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"3\" height=\"20px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Consumo del Kilowatt-Hora:</td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> \n");
      out.write("                    <td align=\"justify\">Por su tipo de Tarifa su consumo puede ir de (n) a (n) KW/h</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"3\" height=\"10px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Precio del Kilowatt-Hora:</td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> \n");
      out.write("                    <td align=\"justify\">El precio del Kilowatt por Hora ha tenido un aumento promedio del (n%) anual</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"3\" height=\"10px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Impuestos:</td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> \n");
      out.write("                    <td align=\"justify\">Es el aumento del 16% al costo de producción de su servicio eléctrico</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"3\" height=\"10px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Susbsidio:</td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> \n");
      out.write("                    <td align=\"justify\">Es el apoyo gubernamental a su pago de luz eléctrica. Para su tipo de tarifa, el subsidio ha decrecido un (n%) en promedio cada año</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td colspan=\"3\" height=\"10px\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\">Sus datos:</td>\n");
      out.write("                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> \n");
      out.write("                    <td align=\"justify\">De acuerdo a su registro de equipos se hace un estimado del consumo de KiloWatts hora que puede consumir cada uno, los cuales se considerarán en su consumo; así como la zona en la que está registrado</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br><br><br>\n");
      out.write("            <table id=\"foot\" align=\"center\">\n");
      out.write("              <tr>\n");
      out.write("                  <td align=\"center\">¿Quiere saber que le recomienda ElectroMex?</td>\n");
      out.write("                  <td align=\"center\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>\n");
      out.write("                  <td align=\"center\"><input type=\"button\" onclick=\"location.href='recomendacion.jsp'\" name=\"irarec\" value=\"Ver Recomendaciones\" id=\"verrec\"></td>\n");
      out.write("              </tr>  \n");
      out.write("            </table>\n");
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
