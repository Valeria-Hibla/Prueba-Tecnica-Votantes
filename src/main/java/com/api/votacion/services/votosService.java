package com.api.votacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.votacion.entities.candidato;
import com.api.votacion.entities.votante;
import com.api.votacion.entities.votos;
import com.api.votacion.repositories.candidatoRepository;
import com.api.votacion.repositories.votanteRepository;
import com.api.votacion.repositories.votosRepository;

import jakarta.transaction.Transactional;

@Service
public class votosService {
    @Autowired
    private votosRepository votosRepository;

    @Autowired
    private votanteRepository votanteRepository;

    @Autowired
    private candidatoRepository candidatoRepository;

    @Transactional
    public votos createVotos(Long id_votante, Long id_candidato){
        votante votante = votanteRepository.findById(id_votante).orElseThrow(() -> new RuntimeException("Votante no encontrado"));

        if(votante.getHas_voted()){
            throw new RuntimeException("El votante ya ha votado");
        }

        candidato candidato = candidatoRepository.findById(id_candidato).orElseThrow(() -> new RuntimeException("Candidato no encontrado"));

        votos voto = new votos();
        voto.setId_votante(votante);
        voto.setId_candidato(candidato);

        votante.setHas_voted(true);
        votanteRepository.save(votante);
        candidato.setVotos(candidato.getVotos()+1);
        candidatoRepository.save(candidato);
        return votosRepository.save(voto);
    }
}
