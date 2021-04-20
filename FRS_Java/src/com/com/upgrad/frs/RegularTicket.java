package com.upgrad.frs;

public class RegularTicket extends Ticket {
    // declare attributes private
    private String specialServices;


    // Using super() keyword to call constructor from Ticket class
    public RegularTicket(String pnr, String from, String to, Flight flight,String departureDateTime, String arrivalDateTime,Passenger passenger, String seatNo, float price, boolean cancelled, String specialServices) {
       super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
       this.specialServices=specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }


}
