package com.kasun.kasun_demo_crud.controllers;

import com.kasun.kasun_demo_crud.domain.CountryDTO;
import com.kasun.kasun_demo_crud.repositories.CountryRepository;
import com.kasun.kasun_demo_crud.services.CountryServices;
import com.kasun.kasun_demo_crud.services.implementation.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class Country {

    @Autowired
    private CountryServices countryServices;

    @GetMapping("/all")
    public List<CountryDTO> allCountries(){

       return countryServices.findAllCountries();
    }
    @PostMapping("/add")
    public  String addCountry(@RequestBody CountryDTO Countrydata){
        return countryServices.saveCountry(Countrydata);
    }

    @PutMapping("/update")
    public String updateCountry(@RequestBody CountryDTO newCountrydata){
        return countryServices.updateCountry(newCountrydata);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteCountry(@PathVariable int id) {
        countryServices.deleteCountry(id);
    }






}
