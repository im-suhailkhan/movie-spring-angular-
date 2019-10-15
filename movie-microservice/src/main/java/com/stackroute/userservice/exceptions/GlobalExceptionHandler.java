package com.stackroute.userservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(value = {MovieAlreadyExistsException.class, MovieNotFoundException.class})
    public ResponseEntity handleCustomException(Exception ex){
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler
    public ResponseEntity handleException(Exception ex){
        return new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
