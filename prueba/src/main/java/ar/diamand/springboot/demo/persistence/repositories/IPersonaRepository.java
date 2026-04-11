package ar.diamand.springboot.demo.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.diamand.springboot.demo.persistence.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {}
