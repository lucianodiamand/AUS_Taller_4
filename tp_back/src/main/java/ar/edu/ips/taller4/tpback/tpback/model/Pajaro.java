package ar.edu.ips.taller4.tpback.tpback.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Pajaro extends Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

}
