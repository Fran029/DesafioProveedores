<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="org.example.desafioprovedores.models.Proveedor" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Proveedores</title>
    <!-- Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <a href="index.jsp" class="btn btn-primary mb-3">Ver todos los proveedores</a>
    <h2 class="mb-4">Lista de Proveedores</h2>

    <table class="table table-bordered table-striped">
        <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>RUT</th>
            <th>Dirección</th>
            <th>Correo</th>
            <th>Teléfono</th>
            <th>Contacto</th>
            <th>Teléfono Contacto</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="proveedor" items="${proveedores}">
        <tr>
            <td>${proveedor.id}</td>
            <td>${proveedor.nombre}</td>
            <td>${proveedor.rut}</td>
            <td>${proveedor.direccion}</td>
            <td>${proveedor.correo}</td>
            <td>${proveedor.telefono}</td>
            <td>${proveedor.contacto}</td>
            <td>${proveedor.telefonoContacto}</td>

        </tr>
        </c:forEach>


        </tbody>
    </table>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>