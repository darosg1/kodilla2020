package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private int flightNumber;

    public Flight(String departureAirport, String arrivalAirport, int flightNumber) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getFlightNumber() == flight.getFlightNumber() &&
                Objects.equals(getDepartureAirport(), flight.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), flight.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport(), getFlightNumber());
    }

    @Override
    public String toString() {
        return "Lot {" +
                "departure airport='" + departureAirport + '\'' +
                ", arrival airport='" + arrivalAirport + '\'' +
                ", nr flight number=" + flightNumber +
                 '}';
    }
}
