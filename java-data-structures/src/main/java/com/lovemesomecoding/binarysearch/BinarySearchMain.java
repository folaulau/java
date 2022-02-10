package com.lovemesomecoding.binarysearch;

import java.util.Arrays;

public class BinarySearchMain {

    /**
     * Time: O(nlogn)<br>
     * Space: O(1)
     */
    /**
     * 
     */
    public static void main(String[] args) {
        CustomBinarySearch bs = new CustomBinarySearch();

        int[] numbers = {1, 4, 6, 8, 45, 34, 78, 12, 23, 34};

        Arrays.sort(numbers);

        int searchNumber = 6;

        int searchNumberIndex = bs.search(numbers, searchNumber, 0, numbers.length - 1);

        searchNumberIndex = bs.searchWithRecursion(numbers, searchNumber, 0, numbers.length - 1);

        System.out.println("searchNumber: " + searchNumber + ", searchNumberIndex: " + searchNumberIndex);
    }
}
