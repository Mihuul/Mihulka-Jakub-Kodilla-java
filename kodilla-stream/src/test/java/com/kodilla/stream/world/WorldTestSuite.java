package com.kodilla.stream.world;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("41")));
        europe.addCountry(new Country("Russia", new BigDecimal("320")));
        europe.addCountry(new Country("Germany", new BigDecimal("50")));
        asia.addCountry(new Country("Japan", new BigDecimal("100")));
        asia.addCountry(new Country("China", new BigDecimal("110")));
        africa.addCountry(new Country("RPA", new BigDecimal("10")));
        africa.addCountry(new Country("Sierra Leone", new BigDecimal("10")));
        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        assertEquals(new BigDecimal("641"), result);
    }
}
