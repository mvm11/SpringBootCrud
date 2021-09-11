package com.sofkau.SpringBootCrud.Controller;

import com.sofkau.SpringBootCrud.Entity.Persona;
import com.sofkau.SpringBootCrud.Repository.InterfaceRepositoryPersona;
import com.sofkau.SpringBootCrud.Services.InterfaceServicesPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    @Autowired
    private InterfaceServicesPersona service;

    @GetMapping(value = "/l")
    public Iterable<Persona>listarPersonas(){
        return service.List();
    }

    // Crear, Guardar
    @PostMapping("/g")
    ResponseEntity<Persona> newPersona(@RequestBody Persona Persona){
        return new ResponseEntity<>(service.save(Persona), HttpStatus.CREATED);
    }
}
