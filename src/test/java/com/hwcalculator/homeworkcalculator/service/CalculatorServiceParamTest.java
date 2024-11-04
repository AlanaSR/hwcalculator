package com.hwcalculator.homeworkcalculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceParamTest {
    private final CalculatorService calculatorService = new CalculatorService();

    static Stream<Arguments> multiplyData() {
        return Stream.of(
                Arguments.of(2, 5, 10),
                Arguments.of(3, 2, 6),
                Arguments.of(5, 0, 0)
        );
    }

    @ParameterizedTest
    @MethodSource ("multiplyData")
    public void multiplyTest(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculatorService.multiply(a, b));
    }
    static Stream<Arguments> divideData() {
        return Stream.of(
                Arguments.of(6, 3, 2),
                Arguments.of(8, 2, 4),
                Arguments.of(15, 3, 5)
        );
    }

    @ParameterizedTest
    @MethodSource ("divideData")
    public void divideTest(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculatorService.divide(a, b));
    }
    static Stream<Arguments> plusData() {
        return Stream.of(
                Arguments.of(5, 5, 10),
                Arguments.of(4, 2, 6),
                Arguments.of(5, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource ("plusData")
    public void plusTest(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculatorService.plus(a, b));
    }
    static Stream<Arguments> minusData() {
        return Stream.of(
                Arguments.of(15, 5, 10),
                Arguments.of(8, 2, 6),
                Arguments.of(5, 0, 5)
        );
    }

    @ParameterizedTest
    @MethodSource ("minusData")
    public void minusTest(Integer a, Integer b, Integer expected) {
        assertEquals(expected, calculatorService.minus(a, b));
    }
}