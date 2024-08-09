package com.outercode.cursomc.repositories;

import com.outercode.cursomc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
