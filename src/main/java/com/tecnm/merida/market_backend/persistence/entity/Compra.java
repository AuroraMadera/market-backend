package com.tecnm.merida.market_backend.persistence.entity;

import com.google.errorprone.annotations.InlineMeValidationDisabled;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "compras")

public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id compra")
    private Integer idCompra;

    @Column (name = "id cliente")
    private Integer idCliente;

    private LocalDateTime fecha;

    @Column (name = "medio pago")
    private String medioPago;

    private String comentario;
    private String estado;
}