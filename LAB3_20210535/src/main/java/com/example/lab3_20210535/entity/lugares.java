package com.example.lab3_20210535.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="lugares")
public class lugares {
    @Id
    @Column(name="idlugares")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLugares;

    @Column(name="nombre_lugar")
    private String nombreLugar;

    @Column(name="descrip_lugar")
    private String descripLugar;

    @Column(name="fecha_lugar")
    private String fechaLugar;

}
