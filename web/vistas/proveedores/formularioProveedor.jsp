<%-- 
    Document   : formularioProveedor
    Created on : Sep 12, 2019, 12:40:23 PM
    Author     : Luis Pavón
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link href="../../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../../js/bootstrap.min.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body>
         <div class="container border border-primary">
            <div class="col-lg-6">
                <h2>Nuevo proveedor</h2>
                <form action="Controlador" method="POST">
                    <div class="form-group">
                        <label>Codigo</label>
                        <input type="number" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                    <div class="form-group">
                        <label>Nombre</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>Institución</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>RUC</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>Observación</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>Información adicional:</label>
                        <input type="text" class="form-control" name="">
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                    
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>

            </div>
        </div>
    </body>
</html>
