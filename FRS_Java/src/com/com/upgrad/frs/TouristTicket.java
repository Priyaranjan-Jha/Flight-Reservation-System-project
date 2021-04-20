package com.upgrad.frs;

public class TouristTicket extends Ticket {
    //make all attributes private

    private String hotelAddress;
    private String[] selectedTouristLocation;

    // Using super() keyword to call constructor from Ticket class

    public TouristTicket(String pnr, String from, String to, Flight flight,String departureDateTime, String arrivalDateTime,Passenger passenger, String seatNo, float price, boolean cancelled,String hotelAddress) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];

    }



    String getHotelAddress() {
        return this.hotelAddress;
    }

    String[] getTouristLocation() {
        return this.selectedTouristLocation;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }


}








