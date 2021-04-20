package com.upgrad.frs;

public class Flight {

    private String flightNumber;
    private String airLine;
    private int capacity;
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

    // getters and setters for private attributes
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
