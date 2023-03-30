package com.ucompensar.Ejercicio1SpringBootDBVentas.interfaces;

import com.ucompensar.Ejercicio1SpringBootDBVentas.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer>{
    
}
