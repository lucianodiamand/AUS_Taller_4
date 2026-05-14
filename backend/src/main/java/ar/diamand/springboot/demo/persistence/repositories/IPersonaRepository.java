package ar.diamand.springboot.demo.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.diamand.springboot.demo.persistence.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

  List<Persona> findByNombreLike(String nombre);

  List<Persona> findByNombre(String nombre);
  
  List<Persona> findByNombreAndApellido(String nombre, String apellido);
}
