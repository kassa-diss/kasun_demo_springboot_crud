package com.kasun.kasun_demo_crud.repositories;

import com.kasun.kasun_demo_crud.domain.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryDTO,Integer> {


    static void deleteById(Long id) {
    }
}
