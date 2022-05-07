package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Warsaw", true);
        airportMap.put("Gdansk", true);
        airportMap.put("Berlin", false);
        airportMap.put("Tel Aviv", true);
        airportMap.put("Bangkok", true);
        airportMap.put("Mars", false);
        airportMap.put("Madrid", true);
        Boolean canFly = airportMap.get(flight.getArrivalAirport());
        if (canFly != null) {
           if(canFly) {
               System.out.println("You can fly here");
           } else {
               System.out.println("Airport is currently unavailable");
           }
            return canFly;
        }else {
            throw new RouteNotFoundException("Airport does not exist");
        }
    }
}
