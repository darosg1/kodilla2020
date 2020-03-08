package com.kodilla.good.patterns.challenges.Flights;

public class FlightRetriever {

    public FlightRegister retriever() {
        Flights flight1 = new Flights("Warsaw EPWA", "Wroclaw EPWR", 2323);
        Flights flight2 = new Flights("Warsaw EPWA", "Krakow EPKR", 1101);
        Flights flight3 = new Flights("Warsaw EPWA", "Gdansk EPGD", 9090);
        Flights flight4 = new Flights("Gdansk EPGD", "Krakow EPKR", 9101);
        Flights flight5 = new Flights("Krakow EPKR", "Gdansk EPGD", 9102);
        Flights flight6 = new Flights("Krakow EPKR", "Wroclaw EPWR", 9905);
        Flights flight7 = new Flights("Gdansk EPGD", "Wroclaw EPWR", 7867);
        Flights flight8 = new Flights("Warsaw EPWA", "Wroclaw EPWR", 2324);
        Flights flight9 = new Flights("Warsaw EPWA", "Poznan EPPO", 4545);
        Flights flight10 = new Flights("Poznan EPPO", "Wroclaw EPWR", 6760);

        FlightRegister flightRegister = new FlightRegister();




