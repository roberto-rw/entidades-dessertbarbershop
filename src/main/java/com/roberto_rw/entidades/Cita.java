package com.roberto_rw.entidades;

import com.roberto_rw.enums.Categoria;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
@Data
@Builder
public class Cita {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_cita")
    private Long id;
    @Column
    private LocalDateTime fechaInicio;
    @Column
    private LocalDateTime fechaFin;
    @Column
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private Servicio servicio;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Usuario usuario;
}
