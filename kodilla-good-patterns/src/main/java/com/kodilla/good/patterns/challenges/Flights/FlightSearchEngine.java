package com.kodilla.good.patterns.challenges.Flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private FlightRetriever flightRetriever;

    public FlightSearchEngine(FlightRetriever flightRetriever) {
        this.flightRetriever = flightRetriever;
    }

    public List<String> findFlightsFrom(String cityDeparture) {
        List<Flight> allFlights = flightRetriever.retrieve();
        allFlights.stream()
                .filter(f -> f.getDepartureAirport().equals(cityDeparture))
                .map(f -> f.toString())
                .forEach(System.out::println);
        return new ArrayList<>();
    }

    public List<String> findFlightsTo(String cityArrival) {
        List<Flight> allFlights = flightRetriever.retrieve();
        allFlights.stream()
                .filter(f -> f.getArrivalAirport().equals(cityArrival))
                .map(f -> f.toString())
                .forEach(System.out::println);
        return new ArrayList<>();
    }
}

