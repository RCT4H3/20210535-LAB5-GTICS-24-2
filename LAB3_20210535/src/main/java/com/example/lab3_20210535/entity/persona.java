package com.example.lab3_20210535.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="persona")
public class persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpersona")
    private Integer idPesona;

    @Column(name="nombre")
    private String nombre;

    @Column(name="dni")
    private String dni;

    @Column(name="celular")
    private String celular;

    @Column(name="tipo_persona")
    private String tipoPersona;
}
