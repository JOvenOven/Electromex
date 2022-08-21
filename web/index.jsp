<%-- 
    Document   : index
    Created on : 8/04/2019, 07:45:37 PM
    Author     : Profesor
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
                <h1>Iniciar Sesión</h1>
            </div>
            <div id="inises">
                <form method="get" action="validarregistro"> 
                    <div class="field-wrap">
                        <label>
                            Nombre de Usuario<span class="req">*</span>
                        </label>
                        <input type="text" name="usuario" required autocomplete="off" minlength="4" maxlength="15">
                    </div>
                    <div class="field-wrap">
                        <label>
                            Contraseña<span class="req">*</span>
                        </label>
                        <input type="password" name="contra" required autocomplete="off" minlength="8" maxlength="20">
                    </div>
                    <div id="buttoninises">
                        <input type="submit" class="button button-block" value="Entrar">
                    </div>
                </form>
            </div>
        </div>
    </body>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
   
</html>

