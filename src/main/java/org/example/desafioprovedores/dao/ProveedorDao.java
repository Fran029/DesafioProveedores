package org.example.desafioprovedores.dao;

import org.example.desafioprovedores.conections.MYSQLConexion;
import org.example.desafioprovedores.models.Proveedor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDao implements IProveedorDao {
    private static final String OBTENER_PROVEEDORES = "SELECT id,nombre,rut, direccion,correo,telefono, contacto,telefono_contacto FROM proveedores";
    private static final String CREAR_PROVEEDOR="INSERT INTO proveedores (nombre,rut, direccion,correo,telefono, contacto,telefono_contacto) VALUES (?,?,?,?,?,?,?)";
    private static final String ACTUALIZAR_PROVEEDOR="UPDATE proveedores SET nombre=?,rut=?,direccion=?,correo=?,telefono=?,contacto=? WHERE id=?";
    private static final String BUSCAR_PROVEEDOR="SELECT * FROM proveedores WHERE id=?";
    private static final String ELIMINAR_PROVEEDOR="DELETE FROM proveedores WHERE id=?";
    @Override
    public Proveedor crear(Proveedor proveedor) {
        Proveedor nuevoProveedor = null;
        try {
            Connection connection = MYSQLConexion.getInstance().getConnection();
            PreparedStatement statement = connection.prepareStatement(CREAR_PROVEEDOR);
            statement.setString(1, proveedor.getNombre());
            statement.setString(2, proveedor.getRut());
            statement.setString(3, proveedor.getDireccion());
            statement.setString(4, proveedor.getCorreo());
            statement.setString(5, proveedor.getTelefono());
            statement.setString(6, proveedor.getContacto());
            statement.setString(7, proveedor.getTelefonoContacto());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();//se genera el numero id automaticamente
        if (resultSet.next()) {
            int id = resultSet.getInt(1);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nuevoProveedor;
    }

    @Override
    public Proveedor actualizar(Proveedor proveedor) {

        return null;
    }

    @Override
    public Boolean eliminar(Proveedor proveedor) {
        return null;
    }

    @Override
    public List<Proveedor> listar() {
        List<Proveedor> proveedores = new ArrayList<>();
        try {
            Connection connection = MYSQLConexion.getInstance().getConnection(); // Usar la clase Conexion
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(OBTENER_PROVEEDORES);

            while (resultSet.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setId(resultSet.getInt("id"));
                proveedor.setNombre(resultSet.getString("nombre"));
                proveedor.setRut(resultSet.getString("rut"));
                proveedor.setDireccion(resultSet.getString("direccion"));
                proveedor.setCorreo(resultSet.getString("correo"));
                proveedor.setTelefono(resultSet.getString("telefono"));
                proveedor.setContacto(resultSet.getString("contacto"));
                proveedor.setTelefonoContacto(resultSet.getString("telefono_contacto"));
                proveedores.add(proveedor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return proveedores;
    }



    @Override
    public Proveedor buscar(int id) {
        return null;
    }



}