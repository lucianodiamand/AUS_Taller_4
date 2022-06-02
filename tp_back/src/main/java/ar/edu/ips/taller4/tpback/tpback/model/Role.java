package ar.edu.ips.taller4.tpback.tpback.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole name;

}