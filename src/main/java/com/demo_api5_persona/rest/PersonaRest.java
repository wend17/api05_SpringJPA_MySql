package com.demo_api5_persona.rest;

import com.demo_api5_persona.model.Persona;
import com.demo_api5_persona.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/personas")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<Persona>> getAllPErsonas() {
        return ResponseEntity.ok(personaService.findAll());
    }

    @PostMapping
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona) {
        try {
            Persona personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/personas" + personaGuardada.getId())).body(personaGuardada);
        } catch (Exception e) {
            log.error(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    @DeleteMapping("/delete/{id}")
    private ResponseEntity<Boolean>deletePersona( @PathVariable("id") Integer id){
        personaService.deleteById(id);
        return ResponseEntity.ok(!(personaService.findById(id)!=null));
    }
}
