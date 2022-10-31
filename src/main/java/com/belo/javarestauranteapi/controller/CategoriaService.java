package com.belo.javarestauranteapi.controller;

import com.belo.javarestauranteapi.domain.Categoria;
import com.belo.javarestauranteapi.domain.CategoriaDTO;
import com.belo.javarestauranteapi.controller.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public List<CategoriaDTO> getCategorias(){
        List<Categoria> categorias = repository.findAll();
        if (categorias.isEmpty()){
            return new ArrayList<>();
        }
        List<CategoriaDTO> categoriasDto = new ArrayList<>();
        categorias.forEach(cat -> {
            categoriasDto.add(new CategoriaDTO(cat.getName()));
        });
        return categoriasDto;
    }

}
