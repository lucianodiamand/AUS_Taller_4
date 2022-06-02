package ar.edu.ips.taller4.tpback.tpback.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.ips.taller4.tpback.tpback.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

}
