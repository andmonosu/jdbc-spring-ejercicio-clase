package com.example.jdbcspringdataejercicioclase.repository;

import com.example.jdbcspringdataejercicioclase.model.Cliente;
import com.example.jdbcspringdataejercicioclase.model.Empleado;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
    Iterable<Empleado> findByCodigoOficina(String codigoOficina);
}
