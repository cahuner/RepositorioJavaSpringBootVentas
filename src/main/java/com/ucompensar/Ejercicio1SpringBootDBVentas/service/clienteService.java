package com.ucompensar.Ejercicio1SpringBootDBVentas.service;

import com.ucompensar.Ejercicio1SpringBootDBVentas.interfaceService.IClienteService;
import com.ucompensar.Ejercicio1SpringBootDBVentas.modelo.Cliente;
import com.ucompensar.Ejercicio1SpringBootDBVentas.interfaces.ICliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class clienteService implements IClienteService{

    @Autowired
    private ICliente data;
    
    @Override
    public List<Cliente> listar() {
        return (List<Cliente>) data.findAll();
    }

    @Override
    public Optional<Cliente> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(Cliente c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
