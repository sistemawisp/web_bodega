/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Conexion.Conexion;
import Interface.CRUD;
import Interface.CRUDINSUMO;
import Modelo.Insumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Pavón
 */
public class InsumoDAO implements CRUDINSUMO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Insumo INSU = new Insumo();

    @Override
    public List listarInsumos() {
        ArrayList<Insumo> list = new ArrayList<>();
        String consultaSQL = "select nombreinsumo,colorinsumo from tblinsumo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Insumo INSUMO = new Insumo();
                // INSUMO.setCodigoinsumo(rs.getInt("codigoinsumo"));
                INSUMO.setNombreinsumo(rs.getString("nombreinsumo"));
                INSUMO.setColorinsumo(rs.getString("colorinsumo"));

//                System.err.println("ueueyeueue");
//                System.err.println("ueueyeueue"+INSUMO.getNombreinsumo());
//                System.err.println("ueueyeueue"+rs.getString("nombreinsumo"));
                list.add(INSUMO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("" + ex);
        }
        return list;
    }

    @Override
    public Insumo list(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Insumo insu) {
        String cadenaSQL = "INSERT INTO(\n"
                + "tblinsumo.nombreinsumo,\n"
                + "tblinsumo.descripcioninsumo,\n"
                + "tblinsumo.tipoinsumo,\n"
                + "tblinsumo.marcainsumo,\n"
                + "tblinsumo.colorinsumo,\n"
                + "tblinsumo.unidadinsumo,\n"
                + "tblinsumo.precioinsumo,\n"
                + "tblinsumo.garantia,\n"
                + "tblinsumo.stock,\n"
                + "tblinsumo.codigoproveedor)\n"
                + "VALUES\n"
                + "('"+insu.getNombreinsumo()+"',"
                + "('"+insu.getDescripcioninsumo()+"',"
                + "('"+insu.getTipoinsumo()+"',"
                + "('"+insu.getMarcainsumo()+"',"
                + "('"+insu.getColorinsumo()+"',"
                + "('"+insu.getUnidadinsumo()+"',"
                + "('"+insu.getPrecioinsumo()+"',"
                + "('"+insu.getGarantia()+"',"
                + "('"+insu.getStock()+"',"
                + "('"+insu.getCodigoproveedo()+"'"
                + ")";
                try {
            con = cn.getConnection();
            ps = con.prepareStatement(cadenaSQL);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(""+e);
        }
                return  false;
    }

    @Override
    public boolean editar(Insumo insu) {
        String cadenaSQL="";
        return false;
    }

    @Override
    public boolean eliminar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
