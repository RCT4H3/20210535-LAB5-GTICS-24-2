package com.example.lab3_20210535.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="viajes")
public class viajes {
    @Id
    @Column(name="idviajes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViajes;

    @Column(name="punto_recojo")
    private String puntoRecojo;

    @Column(name="cant_personas")
    private String cantPersonas;

    @Column(name="cant_perros")
    private String cantPerros;

    @ManyToOne
    @JoinColumn(name="persona_idpersona")
    private persona persona;

    @ManyToOne
    @JoinColumn(name="lugares_idlugares")
    private lugares lugares;
}
