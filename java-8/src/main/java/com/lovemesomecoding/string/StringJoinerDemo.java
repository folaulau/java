package com.lovemesomecoding.string;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		demo();
		demoWithPrefixAndSuffix();
		demoWithMerge();
	}

	public static void demo() {
		String delimeter = "-";
		StringJoiner names = new StringJoiner(delimeter);

		names.add("Laulau");
		names.add("Kinga");
		names.add("Fusi");

		System.out.println(names);
	}

	public static void demoWithPrefixAndSuffix() {
		String delimeter = ",";
		String prefix = "(";
		String suffix = ")";
		StringJoiner names = new StringJoiner(delimeter, prefix, suffix);

		names.add("Laulau");
		names.add("Kinga");
		names.add("Fusi");

		System.out.println(names);
	}

	public static void demoWithMerge() {
		String delimeter = ",";
		String prefix = "(";
		String suffix = ")";
		StringJoiner names1 = new StringJoiner(delimeter, prefix, suffix);

		names1.add("Laulau");
		names1.add("Kinga");
		names1.add("Fusi");

		System.out.println(names1);

		StringJoiner names2 = new StringJoiner(delimeter, prefix, suffix);

		names2.add("John");
		names2.add("Peter");
		names2.add("Andrew");

		System.out.println(names2);
		
		StringJoiner names3 = names1.merge(names2);
		
		System.out.println(names3);
	}
}
