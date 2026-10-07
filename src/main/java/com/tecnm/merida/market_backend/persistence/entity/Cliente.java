package com.tecnm.merida.market_backend.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Integer id;
    private String nombre;
    private String apellidos;
    private String celular;
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }
}
