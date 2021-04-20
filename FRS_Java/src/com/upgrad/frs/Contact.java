package com.upgrad.frs;

public class Contact {
    String name;
    String phone;
    String email;

    // parameterized constructor
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // copy constructor
    Contact(Contact contact ) {
        this.name = contact.name;
        this.phone = contact.phone;
        this.email = contact.email;

    }

    String getContactDetails() {
        return this.name + "," + this.phone + "," + this.email;
    }

}



