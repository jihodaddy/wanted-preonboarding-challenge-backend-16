package com.wanted.preonboarding.discount.infrastructure.repository;

import com.wanted.preonboarding.discount.domain.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
