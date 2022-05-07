package com.kodilla.good.patterns.challenges.task3;

import com.kodilla.good.patterns.challenges.task3.data.Flight;
import com.kodilla.good.patterns.challenges.task3.data.FlightsSet;
import com.kodilla.good.patterns.challenges.task3.search.ArrivalBasedSearch;


import java.util.Objects;
import java.util.Set;

public class Processor {

    private final FlightsSet flightsSet;
    private final ArrivalBasedSearch arrivalBasedSearch;

    public Processor(FlightsSet flightsSet, ArrivalBasedSearch arrivalBasedSearch) {
        this.flightsSet = flightsSet;
        this.arrivalBasedSearch = arrivalBasedSearch;
    }

    public void process(String departureLocation, String arrivalLocation){
        Set<Flight> flights = flightsSet.mapOfFlightsCreator();
        Set<Flight> arrivals = arrivalBasedSearch.arrivalSearch(arrivalLocation);

        System.out.println("Available flight connections: ");

        for (var entry : flights){
            if (entry.getDepartureLocation().equals(departureLocation) && entry.getArrivalLocation().equals(arrivalLocation)){
                System.out.println(entry.getDepartureLocation() + " - " + entry.getArrivalLocation());

            } else if (entry.getDepartureLocation().equals(departureLocation) && !Objects.equals(entry.getArrivalLocation(), arrivalLocation)){
                for (var ar : arrivals) {
                    if (entry.getArrivalLocation().equals(ar.getDepartureLocation())) {
                        System.out.println(entry.getDepartureLocation() + " - " + entry.getArrivalLocation() + " - " + ar.getArrivalLocation());
                    }
                }
            }
        }
    }
}
