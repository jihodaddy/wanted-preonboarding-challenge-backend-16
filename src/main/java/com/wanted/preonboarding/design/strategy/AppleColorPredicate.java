package com.wanted.preonboarding.design.strategy;

import org.springframework.stereotype.Component;

import static com.wanted.preonboarding.design.strategy.Color.GREEN;

@Component
public class AppleColorPredicate extends ApplePredicate{

    @Override
    public boolean filter(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
