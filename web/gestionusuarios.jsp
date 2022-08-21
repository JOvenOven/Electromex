<%-- 
    Document   : gestionusuarios
    Created on : 8/04/2019, 07:18:32 PM
    Author     : Profesor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Gestión de Usuarios</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/gestionusuariosv.js"></script>
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
            <header id="encabezadogestion"><center>Usuarios</center></header>
            <br><br><br>
 <form name="formulario" action="gestionususer" method="post">
            <table id="busqueda"  align="center">
                <tr>
                   <td>Ingresa el nombre del usuario ${a1} </td> 
                   <td><input type="text" id="nombreusuario" name="usu" value="" onKeyPress="return validarn(event)" required onpaste="return false"></td> 
                <td colspan="3"></td><td><input type="submit" id="buscar" name="buscar" value="Buscar" onclick="interes()"></td>
                </tr>
                
            </table>
  </form>
            <form name="formulario" action="gestionusu2ser" method="post">
            <table id="busqueda"  align="center">
                <tr>
                        <td> O Ingresa la "ID" del usuario ${a2}</td> 
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td><input type="text" id="idusuario" value="" name="id" onKeyPress="return validars(event)" required onpaste="return false"></td>  
                        <td><input type="submit" id="buscar" name="buscar" value="Buscar" onclick="interes()"></td>
                </tr>
            </table>
            </form>
            <br><br>
            <table id="usuarios"  align="center">
                    <tr>
                       <td>ID Usuario</td> 
                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                       <td>Nombre del Usuario</td> 
                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                       <td>Contraseña</td> 
                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                       <td>Tipo de Tarifa</td> 
                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                       <td>Delegación</td> 
                       <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                       <td>Fecha de Nacimineto</td> 
                    </tr>
                    <tr height="15px"><td colspan="11"></td></tr>
                    <tr>
                            <td>1</td>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>   
                            <td>Juan</td>  
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td> 
                            <td>Furro</td>   
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>DAC</td>   
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>Iztacalco</td>   
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                            <td>13/08/2002</td>       
                    </tr>
                </table>
                <br><br><br><br>

                <table align=center width="50%" id="botonciños"> 
                    <tr>
                        <td align=center><input type="button" id="aplicar" name="aplicarcambios" value="Aplicar Cambios"></td>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td align=center><input type="button" id="deleteuser" name="del" value="Eliminar Usuario"></td>
                        <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                        <td align=center><input type="reset" id="restablecer" name="restablecer" value="Restablecer"></td>
                    </tr>
                </table>

   

</body>
</html>
