package com.example.jdbcspringdataejercicioclase.service;

import com.example.jdbcspringdataejercicioclase.model.Cliente;
import com.example.jdbcspringdataejercicioclase.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteByCodigoCliente(Integer codigoCliente) {
        return clienteRepository.findById(codigoCliente);
    }
}
