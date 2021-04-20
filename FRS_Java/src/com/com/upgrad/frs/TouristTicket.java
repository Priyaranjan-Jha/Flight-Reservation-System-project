package com.upgrad.frs;

public class TouristTicket {
    //make all attributes private
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;
    private String hotelAddress;
    private String[] selectedTouristLocation;
    private Flight flight;
    private Passenger passenger;

    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String hotelAddress,Flight flight, Passenger passenger) {
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
        this.flight=flight;
        this.passenger=passenger;
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
        this.flight= touristTicket.flight;
        this.passenger= touristTicket.passenger;

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

    // getters and setters for private attributes
    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
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

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}








