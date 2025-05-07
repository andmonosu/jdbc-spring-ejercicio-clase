package com.example.jdbcspringdataejercicioclase.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @Id
    @Column("codigo_empleado")
    private Integer codigoEmpleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String extension;
    private String email;
    @Column("codigo_oficina")
    private String codigoOficina;
    @Column("codigo_jefe")
    private String codigoJefe;
    private String puesto;

    public String getNombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }
}
