package com.sofkau.SpringBootCrud.Repository;

import com.sofkau.SpringBootCrud.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceRepositoryPersona extends CrudRepository<Persona, Integer> {

}
