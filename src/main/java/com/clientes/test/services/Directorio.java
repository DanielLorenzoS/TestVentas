package com.clientes.test.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientes.test.models.Persona;
import com.clientes.test.repositories.PersonaRepository;

@Service
public class Directorio {
    
    @Autowired
    PersonaRepository personaRepository;

    public ArrayList<Persona> obtenerPersona(){
        return (ArrayList<Persona>)personaRepository.findAll();
    }
    public Persona guardarPersona(Persona persona){
        return personaRepository.save(persona);
    }
    public Optional<Persona> obtenerPorId(Long id){
        return personaRepository.findById(id);
    }
    public ArrayList<Persona> obtenerPersonaPorIdentificacion(Integer identificacion){
        return personaRepository.findPersonaByIdentificacion(identificacion);
    }
    public boolean eliminarPersona(Long id){
        try {
            personaRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
