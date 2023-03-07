package com.roberto_rw;

import com.roberto_rw.entidades.*;

import com.roberto_rw.enums.Categoria;
import com.roberto_rw.enums.Rol;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager em = entityManagerFactory.createEntityManager();

//        Empleado e = Empleado.builder().build();
//        LocalDateTime fechaInicio = LocalDateTime.of(2022, 03, 05, 15, 30, 0, 0);
//        LocalDateTime fechaFin = LocalDateTime.of(2022, 03, 05, 15, 30, 0, 0);
//        e.setHoraEntrada(fechaInicio);
//        e.setHoraSalida(fechaFin);
//        e.setNombre("Pablo");
//        e.setPuesto("Recepcionista");
//        e.setSalario(3.5);
//        e.setTelefono("8932498398");
//        e.setApellido("Pacheco");
//
//        Servicio servicio = Servicio.builder().precio(200d)
//                                            .descripcion("Servicio avanzado muy avanzado (Corte de BadBunny)")
//                                            .categoria(Categoria.AVANZADO).build();

//        Usuario user = Usuario.builder().nombreCompleto("Enrique Vega Vega Del Cid")
//                        .nombreUsuario("VDC")
//                                .contrasenia("1234")
//                                        .rol(Rol.ADMINISTRADOR)
//                                        .build();
//
//
//        Cliente client = Cliente.builder().nombre("Artur")
//                        .telefono("2222222")
//                                .correo("artur@gmail.com")
//                                        .build();


        em.getTransaction().begin();
        Servicio s = em.find(Servicio.class, 1L );
        em.getTransaction().commit();

        Cita cita = Cita.builder()
                        .fechaInicio(LocalDateTime.of(2022, 03, 06, 19, 0, 0, 0))
                                .fechaFin(LocalDateTime.of(2022, 03, 06, 20, 0, 0, 0))
                                        .servicio(s)
                                                .build();

        em.getTransaction().begin();
        em.persist(cita);
        em.getTransaction().commit();

    }
}