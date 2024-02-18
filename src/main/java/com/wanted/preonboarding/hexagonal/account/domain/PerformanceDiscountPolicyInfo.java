package com.wanted.preonboarding.hexagonal.account.domain;

import com.wanted.preonboarding.hexagonal.account.adapter.out.web.persistence.entity.PerformanceDiscountPolicy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceDiscountPolicyInfo {

    private String policyName;
    private String policyType;
    private BigDecimal rate;
    private int discountFee;
    private Date startedDate;
    private Date endedDate;

    public static PerformanceDiscountPolicyInfo of(PerformanceDiscountPolicy entity) {
        return PerformanceDiscountPolicyInfo.builder()
                .policyName(entity.getName())
                .policyType(entity.getType())
                .rate(entity.getRate())
                .discountFee(entity.getDiscountFee())
                .startedDate(entity.getStartedAt())
                .endedDate(entity.getEndedAt())
                .build();
    }

    public static List<PerformanceDiscountPolicyInfo> getAllDiscountPolicies(List<PerformanceDiscountPolicy> entities){
        return entities.stream().map(PerformanceDiscountPolicyInfo::of).toList();

    }
}
