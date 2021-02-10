package com.kasun.kasun_demo_crud.services;

import com.kasun.kasun_demo_crud.domain.CountryDTO;

import java.util.List;

public interface CountryServices {

    List<CountryDTO> findAllCountries();

    String saveCountry(CountryDTO countrydata);

    String updateCountry(CountryDTO newCountrydata);


}
