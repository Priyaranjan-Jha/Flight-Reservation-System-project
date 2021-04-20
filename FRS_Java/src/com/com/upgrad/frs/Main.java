package com.upgrad.frs;

public class Main {

    public static void main(String[] args) {
      Flight flight =new Flight("A740" , "IndiGo", 500,400);
      Passenger passenger=new Passenger("Chetla","kolkata","West Bengal","Priya","1234567890","priya30@gmail.com");
     RegularTicket regularTicket=new RegularTicket("A140","Delhi","Chennai","12/10/20 10:50","12/10/20 12:55","F17",5000,false,"food available",flight,passenger);


      System.out.println(flight.getAirLine());
      System.out.println(flight.getBookedSeats());
      System.out.println(flight.getCapacity());

      System.out.println(regularTicket.getFrom());

        }

    }

