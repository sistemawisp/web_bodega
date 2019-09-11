
package Controlador;

import Modelo.Persona;
import ModeloDAO.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

    String listar="vistas/persona/listar.jsp";
    String add="vistas/persona/add.jsp";
    String edit="vistas/persona/edit.jsp";
    String inicio="index.jsp";
    Persona p=new Persona();
    PersonaDAO dao=new PersonaDAO();
    int id;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
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


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }else if(action.equalsIgnoreCase("inicio")){
            acceso=inicio;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String nombreusuario=request.getParameter("txtCed");
            String apellidousuario=request.getParameter("txtNom");
            String direccionusuario=request.getParameter("txtDir");
            String emailusuario=request.getParameter("txtEmail");
            String telefonousuario=request.getParameter("txtTelf");
            String nomedadusuario=request.getParameter("txtEdad");
            String fechaingresousuario=request.getParameter("txtFecha");
            String estadousuario=request.getParameter("txtEstado");
            String usuario=request.getParameter("txtUsuario");
            String password=request.getParameter("txtPassword");
            p.setCed(nombreusuario);
            p.setNom(apellidousuario);
            p.setDir(direccionusuario);
            p.setEmail(emailusuario);
            p.setTelf(telefonousuario);
            p.setEdad(nomedadusuario);
            p.setFecha(fechaingresousuario);
            p.setEstado(estadousuario);
            p.setUsuario(usuario);
            p.setPassword(password);
            dao.add(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtid"));
            String ced=request.getParameter("txtDni");
            String nom=request.getParameter("txtNom");
            p.setId(id);
            p.setCed(ced);
            p.setNom(nom);
            dao.edit(p);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

