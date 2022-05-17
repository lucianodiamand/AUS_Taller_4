package ar.edu.ips.taller4.tpback.tpback.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nombre;

	private String apellido;

	private Direccion casa;

	@ManyToOne
	private Vehiculo vehiculo;

//	@OneToMany(mappedBy = "persona")
//	// @JoinColumn(name = "persona_id")
//	private Set<Mascota> mascotas;

}
