package com.kaveinga.regex;

import java.util.regex.Pattern;

public class StringRegex {

	public static void main(String[] args) {
		StringRegex stringRegex = new StringRegex();
		String str = "test";
		int length = 4;
		Boolean valid = stringRegex.isValidLength(str, length);
		System.out.println("valid: " + valid);
		
		String element = "<b>Folau<div> Kaveinga</div></b>";
		System.out.println("element: " + element);
		element = stringRegex.stripHtmlTag(element);
		System.out.println("element: " + element);
	}

	public Boolean isValidLength(String str, int length) {
		StringBuilder regex = new StringBuilder();
		regex.append("^\\w{" + length + "}$");
		return Pattern.compile(regex.toString()).matcher(str).matches();
	}

	// social security number
	public Boolean isValidSsn(String ssn) {
		StringBuilder regex = new StringBuilder();
		regex.append("^\\d{3}-?\\d{2}-?\\d{4}$");
		return Pattern.compile(regex.toString()).matcher(ssn).matches();
	}

	// zipcode
	// ^\d{5}(-\d{4})?$ - (99999-9999)
	// ^\d{5}$ - (99999)
	public Boolean isValidZipcode(String zipcode) {
		StringBuilder regex = new StringBuilder();
		regex.append("^\\d{5}$");
		return Pattern.compile(regex.toString()).matcher(zipcode).matches();
	}
	
	public Boolean isValidPhoneNumber(String phoneNumber) {
		StringBuilder regex = new StringBuilder();
		regex.append("^(\\d{10})|(([\\(]?([0-9]{3})[\\)]?)?[ \\.\\-]?([0-9]{3})[ \\.\\-]([0-9]{4}))$");
		return Pattern.compile(regex.toString()).matcher(phoneNumber).matches();
	}
	
	// strip off html tags
	public String stripHtmlTag(String element) {
		return element.replaceAll("<(.|\\n)+?>", "");
	}
	
}
