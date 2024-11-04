package com.hwcalculator.homeworkcalculator.service;

import com.hwcalculator.homeworkcalculator.exception.ExceptionBadRequest;
import com.hwcalculator.homeworkcalculator.exception.ExceptionDivideByZero;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(Integer num1, Integer num2) throws ExceptionBadRequest {
        if (num1 == null || num2 == null) {
            throw new ExceptionBadRequest("Bad request");
        }
         return num1 + num2;

    }

    public int minus(Integer num1, Integer num2) throws ExceptionBadRequest {
        if (num1 == null || num2 == null) {
            throw new ExceptionBadRequest("Bad request");
        }
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) throws ExceptionBadRequest {
        if (num1 == null || num2 == null) {
            throw new ExceptionBadRequest("Bad request");
        }
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) throws ExceptionDivideByZero, ExceptionBadRequest {
        if (num1 != null && num2 != null) {
            if (num2 == 0) {
                throw new ExceptionDivideByZero("Divide by zero");
            }
        } else {
            throw new ExceptionBadRequest("Bad request");
        }
        return num1 / num2;
    }
}
