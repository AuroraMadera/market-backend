package com.tecnm.merida.market_backend.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "productos")

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id producto")
    private Integer idProducto;

    private String nombre;

    @Column (name = "id categoria ")
    private Integer id_Categoria;

    @Column (name = "codigo_barras")
    private String codigoBarras;

    @Column (name = "precio_venta")
    private Double precioVenta;

    @Column (name = "cantidad_stock")
    private Integer cantidadStock;
    
    private Boolean estado;

}
