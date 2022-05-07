package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinent = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinent.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinent.stream()
                .map(Continent::getListOfCountries)
                .flatMap(Collection::stream)
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
