package com.kasun.kasun_demo_crud.services;

import com.kasun.kasun_demo_crud.domain.CountryDTO;
import com.kasun.kasun_demo_crud.repositories.CountryRepository;

import java.util.List;

public interface CountryServices {



    List<CountryDTO> findAllCountries();

    String saveCountry(CountryDTO countrydata);

    String updateCountry(CountryDTO newCountrydata);


    void deleteCountry(int id);
}
