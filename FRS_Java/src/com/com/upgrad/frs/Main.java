package com.upgrad.frs;

public class Main {

  public static void main(String[] args) {
       printTicketDetails();
    }

  public static void printTicketDetails(Ticket ticket){
    Flight flight = new Flight("A740", "IndiGo", 500, 400);

    Passenger passenger = new Passenger("Chetla", "kolkata", "West Bengal", "Priya", "1234567890", "priya30@gmail.com");

    RegularTicket rt = new RegularTicket("A123", "kolkata", "Chennai", flight, "12/03/21 08:20", "12/03/21 11:20", passenger, "A09", 5000, false, "Food and spa included");
    TouristTicket tt = new TouristTicket("B420", "kolkata", "Chennai", flight, "12/03/21 08:20", "12/03/21 11:20", passenger, "C13", 4500, false, "Manila Villa");
    System.out.println(rt.getPnr());
    System.out.println(tt.getPnr());

  }

  }







