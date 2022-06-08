package com.clientes.test.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
@Entity
@Table(name = "Factura")
public class Factura {
  @Id
  @NonNull
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NonNull
  private Date fecha;

  @NonNull
  private int monto;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public int getMonto() {
    return monto;
  }

  public void setMonto(int monto) {
    this.monto = monto;
  }
}
