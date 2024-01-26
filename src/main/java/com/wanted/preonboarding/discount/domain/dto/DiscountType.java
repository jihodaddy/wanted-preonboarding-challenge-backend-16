package com.wanted.preonboarding.discount.domain.dto;

import com.wanted.preonboarding.discount.domain.DiscountPolicy;

public enum DiscountType {
    PERCENTAGE("percentage"),
    AMOUNT("amount"),
    FIXED("fixed");

    private final String category;

    DiscountType(String category) {
        this.category = category;
    }

    public String getCategory() { return category;}
}
