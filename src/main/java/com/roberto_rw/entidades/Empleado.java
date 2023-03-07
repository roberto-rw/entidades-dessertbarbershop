package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "empleados")
@Data
@Builder
public class Empleado {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_empleado")
    private Long id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Double salario;
    @Column
    private String puesto;
    @Column
    private String telefono;
    @Column
    private LocalDateTime horaEntrada;
    @Column
    private LocalDateTime horaSalida;
    @OneToMany(mappedBy = "empleado")
    private List<Cita> citas;

}
