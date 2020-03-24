package com.kodilla.good.patterns.challenges.Flights;


public class FlightWithStop {

    private Flight flightFromToBetween;
    private Flight flightBetweenToTo;

    public FlightWithStop(Flight flightFromToBetween, Flight flightBetweenToTo) {
        this.flightFromToBetween = flightFromToBetween;
        this.flightBetweenToTo = flightBetweenToTo;
    }

    public Flight getFlightFromToBetween() {
        return flightFromToBetween;
    }

    public Flight getFlightBetweenToTo() {
        return flightBetweenToTo;
    }

    public static FlightWithStop findFlightWithStop(Flight flightFromToBetween, Flight flightBetweenToTo) {
        return new FlightWithStop (new Flight(flightFromToBetween.getDepartureAirport(),
                flightFromToBetween.getArrivalAirport(), flightFromToBetween.getFlightNumber()),
                new Flight (flightBetweenToTo.getDepartureAirport(), flightBetweenToTo.getArrivalAirport(),
                        flightBetweenToTo.getFlightNumber()));
    }

    @Override
    public String toString() {
        return "FlightWithStop{" +
                "flightFromToBetween=" + flightFromToBetween +
                ", flightBetweenToTo=" + flightBetweenToTo +
                '}';
    }
}
