package ar.edu.ips.taller4.tpback.tpback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.ips.taller4.tpback.tpback.model.Mascota;
import ar.edu.ips.taller4.tpback.tpback.model.User;
import ar.edu.ips.taller4.tpback.tpback.repositories.MascotaRepository;
import ar.edu.ips.taller4.tpback.tpback.services.UserService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;
	
	@Autowired
	private MascotaRepository repository;

	@PostMapping("/user")
	public User guardarUsuario(@RequestBody User usuario) {
		return service.guardarUsuario(usuario);
	}

	@PostMapping("/mascota")
	public Mascota guardarMascota(@RequestBody Mascota mascota) {
		return repository.save(mascota);
	}
}
