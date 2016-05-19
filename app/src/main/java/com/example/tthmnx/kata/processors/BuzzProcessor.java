package com.example.tthmnx.kata.processors;

public class BuzzProcessor implements Processor {

    private final static int ORDER = 1;

    @Override
    public boolean isValid(int input) {

        if (input % 5 == 0) {
            return true;
        }

        return Integer.toString(input).contains("5");

    }

    @Override
    public String getOutput() {
        return "Buzz";
    }

    @Override
    public int getOrder() {
        return ORDER;
    }
}
