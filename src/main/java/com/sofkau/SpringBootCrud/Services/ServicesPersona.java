package com.sofkau.SpringBootCrud.Services;

import com.sofkau.SpringBootCrud.Entity.Persona;
import com.sofkau.SpringBootCrud.Repository.InterfaceRepositoryPersona;
import com.sofkau.SpringBootCrud.configuration.exception.BadRequestException;
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
        if(persona.getName() == null || persona.getName().isEmpty() || persona.getAge() == null || persona.getAge().isEmpty()){
            throw new BadRequestException("Por favor ingresa el nombre y la edad de la persona");
        }
        return data.save(persona);
    }

    @Override
    public void delete(int id) {
        data.delete(new Persona(id));
    }

    @Override
    public Persona update(Persona newPersona, int id) {
        return
                data.findById(id)
                        .map(
                                persona ->{
                                    persona.setName(newPersona.getName());
                                    persona.setAge(newPersona.getAge());
                                    return data.save(persona);
                                }
                        ).get();
    }
}
