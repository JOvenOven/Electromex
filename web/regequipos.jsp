
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Registro de Equipos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/regequiposv.js"></script>
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
        <header id="encabezadoregistro"><center>Registro de Equipos Electrónicos</center></header>
        <br><br><br><br>
        <form name="formulario" method="post" action="regequiposser">
        <table align=center id="registrodeequipos">
            <tr>
                <td colspan="9" height="35px" align=center>Registre los apratos electrónicos con los que cuenta su hogar</td>
            </tr>
            <tr>
                <td colspan="9" height="20px"></td>
            </tr>
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
            
            <tr>
                <td colspan="9" height="20px"></td>
             </tr>
            <tr>
                    <td align=center><select id="selectequipo" name="selequipo">
                            <option value="vacio">Seleccione su Equipo</option>
                            <option value="Television">Televisión</option>
                            <option value="Computadora">Computadora de Escritorio</option>
                            <option value="Laptop">Laptop</option>
                            <option value="Consola">Consola de VideoJuegos</option>
                            <option value="Estereo">Estéreo</option>
                            <option value="Telefono">Teléfono</option>
                            <option value="Modem">Módem</option>
                            <option value="Impresora">Impresora</option> 
                            <option value="Estufa">Estufa</option> 
                            <option value="Refrigerador">Refrigerador</option> 
                            <option value="Microondas">Horno de Microondas</option>
                            <option value="Lavadora">Lavadora</option>
                            <option value="Secadora">Secadora de Ropa</option>
                          </select>
                    </td>
                    <td align=center></td>
                    <td align=center><input type="text" id="kilowatthora" name="kilo" value="" onKeyPress="return validars(event)"required onpaste="return false"></td>
                    <td align=center></td>
                    <td align=center><input type="text" id="horasdeuso" value="horas" name="hora" onKeyPress="return validars(event)"required onpaste="return false" onclick="if(this.value=='horas') this.value=''" onblur="if(this.value=='') this.value='horas'"><input type="text" id="minutosdeuso" value="minutos" name="min" onKeyPress="return validars(event)"required onpaste="return false" onclick="if(this.value=='minutos') this.value=''" onblur="if(this.value=='') this.value='minutos'"></td>
                    <td align=center></td>
                    <td align=center><input type="text" id="cantidaddequipos" value="" onKeyPress="return validars(event)"required onpaste="return false" name="can"></td>
                    <td align=center></td>
                    <td align=center><select id="selectprioridad" name="prioridad">
                            <option value="vacio"></option>
                            <option value="Alta">Alta</option>
                            <option value="Media">Media</option>
                            <option value="Baja">Baja</option>
                          </select></td>
                </tr>
        </table>
        <br><br>
        <table align=center width="80%" id="noloencuentro"> 
                <tr>
                    <td>¿No encuentras tu equipo? Da click <a href="regequnodef.html">aquí</a></td>
                    
                </tr>
            </table>
        <br><br><br><br>
        <table align=center width="30%" id="botonciños"> 
            <tr>
                <td align=center><input type="button" id="agregar" name="add" value="Agregar Nuevo Equipo" onclick="prueba()"></td>
                <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td align=center><input type="button" id="guardarcambios" name="guardar" value="Guardar Cambios" onclick="guardar()"></td>
            </tr>
        </table>
        <center><table id="tablita" border="1">
            <tr>
              <th>Equipo</th>
              <th>Kilowatthora</th>
              <th>Horas de uso</th>
              <th>Minutos de uso</th>
            <th>Cantidad de equipos</th>
            <th>prioridad</th>
            <th>Eliminar equipos</th>
            </tr>
          </table> </center>
    </form>
</body>
</html>