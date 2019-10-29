package com.kaveinga.regex.email;

public class EmailRegexDemo {

	public static void main(String[] args) {
		String email = "folau@gmail.com";
		
		boolean valid = EmailRegex.isValidEmailFormat(email);
		
		System.out.println(email+" is a valid email = "+valid);
	}
}
