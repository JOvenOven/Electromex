<%-- 
    Document   : propiedadesusu
    Created on : 4/05/2019, 03:50:17 PM
    Author     : halo_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Propiedades</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/propiedadesusuv.js"></script>
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
        <br><br>
        <form name="formulario" method="post" action="propiedadesususer">
                <table id="tablaregistro" align=center>
                    <tr>
                        <td id="nombredepropiedad">Nombre de la propiedad &nbsp&nbsp&nbsp</td>
                        <td><input type="text" id="nombre" value="" onKeyPress="return validarn(event)"required onpaste="return false" name="pro"></td>
                    </tr>                         
                     <tr><td colspan="2" height=20px ></td></tr>
                    <tr>
                            <td id="delegacion">Tipo de propiedad</td>
                            <td>
                                <select id="selectpro" name="propidadza">
                                    <option value="vacio"></option>
                                    <option value="AlvObr">Domestica</option>
                                    <option value="Azc">Industrial</option>
                                    <option value="BJ">Comercial</option>          
                                  </select>
                            </td>
                    </tr>
                    <tr><td colspan="2" height=40px ></td></tr>
                    <tr>
                            <td id="delegacion">Delegación</td>
                            <td>
                                <select id="selectdel" name="delegacionza">
                                    <option value="vacio"></option>
                                    <option value="AlvObr">Álvaro Obregón</option>
                                    <option value="Azc">Azcapotzalco</option>
                                    <option value="BJ">Benito Juárez</option>
                                    <option value="Coyo">Coyoacán</option>
                                    <option value="Cuaji">Cuajimalpa</option>
                                    <option value="Cuauh">Cuauhtémoc</option>
                                    <option value="GAM">Gustavo A. Madero</option>
                                    <option value="Iztac">Iztacalco</option>
                                    <option value="Iztap">Iztapalapa</option>
                                    <option value="MagCon">Magdalena Contreras</option>
                                    <option value="MH">Miguel Hidalgo</option>
                                    <option value="MilAlt">Milpa Alta</option>
                                    <option value="Tlah">Tláhuac</option>
                                    <option value="Tlal">Tlalpan</option>
                                    <option value="VC">Venustiano Carranza</option>
                                    <option value="Xoc">Xochimilco</option>           
                                  </select>
                            </td>
                    </tr>
                    <tr><td colspan="2" height=20px ></td></tr>
                    <tr>
                            <td id="tt">Tipo de Tarifa</td>
                            <td>
                                <select id="selecttarifa" name="ttarifa">
                                    <option value="vacio"></option>
                                    <option value="1">1</option>
                                    <option value="1A">1A</option>
                                    <option value="1B">1B</option>
                                    <option value="1C">1C</option>
                                    <option value="1D">1D</option>
                                    <option value="1E">1E</option>
                                    <option value="1F">1F</option>
                                    <option value="DAC">DAC</option>
                                                
                                  </select>
                            </td>
                    </tr>
                    
                    
                    <tr>
                            <td></td>
                           <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" onclick="interes()" name="registrar" value="Añadir propiedad" id="botonentrar"></td>
                    </tr>
                    
                </table>
            <br><br>
            <center><h1>Mis Propiedades</h1></center>
            </form>
    </body>
</html>
