//package com.distribuida.model;
//
//import jakarta.persistence.*;
//import org.hibernate.mapping.List;
//
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "autor")
//public class Autor {
//
//    // Atributos (Variables de instancia)
//    @Id
//    @GeneratedValue
//    @Column(name = "id_autor")
//    private Long idAutor;
//    @Column(name = "nombre")
//    private String nombre;
//    @Column (name = "apellido")
//    private String apellido;
//    @Column (name = "nacionalida")
//    private String nacionalidad;
//    @Column (name = "fechaNacimiento")
//    private LocalDate fechaNacimiento;
//    @Column (name = "librosPublicos")
//    private List librosPublicados; // Simplificado aquí como String, o podría ser una clase 'Libro'
//
//    // Constructor vacío (necesario para muchos frameworks como Spring o Hibernate)
//    public Autor() {
//    }
//
//    // Constructor con parámetros
//    public Autor(Long id, String nombre, String apellido, String nacionalidad, LocalDate fechaNacimiento) {
//        this.idAutor = id;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.nacionalidad = nacionalidad;
//        this.fechaNacimiento = fechaNacimiento;
//    }
//
//    // Métodos Getter y Setter (Ejemplo con algunos atributos)
//    public Long getId() {
//        return idAutor;
//    }
//
//    public void setId(Long id) {
//        this.idAutor = id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//
//    // Método de utilidad para obtener el nombre completo
//    @Override
//    public String toString() {
//        return "Autor{" +
//                "idAutor=" + idAutor +
//                ", nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", direccion='" + nacionalidad + '\'' +
//                ", telefono='" + fechaNacimiento + '\'' +
//                '}';
//    }
//}
