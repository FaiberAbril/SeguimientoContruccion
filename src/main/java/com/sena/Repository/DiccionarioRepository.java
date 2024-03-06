package com.sena.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.Modelos.Diccionario;

public interface DiccionarioRepository extends JpaRepository<Diccionario, Integer> {
    List<Diccionario> findByPalabraContainingIgnoreCase(String palabra);
}

