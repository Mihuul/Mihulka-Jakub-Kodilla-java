package com.kodilla.good.patterns.challenges.task3.data;

import java.util.HashSet;
import java.util.Set;

public class FlightsSet {
    private final Flight flight1 = new Flight("Gdańsk", "Wrocław");
    private final Flight flight2 = new Flight("Warszawa", "Frankfurt");
    private final Flight flight3 = new Flight("Sosnowiec", "Suwałki");
    private final Flight flight4 = new Flight("Poznań", "Radom");
    private final Flight flight5 = new Flight("Warszawa", "Kraków");
    private final Flight flight6 = new Flight("Wilno", "Wrocław");
    private final Flight flight7 = new Flight("Wrocław", "Helsinki");
    private final Flight flight8 = new Flight("Kraków", "Helsinki");
    private final Flight flight9 = new Flight("Gdańsk", "Kraków");

    public Set<Flight> mapOfFlightsCreator() {
        Set<Flight> mapOfFlights = new HashSet<>();
        mapOfFlights.add(flight1);
        mapOfFlights.add(flight2);
        mapOfFlights.add(flight3);
        mapOfFlights.add(flight4);
        mapOfFlights.add(flight5);
        mapOfFlights.add(flight6);
        mapOfFlights.add(flight7);
        mapOfFlights.add(flight8);
        mapOfFlights.add(flight9);


        return mapOfFlights;
    }
}
