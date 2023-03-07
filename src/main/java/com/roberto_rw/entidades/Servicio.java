package com.roberto_rw.entidades;

import com.roberto_rw.enums.Categoria;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "servicios")
@Data
public class Servicio {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_servicio")
    private Long id;
    @Column
    private String descripcion;
    @Column
    private Double precio;
    @Column
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @OneToMany( mappedBy = "servicio")
    private List<Cita> citas;
    @OneToMany(mappedBy = "servicio")
    private List<Venta> ventas;

}
