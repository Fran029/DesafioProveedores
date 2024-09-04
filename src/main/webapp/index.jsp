<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Proveedores</title>
  <!-- Bootstrap CSS -->
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-light bg-light">
  <a class="btn btn-primary" href="todosProveedores">Ver todos los Proveedores</a>
</nav>
<div class="container mt-2 d-flex justify-content-center">
  <div class="card" style="width:100%;">
    <div class="card-body">
      <h1 class="text-center">Agregar Proveedores</h1>

      <form action="proveedor" method="post" class="mt-4">

        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="nombre">Nombre</label>
            <input type="text" class="form-control" id="nombre" name="nombre">
          </div>
        </div>

        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="rut">RUT:</label>
            <input type="text" class="form-control" id="rut" name="rut">
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="direccion">Direccion:</label>
            <input type="text" class="form-control" id="direccion" name="direccion">
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="correo">Correo:</label>
            <input type="text" class="form-control" id="correo" name="correo">
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="telefono">Telefono:</label>
            <input type="text" class="form-control" id="telefono" name="telefono">
          </div>
        </div>

        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="contacto">Contacto:</label>
            <input type="text" class="form-control" id="contacto" name="contacto">
          </div>
        </div>
        <div class="form-row">
          <div class="form-group col-md-12">
            <label for="telefono_contacto">Telefono Contacto:</label>
            <input type="text" class="form-control" id="telefono_contacto" name="telefono_contacto">
          </div>

          <button type="submit" class="btn btn-success btn-block">Agregar</button>
        </div>

      </form>

    </div>
  </div>

</div>






<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
