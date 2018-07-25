package com.kaveinga.regex;

import java.util.regex.Pattern;

public class StringRegex {
	
	
	public static void main(String[] args) {
		StringRegex stringRegex = new StringRegex();
		String str = "test";
		int length = 4;
		Boolean valid = stringRegex.isValidLength(str, length);
		System.out.println("valid: "+valid);
	}
	
	public Boolean isValidLength(String str, int length) {
		StringBuilder regex = new StringBuilder();
		regex.append("^\\w{"+length+"}$");
		return Pattern.compile(regex.toString()).matcher(str).matches();
	}
}
