package ar.diamand.springboot.demo.persistence.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Direccion {

  private String calle;

  private Integer altura;

  private String cp;

}
