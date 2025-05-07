package com.example.jdbcspringdataejercicioclase.controller;

import com.example.jdbcspringdataejercicioclase.model.Oficina;
import com.example.jdbcspringdataejercicioclase.service.EmpleadoService;
import com.example.jdbcspringdataejercicioclase.service.OficinaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OficinaController {

    private final OficinaService oficinaService;
    private final EmpleadoService empleadoService;

    public OficinaController(OficinaService oficinaService, EmpleadoService empleadoService) {
        this.oficinaService = oficinaService;
        this.empleadoService = empleadoService;
    }

    @GetMapping("/oficinas")
    public String showAllOficinas(Model model) {
        model.addAttribute("titulo", "Lista de Oficinas");
        model.addAttribute("oficinas", oficinaService.findAll());
        return "listOficinas";
    }

    @GetMapping("/oficinas/{id}")
    public String showOficina(Model model, @PathVariable String id) {
        Oficina oficina = oficinaService.findById(id).orElse(new Oficina());
        model.addAttribute("oficina", oficina);
        model.addAttribute("empleados", empleadoService.findByCodigoOficina(oficina.getCodigoOficina()));
        return "editarOficina";
    }
}
