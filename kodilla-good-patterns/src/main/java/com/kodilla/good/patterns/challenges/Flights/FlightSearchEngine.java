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

    public FlightWithStop findFlightsBetween(String cityDeparture, String cityArrival, String cityBetween) {
        List<Flight> allFlights = flightRetriever.retrieve();
        allFlights.stream()
            .filter(f -> f.getDepartureAirport().equals(cityDeparture) &&
                    f.getArrivalAirport().equals (cityBetween) ||
                    f.getDepartureAirport().equals (cityBetween)&& f.getArrivalAirport().equals(cityArrival))
                .collect(Collectors.toList());
         //allFlights.stream()
           //     .filter(f -> f.getDepartureAirport().equals(flightBetweenToTo.toString()) &&
             //           f.getArrivalAirport().equals(flightBetweenToTo.toString()))
               // .collect(Collectors.toList());
        return new FlightWithStop( new Flight(), new Flight ());
    }
}



