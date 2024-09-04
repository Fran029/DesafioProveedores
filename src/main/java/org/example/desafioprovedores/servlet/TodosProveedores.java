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

@WebServlet("/provedores")
public class TodosProveedores extends HttpServlet {
    private ProveedorServicio proveedorServicio;//inyectada la dependencia
    public void init() {
        proveedorServicio=new ProveedorServicio();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Proveedor> proveedores = proveedorServicio.listar();
        request.setAttribute("proveedores", proveedores);
         request.getRequestDispatcher("todosProveedores.jsp").forward(request, response);
    }


}