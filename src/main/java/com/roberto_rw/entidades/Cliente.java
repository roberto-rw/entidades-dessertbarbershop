package com.roberto_rw.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table( name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @OneToMany( mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Cita> citas;
    @OneToMany(mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Venta> ventas;

}
