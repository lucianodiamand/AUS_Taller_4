package ar.edu.ips.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.ips.demo.model.Usuario;
import ar.edu.ips.demo.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioRest {

	@Autowired
	private UsuarioService service;
	
	// Cada endpoint es un metodo
	@GetMapping
	public List<Usuario> getAll() {
		return service.getAll();
	}

	@PostMapping
	public Usuario saveUser(@RequestBody Usuario user) {
		// falta implementar
		return user;
	}
	
}
