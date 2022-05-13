package com.kodilla.patterns.strategy.social.platforms;

public class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "You are posting on Facebook";
    }
}
