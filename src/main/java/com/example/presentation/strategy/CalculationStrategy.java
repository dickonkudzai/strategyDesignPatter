package com.example.presentation.strategy;

import org.springframework.stereotype.Component;

@Component
public interface CalculationStrategy {
    int calculate(int num1, int num2);
}
