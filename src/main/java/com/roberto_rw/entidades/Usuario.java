package com.roberto_rw.entidades;

import com.roberto_rw.enums.Rol;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@Builder
public class Usuario {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_usuario")
    private Long id;
    @Column
    private String nombreCompleto;
    @Column
    private String nombreUsuario;
    @Column
    private String contrasenia;
    @Column
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @OneToMany(mappedBy = "usuario")
    private List<Cita> citas;
    @OneToMany
    private List<Compra> compras;
    @OneToMany
    private List<Venta> ventas;
}
