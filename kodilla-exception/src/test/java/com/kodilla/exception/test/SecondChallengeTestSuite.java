package com.kodilla.exception.test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void YThrowExceptionTest() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5,1.5));
    }
    @Test
    void XThrowsExceptionTest() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5,2));
    }
    @Test
    void BothElementsThrowExceptionTest() {
        SecondChallenge secondChallenge = new SecondChallenge();
        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.5,1.5));
    }

    @Test
    void NoExceptionThrownTest() {
        SecondChallenge secondChallenge = new SecondChallenge();
        //When Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,2));
    }

}

