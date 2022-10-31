package com.belo.javarestauranteapi.controller;

import com.belo.javarestauranteapi.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
