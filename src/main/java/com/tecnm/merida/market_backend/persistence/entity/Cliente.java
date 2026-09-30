package com.tecnm.merida.market_backend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Integer id;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    @Column(name = "correo_electronico")
    private String CorreoElectronico;
}
