package com.api.votacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.votacion.entities.votos;

public interface votosRepository extends JpaRepository<votos, Long>{
    
}
