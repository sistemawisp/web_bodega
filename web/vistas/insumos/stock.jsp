<%-- 
    Document   : stock
    Created on : Sep 13, 2019, 4:31:36 PM
    Author     : Luis Pavón
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div class="container border border-primary">
            <div class="col-lg-6">
                <h2>Nuevo insumo</h2>
                   <form action="Controlador2">
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
                        <label>Stock</label>
                        <input type="text" class="form-control" name="">
                        <small id="emailHelp" class="form-text text-muted">Codigo definido.</small>
                    </div>
                       
                    <input class="btn btn-primary" type="submit" name="accion" value="stock">
                </form>
            </div>
        </div>
    </body>
</html>
