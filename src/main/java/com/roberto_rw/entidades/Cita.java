package com.roberto_rw.entidades;

import com.roberto_rw.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "citas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cita {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_cita")
    private Long id;
    @Column
    private LocalDateTime fechaInicio;
    @Column
    private LocalDateTime fechaFin;
    @ManyToOne
    @JoinColumn( name = "id_empleado")
    private Empleado empleado;
    @ManyToOne
    @JoinColumn( name = "id_servicio")
    private Servicio servicio;
    @ManyToOne(optional = true)
    @JoinColumn( name = "id_cliente")
    private Cliente cliente;
    @ManyToOne
    @JoinColumn( name = "id_usuario")
    private Usuario usuario;
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
