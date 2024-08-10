package com.outercode.cursomc.repositories;

import com.outercode.cursomc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
