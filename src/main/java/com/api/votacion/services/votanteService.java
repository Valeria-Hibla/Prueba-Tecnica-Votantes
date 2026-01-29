package com.api.votacion.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.votacion.entities.votante;
import com.api.votacion.repositories.votanteRepository;


@Service
public class votanteService {
    @Autowired
    private votanteRepository votanteRepository;

    public List<votante> getAllVotante(){
        return votanteRepository.findAll();
    }

    public Optional<votante> getVotanteById(Long id){
        return votanteRepository.findById(id);
    }

    public votante createVotante(votante votante){
        return votanteRepository.save(votante);
    }

    public boolean deleteVotante(Long id){
        try {
           votanteRepository.deleteById(id); 
           return true;
        } catch (Exception e) {
            return false;
        }
    }
}
