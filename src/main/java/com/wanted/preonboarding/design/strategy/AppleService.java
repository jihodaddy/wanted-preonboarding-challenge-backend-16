package com.wanted.preonboarding.design.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AppleService {
    private final PredicateFactory factory;

    public List<Apple> getFilteredAppleList(List<Apple> appleList, String className){
        List<Apple> result = new ArrayList<>();
        ApplePredicate predicate = factory.findBy(className);
        for (Apple apple : appleList) {
            if (predicate.filter(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
