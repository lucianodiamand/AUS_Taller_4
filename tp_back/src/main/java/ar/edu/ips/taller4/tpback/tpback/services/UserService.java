package ar.edu.ips.taller4.tpback.tpback.services;

import java.util.List;

import ar.edu.ips.taller4.tpback.tpback.model.User;

public interface UserService {

	User guardarUsuario(User usuario);

	List<User> findAll();

	void delete(Long id);

}
