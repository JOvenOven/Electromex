<%-- 
    Document   : modificarcu
    Created on : 2/05/2019, 12:47:30 AM
    Author     : halo_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Modificar Cuenta</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/micuenta.css" />
    <script src="JS/micuentav.js"></script>
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
        
        <header id="encabezadomicuenta"><center>Modificar Cuenta</center></header>
        
        <br><br><br><br>

        <form name="formulario" method="post" action="modificarcuser">
                <table id="tabladatosuser" align=center>
                    <tr>
                        <td id="nombredeusuario">Nombre de Usuario &nbsp&nbsp&nbsp</td>
                        <td><input type="text" id="nombreusuario" name="usu" value="" onKeyPress="return validarn(event)" required onpaste="return false"></td>
                    </tr>
                    <tr><td colspan="2" height=20px ></td></tr>
                    <tr>
                            <td id="password">Contraseña</td>
                            <td><input type="text" id="contraseña" value="" name="contra"></td>
                    </tr>
                    <tr><td colspan="2" height=20px ></td></tr>
                    <tr>
                            <td id="password">Confirmar Contraseña</td>
                            <td><input type="text" id="contraseña" value="" name="confirmarcontra"></td>
                    </tr>
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
                    <tr><td colspan="2" height=20px ></td></tr>
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
                        <td id="fechanac">Fecha de Nacimiento</td>
                        <td><input id="datenac" type="date" name="fechanacimiento" min="1900-01-01" name="fechanacimineto"
                            max="2019-03-31" step="1"></td>
                    </tr>
                    <tr><td colspan="2" height=40px ></td></tr>
                    
                   
                    <tr>
                            <td><input type="button" name="cancel" value="Cancelar" id="botoncancelar" width="80px"></td>
                            <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" name="cambiar" value="Guardar Cambios" id="botonguardar" onclick="interes()"></td>
                            </form>
                    </tr>
                
                </table>
            <br><br>
            <center><a href="micuenta.jsp" >Regresar</a></center>
        
</body>
</html>