package com.outercode.cursomc.services;


import com.outercode.cursomc.domain.Category;
import com.outercode.cursomc.exceptions.ObjectNotFoundException;
import com.outercode.cursomc.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category search(Integer id){
        Optional<Category> category = repository.findById(id);
        return category.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " Tipo: " + Category.class.getName()));

    }

}
