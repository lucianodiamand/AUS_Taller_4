package ar.edu.ips.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Usuario {

	@Id
	private Long id;

	private String nombre;

	private String apellido;

}
