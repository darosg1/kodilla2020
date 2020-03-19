package com.kodilla.good.patterns.challenges.Flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private FlightRetriever flightRetriever;

    public FlightSearchEngine(FlightRetriever flightRetriever) {
        this.flightRetriever = flightRetriever;
    }

    public List<Flight> findFlightsFrom(String cityDeparture) {
        List<Flight> allFlights = flightRetriever.retrieve();
        return allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(cityDeparture))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsTo(String cityArrival) {
        List<Flight> allFlights = flightRetriever.retrieve();
        return allFlights.stream()
                .filter(f -> f.getArrivalAirport().equals(cityArrival))
                .collect(Collectors.toList());
    }

    public FlightWithStop findFlightsBetween(Flight flightFromToBetween, Flight flightBetweenToTo) {
        List<Flight> allFlights = flightRetriever.retrieve();
        allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(flightFromToBetween) &&
                        f.getArrivalAirport().equals(flightFromToBetween))
                .collect(Collectors.toList());
        allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(flightBetweenToTo) &&
                        f.getArrivalAirport().equals(flightBetweenToTo))
                .collect(Collectors.toList());
        return findFlightsBetween ();
    }
}



