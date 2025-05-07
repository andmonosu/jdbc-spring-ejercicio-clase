package com.example.jdbcspringdataejercicioclase.repository;

import com.example.jdbcspringdataejercicioclase.model.Empleado;
import com.example.jdbcspringdataejercicioclase.model.Oficina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepository extends CrudRepository<Oficina, String> {
}
