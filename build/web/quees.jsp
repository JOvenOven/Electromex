<%-- 
    Document   : quees.jsp
    Created on : May 7, 2019, 1:45:00 AM
    Author     : brunoivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
        <link rel="stylesheet" href="CSS/stylein.css">
    </head>
    <body id="iniciar-sesion">
        <div class="form">
            <img src="CSS/logotipo2.png">
            <div class="barranav">
                <ul>
                    <li><a href="index.jsp">Iniciar Sesión</a></li>
                    <li><a href="registro.jsp">Registrarse</a></li>
                    <li><a href="quees.jsp">¿Qué es ElectroMex?</a></li>
                </ul>
            </div>
            <div id="cabeza">
                <h1>¿Qué es ElectroMex?</h1>
            </div>
            <div id="inises">
                <form method="get" action="validarregistro"> 
                    <div class="field-wrap">
                        ElectroMex es una página web que te permite conocer el estimado del precio de la luz eléctrica en un futuro, todo esto, tomando en cuenta los datos previamente ingresados, como el tipo de tarifa con la que cuenta, el uso y frecuencia de los aparatos electrónicos estableciendo cuantos kilowatts-hora usa cada aparato y el tiempo de uso. Una vez hecho esto, el usuario seleccionará la prioridad de cada equipo electrónico (alta, media o baja). También deberá ingresar la zona de la Ciudad de México del usuario que está ingresando al sistema. Todo esto hace más preciso el funcionamiento de ElectroMex.
                    </div>
                </form>
            </div>
        </div>
    </body>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    
    <script  src="index.js"></script>
</html>
