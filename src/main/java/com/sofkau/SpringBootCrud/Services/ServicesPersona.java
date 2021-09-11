package com.sofkau.SpringBootCrud.Services;

import com.sofkau.SpringBootCrud.Entity.Persona;
import com.sofkau.SpringBootCrud.Repository.InterfaceRepositoryPersona;
import com.sofkau.SpringBootCrud.configuration.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicesPersona implements InterfaceServicesPersona{

    @Autowired
    private InterfaceRepositoryPersona data;

    @Override
    public List<Persona> List() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona ListById(int id) {
        Optional<Persona> persona = data.findById(id);
        if(persona.isEmpty()){
            throw new NotFoundException("La persona no existe");
        }
        return persona.get();
    }

    @Override
    public Persona save(Persona persona) {
        return data.save(persona);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Persona update(Persona persona) {
        return null;
    }
}
