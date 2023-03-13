package com.roberto_rw;

import com.roberto_rw.entidades.*;

import com.roberto_rw.enums.Categoria;
import com.roberto_rw.enums.Rol;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Main {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    private static EntityManager em = entityManagerFactory.createEntityManager();
    public static void main(String[] args) {





//        Cliente cliente = em.find(Cliente.class, 1L);
//        System.out.println("Cliente: " + cliente.getNombre());
//
//        Empleado empleado = em.find(Empleado.class, 1L);
//        System.out.println("Empleado: " + empleado.getNombre());
//
//        Usuario usuario = em.find(Usuario.class, 1L);
//        System.out.println("Usuario: " + usuario.getNombreUsuario() + " ROL: " + usuario.getRol());
//
//        Servicio servicio = em.find(Servicio.class, 1L);
//        System.out.println("Servicio: " + servicio.getDescripcion());


//        Cita cita = new Cita();
//        cita.setCategoria(Categoria.AVANZADO);
//        cita.setEmpleado(empleado);
//        cita.setCliente(cliente);
//        cita.setUsuario(usuario);
//        cita.setServicio(servicio);
//        cita.setFechaInicio(LocalDateTime.now());
//        cita.setFechaFin(LocalDateTime.now());

//        for (Cita cita: cliente.getCitas()){
//            cliente.eliminarCita(cita);
//        }

//        em.remove(cliente);

        em.getTransaction().begin();
        Servicio servicio = em.find(Servicio.class, 1L);
        System.out.println(servicio.getDescripcion());

        em.getTransaction().commit();


    }

    static void agregarCita(Cita cita){
        em.getTransaction().begin();
        em.persist(cita);
        em.getTransaction().commit();
    }

    static void eliminarCita(Long id){
        em.getTransaction().begin();
        Cita cita = em.find(Cita.class, id);
        em.remove(cita);
        em.getTransaction().commit();
    }

    static void actualizarCita(Long id){
        em.getTransaction().begin();
        Cita cita = em.find(Cita.class, id);
        em.persist(cita);
        em.getTransaction().commit();
    }

    static Servicio crearServicio(){
        Servicio servicio = new Servicio();
        servicio.setCategoria(Categoria.AVANZADO);
        servicio.setPrecio(120.0);
        servicio.setDescripcion("Corte de BadBunny");

        return servicio;
    }

    static Empleado crearEmpleado(){
        Empleado empleado = new Empleado();
        empleado.setNombre("Roberto");
        empleado.setApellido("RW");
        empleado.setTelefono("1234");
        empleado.setHoraSalida(LocalDateTime.now());
        empleado.setHoraSalida(LocalDateTime.now());
        empleado.setPuesto("Peluquero");


        return empleado;
    }

    static Usuario crearUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario("VDC");
        usuario.setNombreCompleto("Enrique Vega Del Cid");
        usuario.setRol(Rol.ADMINISTRADOR);
        usuario.setContrasenia("1234");


        return  usuario;
    }

    static Cliente crearCliente(){
        Cliente cliente = new Cliente();
        cliente.setNombre("Roberto");
        cliente.setCorreo("robertorw7@gmail.com");
        cliente.setTelefono("12345");


        return  cliente;
    }
}