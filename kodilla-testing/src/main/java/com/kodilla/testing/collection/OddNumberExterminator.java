package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumberExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        int temporaryValue = 0;
        List<Integer> newNumbersList = new ArrayList<>();
        for(int i=0; i < numbers.size(); i++){
            temporaryValue = numbers.get(i);
            if(temporaryValue % 2 == 0) {
                newNumbersList.add(numbers.get(i));
            }
        }
        return newNumbersList;
    }
}
