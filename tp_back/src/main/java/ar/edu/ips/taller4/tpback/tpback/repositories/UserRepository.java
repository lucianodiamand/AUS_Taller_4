package ar.edu.ips.taller4.tpback.tpback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.ips.taller4.tpback.tpback.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
