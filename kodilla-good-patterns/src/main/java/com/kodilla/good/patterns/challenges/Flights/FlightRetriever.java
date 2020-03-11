package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRetriever {

    public List<Flight> retrieve() {
        Flight flight1 = new Flight("Warsaw EPWA", "Wroclaw EPWR", 2323);
        Flight flight2 = new Flight("Warsaw EPWA", "Krakow EPKR", 1101);
        Flight flight3 = new Flight("Warsaw EPWA", "Gdansk EPGD", 9090);
        Flight flight4 = new Flight("Gdansk EPGD", "Krakow EPKR", 9101);
        Flight flight5 = new Flight("Krakow EPKR", "Gdansk EPGD", 9102);
        Flight flight6 = new Flight("Krakow EPKR", "Wroclaw EPWR", 9905);
        Flight flight7 = new Flight("Gdansk EPGD", "Wroclaw EPWR", 7867);
        Flight flight8 = new Flight("Warsaw EPWA", "Wroclaw EPWR", 2324);
        Flight flight9 = new Flight("Warsaw EPWA", "Poznan EPPO", 4545);
        Flight flight10 = new Flight("Poznan EPPO", "Wroclaw EPWR", 6760);

        List<Flight> allFlights = new ArrayList<>();
        allFlights.add(flight1);
        allFlights.add(flight2);
        allFlights.add(flight3);
        allFlights.add(flight4);
        allFlights.add(flight5);
        allFlights.add(flight6);
        allFlights.add(flight7);
        allFlights.add(flight8);
        allFlights.add(flight9);
        allFlights.add(flight10);

        return allFlights;
    }
}



