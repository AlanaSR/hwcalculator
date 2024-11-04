package com.hwcalculator.homeworkcalculator.controller;

import com.hwcalculator.homeworkcalculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }

}
