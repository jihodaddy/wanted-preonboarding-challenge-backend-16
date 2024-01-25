package com.wanted.preonboarding.core.exception;

import com.wanted.preonboarding.core.constants.BaseConstant;
import com.wanted.preonboarding.core.domain.dto.MessageResponse;
import com.wanted.preonboarding.core.domain.response.ResponseHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@ControllerAdvice
@Slf4j
public class ApiExceptionHandler {
    @ExceptionHandler(NoDataException.class)
    public ResponseEntity<ResponseHandler<Object>> noDataException(NoDataException exception) {
        log.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ResponseHandler.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR)
                        .message(exception.getMessage()).build());
    }

    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<ResponseHandler<Object>> duplicateException(DuplicateException exception) {
        log.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT.value())
                .body(ResponseHandler.builder().statusCode(HttpStatus.CONFLICT)
                        .message(exception.getMessage()).build());
    }

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ResponseHandler<Object>> handleValidationExceptions(BindException ex) {
        log.error(ex.getMessage());
        List<MessageResponse.Detail> details = new ArrayList<>();
        ex.getBindingResult().getFieldErrors()
                .parallelStream()
                .forEach(error -> details.add(MessageResponse.Detail.builder().key(error.getField()).value(error.getDefaultMessage()).build()));

        return ResponseEntity.badRequest()
                .body(ResponseHandler.builder()
                        .message(BaseConstant.FAIL)
                        .messageResponse(MessageResponse.builder()
                                .description("Param missing or incorrect").details(details).build())
                        .build());
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResponseHandler<Object>> handleApplicationException(BusinessException exception) {
        log.error(exception.getMessage());
        return ResponseEntity.internalServerError()
                .body(ResponseHandler.builder().message(BaseConstant.FAIL)
                        .messageResponse(MessageResponse.builder()
                                .description(exception.getMessage())
                                .build())
                        .build());
    }

    @ExceptionHandler(ExecutionException.class)
    public ResponseEntity<ResponseHandler<Object>> handleExecutionException(ExecutionException exception) {
        log.error(exception.getMessage());
        return ResponseEntity.internalServerError()
                .body(ResponseHandler.builder().message(BaseConstant.FAIL)
                        .messageResponse(MessageResponse.builder()
                                .description(exception.getMessage())
                                .build())
                        .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseHandler<Object>> handleException(Exception exception) {
        log.error(exception.getMessage());
        return ResponseEntity.internalServerError()
                .body(ResponseHandler.builder().message(BaseConstant.FAIL)
                        .messageResponse(MessageResponse.builder()
                                .description(exception.getMessage())
                                .build())
                        .build());
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ResponseHandler<Object>> handleNotFoundException(NotFoundException exception) {
        log.error(exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ResponseHandler.builder().message(BaseConstant.FAIL)
                        .messageResponse(MessageResponse.builder()
                                .description(exception.getMessage())
                                .build())
                        .build());
    }
}
