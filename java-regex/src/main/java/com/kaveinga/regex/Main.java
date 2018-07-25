package com.kaveinga.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	/*
	 * \w - words 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		Main main = new Main();
		String str = "test";
		int length = 4;
		Boolean valid = main.isValidLength(str, length);
		System.out.println("valid: "+valid);
	}
	
	public Boolean isValidLength(String str, int length) {
		StringBuilder regex = new StringBuilder();
		regex.append("^\\w{"+length+"}$");
		return Pattern.compile(regex.toString()).matcher(str).matches();
	}
}
