package com.ucompensar.Ejercicio1SpringBootDBVentas.interfaceService;

import java.util.List;
import com.ucompensar.Ejercicio1SpringBootDBVentas.modelo.Cliente;
import java.util.Optional;


public interface IClienteService {
    public List<Cliente>listar();
    public Optional<Cliente>listarId(int id);
    public int save(Cliente c);
    public void delete(int id);
}
