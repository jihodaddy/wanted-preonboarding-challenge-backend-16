package com.wanted.preonboarding.ticket.domain.dto;

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
