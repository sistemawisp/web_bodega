/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Insumo;
/**
 *
 * @author Luis Pavón
 */
public class controladorInsumos extends HttpServlet{
    
    String listar = "vista/insumos/ventanaInsumos.jsp";
    String agregar = "vista/insumos/agregarInsumo.jsp";
    String editar = "vista/insumos/editarInsumo.jsp";
    String inicio = "index.jsp";
    
    Insumo INSUMO = new Insumo();
    int codigo;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String acceso = "";
        String accion = req.getParameter("accion");
        if(accion.equalsIgnoreCase("listar")){
            acceso = inicio;
        }else if(accion.equalsIgnoreCase("agregar")){
            acceso = agregar;
        }else if(accion.equalsIgnoreCase("inicio")){
            acceso = inicio;
        }else if(accion.equalsIgnoreCase("Agregar")){
            /*parametros requeridos desde la interfaz*/
            /*definir todos los campos de la base de datos*/
            ///int codigo = req.getParameter("txtCodigo");
            
            String nombre = req.getParameter("txtNombre");
            String color = req.getParameter("txtColor");
            
            INSUMO.setNombreinsumo(nombre);
            INSUMO.setColorinsumo(color);
            
            //dao.add(INSUMO);
            
            acceso = listar;
        }else if(accion.equalsIgnoreCase("editar")){
            
        }
    }

    @Override
    public String getServletInfo() {
        return "INFORMSCION ENVIADA";
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
}
