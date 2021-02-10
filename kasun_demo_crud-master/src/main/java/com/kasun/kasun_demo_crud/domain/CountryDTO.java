package com.kasun.kasun_demo_crud.domain;

import javax.persistence.*;

@Entity
@Table(name ="country")
public class CountryDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "country_id")
    private  Integer id;

    @Column(name = "country_name")
    private  String country_name;

    @Column(name = "capacity")
    private  Integer capacity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
