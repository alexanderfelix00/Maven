<%-- 
    Document   : index
    Created on : 11/08/2019, 12:14:14 PM
    Author     : Angel Gabriel TG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SYSCOLE - Inicia Sesión</title>
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-image:url(assets/img/frmLogin.jpg);">
        <div class="login-box">
            <img src="assets/img/avatar.png" class="avatar"/>
            <h1>INICIAR SESION</h1>
            <form action="ServletUsuario">
                <p>Usuario</p>
                <input type="text" name="username" placeholder="Ingresar Usuario" required="">
                <p>Contraseña</p>
                <input type="password" name="password" placeholder="Ingresar Contraseña" required="">
                <input type="submit" name="accion" value="Ingresar">
                <a href="#">Olvidaste tu Contraseña</a>    
            </form>
        </div>
    </body>
</html>
