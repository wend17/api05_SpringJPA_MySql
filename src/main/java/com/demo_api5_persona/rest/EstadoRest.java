package com.demo_api5_persona.rest;

import com.demo_api5_persona.model.Estado;
import com.demo_api5_persona.model.Pais;
import com.demo_api5_persona.service.EstadoService;
import com.demo_api5_persona.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/estados")
public class EstadoRest {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable("id") int idPais){
        return ResponseEntity.ok(estadoService.findAllByCountry(idPais));
    }


}
