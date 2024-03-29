package com.company;

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;


    //getters and setters


    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }
    public void setAirline(String airline) {
        this.airline = airline;
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

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    public String flightDetails(){
        return String.format("This flight no is %s of airline %s with " +
                "capacity %d and booked seats %d",flightNumber,airline,capacity,bookedSeats);
    }
    public boolean checkAvailability(){
        if (this.bookedSeats<this.capacity) return true;
        else return false;
    }




}
