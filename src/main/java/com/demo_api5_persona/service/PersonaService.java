package com.demo_api5_persona.service;

import com.demo_api5_persona.Repository.PersonaRepository;
import com.demo_api5_persona.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public List<Persona> findAll() {
        return personaRepository.findAll();
    }


    public void deleteById(Integer integer) {

    }

    public void delete(Persona entity) {

    }
}
