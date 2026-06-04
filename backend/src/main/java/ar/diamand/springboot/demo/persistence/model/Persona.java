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

  @Column(name = "lastName", nullable = false)
  private String apellido;

}
