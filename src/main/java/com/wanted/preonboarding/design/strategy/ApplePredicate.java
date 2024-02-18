package com.wanted.preonboarding.design.strategy;

public abstract class ApplePredicate {
    public String getFilterName(){
        return getClass().getSimpleName();
    }

    public abstract boolean filter(Apple apple);
}
