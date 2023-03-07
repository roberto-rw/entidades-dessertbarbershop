package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Entity
@Table( name = "productos")
@Data
@Builder
public class Producto {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_producto")
    private Long id;
    @Column
    private String nombre;
    @Column
    private Double precioActual;
    @Column
    private Integer stock;
    @Column
    private String descripcion;

}
