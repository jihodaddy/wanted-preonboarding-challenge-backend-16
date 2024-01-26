package com.wanted.preonboarding.discount.domain;

public interface DiscountPolicy {
    double calculateDiscount(Long id, double amount);
}
