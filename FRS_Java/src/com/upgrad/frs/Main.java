package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
      Flight indiGo =new Flight("A740" , "IndiGo", 500,400);

      Contact contact=new Contact("Ranjan","9090909080","ranjan14@gmail.com");

      Flight copiedFlight=new Flight(indiGo);

      Address address= new Address("Chetla","Kolkata","West Bengal");
      TouristTicket tt=new TouristTicket("B-125","Delhi","Chennai","10/04/20 12:52","10/04/20 15:50","F14",5200,false,"Shanti Hotel");

        System.out.println(indiGo.checkAvailability());
        System.out.println(tt.from);
        System.out.println(contact.getContactDetails());

        }

    }

