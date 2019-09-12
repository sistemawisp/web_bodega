/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Interface.CRUDPROVEE;
import Modelo.Insumo;
import Modelo.Proveedor;
import config.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Pavón
 */
public class ProveedorDAO implements CRUDPROVEE {

    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listarProveedores() {

        ArrayList<Proveedor> list = new ArrayList<>();
        String consultaSQL = "SELECT\n"
                + "tblproveedor.CodigoProveedor,\n"
                + "NombreProveedor,\n"
                + "tblproveedor.InstitucionProveedor,\n"
                + "tblproveedor.RucProveedor,\n"
                + "tblproveedor.ObservacionProveedor,\n"
                + "tblproveedor.DatoAdicionalProveedor\n"
                + "FROM\n"
                + "tblproveedor";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor PROVEEDOR = new Proveedor();
                PROVEEDOR.setCodigoProveedor(rs.getInt("tblproveedor.CodigoProveedor"));
                PROVEEDOR.setNombreProveedor(rs.getString("NombreProveedor"));
                PROVEEDOR.setInstitucionProveedor(rs.getString("InstitucionProveedor"));
                PROVEEDOR.setRucProveedor(rs.getString("RucProveedor"));
                PROVEEDOR.setObservacionProveedor(rs.getString("ObservacionProveedor"));
                PROVEEDOR.setDatoAdicionalProveedor(rs.getString("DatoAdicionalProveedor"));
                
              //  System.err.println("NOMBRE PROVEEDOR"+PROVEEDOR.getNombreProveedor());
                
                list.add(PROVEEDOR);
            }
        } catch (Exception e) {
            System.err.println(""+e);
        }
        return list;
    }

    @Override
    public Proveedor list(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Proveedor provee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editar(Proveedor provee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
