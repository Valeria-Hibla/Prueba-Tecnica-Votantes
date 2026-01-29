package com.api.votacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "votante")
public class votante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_votante;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false, unique = true)
    private String email;

    private Boolean has_voted = false;


    public votante() {
    }

    public Long getId_votante() {
        return id_votante;
    }

    public void setId_votante(Long id_votante) {
        this.id_votante = id_votante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getHas_voted() {
        return has_voted;
    }

    public void setHas_voted(Boolean has_voted) {
        this.has_voted = has_voted;
    }

    
}
