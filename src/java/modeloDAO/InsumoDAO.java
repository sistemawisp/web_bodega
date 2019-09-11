/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import Interface.CRUD;
import conf.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Insumo;

/**
 *
 * @author Luis Pavón
 */
public class InsumoDAO implements CRUD{
    conexion cn = new conexion();
     Connection con;
     PreparedStatement ps;
     ResultSet rs;
     Insumo INSUMO = new Insumo();

    @Override
    public List listar() {
       ArrayList<Insumo> listaInsumos = new ArrayList<>();
            String consultaSQL = "select * from tblinsumo";
        try {
            
            con = cn.getConnection();
            ps = con.prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Insumo lINSUMO = new Insumo();
                lINSUMO.setNombreinsumo(rs.getString("nombreinsumo"));
                lINSUMO.setColorinsumo(rs.getString("colorinsumo"));
                listaInsumos.add(lINSUMO);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsumoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error en la consulta de la lista de insumos existentes");
        }
        return listaInsumos;
    }

    @Override
    public boolean agregar(Insumo INSUMO) {
        
    }

    @Override
    public boolean editar(Insumo INSUMO) {
        
    }

    @Override
    public boolean eliminar(int id) {
        
    }
     
     
}
