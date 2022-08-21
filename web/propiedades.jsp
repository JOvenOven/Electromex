
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Registro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" href="CSS/stylein.css">
    <script src="JS/registrov.js"></script>
</head>
<body id="cuerpo">
        <br><br>

        <header id="encabezadoregistro"><center>ElectroMex</center></header>
        <br><br><br><br>

        <form name="formulario" method="post" action="propiedadesser">
                <table id="tablaregistro" align=center>
                    <tr>
                        <td id="nombredepropiedad">Nombre de la propiedad &nbsp&nbsp&nbsp</td>
                        <td><input type="text" id="pro" value="" onKeyPress="return validarn(event)"required onpaste="return false" name="pro"></td>
                    </tr>                         
                     <tr><td colspan="2" height=20px ></td></tr>
                    <tr>
                            <td id="delegacion">Tipo de propiedad</td>
                            <td>
                                <select id="propidadza" name="propidadza">
                                    <option value="vacio"></option>
                                    <option value="1">Domestica</option>
                                    <option value="2">Industrial</option>
                                    <option value="3">Comercial</option>          
                                  </select>
                            </td>
                    </tr>
                    <tr><td colspan="2" height=40px ></td></tr>
                    <tr>
                            <td id="delegacion">Delegación</td>
                            <td>
                                <select id="delegacionza" name="delegacionza">
                                    <option value="vacio"></option>
                                    <option value="1">Álvaro Obregón</option>
                                    <option value="2">Azcapotzalco</option>
                                    <option value="3">Benito Juárez</option>
                                    <option value="4">Coyoacán</option>
                                    <option value="5">Cuajimalpa</option>
                                    <option value="6">Cuauhtémoc</option>
                                    <option value="7">Gustavo A. Madero</option>
                                    <option value="8">Iztacalco</option>
                                    <option value="9">Iztapalapa</option>
                                    <option value="10">Magdalena Contreras</option>
                                    <option value="11">Miguel Hidalgo</option>
                                    <option value="12">Milpa Alta</option>
                                    <option value="13">Tláhuac</option>
                                    <option value="14">Tlalpan</option>
                                    <option value="15">Venustiano Carranza</option>
                                    <option value="16">Xochimilco</option>           
                                  </select>
                            </td>
                    </tr>
                    <tr><td colspan="2" height=20px ></td></tr>
                    <tr>
                            <td id="tt">Tipo de Tarifa</td>
                            <td>
                                <select id="ttarifa" name="ttarifa">
                                    <option value="vacio"></option>
                                    <option value="1">1</option>
                                    <option value="2">1A</option>
                                    <option value="3">1B</option>
                                    <option value="4">1C</option>
                                    <option value="5">1D</option>
                                    <option value="6">1E</option>
                                    <option value="7">1F</option>
                                    <option value="8">DAC</option>
                                                
                                  </select>
                            </td>
                    </tr>
                    
                    <tr>
                            <td></td>
                           <td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" onclick="interes()" name="registrar" value="Añadir propiedad" id="botonentrar"></td>
                    </tr>
                    
                </table>
            </form>
        
</body>
</html>