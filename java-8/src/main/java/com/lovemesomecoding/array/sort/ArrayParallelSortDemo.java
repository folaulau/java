package com.lovemesomecoding.array.sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayParallelSortDemo {

	public static void main(String[] args) {
		sort();
		System.out.println("\n\n");
		timeSort();
		System.out.println("\n\n");
		sortPartial();
	}

	private static void sort() {
		int[] intArray = { 73, 1, 14, 2, 15, 12, 7, 45 };

		System.out.println("---Before Parallel Sort---");
		for (int i : intArray)
			System.out.print(i + " ");

		// Parallel Sorting
		Arrays.parallelSort(intArray);

		System.out.println("\n---After Parallel Sort---");
		for (int i : intArray)
			System.out.print(i + " ");
	}

	private static void timeSort() {
		int[] arraySizes = { 10000, 100000, 1000000, 10000000 };

		for (int arraySize : arraySizes) {

			System.out.println("When Array size = " + arraySize);

			int[] intArray = new int[arraySize];
			Random random = new Random();

			for (int i = 0; i < arraySize; i++) {
				intArray[i] = random.nextInt(arraySize) + random.nextInt(arraySize);
			}

			int[] forSequential = Arrays.copyOf(intArray, intArray.length);
			int[] forParallel = Arrays.copyOf(intArray, intArray.length);

			long startTime = System.currentTimeMillis();
			Arrays.sort(forSequential);
			long endTime = System.currentTimeMillis();

			System.out.println("Sequential Sort Milli seconds: " + (endTime - startTime));

			startTime = System.currentTimeMillis();
			Arrays.parallelSort(forParallel);
			endTime = System.currentTimeMillis();

			System.out.println("Parallel Sort Milli seconds: " + (endTime - startTime));
			System.out.println("------------------------------");

		}
	}

	private static void sortPartial() {
		int[] intArray = { 18, 1, 14, 2, 15, 12, 5, 4 };

		System.out.println("Array Length " + intArray.length);
		System.out.println("---Before Parallel Sort---");

		for (int i : intArray)
			System.out.print(i + " ");

		// Parallel Sorting
		Arrays.parallelSort(intArray, 0, 4);

		System.out.println("\n---After Parallel Sort---");
		for (int i : intArray)
			System.out.print(i + " ");
	}
}
