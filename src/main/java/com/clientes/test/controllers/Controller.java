package com.clientes.test.controllers;

import com.clientes.test.models.Persona;
import com.clientes.test.services.Directorio;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class Controller {
  @Autowired
  Directorio personaService;

  @GetMapping
  public ArrayList<Persona> obtenerPersona() {
    return personaService.obtenerPersona();
  }

  @PostMapping
  public Persona guardarPersona(@RequestBody Persona persona) {
    return this.personaService.guardarPersona(persona);
  }

  @GetMapping("/{id}")
  public Optional<Persona> obtenerPersonaPorId(
    @PathVariable("id") Long id
  ) {
    return this.personaService.obtenerPorId(id);
  }

  @GetMapping("/query")
  public ArrayList<Persona> obtenerPersonaPorIdentificacion(
    @RequestParam("identificacion") Integer identificacion) {
      return this.personaService.obtenerPersonaPorIdentificacion(identificacion);
  }

  @DeleteMapping(path = "/{id}")
  public String eliminarPorId(@PathVariable("id") Long id){
      boolean ok = this.personaService.eliminarPersona(id);
      if (ok){
          return "Se eliminó a la persona seleccionada";
      }else {
        return "No se pudo eliminar a la persona seleccionada";
      }
  }
}
