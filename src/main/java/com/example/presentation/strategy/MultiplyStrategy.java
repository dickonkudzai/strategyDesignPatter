package com.example.presentation.strategy;

import org.springframework.stereotype.Component;

@Component
public class MultiplyStrategy implements CalculationStrategy{
    @Override
    public int calculate(int num1, int num2) {
        return num1 * num2;
    }
}
