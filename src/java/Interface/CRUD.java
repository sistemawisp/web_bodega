/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import modelo.Insumo;

/**
 *
 * @author Luis Pavón
 */
public interface CRUD {
     public List listar();

    public boolean agregar(Insumo INSUMO);

    public boolean editar(Insumo INSUMO);

    public boolean eliminar(int id);

}
