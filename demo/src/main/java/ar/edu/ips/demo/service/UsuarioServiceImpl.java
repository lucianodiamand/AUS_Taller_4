package ar.edu.ips.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ips.demo.model.Usuario;
import ar.edu.ips.demo.repositoy.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	@Override
	public List<Usuario> getAll() {
		return repo.findAll();
	}

}
