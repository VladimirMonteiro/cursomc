package com.outercode.cursomc.repositories;

import com.outercode.cursomc.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
