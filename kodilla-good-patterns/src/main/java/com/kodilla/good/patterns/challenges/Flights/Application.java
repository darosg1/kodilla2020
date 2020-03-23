package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;

public class Application {
    public static void main (String []args){
        FlightRetriever flightRetriever = new FlightRetriever();
        FlightSearchEngine flightSearchEngine = new FlightSearchEngine(flightRetriever);

        List<Flight> destination = flightSearchEngine.findFlightsFrom("Warsaw EPWA");
        System.out.println("Dostępne loty z Warszawy: " + destination);

        List<Flight> destination2 = flightSearchEngine.findFlightsTo("Wroclaw EPWR");
        System.out.println("Dostępne loty do Wrocławia: " + destination2);

        FlightWithStop destination3 = flightSearchEngine.findFlightsBetween ("Warsaw EPWA", "Wroclaw EPWR", "Krakow EPKR");
        System.out.println("Dostępne loty Warszawa-Wrocław z przesiadką w Krakowie: " + destination3);
    }
}
