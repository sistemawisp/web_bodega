<%-- 
    Document   : Login
    Created on : 09-sep-2017, 22:18:48
    Author     : Mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/Login.js"></script>
        <link type="text/css" rel="stylesheet" href="css/css1.css" />
        <title>SISTEMA CONTABLE DE INSUMOS</title>
    </head>
    
    <body>
        <div>
            <form method="post" action="Servlet_Usu" id="frmLogin">
                <table id="tablaLogin">
                    <tr>
                        <th>
                            <h1>Ingrese su Usuario y Clave</h1>
                        </th>
                    </tr>
                    <tr>
                        <td>
                            <input type="text" name="txtUsuario" placeholder="Ingrese usuario" id="txtUsuario" class="textBox">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="password" name="txtClave" placeholder="Ingrese contraseña" id="txtClave" class="textBox">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="button" name="btnIngresar" value="Ingresar" id="btnIngresar" >
                        </td>
                    </tr>
                    <tr>
                        <td class="centrarBoton">
                            <a href="RegistrarUsuario.jsp" id="lnkRegistrarUsuario"><h4>Registrate aqui</h4></a>
                        </td>
                    </tr>
                </table>
                    <input type="hidden" name="accion" value="login">
            </form>
        </div>
    </body>
</html>
