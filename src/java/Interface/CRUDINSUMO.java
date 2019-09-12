/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Insumo;
import java.util.List;

/**
 *
 * @author Luis Pavón
 */
public interface CRUDINSUMO {
    
    public List listarInsumos();
    public Insumo list(int codigo);
    public boolean agregar(Insumo insu);
    public boolean editar(Insumo insu);
    public boolean eliminar(int codigo);
    
}
