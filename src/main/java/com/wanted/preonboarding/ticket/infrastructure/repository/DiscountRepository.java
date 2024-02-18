package com.wanted.preonboarding.ticket.infrastructure.repository;

import com.wanted.preonboarding.ticket.domain.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Optional<Discount> findByPerformanceId(UUID performanceId);
}
