/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Proveedor;
import java.util.List;

/**
 *
 * @author Luis Pavón
 */
public interface CRUDPROVEE {
    
     public List listarProveedores();
    public Proveedor list(int codigo);
    public boolean agregar(Proveedor provee);
    public boolean editar(Proveedor provee);
    public boolean eliminar(int codigo);
    
}
