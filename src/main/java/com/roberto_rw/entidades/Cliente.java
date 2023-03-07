package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table( name = "clientes")
@Data
@Builder
public class Cliente {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_cliente")
    private Long id;
    @Column
    private String nombre;
    @Column
    private String telefono;
    @Column
    private String correo;
    @OneToMany( mappedBy = "cliente")
    private List<Cita> citas;
    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;

}
