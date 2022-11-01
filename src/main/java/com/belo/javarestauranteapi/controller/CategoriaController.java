package com.belo.javarestauranteapi.controller;

import com.belo.javarestauranteapi.domain.CategoriaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping(value = "/categorias", produces="application/json")
    public List<CategoriaDTO> get() {
        return service.getCategorias();
    }
}
