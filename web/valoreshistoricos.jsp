<%-- 
    Document   : valoreshistoricos
    Created on : 8/04/2019, 07:20:27 PM
    Author     : Profesor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Valores Históricos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/valoreshistoricosv.js"></script>
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
        </header>            <br>
            <header id="encabezadovalores"><center>Valores Históricos</center></header><br>
            <br><br><br>

        <table id="valoreshistoricos" align="center" border="1">
            <tr>
                <td colspan="2" height="30px"></td> 
                <td colspan="20" bgcolor="#E2A9F3"><center>Datos Anuales</center></td>
            </tr>
            <tr>
                <td bgcolor="#B40404" style=color:white><center>Tarifa</center></td>
                <td bgcolor="#B40404" style=color:white><center>Concepto</center></td>
                <td bgcolor="#FACC2E" ><center>1995</center></td>
                <td bgcolor="#FACC2E"><center>2000</center></td>
                <td bgcolor="#FACC2E"><center>2001</center></td>
                <td bgcolor="#FACC2E"><center>2002</center></td>
                <td bgcolor="#FACC2E"><center>2003</center></td>
                <td bgcolor="#FACC2E"><center>2004</center></td>
                <td bgcolor="#FACC2E"><center>2005</center></td>
                <td bgcolor="#FACC2E"><center>2006</center></td>
                <td bgcolor="#FACC2E"><center>2007</center></td>
                <td bgcolor="#FACC2E"><center>2008</center></td>
                <td bgcolor="#FACC2E"><center>2009</center></td>
                <td bgcolor="#FACC2E"><center>2010</center></td>
                <td bgcolor="#FACC2E"><center>2011</center></td>
                <td bgcolor="#FACC2E"><center>2012</center></td>
                <td bgcolor="#FACC2E"><center>2013</center></td>
                <td bgcolor="#FACC2E"><center>2014</center></td>
                <td bgcolor="#FACC2E"><center>2015</center></td>
                <td bgcolor="#FACC2E"><center>2016</center></td>
                <td bgcolor="#FACC2E"><center>2017</center></td>
                <td bgcolor="#FACC2E"><center>2018</center></td>
            </tr>
            <tr>
                <td rowspan="3" bgcolor="#0A0A2A" style=color:white><center>Doméstica</center></td>
                <td bgcolor="#64FE2E"><center>Precio Medio del Kilowatt-Hora</center></td>
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
            </tr>
            <tr>
                    <td bgcolor="#64FE2E"><center>Precio/Costo</center></td>
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                </tr>
                <tr>
                        <td bgcolor="#64FE2E"><center>Subsidio a la luz eléctrica</center></td>
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                    </tr>
        <tr>
                <td rowspan="3" bgcolor="#0080FF" style=color:white><center>Comercial</center></td>
                <td bgcolor="#64FE2E"><center>Precio Medio del Kilowatt-Hora</center></td>
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
                <td><center>$<input type="text" value="" id="valor"></center></td> 
            </tr>
            <tr>
                    <td bgcolor="#64FE2E"><center>Precio/Costo</center></td>
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                </tr>
                <tr>
                        <td bgcolor="#64FE2E"><center>Subsidio a la luz eléctrica</center></td>
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                        <td><center>$<input type="text" value="" id="valor"></center></td> 
                    </tr>
                    <tr>
                            <td rowspan="3" bgcolor="#81DAF5" style=color:white><center>Indsutrial</center></td>
                            <td bgcolor="#64FE2E"><center>Precio Medio del Kilowatt-Hora</center></td>
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                            <td><center>$<input type="text" value="" id="valor"></center></td> 
                        </tr>
                        <tr>
                                <td bgcolor="#64FE2E"><center>Precio/Costo</center></td>
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                                <td><center>$<input type="text" value="" id="valor"></center></td> 
                            </tr>
                            <tr>
                                    <td bgcolor="#64FE2E"><center>Subsidio a la luz eléctrica</center></td>
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                    <td><center>$<input type="text" value="" id="valor"></center></td> 
                                </tr>
        </table>
        <br><br><br><br>
        <table align=center width="30%" id="botonciños"> 
            <tr>
                <td align=center><input type="button" id="cambios" name="changes" value="Aplicar Cambios"></td>
                <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td align=center><input type="button" id="restablecer" name="restablecer" value="Restablecer"></td>
            </tr>
        </table>
</body>
</html>
