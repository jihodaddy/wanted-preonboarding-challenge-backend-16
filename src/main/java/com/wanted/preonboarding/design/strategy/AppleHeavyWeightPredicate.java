package com.wanted.preonboarding.design.strategy;

import org.springframework.stereotype.Component;

@Component
public class AppleHeavyWeightPredicate extends ApplePredicate{
    @Override
    public boolean filter(Apple apple) {
        return apple.getWeight() > 15;
    }
}
