package com.example.tthmnx.kata.processors;

public class FizzProcessor implements Processor {

    private final static  int ORDER = 0;

    @Override
    public boolean isValid(int input) {
        if (input % 3 == 0) {
            return true;
        }
        int digit;
        while (input > 0) {
            digit = input % 10;
            if (digit == 3) {
                return true;
            }
            input /= 10;
        }
        return false;

    }

    @Override
    public String getOutput() {
        return "Fizz";
    }

    @Override
    public int getOrder() {
        return ORDER;
    }
}
