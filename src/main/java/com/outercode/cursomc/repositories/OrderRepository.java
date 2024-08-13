package com.outercode.cursomc.repositories;

import com.outercode.cursomc.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
