package com.belo.javarestauranteapi.controller;

import com.belo.javarestauranteapi.domain.Categoria;
import com.belo.javarestauranteapi.domain.CategoriaDTO;
import com.belo.javarestauranteapi.repository.CategoriaFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaFoodController {

    @Autowired
    private CategoriaFoodRepository repository;

    @GetMapping
    public List<Categoria> get() {
        List<Categoria> listCategoria = repository.findAll();
        if(listCategoria.isEmpty()){
            return new ArrayList<>();
        }
//        return categoriaDTO.getList(listCategoria);
        return listCategoria;
    }
}
