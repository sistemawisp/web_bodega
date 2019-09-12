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
public class Insumo {

    int codigoinsumo;
    String nombreinsumo;
    String descripcioninsumo;
    String tipoinsumo;
    String marcainsumo;
    String colorinsumo;
    String unidadinsumo;
    String precioinsumo;
    String garantia;
    String stock;
    int codigoproveedo;

    public Insumo() {

    }

    public Insumo(String nombreinsumo, String descripcioninsumo, String tipoinsumo, String marcainsumo, String colorinsumo, String unidadinsumo, String precioinsumo, String garantia, String stock, int codigoproveedo) {
        this.nombreinsumo = nombreinsumo;
        this.descripcioninsumo = descripcioninsumo;
        this.tipoinsumo = tipoinsumo;
        this.marcainsumo = marcainsumo;
        this.colorinsumo = colorinsumo;
        this.unidadinsumo = unidadinsumo;
        this.precioinsumo = precioinsumo;
        this.garantia = garantia;
        this.stock = stock;
        this.codigoproveedo = codigoproveedo;
    }

    public int getCodigoinsumo() {
        return codigoinsumo;
    }

    public void setCodigoinsumo(int codigoinsumo) {
        this.codigoinsumo = codigoinsumo;
    }

    public String getNombreinsumo() {
  //      System.err.println(""+nombreinsumo);
        return nombreinsumo;
    }

    public void setNombreinsumo(String nombreinsumo) {
        this.nombreinsumo = nombreinsumo;
    }

    public String getDescripcioninsumo() {
        return descripcioninsumo;
    }

    public void setDescripcioninsumo(String descripcioninsumo) {
        this.descripcioninsumo = descripcioninsumo;
    }

    public String getTipoinsumo() {
        return tipoinsumo;
    }

    public void setTipoinsumo(String tipoinsumo) {
        this.tipoinsumo = tipoinsumo;
    }

    public String getMarcainsumo() {
        return marcainsumo;
    }

    public void setMarcainsumo(String marcainsumo) {
        this.marcainsumo = marcainsumo;
    }

    public String getColorinsumo() {
        return colorinsumo;
    }

    public void setColorinsumo(String colorinsumo) {
        this.colorinsumo = colorinsumo;
    }

    public String getUnidadinsumo() {
        return unidadinsumo;
    }

    public void setUnidadinsumo(String unidadinsumo) {
        this.unidadinsumo = unidadinsumo;
    }

    public String getPrecioinsumo() {
        return precioinsumo;
    }

    public void setPrecioinsumo(String precioinsumo) {
        this.precioinsumo = precioinsumo;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public int getCodigoproveedo() {
        return codigoproveedo;
    }

    public void setCodigoproveedo(int codigoproveedo) {
        this.codigoproveedo = codigoproveedo;
    }

}
