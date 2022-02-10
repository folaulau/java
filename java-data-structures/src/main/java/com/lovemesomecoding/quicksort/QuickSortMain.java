package com.lovemesomecoding.quicksort;

import java.util.Arrays;

public class QuickSortMain {

    public static void main(String[] args) {

        CustomQuickSort qs = new CustomQuickSort();
        
        int[] numbers = {8, 5, 2, 9, 5, 6, 3};

        System.out.println("numbers: " + Arrays.toString(numbers));
        
        int[] sortedNumbers = qs.sort(numbers, 0, numbers.length - 1);

        System.out.println("sortedNumbers: " + Arrays.toString(sortedNumbers));
    }
}
