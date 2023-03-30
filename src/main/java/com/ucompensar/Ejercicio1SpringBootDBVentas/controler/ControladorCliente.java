package com.ucompensar.Ejercicio1SpringBootDBVentas.controler;

import com.ucompensar.Ejercicio1SpringBootDBVentas.interfaceService.IClienteService;
import com.ucompensar.Ejercicio1SpringBootDBVentas.modelo.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControladorCliente {
    
    @Autowired
    private IClienteService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Cliente>clientes=service.listar();
        model.addAttribute("clientes",clientes);
        return "index";
    }
}
