package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "detalle_venta_producto")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinColumn( name = "id_producto")
    private Producto producto;
    @ManyToOne
    @JoinColumn( name = "id_venta")
    private Venta venta;
}
