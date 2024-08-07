package com.outercode.cursomc.controllers;


import com.outercode.cursomc.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @GetMapping
    public List<Category> listar(){
        List<Category> lista = new ArrayList<>();
        Category cat1 = new Category(1, "Informática");
        Category cat2 = new Category(2, "Moda");

        lista.add(cat1);
        lista.add(cat2);
        return lista;
    }
}
