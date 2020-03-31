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

    @Override
    public String toString() {
        return "Odlot "+ flightFromToBetween +
                " przesiadka " + flightBetweenToTo;
    }
}
