package ar.diamand.springboot.demo.persistence.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Documento {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String tipo;

  private String numero;

}
