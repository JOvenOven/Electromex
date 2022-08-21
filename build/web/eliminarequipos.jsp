<%-- 
    Document   : eliminarequipos
    Created on : 8/04/2019, 07:18:20 PM
    Author     : Profesor
--%>

<%@page import="Servlets.consultaequi"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="java.sql.Connection"%>
<%@page import="Servlets.Conexion"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Eliminar Equipos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/eliminarequiposv.js"></script>
</head>
<body>
         <header>
            <img src="CSS/logotipo3.png">
            <div class="menu_bar">
                <a href="#" class="bt-menu"><i class="icono fas fa-bars"></i></a>
            </div>
            <nav>
                <ul>
                    <li class="submenu"><a href="#">Variables<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                            <li><a href="valoreshistoricos.jsp">Ingreso de Valores Históricos</a></li>
                            <li><a href="variablesadmin.jsp">Modificar Variables</a></li>
                        </ul>
                    <li class="submenu"><a href="#">Equipos<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                            <li><a href="regeqadmin.jsp">Definir Equipos</a></li>
                            <li><a href="eliminarequipos.jsp">Eliminar Equipos</a></li>
                        </ul>
                    </li>
                    <li class="submenu"><a href="#">Usuario<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                            <li><a href="gestionusuarios.jsp">Gestión de Usuarios</a></li>
                        </ul>
                    </li>
                    <li class="submenu"><a href="#">Cuenta<i class="icon fas fa-angle-down"></i></a>
                        <ul class="children">
                           
                            <li><a href="index.jsp">Cerrar Sesión</a></li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </header>
            <br>
            <header id="encabezadoeliminar"><center>Eliminar Equipos Electrónicos</center></header>
            <br><br><br><br>
            <form method="post" action="eliminarequiser">

                <center><table align="center"><tr><td><h2>Ingresa el nombre del equipo</h2></td><td><input type="text" name="equi"></td></tr></table>
            <table id="paraeliminar" align=center width="80%">
                <tr>
                        
                        <td id="equipo" align=center>Equipo</td>
                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td id="KWpH" align=center>Kilowatt por Hora (Estimado)</td>
                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td id="horasuso" align=center>Horas de Uso Diario</td>
                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td id="cantidad" align=center>Cantidad de equipos</td>
                        <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td id="prioridad" align=center>Prioridad</td>
                </tr>
                <tr><td colspan="11" height="20px"></td></tr>
                <tr>
                   
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>Televisión</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>80 KW/h</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>4 horas</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>4</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>Media</td>
                </tr>
                <tr><td colspan="11" height="20px"></td></tr>
                <tr>
                    
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>Refrigerador</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>150 KW/h</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>24 horas</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>1</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>Alta</td>
                </tr>
                <tr><td colspan="11" height="20px"></td></tr>
                <tr>
                    
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>Consola de Videojuegos</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>95 KW/h</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>3 horas</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>1</td>
                    <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                    <td align=center>Baja</td>
                </tr>

            </table>
            <br><br><br><br>
        <table align=center width="30%" id="botonciños"> 
            <tr>
                <td align=center><input type="submit" id="guardarcambios" name="eli" value="Eliminar Equipo"></td>
            </tr>
            </form>
        </table>
   
</body>
</html>