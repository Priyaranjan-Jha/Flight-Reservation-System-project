package com.upgrad.frs;

public class TouristTicket {
    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;
    String hotelAddress;
    String[] selectedTouristLocation;

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String hotelAddress) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];
    }

    TouristTicket(TouristTicket touristTicket) {
        this.pnr = touristTicket.pnr;
        this.from = touristTicket.from;
        this.to = touristTicket.to;
        this.departureDateTime = touristTicket.departureDateTime;
        this.arrivalDateTime = touristTicket.arrivalDateTime;
        this.seatNo = touristTicket.seatNo;
        this.price = touristTicket.price;
        this.cancelled = touristTicket.cancelled;
        this.hotelAddress = touristTicket.hotelAddress;
        this.selectedTouristLocation = touristTicket.selectedTouristLocation;

    }

    String checkStatus() {
        if (cancelled == true) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }

    int getFlightDuration() {
        return Integer.parseInt(arrivalDateTime) - Integer.parseInt(departureDateTime);
    }


    String getHotelAddress() {
        return this.hotelAddress;
    }

    String[] getTouristLocation() {
        return this.selectedTouristLocation;
    }


}








