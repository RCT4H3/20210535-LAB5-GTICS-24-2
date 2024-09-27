package com.example.lab3_20210535.repository;

import com.example.lab3_20210535.entity.lugares;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugaresRepository extends JpaRepository<lugares, Integer> {
}
