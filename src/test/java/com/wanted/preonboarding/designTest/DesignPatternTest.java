package com.wanted.preonboarding.designTest;

import com.wanted.preonboarding.design.strategy.Apple;
import com.wanted.preonboarding.design.strategy.AppleService;
import com.wanted.preonboarding.design.strategy.Color;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class DesignPatternTest {
    @Autowired
    AppleService appleService;

    @Test
    void FactoryTest(){
        List<Apple> appleList = new ArrayList<>();
        Apple apple1 = new Apple();
        apple1.setColor(Color.BLUE);
        apple1.setWeight(14L);

        appleList.add(apple1);

        Apple apple2 = new Apple();
        apple2.setColor(Color.GREEN);
        apple2.setWeight(15L);

        appleList.add(apple2);

        List<Apple> filteredAppleList = appleService.getFilteredAppleList(appleList, "Color");
        System.out.println(filteredAppleList);
    }
}
