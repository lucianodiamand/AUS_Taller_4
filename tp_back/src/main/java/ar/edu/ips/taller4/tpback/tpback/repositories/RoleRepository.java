package ar.edu.ips.taller4.tpback.tpback.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.edu.ips.taller4.tpback.tpback.model.ERole;
import ar.edu.ips.taller4.tpback.tpback.model.Role;;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByName(ERole name);

}