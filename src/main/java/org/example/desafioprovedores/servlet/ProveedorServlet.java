package org.example.desafioprovedores.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.desafioprovedores.models.Proveedor;
import org.example.desafioprovedores.services.ProveedorServicio;

import java.io.IOException;
import java.util.List;

@WebServlet("/proveedor")
public class ProveedorServlet extends HttpServlet {
  private ProveedorServicio proveedorServicio;//inyectada la dependencia
    public void init() {
        proveedorServicio=new ProveedorServicio();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String rut = request.getParameter("rut");
        String direccion = request.getParameter("direccion");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        String contacto = request.getParameter("contacto");
        String telefonoContacto = request.getParameter("telefono_contacto");

        //Validar campos no nulos o vacios

        if (nombre == null || nombre.isEmpty() ||
                rut == null || rut.isEmpty() ||
                direccion == null || direccion.isEmpty() ||
                correo == null || correo.isEmpty() ||
                telefono == null || telefono.isEmpty() ||
                contacto == null || contacto.isEmpty() ||
                telefonoContacto == null || telefonoContacto.isEmpty()) {
            request.setAttribute("error", "todos los campos son obligatorios.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

        Proveedor proveedor = new Proveedor();
        proveedor.setNombre(nombre);
        proveedor.setRut(rut);
        proveedor.setDireccion(direccion);
        proveedor.setCorreo(correo);
        proveedor.setTelefono(telefono);
        proveedor.setContacto(contacto);
        proveedor.setTelefonoContacto(telefonoContacto);


        proveedorServicio.crear(proveedor);

        //Obtener todos los proveedores actualizados

        List<Proveedor> proveedores = proveedorServicio.listar();
        request.setAttribute("proveedores", proveedores);

        //Redirigir a index.jsp despues de agregar

        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
