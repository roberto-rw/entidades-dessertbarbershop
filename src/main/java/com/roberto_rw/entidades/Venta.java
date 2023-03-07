package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "ventas")
@Data
@Builder
public class Venta {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_venta")
    private Long id;
    @Column
    private LocalDateTime fechaHoraVenta;
    @Column
    private Double total;
    @Column
    private Double descuento;
    @Column
    private Double subtotal;
    @ManyToOne
    private Servicio servicio;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Cliente cliente;

}
