package com.kaveinga.regex.isbn;

import java.util.regex.Pattern;

public class RegexISNB {

	static String regex = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})" + 
			"[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)" + 
			"(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";

	public static Boolean isValidISBNFormat(String isbn) {
		if (isbn == null || isbn.length() == 0) {
			return false;
		}
		return Pattern.compile(regex).matcher(isbn).matches();
	}
}
