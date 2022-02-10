package com.lovemesomecoding.binarysearch;

public class CustomBinarySearch {

    public int search(int array[], int element, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {

            // get index of mid element
            int mid = low + (high - low) / 2;

            // if element to be searched is the mid element
            if (array[mid] == element)
                return mid;

            // if element is less than mid element
            // search only the left side of mid
            if (array[mid] < element)
                low = mid + 1;

            // if element is greater than mid element
            // search only the right side of mid
            else
                high = mid - 1;
        }

        return -1;
    }

    public int searchWithRecursion(int array[], int element, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // check if mid element is searched element
            if (array[mid] == element)
                return mid;

            // Search the left half of mid
            if (array[mid] > element)
                return searchWithRecursion(array, element, low, mid - 1);

            // Search the right half of mid
            return searchWithRecursion(array, element, mid + 1, high);
        }

        return -1;
    }
}
