package com.wanted.preonboarding.ticket.domain.entity;

import com.wanted.preonboarding.core.domain.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceSeatInfo extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "BINARY(16)", nullable = false, name = "performance_id")
    private UUID performanceId;
    private int round;
    private int gate;
    private String line;
    private int seat;
    @Column(nullable = false, name = "is_reserve", columnDefinition = "varchar default 'enable'")
    private String isReserve;
}
