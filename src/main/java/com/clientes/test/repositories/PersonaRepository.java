package com.clientes.test.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clientes.test.models.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
    public abstract ArrayList<Persona> findPersonaByIdentificacion(Integer identificacion);

    public abstract ArrayList<Persona> deletePersonaByIdentificacion(Integer identificacion);
    
}
