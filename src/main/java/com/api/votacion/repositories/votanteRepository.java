package com.api.votacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.votacion.entities.votante;

public interface votanteRepository extends JpaRepository<votante, Long> {
}
