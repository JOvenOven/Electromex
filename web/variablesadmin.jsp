<%-- 
    Document   : variablesadmin
    Created on : 8/04/2019, 07:20:35 PM
    Author     : Profesor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Variables</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/variablesadminv.js"></script>
</head>
<body>
    <form name="formulario" method="post" action="variablesadminser">
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
            <header id="encabezadovariables"><center>Modificar Variables</center></header>
            <br>
            <header id="encabezadoequiposadmin"><center>Registro de Equipos Predefinidos</center></header>

            <br><br><br>
            <table id="adicionvariables" align="center">
                <tr>
                   <td><input type="text" id="nombrevariable" name="namevariable" value="Ingrese el nombre de la variable" required onpaste="return false" onclick="if(this.value=='Ingrese el nombre de la variable') this.value=''" onblur="if(this.value=='') this.value='Ingrese el nombre de la variable'"></td> 
                   <td><input type="text" id="impactov" name="impactov" value="Ingrese el impacto sobre el precio de la luz" required onpaste="return false" onclick="if(this.value=='Ingrese el impacto sobre el precio de la luz') this.value=''" onblur="if(this.value=='') this.value='Ingrese el impacto sobre el precio de la luz'"></td> 
                   <td><input type="button" id="agregarv" name="addv" value="Agregar Variable" onclick="inters()"></td> 
                </tr>
            </table>
            <br><br><br>
            <table id="variables" align="center">
                <tr>
                    <td>Variable</td>
                    <td>Impacto sobre el Precio de Luz Eléctrica</td>
                    <td>Eliminar variable</td>
                </tr>
                
            </table>
            <br><br><br>
            <table id="boton" align="center">
                <tr><td><input type="button" id="guardarcambios" name="guardarcambios" value="Guardar Cambios" onclick="guardar()"></td></tr>
            </table>
        </form>
</body>
</html>