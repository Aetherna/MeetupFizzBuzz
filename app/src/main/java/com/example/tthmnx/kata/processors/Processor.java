package com.example.tthmnx.kata.processors;

public interface Processor {

    boolean isValid(int input);

    String getOutput();

    int getOrder();

}
