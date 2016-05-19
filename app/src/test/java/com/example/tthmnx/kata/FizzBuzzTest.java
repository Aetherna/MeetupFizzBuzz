package com.example.tthmnx.kata;

import com.example.tthmnx.kata.processors.BuzzProcessor;
import com.example.tthmnx.kata.processors.FizzProcessor;
import com.example.tthmnx.kata.processors.LolzProcessor;
import com.example.tthmnx.kata.processors.Processor;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz undertest;

    @Before
    public void setUp() throws Exception {

        undertest = new FizzBuzz();
        undertest.addProcessor(new FizzProcessor());
        undertest.addProcessor(new BuzzProcessor());
        undertest.addSuperDuperProcessor(new LolzProcessor());
    }

    @Test
    public void shouldPrintFizzIfNumberIsDividableby3() {

        //havin
        int input = 3;

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz", result);

    }

    @Test
    public void shouldPrintBuzzIfDivisibleby5() {
        assertEquals("Buzz", undertest.processInput(5));
    }


    @Test
    public void shouldPrintFizzIfNumberContains3() {

        //having
        int input = 13;

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz", result);

    }

    @Test
    public void shouldPrintFizzBuzzIfNumberDivisibleBy5And3() {

        //having
        int input = 651;

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz Buzz", result);

    }

    @Test
    public void shouldPrintFizzBuzzIfNumberContainsBy5And3() {

        //having
        int input = 532;

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz Buzz", result);

    }

    @Test
    public void shouldReturnCorrectOrder() {
        //having

        undertest = new FizzBuzz();
        undertest.addProcessor(new BuzzProcessor());
        undertest.addProcessor(new FizzProcessor());
        int input = 532;

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz Buzz", result);

    }

    @Test
    public void shouldPrintLolzOn100() {

        //having
        int input = 100;

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Lolz", result);

    }

    @Test
    public void shouldNotprintDelimiterWhenSingleOutput() {

        //having
        int input = 3;
        undertest.setDelimiter("*");

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz", result);

    }

    @Test
    public void shouldNotprintLongDelimiterWhenSingleOutput() {

        //having
        int input = 3;
        undertest.setDelimiter("***");

        //when
        String result = undertest.processInput(input);

        //then
        assertEquals("Fizz", result);

    }



}