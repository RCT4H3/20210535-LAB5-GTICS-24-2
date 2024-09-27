package com.example.lab3_20210535.repository;

import com.example.lab3_20210535.entity.mascotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends JpaRepository<mascotas, Integer> {
}
