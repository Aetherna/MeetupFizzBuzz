package com.example.tthmnx.kata;

import com.example.tthmnx.kata.processors.Processor;

import java.util.Comparator;

public class ProcessorsComparator implements Comparator<Processor> {
    @Override
    public int compare(Processor lhs, Processor rhs) {
        if (lhs.getOrder() > rhs.getOrder()) {
            return 1;
        } else if (lhs.getOrder() < rhs.getOrder()) {
            return -1;
        }

        return 0;
    }
}
