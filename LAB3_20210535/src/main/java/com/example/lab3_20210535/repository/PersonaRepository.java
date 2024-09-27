package com.example.lab3_20210535.repository;

import com.example.lab3_20210535.entity.persona;
import com.example.lab3_20210535.entity.viajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<persona, Integer> {
}
