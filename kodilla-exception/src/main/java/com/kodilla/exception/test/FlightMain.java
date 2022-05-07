package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight101 = new Flight("Tel Aviv", "Madrid");
        try {
            flightFinder.findFlight(flight101);
        }catch (RouteNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }
}
