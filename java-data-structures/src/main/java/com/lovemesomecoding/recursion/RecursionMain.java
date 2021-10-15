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

        int factorialOf = factorial(9);
        System.out.println("factorialOf of 9: " + factorialOf);

        factorialOf = factorialWithLoop(9);
        System.out.println("factorialWithLoop with 9: " + factorialOf);

        int fibonacciOf = fibonacci(9);
        System.out.println("fibonacci of 9: " + fibonacciOf);

        fibonacciOf = fibonacciWithCache(new HashMap<>(), 9);
        System.out.println("fibonacciWithCache of 9: " + fibonacciOf);

        fibonacciOf = fibonacciWithTabulation(9);
        System.out.println("fibonacciWithTabulation of 9: " + fibonacciOf);

        fibonacciOf = fibonacciWithLoop(9);
        System.out.println("fibonacciWithLoop of 9: " + fibonacciOf);

        int total = sum(5);
        System.out.println("sum of 5: " + total);

        total = sumWithLoop(5);

        System.out.println("sumWithLoop of 5: " + total);
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

    /**
     * Dynamic Programming with Tabulation<br>
     */
    private static int fibonacciWithTabulation(int num) {

        if (num <= 0) {
            return 0;
        }

        int storage[] = new int[num + 1];

        /**
         * first and second case are pre-computed
         */
        /*
         * first case
         */
        storage[0] = 0;
        /*
         * second case
         */
        storage[1] = 1;

        for (int i = 2; i <= num; i++) {

            storage[i] = storage[i - 1] + storage[i - 2];

            System.out.println(storage[i - 1] + "+" + storage[i - 2] + " = " + storage[i]);

        }

        return storage[num];
    }

    /**
     * Dynamic Programming with Memoization<br>
     * storage can be a map, array, or list depending on your situation.
     */
    private static int fibonacciWithCache(Map<Integer, Integer> storage, int num) {
        if (num <= 1) {
            return num;
        }

        if (storage.containsKey(num)) {
            return storage.get(num);
        }

        int number1 = fibonacciWithCache(storage, num - 1);
        int number2 = fibonacciWithCache(storage, num - 2);

        int result = number1 + number2;
        
        System.out.println(number1 + "+" + number2 + " = " + result);

        storage.put(num, result);

        return result;
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
