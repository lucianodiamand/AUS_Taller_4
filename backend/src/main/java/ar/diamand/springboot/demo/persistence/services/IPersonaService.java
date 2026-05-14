package ar.diamand.springboot.demo.persistence.services;

import java.util.List;
import java.util.Optional;

import ar.diamand.springboot.demo.persistence.model.Persona;

public interface IPersonaService {

  Persona alta(Persona persona);
  List<Persona> sayHello();
  Optional<Persona> findById(Long id);
}
