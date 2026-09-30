package com.tecnm.merida.market_backend.persistence.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name ="id_categoria")
    private Integer idCategoria;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    private String descripcion;

    private Boolean estado;
}
