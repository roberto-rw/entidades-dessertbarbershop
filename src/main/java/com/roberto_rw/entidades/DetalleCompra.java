package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "detalle_compra")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinColumn( name = "id_compra")
    private Compra compra;
    @ManyToOne
    @JoinColumn( name = "id_producto")
    private Producto producto;
}
