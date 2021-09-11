package com.sofkau.SpringBootCrud.Services;

import com.sofkau.SpringBootCrud.Entity.Persona;
import com.sofkau.SpringBootCrud.Repository.InterfaceRepositoryPersona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicesPersona implements InterfaceServicesPersona{

    @Autowired
    private InterfaceRepositoryPersona data;

    @Override
    public List<Persona> List() {
        return (List<Persona>) data.findAll();
    }

    @Override
    public Persona ListById(int id) {
        return null;
    }

    @Override
    public Persona save(Persona persona) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Persona update(Persona persona) {
        return null;
    }
}
