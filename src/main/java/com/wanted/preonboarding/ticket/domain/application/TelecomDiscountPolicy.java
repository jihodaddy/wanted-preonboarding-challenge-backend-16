package com.wanted.preonboarding.ticket.domain.application;

public class TelecomDiscountPolicy implements DiscountPolicy{
    @Override
    public double calculateDiscount(double amount) {
        return 0;
    }
}
