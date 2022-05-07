package com.kodilla.good.patterns.challenges.task3.data;

public class Flight {
    private final String departureLocation;
    private final String arrivalLocation;


    public Flight(String departureLocation, String arrivalLocation) {
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;

    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (getDepartureLocation() != null ? !getDepartureLocation().equals(flight.getDepartureLocation()) : flight.getDepartureLocation() != null)
            return false;
        return getArrivalLocation() != null ? getArrivalLocation().equals(flight.getArrivalLocation()) : flight.getArrivalLocation() == null;
    }

    @Override
    public int hashCode() {
        int result = getDepartureLocation() != null ? getDepartureLocation().hashCode() : 0;
        result = 31 * result + (getArrivalLocation() != null ? getArrivalLocation().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureLocation='" + departureLocation + '\'' +
                ", arrivalLocation='" + arrivalLocation + '\'' +
                '}';
    }
}
