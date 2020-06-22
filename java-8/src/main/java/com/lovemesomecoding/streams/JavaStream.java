package com.lovemesomecoding.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void main(String[] args) {

//		creation();
//
//		filter();
//
//		reduce();
//
//		parallel();
//
//		sort();
//
//		map();

		collectors();
	}

	public static void creation() {
		Stream.of("Folau", "Kinga", "Laulau").forEach((name) -> {
			System.out.println("name1: " + name);
		});

		Stream.of(1, 2, 3).forEach((num) -> {
			System.out.println("num1: " + num);
		});

		Stream.builder().add("Folau").add("Kinga").add("Laulau").build().forEach((name) -> {
			System.out.println("name2: " + name);
		});

		// Stream.iterate(initial value, next value)
		int numOfIterations = 5;
		int initialValue = 3;

		Stream.iterate(initialValue, n -> {
			return n * 2;
		}).limit(numOfIterations).forEach(x -> System.out.println(x));

	}

	public static void filter() {
		Stream.of("Folau", "Kinga", "Laulau").filter(name -> name.contains("lau")).forEach((name) -> {
			System.out.println("name1: " + name);
		});
	}

	public static void reduce() {
		int initialValue = 5;

		int reducedNumber = Stream.of(1, 2, 3).reduce(initialValue, (num, index) -> {
			System.out.println("num: " + num + ", index: " + index);
			return index;
		});

		System.out.println("reducedNumber: " + reducedNumber);

		String listToString = Stream.of("Folau", "Kinga", "Laulau").collect(Collectors.joining(", ", "(", ")"));

		System.out.println("listToString: " + listToString);

	}

	public static void collectors() {
		int sum = Stream.of(1, 2, 3).collect(Collectors.summingInt(Integer::intValue));

		System.out.println("sum: " + sum);

		Set<Integer> set = Stream.of(1, 2, 3).collect(Collectors.toCollection(HashSet::new));

		System.out.println("set: " + set);
		
		Map<Integer,String> concurrentMap = Stream.of(1, 2, 3).collect(Collectors.toConcurrentMap(num -> num, num -> num+""));
	
		System.out.println("concurrentMap: " + concurrentMap);
		
		Map<Integer,String> map = Stream.of(1, 2, 3, 3).collect(Collectors.toMap(num -> num, num -> num+""));
		
		System.out.println("map: " + map);
	}

	public static void parallel() {
		int numOfIterations = 20;
		int initialValue = 3;

		int sum = Stream.iterate(initialValue, n -> {
			return n * 2;
		}).limit(numOfIterations).parallel().map(num -> {
			System.out.println(Thread.currentThread().getName());
			return num;
		}).collect(Collectors.summingInt(Integer::intValue));

		System.out.println("sum: " + sum);

	}

	public static void sort() {

		List<Integer> numbers = Stream.of(9, 4, 6, 1, 3, 5).sorted((a, b) -> {

			return a.compareTo(b);

		}).collect(Collectors.toList());

		System.out.println("numbers: " + numbers.toString());
	}

	public static void map() {

		// map to a different data type.
		String number = Stream.of(9, 4, 6, 1, 3, 5).map(num -> num + "").collect(Collectors.joining(","));
		System.out.println("number: " + number);

		double average = Stream.of("1", "5", "10", "4").mapToInt(Integer::parseInt).average().getAsDouble();

		System.out.println("average: " + average);

	}
}
