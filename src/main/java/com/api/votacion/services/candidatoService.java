package com.api.votacion.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.votacion.entities.candidato;
import com.api.votacion.repositories.candidatoRepository;

@Service
public class candidatoService {
    @Autowired
    private candidatoRepository candidatRepository;

    public candidato createCandidato(candidato candidato){
        return candidatRepository.save(candidato);
    }
}
