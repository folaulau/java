package com.kaveinga.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexDemo {

	public static void main(String[] args) {
		List<String> inputs = new ArrayList<String>();
		inputs.add("Folaulau");
		inputs.add("JAVA is great");
		inputs.add("I love java programming");
		
		inputs.forEach((input) -> {
			int length = 10;
			boolean valid = StringRegex.isValidLength(input, length);

			System.out.println("is " + input + " " + length + " in length? " + valid);
		});
		
		System.out.println("\n\n\n");
		
		StringBuilder line = new StringBuilder();
		line.append("Hey man");
		line.append("\n");
		line.append("I like Java");
		line.append("\n");
		
		boolean valid = StringRegex.isValidLines(line.toString(), 2);
		System.out.println("does \n===\n" + line.toString() + "===\nhas 2 lines? " + valid);
	}
}
