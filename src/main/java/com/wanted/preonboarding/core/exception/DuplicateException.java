package com.wanted.preonboarding.core.exception;

import org.springframework.http.HttpStatus;

public class DuplicateException extends BusinessException{

    public DuplicateException(String message) {
        super(HttpStatus.CONFLICT.value(), message);
    }

    public DuplicateException(Throwable cause) {
        super(HttpStatus.CONFLICT.value(), HttpStatus.CONFLICT.getReasonPhrase(), cause);
    }
}
