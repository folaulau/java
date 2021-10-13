package com.lovemesomecoding.javadatastructures.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RecursionTests {

    @BeforeEach
    public void init() {
    }

    @Test
    void getFibonacciNumberOfIndex() {
        int count = 10;
        int indexNumber = 0;
        int number1 = 0;
        int number2 = 1;
        int sum = 0;

        System.out.println(number1);
        System.out.println(number2);

        for (int i = 0; i < count; i++) {

            sum = number1 + number2;

            System.out.println((i + 1) + ". " + number1 + " + " + number2 + " = " + sum);

            number1 = number2;
            number2 = sum;

            indexNumber = sum;

        }

        System.out.println("indexNumber: " + indexNumber);

        indexNumber = fib(count);

        System.out.println("indexNumber: " + indexNumber);
    }

    private int fib(int num) {
        if (num <= 1) {
            return num;
        }
        int number1 = fib(num - 1);
        int number2 = fib(num - 2);
        return number1 + number2;
    }
}
