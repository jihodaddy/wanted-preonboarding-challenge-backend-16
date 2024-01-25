package com.wanted.preonboarding.core.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BusinessException{

    public NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND.value(), message);
    }

    public NotFoundException(Throwable cause) {
        super(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), cause);
    }
}
