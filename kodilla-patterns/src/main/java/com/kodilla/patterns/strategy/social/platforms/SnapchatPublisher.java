package com.kodilla.patterns.strategy.social.platforms;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "You are posting on Snapchat!";
    }
}
