package com.example.presentation.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
    private final Calculator calculator;
    @Autowired
    public CalculationController(Calculator calculator) {
        this.calculator = calculator;
    }
    @GetMapping("/calculate")
    public int calculate(@RequestParam("num1") int num1,
                         @RequestParam("num2") int num2,
                         @RequestParam("operation") String operation) {
//        CalculationStrategy calculationStrategy;
//        if ("add".equals(operation)) {
//            calculationStrategy = new AddStrategy();
//        } else if ("multiply".equals(operation)) {
//            calculationStrategy = new MultiplyStrategy();
//        } else {
//            throw new IllegalArgumentException("Invalid operation: " + operation);
//        }
        return calculator.performCalculation(num1, num2, operation);
    }
}
