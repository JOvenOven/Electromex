<%-- 
    Document   : delete
    Created on : 6/05/2019, 12:07:51 PM
    Author     : halo_
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       //CONECTANOD A LA BASE DE DATOS:
       Connection con;       
       String url="jdbc:mysql://localhost:3306/electromex";
       String Driver="com.mysql.jdbc.Driver";
       String user="root";
       String clave="n0m3l0";
       Class.forName(Driver);
       con=DriverManager.getConnection(url,user,clave);
       //Emnpezamos Listando los Datos de la Tabla Usuario pero de la fila seleccionada
       PreparedStatement ps;       
       int id=Integer.parseInt(request.getParameter("id"));
       ps=con.prepareStatement("delete from usuario where Id_Usuario="+id);
       ps.executeUpdate();
       response.sendRedirect("index.jsp");
       
       %>
    </body>
</html>
