package com.belo.javarestauranteapi.domain;

import java.util.ArrayList;
import java.util.List;

public class CategoriaDTO {

    private String name;
    public CategoriaDTO(String categoria) {
        this.name = categoria;
    }

    public List<CategoriaDTO> getList(List<Categoria> listCategoria) {
        List<CategoriaDTO> list1 = new ArrayList<>();
        listCategoria.forEach(cat -> {
            CategoriaDTO categoriaDTO = new CategoriaDTO(cat.getName());
            list1.add(categoriaDTO);
        });
        return list1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
