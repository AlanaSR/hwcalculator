package com.hwcalculator.homeworkcalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus (HttpStatus.CONFLICT)
public class ExceptionDivideByZero extends IllegalArgumentException {
    public ExceptionDivideByZero(String message) {
        super(message);
    }
}
