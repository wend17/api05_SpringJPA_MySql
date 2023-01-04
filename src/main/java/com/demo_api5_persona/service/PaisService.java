package com.demo_api5_persona.service;

import com.demo_api5_persona.Repository.EstadoRepository;
import com.demo_api5_persona.Repository.PaisRepository;
import com.demo_api5_persona.model.Estado;
import com.demo_api5_persona.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll(){
        return paisRepository.findAll();
    }

}
