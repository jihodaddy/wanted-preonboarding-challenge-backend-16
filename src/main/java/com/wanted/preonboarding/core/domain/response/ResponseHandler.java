package com.wanted.preonboarding.core.domain.response;

import com.wanted.preonboarding.core.constants.BaseConstant;
import com.wanted.preonboarding.core.domain.dto.MessageResponse;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Builder
public record ResponseHandler<T>(HttpStatus statusCode, String message, MessageResponse messageResponse, T data) {

    public static <T> ResponseHandler<T> createSuccessData(T data) {
        return ResponseHandler.<T>builder()
                .message(BaseConstant.SUCCESS)
                .statusCode(HttpStatus.OK)
                .data(data)
                .build();
    }
}
