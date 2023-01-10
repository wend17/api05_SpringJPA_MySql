package com.demo_api5_persona.service;

import com.demo_api5_persona.Repository.PaisRepository;
import com.demo_api5_persona.Repository.PersonaRepository;
import com.demo_api5_persona.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PaisRepository paisRepository;


    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public Persona save(Persona persona) {
        var optional = paisRepository.findByNombre(persona.getPais().getNombre());
        if (optional.isEmpty()) {
            var newPais = paisRepository.save(persona.getPais());
            persona.setPais(newPais);
        } else {
            persona.setPais(optional.get());
        }

        return personaRepository.save(persona);
    }


    public void deleteById(Integer id) {
        personaRepository.deleteById(id);
    }

    public void delete(Persona entity) {

    }

    public Optional<Persona> findById(Integer id) {
        return personaRepository.findById(id);
    }
}
