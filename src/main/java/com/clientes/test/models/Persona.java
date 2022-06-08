package com.clientes.test.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
@Entity
@Table(name = "Persona")
public class Persona {
  @Id
  @NonNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private String nombre;

  @NonNull
  private String apellidoPaterno;

  private String apellidoMaterno;

  @NonNull
  private int identificacion;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String materno) {
    apellidoMaterno = materno;
  }

  public int getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(int identificacion) {
    this.identificacion = identificacion;
  }
}
