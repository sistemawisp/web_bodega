/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Pavón
 */
public class Proveedor {
    
    int CodigoProveedor;
    String NombreProveedor;
    String InstitucionProveedor;
    String RucProveedor;
    String ObservacionProveedor;
    String DatoAdicionalProveedor;

    public Proveedor() {
    }

    public Proveedor(int CodigoProveedor, String NombreProveedor, String InstitucionProveedor, String RucProveedor, String ObservacionProveedor, String DatoAdicionalProveedor) {
        this.CodigoProveedor = CodigoProveedor;
        this.NombreProveedor = NombreProveedor;
        this.InstitucionProveedor = InstitucionProveedor;
        this.RucProveedor = RucProveedor;
        this.ObservacionProveedor = ObservacionProveedor;
        this.DatoAdicionalProveedor = DatoAdicionalProveedor;
    }
    
    

    public int getCodigoProveedor() {
        return CodigoProveedor;
    }

    public void setCodigoProveedor(int CodigoProveedor) {
        this.CodigoProveedor = CodigoProveedor;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    public String getInstitucionProveedor() {
        return InstitucionProveedor;
    }

    public void setInstitucionProveedor(String InstitucionProveedor) {
        this.InstitucionProveedor = InstitucionProveedor;
    }

    public String getRucProveedor() {
        return RucProveedor;
    }

    public void setRucProveedor(String RucProveedor) {
        this.RucProveedor = RucProveedor;
    }

    public String getObservacionProveedor() {
        return ObservacionProveedor;
    }

    public void setObservacionProveedor(String ObservacionProveedor) {
        this.ObservacionProveedor = ObservacionProveedor;
    }

    public String getDatoAdicionalProveedor() {
        return DatoAdicionalProveedor;
    }

    public void setDatoAdicionalProveedor(String DatoAdicionalProveedor) {
        this.DatoAdicionalProveedor = DatoAdicionalProveedor;
    }
    
    
    
}
