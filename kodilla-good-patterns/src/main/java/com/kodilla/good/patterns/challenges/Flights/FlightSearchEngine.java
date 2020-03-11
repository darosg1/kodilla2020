package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {

    private FlightRetriever flightRetriever;

    public FlightSearchEngine(FlightRetriever flightRetriever) {
        this.flightRetriever = flightRetriever;
    }

    public List<String> findFlightsFrom(String cityDeparture) {
        List<Flight> allFlights = flightRetriever.retrieve();
            allFlights.stream()
                    .filter(f->f.getDepartureAirport().equals(cityDeparture))
                    .map(f->f.toString())
                    .collect(Collectors.toList());
            return findFlightsFrom(cityDeparture);
    }

    //public List<String> findFlightsTo(String city) {

    //}
}
