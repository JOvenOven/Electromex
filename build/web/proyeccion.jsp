<%-- 
    Document   : proyeccion
    Created on : 8/04/2019, 07:19:03 PM
    Author     : Profesor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Proyecciones</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/proyeccionv.js"></script>
</head>
<body>
        </head>
<body>
   <header>
            <img src="CSS/logotipo3.png">
            <div class="menu_bar">
                <a href="#" class="bt-menu"><i class="icono fas fa-bars"></i></a>
            </div>
            <nav>
                <ul>
                    <li class="submenu"><a href="#">Electromex<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                            <li><a href="queeselectromex.jsp">¿Qué es ElectroMex?</a></li>
                            <li><a href="ejemplotarifa.jsp">Encuentra tu Tipo de Tarifa</a></li>
                            
                        </ul>
                    <li class="submenu"><a href="#">Equipos<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                            <li><a href="propiedadesusu.jsp">Mis propiedades</a></li>
                            <li><a href="regequipos.jsp">Registro de Equipos</a></li>
                            <li><a href="eliminarequipos.jsp">Eliminar Equipos</a></li>
                        </ul>
                    </li>
                    <li class="submenu"><a href="#">Usuario<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                            <li><a href="proyeccion.jsp">Proyecciones</a></li>
                        </ul>
                    </li>
                    <li class="submenu"><a href="#">Cuenta<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                           
                            <li><a href="micuenta.jsp">Mi cuenta</a></li>
                            <li><a href="index.jsp">Cerrar Sesión</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </header>
            <br>
            
            
        

            
            <header id="encabezadoproyeccion"><center>¿Cómo sería su consumo y su costo?</center></header>
            <br><br><br>
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <h1 class="h2">Proyecciones</h1>
            </div>

            <canvas class="my-4" id="myChart" width="900" height="380"></canvas>

                </div>
            </main>
        </div>
    </div>

    <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
        <script src="../../assets/js/vendor/popper.min.js"></script>

        <script src="bootstrap-4.3.1-dist/js/bootstrap.js" ></script>

        <!-- Icons -->
        <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
        <script>
            feather.replace()
        </script>

        <!-- Graphs -->
        <script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
    
        <script src="js/Chart.bundle.js"></script>
        <script src="js/utils.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>
        <script>
            
           $.ajax({
        url: 'datos.csv',
        datatype: "text",
        contentType:"charset=utf-8"
    })
            function grafica()
    {
        
    
            var ctx = document.getElementById("myChart");
var myChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ["2018", "2019", "2020", "2021", "2022", "2023", "2024"],
        datasets: [{
            data: [167, 166, 164, 168, 160, 165, 162],
            lineTension: 0,
            backgroundColor: 'transparent',
            borderColor: '#007bff',
            borderWidth: 4,
            pointBackgroundColor: '#007bff'
        }]
    },
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    beginAtZero: false
                }
            }]
        },
        legend: {
            display: false,
        }
    }}
)};
        </script>
        <br><br><br>
            <form name="formulario" method="post" action="proyeccionser">
            <table id="datosproyeccion" align="center">
                <tr>
                    <!-- Icons --><td align="center">Indique el número de bimestres a proyectar</td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align="center"><input type="text" id="nobimestres" value="" onKeyPress="return validarn(event)" required onpaste="return false"></td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align="center"><input type="button" id="proyectar" value="Proyectar" onclick="grafica()"></td>
                </tr>
            </table>
            <br><br><br>
            
            <table id="doproyection" align="center">
                <tr>
                    <td colspan="2" align="center">De acuerdo con la información que usted ingresó:</td>
                </tr>
                <tr><td colspan="2" height="20px"></td></tr>
                <tr>
                        <td colspan="2" align="center">Su tipo de tarifa es ()</td>
                    </tr>
                    <tr><td colspan="2" height="20px"></td></tr>
                <tr>
                        <td align="center">Su consumo dentro de n bimestres será de: </td>
                        
                        <td align="center"><input type="text" id="consumobimestres" value="">&nbsp&nbsp Kw/h</td>
                </tr>
                <tr><td colspan="2" height="20px"></td></tr>
                <tr>
                        <td align="center">Su consumo por bimestre será de: </td>
                        
                        <td align="center"><input type="text" id="consumoxbimestre" value="">&nbsp&nbsp Kw/h</td>
                </tr>
                <tr><td colspan="2" height="20px"></td></tr>
                <tr>
                        <td align="center">El costo total de su luz eléctrica será de: </td>
                        
                        <td align="center">$ &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" id="costobimestres" value=""></td>
                </tr>
                <tr><td colspan="2" height="20px"></td></tr>
                <tr>
                        <td align="center">El costo de su luz eléctrica por bimestre será de: </td>
                        
                        <td align="center">$ &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" id="costoxbimestre" value=""></td>
                </tr>
                <tr><td colspan="2" height="35px"></td></tr>
                <tr>
                        <td colspan="2" align="center">Su Proyección a (n) bimestres</td>
                    </tr>
                
            </table>
            <br><br><br>

            <table id="quefue" align="center">
                <tr>
                    <td align="center" colspan="3" style=color:#3ADF00>¿Qué fué lo que tomamos en cuenta?</td>
                </tr>
                <tr><td colspan="3" height="20px"></td></tr>
                <tr>
                    <td align="right">Consumo del Kilowatt-Hora:</td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> 
                    <td align="justify">Por su tipo de Tarifa su consumo puede ir de (n) a (n) KW/h</td>
                </tr>
                <tr><td colspan="3" height="10px"></td></tr>
                <tr>
                    <td align="right">Precio del Kilowatt-Hora:</td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> 
                    <td align="justify">El precio del Kilowatt por Hora ha tenido un aumento promedio del (n%) anual</td>
                </tr>
                <tr><td colspan="3" height="10px"></td></tr>
                <tr>
                    <td align="right">Impuestos:</td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> 
                    <td align="justify">Es el aumento del 16% al costo de producción de su servicio eléctrico</td>
                </tr>
                <tr><td colspan="3" height="10px"></td></tr>
                <tr>
                    <td align="right">Susbsidio:</td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> 
                    <td align="justify">Es el apoyo gubernamental a su pago de luz eléctrica. Para su tipo de tarifa, el subsidio ha decrecido un (n%) en promedio cada año</td>
                </tr>
                <tr><td colspan="3" height="10px"></td></tr>
                <tr>
                    <td align="right">Sus datos:</td>
                    <td>&nbsp&nbsp&nbsp&nbsp&nbsp</td> 
                    <td align="justify">De acuerdo a su registro de equipos se hace un estimado del consumo de KiloWatts hora que puede consumir cada uno, los cuales se considerarán en su consumo; así como la zona en la que está registrado</td>
                </tr>
            </table>
            <br><br><br>
            <table id="foot" align="center">
              <tr>
                  <td align="center">¿Quiere saber que le recomienda ElectroMex?</td>
                  <td align="center">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                  <td align="center"><input type="button" onclick="location.href='recomendacion.jsp'" name="irarec" value="Ver Recomendaciones" id="verrec"></td>
              </tr>  
            </table>
        </form>
</body>
</html>