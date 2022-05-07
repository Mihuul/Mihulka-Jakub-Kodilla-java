package com.kodilla.stream.array;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] board = new int[]{1,2,3,4,5,6,7,8,9,10};
        //Then
        double result = ArrayOperations.getAverage(board);
        //When
        assertEquals(5.5,result);
    }
}
