package com.example.tthmnx.kata.processors;

public class LolzProcessor implements Processor {

    public static final int HUNDRED = 100;
    public static final int ORDER = -1;

    @Override
    public boolean isValid(int input) {
        return input == HUNDRED;
    }

    @Override
    public String getOutput() {
        return "Lolz";
    }

    @Override
    public int getOrder() {
        return ORDER;
    }
}
