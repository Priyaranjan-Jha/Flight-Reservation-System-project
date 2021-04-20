package com.upgrad.frs;

public class RegularTicket {
    // declare attributes
   String pnr;
   String from;
   String to;
   String departureDateTime;
   String arrivalDateTime;
   String seatNo;
   float price;
   boolean cancelled;
   String specialServices;

    // parameterized constructor
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.specialServices = specialServices;
    }

    // copy constructor
    RegularTicket( RegularTicket regularTicket) {
        this.pnr = regularTicket.pnr;
        this.from = regularTicket.from;
        this.to = regularTicket.to;
        this.departureDateTime = regularTicket.departureDateTime;
        this.arrivalDateTime = regularTicket.arrivalDateTime;
        this.seatNo = regularTicket.seatNo;
        this.price = regularTicket.price;
        this.cancelled = regularTicket.cancelled;
        this.specialServices = regularTicket.specialServices;

    }

    String checkStatus() {
        if (cancelled==true){
            return "Cancelled";
        }
        else{
            return "Confirmed";
        }

    }
    int getFlightDuration() {
        return Integer.parseInt(arrivalDateTime)-Integer.parseInt(departureDateTime);
    }

    String getSpecialServices() {
        return this.specialServices;
    }

}
