package com.kasun.kasun_demo_crud.services.implementation;

import com.kasun.kasun_demo_crud.controllers.Country;
import com.kasun.kasun_demo_crud.domain.CountryDTO;
import com.kasun.kasun_demo_crud.repositories.CountryRepository;
import com.kasun.kasun_demo_crud.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryServices {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<CountryDTO> findAllCountries() {

            List<CountryDTO> allcountrys= countryRepository.findAll();
            return allcountrys;

    }

    @Override
    public String saveCountry(CountryDTO countrydata) {
        countryRepository.save(countrydata);
        return "Data saved";
    }

    @Override
    public String updateCountry(CountryDTO newCountrydata) {
        String msg=null;
        if(newCountrydata.getId()!= null){
            countryRepository.save(newCountrydata);
            msg = "data updated";
        }
        else{
            msg="Error";
        }
        return msg;

    }





}
