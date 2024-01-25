package com.wanted.preonboarding.core.exception;

import com.wanted.preonboarding.core.domain.dto.ErrorDetail;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BusinessException extends RuntimeException{
    protected final transient ErrorDetail errorDetail;

    public BusinessException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorDetail = ErrorDetail.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .build();
    }

    public BusinessException(int errorCode, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.errorDetail = ErrorDetail.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .build();
    }
}
