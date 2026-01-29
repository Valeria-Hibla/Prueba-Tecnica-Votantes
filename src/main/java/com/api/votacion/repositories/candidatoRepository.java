package com.api.votacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.votacion.entities.candidato;

public interface candidatoRepository extends JpaRepository<candidato, Long>{
    
}
