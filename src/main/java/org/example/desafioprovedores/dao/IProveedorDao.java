package org.example.desafioprovedores.dao;

import org.example.desafioprovedores.models.Proveedor;

import java.util.List;

public interface IProveedorDao {
     Proveedor crear(Proveedor proveedor);
     Proveedor actualizar(Proveedor proveedor);
      Boolean  eliminar(Proveedor proveedor);
      List<Proveedor> listar();
      Proveedor buscar(int id);

}
