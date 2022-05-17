package ar.edu.ips.taller4.tpback.tpback;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ar.edu.ips.taller4.tpback.tpback.model.Gato;
import ar.edu.ips.taller4.tpback.tpback.model.Mascota;
import ar.edu.ips.taller4.tpback.tpback.model.Pajaro;
import ar.edu.ips.taller4.tpback.tpback.repositories.MascotaRepository;

@SpringBootApplication
public class TpbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpbackApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadMascotas(MascotaRepository repository) {
		return (args) -> {
			Mascota gato = new Gato();
			//gato.setPiedritas(true);
			gato.setNombre("Michifus");
			gato.setVacunas(true);
			gato.setAlimento("Mucho");
			repository.save(gato);

			Pajaro pajaro = new Pajaro();
			pajaro.setJaula(false);
			pajaro.setNombre("Piolin");
			pajaro.setVacunas(false);
			pajaro.setAlimento("Mijo");
			repository.save(pajaro);
		};
	}

}
