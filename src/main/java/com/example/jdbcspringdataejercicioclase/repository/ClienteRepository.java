package com.example.jdbcspringdataejercicioclase.repository;

import com.example.jdbcspringdataejercicioclase.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
