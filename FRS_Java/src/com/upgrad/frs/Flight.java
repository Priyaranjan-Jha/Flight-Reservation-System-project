package com.upgrad.frs;

public class Flight {

    String flightNumber;
    String airLine;
    int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String airLine, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    Flight (Flight flight) {
        this.flightNumber = flight.flightNumber;
        this.airLine = flight.airLine;
        this.capacity = flight.capacity;
        this.bookedSeats = flight.bookedSeats;

    }

    String getFlightDetails() {
        return this.flightNumber + ", " + this.airLine;
    }
    boolean checkAvailability() {
        if(bookedSeats < capacity) {
            return true;
        }
        else{
            return false;
        }
    }
    void incrementBookingCounter() {
        int bookingCounter=0;
        for(bookedSeats=0; bookedSeats<=capacity;bookedSeats++) {
             bookingCounter=bookedSeats;
        }
        System.out.println(bookingCounter);
    }



}
