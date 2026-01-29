package com.api.votacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.votacion.entities.votos;
import com.api.votacion.services.votosService;

@RestController
@RequestMapping("/votos")
public class votosController {
    
    @Autowired
    private votosService votosService;

    @PostMapping
    public votos createVotos(@RequestParam Long id_votante, @RequestParam Long id_candidato){
        return votosService.createVotos(id_votante, id_candidato);
    }
}
