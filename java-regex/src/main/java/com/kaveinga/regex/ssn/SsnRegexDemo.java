package com.kaveinga.regex.ssn;

public class SsnRegexDemo {

	public static void main(String[] args) {
		String ssn = "123-45-678";
		boolean valid = SsnRegex.isValidSSNFormat(ssn);
		
		System.out.println(ssn+" is a valid ssn = "+valid);
	}
	
}
