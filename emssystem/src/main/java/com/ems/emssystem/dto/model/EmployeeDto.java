package com.ems.emssystem.dto.model;

import java.time.Instant;

public class EmployeeDto {


    private String firstname;
    private String lastname;
    private String email_address;
    private Instant creationtime;
    private String home_address;
    private String zipcode;
    private String city;
    private String country;

    public EmployeeDto(){

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public Instant getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(Instant creationtime) {
        this.creationtime = creationtime;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email_address='" + email_address + '\'' +
                ", creationtime=" + creationtime +
                ", home_address='" + home_address + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
