package com.example.videojuegos.models;

import javax.persistence.*;

@Entity
@Table(name="videojuegos")
public class Video{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )
    private Long id;
    private String nombre;
    private String descripcion;
    private String genero;
    private String year;
    private Long peso;
    public String getNombre() {
        return nombre;
    }
    public Long getPeso() {
        return peso;
    }
    public void setPeso(Long peso) {
        this.peso = peso;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
