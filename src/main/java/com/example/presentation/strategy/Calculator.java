package com.example.presentation.strategy;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private final CalculationStrategy addStrategy;
    private final CalculationStrategy multiplyStrategy;

    public Calculator(@Qualifier("addStrategy") CalculationStrategy addStrategy,
                      @Qualifier("multiplyStrategy") CalculationStrategy multiplyStrategy) {
        this.addStrategy = addStrategy;
        this.multiplyStrategy = multiplyStrategy;
    }

    public int performCalculation(int num1, int num2, String operation) {
        CalculationStrategy strategy;
        if ("add".equals(operation)) {
            strategy = addStrategy;
        } else if ("multiply".equals(operation)) {
            strategy = multiplyStrategy;
        } else {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        return strategy.calculate(num1, num2);
    }
}
