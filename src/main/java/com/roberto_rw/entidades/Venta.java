package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "ventas")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @JoinColumn( name = "id_servicio")
    private Servicio servicio;
    @ManyToOne
    @JoinColumn( name = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn( name = "id_cliente")
    private Cliente cliente;

}
