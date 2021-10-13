package com.lovemesomecoding.recursion;

public class RecursionMain {

    /**
     * Recursion can be done with for loop<br>
     * 
     * 1. base case(return value)<br>
     * 2. recursive case(call itself with reduced parameter value)
     */

    public static void main(String[] args) {

        int factorialOf = factorial(9);
        System.out.println("factorialOf: " + factorialOf);

        factorialOf = factorialWithLoop(9);
        System.out.println("factorialOf: " + factorialOf);

        int fibonacciOf = fibonacci(9);
        System.out.println("fibonacci: " + fibonacciOf);

        fibonacciOf = fibonacciWithLoop(9);
        System.out.println("fibonacci: " + fibonacciOf);

        int total = sum(5);
        System.out.println("sum: " + total);

        total = sumWithLoop(5);

        System.out.println("sum: " + total);
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

    private static int fibonacciWithLoop(int num) {
        int indexNumber = 0;
        int number1 = 0;
        int number2 = 1;
        int sum = 0;

        for (int i = 0; i < num; i++) {

            sum = number1 + number2;

            number1 = number2;
            number2 = sum;

            indexNumber = sum;

        }

        return indexNumber;
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
