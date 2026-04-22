package ar.diamand.springboot.demo.persistence.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.diamand.springboot.demo.persistence.model.Persona;
import ar.diamand.springboot.demo.persistence.repositories.IPersonaRepository;
import jakarta.transaction.Transactional;

@Service
class PersonaService implements IPersonaService {

  @Autowired
  private IPersonaRepository repo;

  @Transactional
  public Persona alta(Persona persona) {
    return repo.save(persona);
  }

  public List<Persona> sayHello() {
    return repo.findAll();
  }

  public Optional<Persona> findById(Long id) {
    return repo.findById(id);
  }
}
