package com.example.jdbcspringdataejercicioclase.service;

import com.example.jdbcspringdataejercicioclase.model.Empleado;
import com.example.jdbcspringdataejercicioclase.model.Oficina;
import com.example.jdbcspringdataejercicioclase.repository.EmpleadoRepository;
import com.example.jdbcspringdataejercicioclase.repository.OficinaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OficinaService {

    private final OficinaRepository oficinaRepository;

    public OficinaService(OficinaRepository oficinaRepository) {
        this.oficinaRepository = oficinaRepository;
    }

    public Iterable<Oficina> findAll() {
        return oficinaRepository.findAll();
    }

    public Optional<Oficina> findById(String id) {
        return  oficinaRepository.findById(id);
    }
}
