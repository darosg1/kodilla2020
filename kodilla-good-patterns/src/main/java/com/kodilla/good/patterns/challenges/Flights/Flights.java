package com.kodilla.good.patterns.challenges.Flights;

import java.util.Objects;

public class Flights {
    private String departureAirport;
    private String arrivalAirport;
    private int flightNumber;

    public Flights(String departureAirport, String arrivalAirport, int flightNumber) {
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
        if (!(o instanceof Flights)) return false;
        Flights flights = (Flights) o;
        return getFlightNumber() == flights.getFlightNumber() &&
                Objects.equals(getDepartureAirport(), flights.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), flights.getArrivalAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport(), getArrivalAirport(), getFlightNumber());
    }

    @Override
    public String toString() {
        return "Flights{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", flightNumber=" + flightNumber +
                '}';
    }
}
