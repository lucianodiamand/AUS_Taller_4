package ar.edu.ips.taller4.tpback.tpback.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Gato extends Mascota {

	private Boolean piedritas;

}
