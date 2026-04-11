package ar.diamand.springboot.demo.persistence.services;

import java.util.List;

import ar.diamand.springboot.demo.persistence.model.Persona;

public interface IPersonaService {

  Persona alta(Persona persona);
  List<Persona> sayHello();

}
