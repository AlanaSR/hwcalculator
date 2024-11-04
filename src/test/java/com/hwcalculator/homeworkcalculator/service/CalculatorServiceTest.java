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
        Integer actual = Integer.valueOf(calculatorService.plus(num1, num2));
        assertEquals(expectedPlus, actual);
    }

    @Test
    public void calculatorMinusTest() {
        Integer expectedMinus = num1 - num2;
        Integer actual = Integer.valueOf(calculatorService.minus(num1, num2));
        assertEquals(expectedMinus, actual);
    }

    @Test
    public void calculatorMultiplyTest() {
        Integer expectedMultiply = num1 * num2;
        Integer actual = Integer.valueOf(calculatorService.multiply(num1, num2));
        assertEquals(expectedMultiply, actual);
    }

    @Test
    public void calculatorDivideTest() {
        Integer expectedDivide = num1 / num2;
        Integer actual = Integer.valueOf(calculatorService.divide(num1, num2));
        assertEquals(expectedDivide, actual);
    }

    @Test
    public void calculatorDivideByZeroTest() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide((num1, 0)))
    }
}
