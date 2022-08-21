<%-- 
    Document   : regeqnodef
    Created on : 8/04/2019, 07:20:02 PM
    Author     : Profesor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Registro de Equipos no definidos</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/regequnodef.css" />
    <script src="JS/regequnodefv.js"></script>
</head>
<body>
        <table id="cinta" width=100%>
                <tr>
                    <td id="whatiselectromx"><a href="queeselectromex.jsp"><center>¿Qué es ElectroMex?</center></a></td>
                    <td><center>|</center></td>
                   <td id="whatiselectromx"><a href="propiedadesusu.jsp"><center>Mis propiedades</center></a></td>
            <td><center>|</center></td>
                    <td id="findtarif"><a href="ejemplotarifa.jsp"><center>Encuentra tu Tipo de Tarifa</center></a></td>
                    <td><center>|</center></td>
                    <td id="registrareq"><a href="regequipos.jsp"><center>Registro de Equipos</center></a></td>
                    <td><center>|</center></td> 
                    
                    <td id="proyectar"><a href="proyeccion.jsp"><center>Proyecciones</center></a></td>
                    <td><center>|</center></td> 
                    <td id="cuenta"><a href="micuenta.jsp"><center>Mi cuenta</center></a></td>
                    <td><center>|</center></td> 
                    <td id="logout"><a href="index.jsp"><center>Cerrar Sesión</center></a></td>
                </tr>
            </table>
            <br>
            <header id="encabezadoregistrond"><center>Registro de Equipos Electrónicos</center></header>
            <br><br><br><br>
<form name="formulario" method="post" action="regequiponodefser">
        <table align=center id="registrodeequiposnd">
            <tr>
                <td colspan="9" height="35px" align=center>Aquí podrá ingresar un nuevo equipo electrónico que no haya encontrado</td>
            </tr>
            <tr>
                <td colspan="9" height="20px"></td>
            </tr>
            <tr>
                <td id="equipo" align=center>Equipo</td>
                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td id="KWpH" align=center>Kilowatt por Hora (Estimado)</td>
                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td id="horasuso" align=center>Tiempo de Uso Diario</td>
                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td id="cantidad" align=center>Cantidad de equipos</td>
                <td align=center>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td id="prioridad" align=center>Prioridad</td>
            </tr>
            
            <tr>
                <td colspan="9" height="20px"></td>
             </tr>
            <tr>
                    <td align=center><input type="text" id="nuevoequipo" name="equi" value="" onKeyPress="return validarn(event)"required onpaste="return false"></td>
                    <td align=center></td>
                    <td align=center><input type="text" id="kilowatthora" value="" nane="kilo" onKeyPress="return validars(event)"required onpaste="return false"></td>
                    <td align=center></td>
                    <td align=center><input type="text" id="horasdeuso" name="hora" value="horas" onclick="if(this.value=='horas') this.value=''" onblur="if(this.value=='') this.value='horas'" onKeyPress="return validars(event)"required onpaste="return false">    <input type="text" id="minutosdeuso" value="minutos" name="min" onclick="if(this.value=='minutos') this.value=''" onblur="if(this.value=='') this.value='minutos'" onKeyPress="return validars(event)"required onpaste="return false"></td>
                    <td align=center></td>
                    <td align=center><input type="text" id="cantidaddequipos" name="can" value="" onKeyPress="return validars(event)"required onpaste="return false"></td>
                    <td align=center></td>
                    <td align=center><select id="selectprioridad" name="prioridad">
                            <option value="vacio"></option>
                            <option value="Alta">Alta</option>
                            <option value="Media">Media</option>
                            <option value="Baja">Baja</option>
                          </select></td>
                </tr>
        </table>

        <br><br><br><br>
        <table align=center width="30%" id="botonciños"> 
            <tr>
                <td align=center><input type="button" id="cancelar" name="cancel" value="Guardar Cambios" onclick="guardar()"></td>
                <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
                <td align=center><input type="button" id="agregarequipos" name="agregar" value="Agregar Equipos" onclick="prueba()"></td>
            </tr>
        </table>
    </form>
    <center><table id="tablita" border="1">
        <tr>
          <th>Equipo</th>
          <th>Kilowatthora</th>
          <th>Horas de uso</th>
          <th>Minutos de uso</th>
        <th>Cantidad de equipos</th>
        <th>Prioridad</th>
        <th>Eliminar eqiupos</th>
        </tr>
      </table> </center>
</body>
</html>
