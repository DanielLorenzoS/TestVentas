package com.clientes.test.models;

import com.sun.istack.NotNull;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.Date;

@Validated
@Entity
@Table(name = "Factura")
public class Factura {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long personaId;
    @NotNull
    private String fecha;
    @NotNull
    private String concepto;
    @NotNull
    private String iva;
    @NotNull
    private double cuotaIva;
    @NotNull
    private double total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public double getCuotaIva() {
        return cuotaIva;
    }

    public void setCuotaIva(double cuotaIva) {
        this.cuotaIva = cuotaIva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
