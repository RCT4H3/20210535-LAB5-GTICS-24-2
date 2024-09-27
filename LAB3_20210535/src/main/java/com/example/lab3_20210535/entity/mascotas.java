package com.example.lab3_20210535.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="mascotas")
public class mascotas {
    @Id
    @Column(name="idmascotas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMascotas;

    @Column(name="nombre_mascota")
    private String nombreMascota;

    @Column(name="genero")
    private String genero;

    @Column(name="edad")
    private String edad;

    @Column(name="fecha_nacimiento")
    private String fechaNacimiento;

    @Column(name="vacunado")
    private String vacunado;

    @Column(name="desparasitado")
    private String desparasitado;

    @ManyToOne
    @JoinColumn(name="persona_idpersona")
    private persona persona;
}
