package com.shahin;

public class Address {
    private String district, street;

    public Address() {
    }

    public Address(String district, String street) {
        this.district = district;
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    @Override
    public String toString() {
        return "Address{" +
                "district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
