<%-- 
    Document   : micuenta
    Created on : 8/04/2019, 07:18:46 PM
    Author     : Profesor
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="Servlets.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Mi Cuenta</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" media="screen" href="CSS/style.css" />
    <script src="JS/micuentav.js"></script>
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
        
        <header id="encabezadomicuenta"><center>Mi Cuenta</center></header>
        
        <br><br><br><br>

       <%
       Connection con=Conexion.iniciar();
            
            Statement st=con.createStatement();
           
           String user = (String)session.getAttribute("usuario");
            PreparedStatement stmt=con.prepareStatement("SELECT id, usuario, contrasena FROM usuario WHERE usuario='"+user+"'");
            ResultSet rs=stmt.executeQuery("SELECT id, usuario, contrasena FROM usuario WHERE usuario='"+user+"'");
            
            while(rs.next()){
            out.println("<h1>"+ rs.getInt("id_usu") + "  " + rs.getString("nom_usu")+ "  " + rs.getString("con_usu")+" </h1>");
            }                      
           
            
         
           
            con.close();
            st.close();
       %>
            <br> <br>
                    <center><a href="modificarcu.jsp" >MODIFICAR MI CUENTA</a></center>
        </form>
</body>
</html>