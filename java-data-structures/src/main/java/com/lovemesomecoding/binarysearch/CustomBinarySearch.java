package com.lovemesomecoding.binarysearch;

import java.util.Arrays;

public class CustomBinarySearch {

    public int search(int array[], int searchElement, int lowIndex, int highIndex) {

        /**
         * Be sure that array is sorted before passing it in
         */
        System.out.println("array: " + Arrays.toString(array));

        // Repeat until the pointers low and high meet each other
        while (lowIndex <= highIndex) {

            // get index of mid element
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;

            int midValue = array[midIndex];

            System.out.println("searchElement: " + searchElement + ", lowIndex: " + lowIndex + ", midIndex: " + midIndex + ", highIndex: " + highIndex + ", midValue: " + midValue);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            // if element to be searched is the mid element
            if (midValue == searchElement) {
                System.out.println("found searchElement: " + searchElement + ", at index " + midIndex);

                return midIndex;
            }

            /**
             * if element is less than mid element search only the left side of mid<br>
             */
            if (searchElement < midValue) {

                System.out.println("search left side");

                highIndex = midIndex - 1;

                /**
                 * if element is greater than mid element search only the right side of mid<br>
                 */
            } else {

                System.out.println("search right side");
                lowIndex = midIndex + 1;
            }
        }

        return -1;
    }

    public int searchWithRecursion(int array[], int searchElement, int lowIndex, int highIndex) {
        if (highIndex >= lowIndex) {
            int midIndex = lowIndex + (highIndex - lowIndex) / 2;

            int midValue = array[midIndex];

            // check if mid element is searched element
            if (midValue == searchElement) {
                return midIndex;
            }

            // Search the left half of mid
            if (midValue > searchElement) {
                return searchWithRecursion(array, searchElement, lowIndex, midIndex - 1);
            }

            // Search the right half of mid
            return searchWithRecursion(array, searchElement, midIndex + 1, highIndex);
        }

        return -1;
    }
}
