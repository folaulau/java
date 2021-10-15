package com.lovemesomecoding.dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class DynamicProgrammingMain {

    /**
     * Recursion can be done with for loop<br>
     * 
     * 1. base case(return value)<br>
     * 2. recursive case(call itself with reduced parameter value)
     */

    public static void main(String[] args) {
        int num = 9;
        int fibonacciOf = fibonacci(num);
        System.out.println("fibonacci of "+num+": " + fibonacciOf);
        
        fibonacciOf = fibonacciWithCache(new HashMap<>(), num);
        System.out.println("fibonacciWithCache of "+num+": " + fibonacciOf);

        fibonacciOf = fibonacciWithTabulation(num);
        System.out.println("fibonacciWithTabulation of "+num+": " + fibonacciOf);
    }

    private static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        int number1 = fibonacci(num - 1);
        int number2 = fibonacci(num - 2);
        
        int result = number1 + number2;

        System.out.println("num: " + num + " - " + number1 + "+" + number2 + " = " + result);
        return result;
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

        System.out.println("num: " + num + " - " + number1 + "+" + number2 + " = " + result);

        storage.put(num, result);

        return result;
    }
}
