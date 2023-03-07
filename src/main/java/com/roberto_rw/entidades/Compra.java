package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "compras")
@Data
@Builder
public class Compra {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_compras")
    private Long id;
    @Column
    private LocalDateTime fechaHora;
    @Column
    private Double total;
    @OneToMany(mappedBy = "compra")
    private List<DetalleCompra> compras;
}
