<%-- 
    Document   : formularioInsumo
    Created on : Sep 12, 2019, 11:35:22 AM
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
                <h2>Nuevo insumo</h2>
                <form action="Controlador2" >
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
                        <label>Descripcion</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>Tipo</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>Marca</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                     <div class="form-group">
                        <label>Color</label>
                        <input type="text" class="form-control" name="">
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                    <div class="form-group">
                        <label>Precio</label>
                        <input type="text" class="form-control" name="">
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                    <div class="form-group">
                        <label>Garantia</label>
                        <input type="text" class="form-control" name="">
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                    <div class="form-group">
                        <label>Stock</label>
                        <input type="text" class="form-control" name="">
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                    <div class="form-group">
                        <label>Proveedor</label>
                        <input type="text" class="form-control" name="" >
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                       
                    <input class="btn btn-primary" type="submit" name="hacer" value="guardarinsumo">
                </form>
            </div>
        </div>
    </body>
</html>
