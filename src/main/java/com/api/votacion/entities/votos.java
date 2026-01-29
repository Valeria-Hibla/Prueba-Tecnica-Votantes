package com.api.votacion.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "votos")
public class votos {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_votos;

    @ManyToOne
    @JoinColumn(name = "id_votante", nullable=false)
    private votante id_votante;

    @ManyToOne
    @JoinColumn(name = "id_candidato", nullable=false)
    private candidato id_candidato;
    

    public votos() {
    }

    public Long getId_votos() {
        return id_votos;
    }

    public void setId_votos(Long id_votos) {
        this.id_votos = id_votos;
    }

    public votante getId_votante() {
        return id_votante;
    }

    public void setId_votante(votante id_votante) {
        this.id_votante = id_votante;
    }

    public candidato getId_candidato() {
        return id_candidato;
    }

    public void setId_candidato(candidato id_candidato) {
        this.id_candidato = id_candidato;
    }

    


    
}
