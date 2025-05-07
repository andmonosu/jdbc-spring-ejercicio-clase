package com.example.jdbcspringdataejercicioclase.controller;

import com.example.jdbcspringdataejercicioclase.service.EmpleadoService;
import com.example.jdbcspringdataejercicioclase.service.OficinaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OficinaController {

    private final OficinaService oficinaService;

    public OficinaController(OficinaService oficinaService) {
        this.oficinaService = oficinaService;
    }

    @GetMapping("/oficinas")
    public String showAllOficinas(Model model) {
        model.addAttribute("titulo", "Lista de Oficinas");
        model.addAttribute("oficinas", oficinaService.findAll());
        return "listOficinas";
    }

    @GetMapping("/oficinas/{id}")
    public String showOficina(Model model, @PathVariable String id) {
        model.addAttribute("oficina", oficinaService.findById(id));
        return "editarOficina";
    }
}
