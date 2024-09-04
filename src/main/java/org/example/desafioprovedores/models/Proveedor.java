package org.example.desafioprovedores.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Proveedor {
    private int id;
    private String nombre;
    private String rut;
    private String direccion;
    private String correo;
    private String telefono;
    private String contacto;
    private String telefonoContacto;


}
