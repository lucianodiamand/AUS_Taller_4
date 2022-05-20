package ar.edu.ips.taller4.tpback.tpback.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.ips.taller4.tpback.tpback.model.User;
import ar.edu.ips.taller4.tpback.tpback.repositories.UserRepository;
import ar.edu.ips.taller4.tpback.tpback.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User guardarUsuario(User usuario) {
		return repository.save(usuario);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

}
