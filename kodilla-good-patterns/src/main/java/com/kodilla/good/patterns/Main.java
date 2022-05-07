package com.kodilla.good.patterns;

import com.kodilla.good.patterns.challenges.task3.Processor;
import com.kodilla.good.patterns.challenges.task3.data.FlightsSet;
import com.kodilla.good.patterns.challenges.task3.search.ArrivalBasedSearch;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(new FlightsSet(), new ArrivalBasedSearch(new FlightsSet()));
        processor.process("Gdańsk", "Helsinki");
    }
}
