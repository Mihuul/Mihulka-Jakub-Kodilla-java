package com.kodilla.patterns.strategy.social.platforms;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "You are posting on twitter!";
    }
}
