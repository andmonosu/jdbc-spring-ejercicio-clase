package com.example.jdbcspringdataejercicioclase.controller;

import com.example.jdbcspringdataejercicioclase.model.Cliente;
import com.example.jdbcspringdataejercicioclase.model.Empleado;
import com.example.jdbcspringdataejercicioclase.repository.ClienteRepository;
import com.example.jdbcspringdataejercicioclase.service.ClienteService;
import com.example.jdbcspringdataejercicioclase.service.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ClienteController {

    private final ClienteService clienteService;
    private final EmpleadoService empleadoService;

    public ClienteController(ClienteService clienteService, EmpleadoService empleadoService) {
        this.clienteService = clienteService;
        this.empleadoService = empleadoService;
    }

    @GetMapping("/clientes")
    public String showAllClientes(Model model) {
        model.addAttribute("titulo", "Lista de Clientes");
        model.addAttribute("clientes", clienteService.findAll());
        return "listClientes";
    }

    @GetMapping("/clientes/{id}")
    public String editCliente(@PathVariable Integer id, Model model) {
        Cliente cliente = clienteService.getClienteByCodigoCliente(id).orElse(new Cliente());
        model.addAttribute("titulo", "Editar Cliente " + id);
        model.addAttribute("cliente", cliente);
        Empleado empleado = empleadoService.findById(cliente.getCodigoEmpleadoRepVentas()).orElse(new Empleado());
        model.addAttribute("nombre_empleado", empleado.getNombreCompleto());
        model.addAttribute("empleados", empleadoService.findAll());
        return "editarCliente";
    }
}
