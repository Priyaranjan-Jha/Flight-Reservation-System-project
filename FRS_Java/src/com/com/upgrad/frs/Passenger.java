package com.upgrad.frs;

public class Passenger {

    private static int idCounter;
    private int id;

    // nested Address class inside Passenger class
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    Address address;

    // nested Contact class inside Passenger class
    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    Contact contact;

    // initialise idCounter inside Static Constructor
    static {
        idCounter = 0;
    }

    // instantiate Address and Contact classes inside Passenger constructor
    public Passenger(String addressStreet, String addressCity,
                           String addressState, String contactName, String contactPhone,
                           String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    public int getPassengerCount() { return idCounter; }
    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }



}
