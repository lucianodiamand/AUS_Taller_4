package ar.edu.ips.taller4.tpback.tpback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.ips.taller4.tpback.tpback.model.Mascota;
import ar.edu.ips.taller4.tpback.tpback.model.User;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
