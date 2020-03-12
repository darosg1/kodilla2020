package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class Application {
    public static void main (String []args){
        FlightRetriever flightRetriever = new FlightRetriever();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRetriever);

        List<Flight> destination = flightSearchEngine.findFlightsFrom("Warsaw EPWA");
        System.out.println(destination);

        List<Flight> destination2 = flightSearchEngine.findFlightsTo("Wroclaw EPWR");
        System.out.println(destination2);

        List<Flight> destination3 = flightSearchEngine.findFlightsBetween("Warsaw EPWA", "Wroclaw EPWR", "Krakow EPKR");
        System.out.println(destination3);
    }
}
