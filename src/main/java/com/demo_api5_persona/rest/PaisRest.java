package com.demo_api5_persona.rest;

import com.demo_api5_persona.model.Pais;
import com.demo_api5_persona.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisRest {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity <List<Pais>>getAllPaises(){
        return ResponseEntity.ok(paisService.findAll());
    }
}
