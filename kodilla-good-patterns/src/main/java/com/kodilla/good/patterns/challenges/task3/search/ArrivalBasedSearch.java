package com.kodilla.good.patterns.challenges.task3.search;


import com.kodilla.good.patterns.challenges.task3.data.Flight;
import com.kodilla.good.patterns.challenges.task3.data.FlightsSet;

import java.util.Set;
import java.util.stream.Collectors;

public class ArrivalBasedSearch {
    private final FlightsSet flightsSet;

    public ArrivalBasedSearch(FlightsSet flightsMap) {
        this.flightsSet = flightsMap;
    }

    public Set<Flight> arrivalSearch(String arrivalLocation) {
        return flightsSet.mapOfFlightsCreator().stream()
                .filter(e -> arrivalLocation.equals(e.getArrivalLocation()) ||
                        arrivalLocation.equals(e.getArrivalLocation() + " ") || arrivalLocation.equals(" " + e.getArrivalLocation()))
                .collect(Collectors.toSet());
    }
}
