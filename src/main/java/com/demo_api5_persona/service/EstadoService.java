package com.demo_api5_persona.service;

import com.demo_api5_persona.Repository.EstadoRepository;
import com.demo_api5_persona.model.Estado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado>findAll(){
        return estadoRepository.findAll();
    }

    public List<Estado>findAll(Sort sort){
        return estadoRepository.findAll(sort);
    }
}
