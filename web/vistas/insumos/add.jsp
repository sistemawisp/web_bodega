
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Usuario</h1>
                <form action="Controlador2">
                    Nombre:<br>
                    <input class="form-control" type="text" name="txtCed"><br>
                    Apellido: <br>
                    <input class="form-control" type="text" name="txtNom"><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtDir"><br>
                    Email: <br>
                    <input class="form-control" type="text" name="txtEmail"><br>
                    Telefono: <br>
                    <input class="form-control" type="text" name="txtTelf"><br>
                    Edad: <br>
                    <input class="form-control" type="text" name="txtEdad"><br>
                    Fecha: <br>
                    <input class="form-control" type="text" name="txtFecha"><br>
                    Estado: <br>
                    <input class="form-control" type="text" name="txtEstado"><br>
                    Usuario: <br>
                    <input class="form-control" type="text" name="txtUsuario"><br>
                    Password: <br>
                    <input class="form-control" type="text" name="txtPassword"><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                    <a href="Controlador?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
</html>
