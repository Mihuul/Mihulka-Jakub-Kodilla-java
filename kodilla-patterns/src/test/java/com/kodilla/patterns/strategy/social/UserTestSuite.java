package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.platforms.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User miles = new ZGeneration("Miles Morales");
        User cezary = new YGeneration("Cezary Baryka");
        //When
        String johnsPost = john.sharePost();
        String milesPost = miles.sharePost();
        String cezarysPost = cezary.sharePost();
        //Then
        assertEquals("You are posting on Facebook", johnsPost);
        assertEquals("You are posting on twitter!", milesPost);
        assertEquals("You are posting on Snapchat!", cezarysPost);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User miles = new ZGeneration("Miles Morales");
        //When
        String milesPost = miles.sharePost();
        System.out.println(milesPost);
        miles.setSocialPublisher(new SnapchatPublisher());
        milesPost = miles.sharePost();
        System.out.println(milesPost);
        //Then
        assertEquals("You are posting on Snapchat!", milesPost);
    }
}
