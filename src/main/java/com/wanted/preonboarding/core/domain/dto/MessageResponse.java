package com.wanted.preonboarding.core.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class MessageResponse {
    private String description;
    private List<Detail> details;

    @Builder
    @Setter
    @Getter
    public static class Detail {
        String key;
        String value;
    }
}
