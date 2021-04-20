package com.upgrad.frs;

public class Address {
    String street;
    String city;
    String state;

    public Address(String street, String city, String state) {
        this.street= street;
        this.city = city;
        this.state = state;
    }

    Address(Address address) {
        this.street = address.street;
        this.city = address.city;
        this.state = address.state;
    }

    String getAddressDetails() {
        return street + "," + city + "," + state;
    }
}
