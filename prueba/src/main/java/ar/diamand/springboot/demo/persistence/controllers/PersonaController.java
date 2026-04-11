package ar.diamand.springboot.demo.persistence.controllers;

import ar.diamand.springboot.demo.persistence.model.Persona;
import ar.diamand.springboot.demo.persistence.services.IPersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private IPersonaService service;

    @GetMapping
    public List<Persona> getPersonas() {
      return service.sayHello();
    }
 
    @PostMapping()
    public Persona alta(@RequestBody() Persona persona) {
      return service.alta(persona);
    }
}
