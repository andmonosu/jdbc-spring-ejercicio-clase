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
public class Oficina {
    @Id
    @Column("codigo_oficina")
    private String codigoOficina;
    private String ciudad;
    private String pais;
    private String region;
    @Column("codigo_postal")
    private String codigoPostal;
    private String telefono;
    @Column("linea_direccion1")
    private String lineaDireccion1;
    @Column("linea_direccion2")
    private String lineaDireccion2;
}
