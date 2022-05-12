package ar.edu.ips.taller4.tpback.tpback.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class Direccion {

	private String calle;
	
	private Integer altura;
	
	private Integer piso;
	
	private String departamento;

}
