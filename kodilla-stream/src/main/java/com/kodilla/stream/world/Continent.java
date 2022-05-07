package com.kodilla.stream.world;
import java.util.List;
import java.util.ArrayList;

public final class Continent {

    private final List<Country> listOfCountries = new ArrayList<>();

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }

    public void addCountry(Country country) {
        listOfCountries.add(country);
    }


}
