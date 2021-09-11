package com.sofkau.SpringBootCrud.Controller;

import com.sofkau.SpringBootCrud.Entity.Persona;
import com.sofkau.SpringBootCrud.Repository.InterfaceRepositoryPersona;
import com.sofkau.SpringBootCrud.Services.InterfaceServicesPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaRestController {

    @Autowired
    private InterfaceServicesPersona service;

    @GetMapping(value = "l")
    public Iterable<Persona>listarPersonas(){
        return service.List();
    }
}
