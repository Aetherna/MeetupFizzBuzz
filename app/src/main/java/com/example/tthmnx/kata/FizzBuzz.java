package com.example.tthmnx.kata;

import com.example.tthmnx.kata.processors.Processor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {

    private static final ProcessorsComparator DEFAULT_COMPARATOR = new ProcessorsComparator();
    List<Processor> processors = new ArrayList<>();
    List<Processor> superDuperProcessors = new ArrayList<>();
    private ProcessorsComparator comparator;
    private String delimiter = " ";

    public FizzBuzz() {
        this(DEFAULT_COMPARATOR);
    }

    public FizzBuzz(ProcessorsComparator comparator) {
        this.comparator = comparator;
    }

    public void addProcessor(Processor processor) {
        this.processors.add(processor);
    }

    public void addSuperDuperProcessor(Processor processor) {
        this.superDuperProcessors.add(processor);
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public String processInput(int input) {

        Collections.sort(processors, comparator);

        for (Processor processor : superDuperProcessors) {
            if (processor.isValid(input)) {
                return processor.getOutput();
            }
        }

        String result = "";
        for (Processor processor : processors) {
            if (processor.isValid(input)) {
                result += processor.getOutput() + delimiter;
            }
        }

        return trimLastDelimiter(result);

    }

    private String trimLastDelimiter(String results) {

        return results.substring(0, results.length() - delimiter.length());
    }

}
