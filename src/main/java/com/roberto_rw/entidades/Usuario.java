package com.roberto_rw.entidades;

import com.roberto_rw.enums.Rol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
    @OneToMany(mappedBy = "usuario")
    private List<Compra> compras;
    @OneToMany(mappedBy = "usuario")
    private List<Venta> ventas;
}
