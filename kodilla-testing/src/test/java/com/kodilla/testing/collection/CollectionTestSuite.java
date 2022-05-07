package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumberExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before(TestInfo testInfo) {
        String displayName = testInfo.getDisplayName();
        System.out.println("Test: ");
        System.out.println(displayName);
    }

    @AfterEach
    public void after(){
        System.out.println("Test completed");
    }

    @DisplayName("Checks if the class behaves correctly when the list is empty.")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> testList = new ArrayList<>();
        //When
        List<Integer> testNumbers = oddNumberExterminator.exterminate(testList);
        //Then
            Assertions.assertEquals(testList.size(), 0);
    }

    @DisplayName("checks if the class behaves correctly when the list contains even and odd numbers.")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        List<Integer> testList = new ArrayList<>();
        testList.add(10);
        testList.add(5);
        testList.add(2);
        int getNumbers = 0;
        //When
        List<Integer> testNumbers = oddNumberExterminator.exterminate(testList);
        //Then
        for(int i = 0; i < testNumbers.size(); i++){
            getNumbers = testNumbers.get(i);
            Assertions.assertTrue(testNumbers.get(i) % 2 == 0);
        }
    }
}