package com.lovemesomecoding.quicksort;

import java.util.Arrays;

public class QuickSortMain {

    /**
     * Time: average O(n log n), worst O(n^2) <br>
     * Space: average O(log n), worst O(n) <br>
     */
    public static void main(String[] args) {

        CustomQuickSort qs = new CustomQuickSort();
        
        int[] numbers = {50, 23, 9, 18, 61, 32};

        System.out.println("numbers: " + Arrays.toString(numbers));
        
        int[] sortedNumbers = qs.sort(numbers, 0, numbers.length - 1);

        System.out.println("sortedNumbers: " + Arrays.toString(sortedNumbers));
    }
}
