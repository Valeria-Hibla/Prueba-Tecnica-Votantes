package com.api.votacion.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.votacion.entities.votante;
import com.api.votacion.services.votanteService;

@RestController
@RequestMapping("/votante")
public class votanteController {
    @Autowired
    private votanteService votanteService;

    @GetMapping
    public List<votante> getAllVotantes(){
        return votanteService.getAllVotante();
    }

    @GetMapping("/{id}")
    public Optional<votante> getVotanteById(@PathVariable Long id){
        return votanteService.getVotanteById(id);
    }

    @PostMapping
    public votante createVotante(@RequestBody votante votante){
        return votanteService.createVotante(votante);
    }

    @DeleteMapping("/{id}")
    public String deleteVotante(@PathVariable Long id){
        boolean ok = votanteService.deleteVotante(id);
        if(ok){
            return "Votante " + id + " eliminado con éxito";
        }else{
            return "El votante "+id+ " no se eliminó correctamente";
        }
    }
}
