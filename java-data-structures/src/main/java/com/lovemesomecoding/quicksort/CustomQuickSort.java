package com.lovemesomecoding.quicksort;

import java.util.Arrays;

public class CustomQuickSort {

    public int[] sort(int[] array, int low, int high) {

        System.out.println("low: " + low + ", high: " + high + ", array: " + Arrays.toString(array));

        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivot = partition(array, low, high);

            // recursive call on the left of pivot
            sort(array, low, pivot - 1);

            // recursive call on the right of pivot
            sort(array, pivot + 1, high);
        }

        return array;
    }

    // method to find the partition position
    int partition(int array[], int low, int high) {
        System.out.println("partion, low: " + low + ", high: " + high);
        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            System.out.println("compare element: " + array[j] + " with pivot: " + pivot);
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                swap(i, j, array);
            }

        }

        // swap the pivot element with the greater element specified by i

        swap((i + 1), high, array);
        
        System.out.println("\n\n");
        // return the position from where partition is done
        return (i + 1);
    }

    private void swap(int i, int j, int[] array) {
        System.out.println("swapping " + array[i] + " and " + array[j]);
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
