package com.wanted.preonboarding.core.exception;

import org.springframework.http.HttpStatus;

public class NoDataException extends BusinessException{

    public NoDataException(String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    public NoDataException(Throwable cause) {
        super(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), cause);
    }
}
