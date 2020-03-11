package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class Application {
    public static void main (String []args){
        FlightRetriever flightRetriever = new FlightRetriever();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRetriever);

        List<String> destination = flightSearchEngine.findFlightsFrom("Warsaw EPWA");

        System.out.println(destination);
    }
}
