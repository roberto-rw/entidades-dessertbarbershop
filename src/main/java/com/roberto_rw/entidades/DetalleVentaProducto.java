package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table( name = "detalle_venta_producto")
@Data
@Builder
public class DetalleVentaProducto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_detalle_venta_producto")
    private Long id;
    @Column
    private Integer cantidadProducto;
    @Column
    private Integer precioUnitarioProducto;
    @ManyToOne
    private Producto producto;
    @ManyToOne
    private Venta venta;
}
