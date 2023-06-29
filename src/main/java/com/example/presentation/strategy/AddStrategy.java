package com.example.presentation.strategy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AddStrategy implements CalculationStrategy{
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
