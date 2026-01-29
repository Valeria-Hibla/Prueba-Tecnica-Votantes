package com.api.votacion.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "candidato")
public class candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidato;
    
    @Column(nullable=false)
    private String nombre;

    @Column
    private String partido;

    @Column
    private int votos=0;

    

    public candidato() {
    }

    public Long getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(Long id_candidato) {
        this.id_candidato = id_candidato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
}
