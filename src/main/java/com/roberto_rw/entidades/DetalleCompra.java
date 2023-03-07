package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table( name = "detalle_compra")
@Data
@Builder
public class DetalleCompra {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_detalle_compra")
    private Long id;
    @Column
    private Integer cantidadProducto;
    @Column
    private Double precioUnitarioProducto;
    @Column
    private Double subtotal;
    @ManyToOne
    private Compra compra;
    @ManyToOne
    private Producto producto;
}
