package com.example.jdbcspringdataejercicioclase.controller;

import com.example.jdbcspringdataejercicioclase.model.Empleado;
import com.example.jdbcspringdataejercicioclase.model.Oficina;
import com.example.jdbcspringdataejercicioclase.service.ClienteService;
import com.example.jdbcspringdataejercicioclase.service.EmpleadoService;
import com.example.jdbcspringdataejercicioclase.service.OficinaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpleadoController {

    private final EmpleadoService empleadoService;
    private final OficinaService oficinaService;

    public EmpleadoController(EmpleadoService empleadoService, OficinaService oficinaService) {
        this.empleadoService = empleadoService;
        this.oficinaService = oficinaService;
    }

    @GetMapping("/empleados")
    public String showAllEmpleados(Model model) {
        model.addAttribute("titulo", "Lista de Empleados");
        model.addAttribute("empleados", empleadoService.findAll());
        return "listEmpleados";
    }

    @GetMapping("/empleados/{id}")
    public String showEmpleadoById(@PathVariable Integer id, Model model) {
        Empleado empleado = empleadoService.findById(id).orElse(new Empleado());
        model.addAttribute("empleado", empleado);
        Iterable<Oficina> oficinas = oficinaService.findAll();
        Oficina oficina = oficinaService.findById(empleado.getCodigoOficina()).orElse(new Oficina());
        model.addAttribute("oficinas", oficinas);
        model.addAttribute("oficinaEmpleado", oficina);
        model.addAttribute("empleados", empleadoService.findByCodigoOficina(empleado.getCodigoOficina()));
        return "/editarEmpleados";
    }
}
