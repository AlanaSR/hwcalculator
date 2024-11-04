package com.hwcalculator.homeworkcalculator.service;

import com.hwcalculator.homeworkcalculator.exception.ExceptionDivideByZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService;

    public CalculatorServiceTest(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    Integer num1 = 5;
    Integer num2 = 5;


    @Test
    public void calculatorPlusTest() {
        Integer expectedPlus = num1 + num2;
        assertEquals(expectedPlus, calculatorService.plus(num1,num2));
    }

    @Test
    public void calculatorMinusTest() {
        Integer expectedMinus = num1 - num2;
        assertEquals(expectedMinus, calculatorService.minus(num1, num2));
    }

    @Test
    public void calculatorMultiplyTest() {
        Integer expectedMultiply = num1 * num2;
        assertEquals(expectedMultiply, calculatorService.multiply(num1, num2));
    }

    @Test
    public void calculatorDivideTest() {
        Integer expectedDivide = num1 / num2;
        assertEquals(expectedDivide, calculatorService.divide(num1, num2));
    }

    @Test
    public void calculatorDivideByZeroTest() {
        Exception exception = assertThrows(ExceptionDivideByZero.class, () -> {
            calculatorService.divide(num1, 0);
        });
    }
}
