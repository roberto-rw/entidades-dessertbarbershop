package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table( name = "compras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_compras")
    private Long id;
    @Column
    private LocalDateTime fechaHora;
    @Column
    private Double total;
    @ManyToOne
    @JoinColumn( name = "id_usuario")
    private Usuario usuario;
    @OneToMany(mappedBy = "compra", cascade = CascadeType.ALL)
    private List<DetalleCompra> compras;
}
