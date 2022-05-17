package ar.edu.ips.taller4.tpback.tpback.model;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class Animal {

	private Integer cantidadPatas;

	private Boolean vuela;
	
}
