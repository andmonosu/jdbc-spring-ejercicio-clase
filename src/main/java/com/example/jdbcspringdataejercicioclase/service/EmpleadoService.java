package com.example.jdbcspringdataejercicioclase.service;

import com.example.jdbcspringdataejercicioclase.model.Cliente;
import com.example.jdbcspringdataejercicioclase.model.Empleado;
import com.example.jdbcspringdataejercicioclase.repository.ClienteRepository;
import com.example.jdbcspringdataejercicioclase.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Iterable<Empleado> findAll() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> findById(Integer id) {
        return empleadoRepository.findById(id);
    }

    public Iterable<Empleado> findByCodigoOficina(String codigoOficina) {
        return empleadoRepository.findByCodigoOficina(codigoOficina);
    }
}
