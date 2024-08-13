package com.outercode.cursomc.repositories;

import com.outercode.cursomc.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
