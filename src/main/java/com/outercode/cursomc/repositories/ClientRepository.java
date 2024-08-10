package com.outercode.cursomc.repositories;

import com.outercode.cursomc.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
