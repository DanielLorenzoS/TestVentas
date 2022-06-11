package com.clientes.test.repositories;

import com.clientes.test.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {

}
