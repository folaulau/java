package com.lovemesomecoding.recursion;

import java.util.HashMap;
import java.util.Map;

public class RecursionMain {

    /**
     * Recursion can be done with for loop<br>
     * 
     * 1. base case(return value)<br>
     * 2. recursive case(call itself with reduced parameter value)
     */

    public static void main(String[] args) {

        int num = 9;

        int factorialOf = factorial(num);
        System.out.println("factorialOf of " + num + ": " + factorialOf);

        factorialOf = factorialWithLoop(num);
        System.out.println("factorialWithLoop with " + num + ": " + factorialOf);

        int fibonacciOf = fibonacci(9);
        System.out.println("fibonacci of " + num + ": " + fibonacciOf);

        fibonacciOf = fibonacciWithLoop(num);
        System.out.println("fibonacciWithLoop of " + num + ": " + fibonacciOf);

        int total = sum(num);
        System.out.println("sum of " + num + ": " + total);

        total = sumWithLoop(num);

        System.out.println("sumWithLoop of " + num + ": " + total);

        Map<Integer, Integer> map = new HashMap<>();
        total = fibonacciWithMomiezation(num, map);
        System.out.println("fibonacciWithMomiezation of " + num + ": " + total);
    }

    /**
     * Recursion used for factorial<br>
     * Start from the top and go to bottom, then calculation will start from bottom back to top
     */
    private static int factorial(int num) {
        /**
         * validation
         */
        if (num < 0) {
            throw new IllegalArgumentException("num is invalid");
        }

        /**
         * base case
         */
        if (num == 0) {
            return 1;
        }

        /**
         * recursive case
         */

        return num * factorial(num - 1);
    }

    private static int factorialWithLoop(int num) {

        int fact = 0;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    /**
     * Recursion used for fibonacci<br>
     * Start from the top and go to bottom, then calculation will start from bottom back to top
     */
    private static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        int number1 = fibonacci(num - 1);
        int number2 = fibonacci(num - 2);
        return number1 + number2;
    }

    private static int fibonacciWithMomiezation(int num, Map<Integer, Integer> map) {
        if (num <= 1) {
            return num;
        }

        if (map.containsKey(num)) {
            return map.get(num);
        }

        int number1 = fibonacciWithMomiezation(num - 1, map);
        int number2 = fibonacciWithMomiezation(num - 2, map);

        int sum = number1 + number2;
        map.put(num, sum);
        return sum;
    }

    /**
     * Dynamic Programming with Tabulation<br>
     */
    private static int fibonacciWithLoop(int num) {

        if (num <= 0) {
            return 0;
        }

        /**
         * first and second case are pre-computed
         */
        /*
         * first case
         */
        int number1 = 0;
        /*
         * second case
         */
        int number2 = 1;

        int sum = 0;

        for (int i = 2; i <= num; i++) {

            sum = number1 + number2;

            System.out.println(number1 + "+" + number2 + " = " + sum);

            number1 = number2;
            number2 = sum;

        }

        return sum;
    }

    private static int sum(int num) {

        /**
         * base case
         */
        if (num <= 0) {
            return 0;
        }

        /**
         * recursive case
         */
        return num + sum(num - 1);
    }

    private static int sumWithLoop(int num) {
        int total = 0;
        for (int i = 0; i <= num; i++) {
            total += i;
        }
        return total;
    }
}
