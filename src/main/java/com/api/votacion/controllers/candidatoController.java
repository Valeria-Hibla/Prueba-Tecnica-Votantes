package com.api.votacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.votacion.entities.candidato;
import com.api.votacion.services.candidatoService;

@RestController
@RequestMapping("/candidato")
public class candidatoController {
    
    @Autowired
    private candidatoService candidatoService;

    @PostMapping
    public candidato createCandidato(@RequestBody candidato candidato){
        return candidatoService.createCandidato(candidato);
    }
}
