package com.example.demo.service.impl;

import com.example.demo.service.ICalculatorService;

public class CalculatorService implements ICalculatorService {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
