package com.demo_api5_persona.Repository;

import com.demo_api5_persona.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaisRepository extends JpaRepository<Pais,Integer> {
    Optional<Pais> findByNombre(String nombre);
}
