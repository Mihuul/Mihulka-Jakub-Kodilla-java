package com.kodilla.good.patterns.challenges.task3.search;

import com.kodilla.good.patterns.challenges.task3.data.Flight;
import com.kodilla.good.patterns.challenges.task3.data.FlightsSet;

import java.util.Set;
import java.util.stream.Collectors;

public class Searcher {
    private final FlightsSet flightsSet;

    public Searcher(FlightsSet flightsSet) {
        this.flightsSet = flightsSet;
    }

    public Set<Flight> searcher(String departureLocation, String arrivalLocation) {
        return flightsSet.mapOfFlightsCreator().stream()
                .filter(e ->  departureLocation.equals(e.getDepartureLocation()) && arrivalLocation.equals(e.getArrivalLocation())
                        || departureLocation.equals(e.getDepartureLocation() + " ") && arrivalLocation.equals(e.getArrivalLocation() + " "))
                .collect(Collectors.toSet());
    }
}
