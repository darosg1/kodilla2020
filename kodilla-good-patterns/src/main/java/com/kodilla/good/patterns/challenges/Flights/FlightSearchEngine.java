package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class FlightSearchEngine {
    private FlightRetriever flightRetriever;
    private FlightWithStop flightWithStop1;

    public FlightSearchEngine(FlightRetriever flightRetriever) {
        this.flightRetriever = flightRetriever;
    }

    public List<Flight> findFlightsFrom(String cityDeparture) {
        List<Flight> allFlights = flightRetriever.retrieve ();
        return allFlights.stream ()
                .filter ( f -> f.getDepartureAirport ().equals ( cityDeparture ) )
                .collect ( Collectors.toList () );
    }

    public List<Flight> findFlightsTo(String cityArrival) {
        List<Flight> allFlights = flightRetriever.retrieve ();
        return allFlights.stream ()
                .filter ( f -> f.getArrivalAirport ().equals ( cityArrival ) )
                .collect ( Collectors.toList () );
    }

    public List<FlightWithStop> findFlightsBetween(String cityDeparture , String cityArrival , String cityBetween) {
        List<Flight> allFlights = flightRetriever.retrieve();

        List<FlightWithStop> result = new ArrayList<>();
        for (Flight flightConnection: allFlights) {
                if (flightConnection.getDepartureAirport().equals(cityDeparture)&&
                        flightConnection.getArrivalAirport().equals(cityBetween)) {
                    for (Flight flightConnection1: allFlights) {
                        if (flightConnection1.getDepartureAirport ().equals ( cityBetween ) &&
                                flightConnection1.getArrivalAirport ().equals ( cityArrival )) {
                            result.add(new FlightWithStop (flightConnection, flightConnection1));
                        }
                    }
                }
            }
       return result;
    }
}

