package com.sofkau.SpringBootCrud.Controller;

import com.sofkau.SpringBootCrud.Entity.Persona;
import com.sofkau.SpringBootCrud.Repository.InterfaceRepositoryPersona;
import com.sofkau.SpringBootCrud.Services.InterfaceServicesPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    @Autowired
    private InterfaceServicesPersona service;

    // Listar
    @GetMapping(value = "/")
    List<Persona> Personas(){
        return service.List();
    }
    // listar por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Persona> listById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.ListById(id));
    }
    // Crear, Guardar
    @PostMapping("/g")
    ResponseEntity<Persona> newPersona(@RequestBody Persona Persona){
        return new ResponseEntity<>(service.save(Persona), HttpStatus.CREATED);
    }
    // Actualizar
    @PutMapping(value = "/{id}")
    ResponseEntity<Persona> replacePersona(@RequestBody Persona persona, @PathVariable int id){
        return new ResponseEntity<>(service.update(persona, id), HttpStatus.OK);
    }
}
