package com.sofkau.SpringBootCrud.Services;

import com.sofkau.SpringBootCrud.Entity.Persona;

import java.util.List;

public interface InterfaceServicesPersona {

    public List<Persona> List();
    public Persona ListById(int id);
    public Persona save(Persona persona);
    public void delete(int id);
    public Persona update(Persona persona, int id);
}
