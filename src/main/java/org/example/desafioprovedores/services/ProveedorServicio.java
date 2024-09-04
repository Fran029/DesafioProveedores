package org.example.desafioprovedores.services;
import lombok.NoArgsConstructor;
import org.example.desafioprovedores.dao.ProveedorDao;
import org.example.desafioprovedores.models.Proveedor;

import java.util.List;

@NoArgsConstructor
public class ProveedorServicio  implements IProveedorServicio{

     private  ProveedorDao proveedorDao;
     public ProveedorServicio(ProveedorDao proveedorDao) {
         this.proveedorDao = proveedorDao;//inyectada la dependencia
     }

    @Override
    public Proveedor crear(Proveedor proveedor) {
        return proveedorDao.crear(proveedor);
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) {
        return proveedorDao.actualizar(proveedor);//esto no esta desarrolado en el DAO
    }

    @Override
    public Boolean eliminar(Proveedor proveedor) {
        return proveedorDao.eliminar(proveedor);//esto no esta desarrolado en el DAO
    }

    @Override
    public List<Proveedor> listar() {
        return  proveedorDao.listar();
    }

    @Override
    public Proveedor buscar(int id) {
        return proveedorDao.buscar(id);//esto no esta desarrolado en el DAO
    }
}
