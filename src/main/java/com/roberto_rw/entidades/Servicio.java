package com.roberto_rw.entidades;

import com.roberto_rw.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "servicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @OneToMany( mappedBy = "servicio", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Cita> citas;
    @OneToMany(mappedBy = "servicio", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Venta> ventas;

}
