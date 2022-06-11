package com.clientes.test.controllers;

import com.clientes.test.models.Factura;
import com.clientes.test.services.Ventas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/factura")
public class FacturaController {

    @Autowired
    Ventas facturaService;

    @GetMapping
    public ArrayList<Factura> findFacturas(){
        return facturaService.findFacturas();
    }

    @PostMapping
    public Factura guardarFactura(@RequestBody Factura factura){
        return this.facturaService.guardarFactura(factura);
    }
}
