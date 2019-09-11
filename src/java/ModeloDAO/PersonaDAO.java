
package ModeloDAO;

import Conexion.Conexion;
import Interface.CRUD;
import Modelo.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Persona p=new Persona();
    
    @Override
    public List listar() {
        ArrayList<Persona>list=new ArrayList<>();
        String sql="select * from usuarios";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Persona per=new Persona();
                per.setId(rs.getInt("id"));
                per.setCed(rs.getString("ced"));
                per.setNom(rs.getString("nom"));
                per.setDir(rs.getString("Dir"));
                per.setEmail(rs.getString("Email"));
                per.setTelf(rs.getString("Telf"));
                per.setEdad(rs.getString("Edad"));
                per.setFecha(rs.getString("Fecha"));
                per.setEstado(rs.getString("Estado"));
                per.setUsuario(rs.getString("Usuario"));
                per.setPassword(rs.getString("Password"));
                list.add(per);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Persona list(int id) {
        String sql="select * from usuarios where Id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                p.setId(rs.getInt("id"));
                p.setCed(rs.getString("ced"));
                p.setNom(rs.getString("nom"));
                
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Persona per) {
       String sql="insert into usuarios(nombreusuario, apellidousuario, direccionusuario, emailusuario, telefonousuario, edadusuario, fechaingresousuario, estadousuario, usuario, password )values('"+per.getCed()+"','"+per.getNom()+"','"+per.getDir()+"','"+per.getEmail()+"','"+per.getTelf()+"','"+per.getEdad()+"','"+per.getFecha()+"','"+per.getEstado()+"','"+per.getUsuario()+"','"+per.getPassword()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Persona per) {
        String sql="update usuarios set ced='"+per.getCed()+"',nom='"+per.getNom()+"'where id="+per.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from usuarios where id="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }
    
}
