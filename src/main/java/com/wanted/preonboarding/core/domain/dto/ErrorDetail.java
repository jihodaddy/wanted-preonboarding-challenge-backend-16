package com.wanted.preonboarding.core.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class ErrorDetail {
    private final Integer errorCode;
    private final String errorMessage;
}
