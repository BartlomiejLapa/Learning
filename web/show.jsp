<%-- 
    Document   : show
    Created on : 2018-10-16, 21:38:18
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wynik haszowania</title>
    </head>
    <body>
        <h1>Wynik haszowania to: <%= request.getAttribute("md5hash") %> </h1>
    </body>
</html>
