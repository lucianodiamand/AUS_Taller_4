package ar.diamand.springboot.demo.persistence.model;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Entity
@Data
@Table(name = "personas")
public class Persona {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String nombre;

  @Column(name = "lastName", unique = true, nullable = false)
  private String apellido;

  @Embedded
  private Direccion direccion;

  @Embedded
  @AttributeOverrides({
    @AttributeOverride(
      name = "calle", column = @Column(name = "calle_trabajo")
    ),
    @AttributeOverride(
      name = "altura", column = @Column(name = "altura_trabajo")
    ),
    @AttributeOverride(
      name = "cp", column = @Column(name = "cp_trabajo")
    )
  })
  private Direccion direccionTrabajo;

  @ManyToOne
  private Documento documento;
}
