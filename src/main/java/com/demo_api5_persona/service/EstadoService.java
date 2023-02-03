package com.demo_api5_persona.service;

import com.demo_api5_persona.Repository.EstadoRepository;
import com.demo_api5_persona.model.Estado;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }


    public List<Estado> findAllByCountry(int idPais) {
        List<Estado> estadosRespuestas = new ArrayList<>();
        List<Estado> estados = estadoRepository.findAll();
        for (int i = 0; i < estados.size(); i++) {
            if (estados.get(i).getPais().getId() == idPais) { // el i es 1,2,3,...,busca un estado, busca el pais del estado, luego el id del pais
                estadosRespuestas.add(estados.get(i));
            }
        }
        return estadosRespuestas;
    }
}
