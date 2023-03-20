package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "empleados")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
    private List<Cita> citas;

    @Override
    public String toString() {
        return getNombre();
    }
}
