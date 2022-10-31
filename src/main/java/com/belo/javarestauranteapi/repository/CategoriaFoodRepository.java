package com.belo.javarestauranteapi.repository;

import com.belo.javarestauranteapi.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaFoodRepository extends JpaRepository<Categoria, Long> {
}
