package com.kaveinga.regex.zipcode;

import java.util.regex.Pattern;

public class ZipcodeRegex {

	static String US_ZIPCODE_REGEX = "^[0-9]{5}(?:-[0-9]{4})?$";
	
	/*
	 * ^         # Assert position at the beginning of the string.
     * [0-9]{5}  # Match a digit, exactly five times.
     * (?:       # Group but don't capture:
     * -         # Match a literal "-".
     * [0-9]{4}  # Match a digit, exactly four times.
     * )         # End the non-capturing group.
     * ?         # Make the group optional.
     * $         # Assert position at the end of the string.
	 */
	
	public static Boolean isValidUSZipcodeFormat(String zipcode) {
		if(zipcode==null || zipcode.length()==0) {
			return false;
		}
		return Pattern.compile(US_ZIPCODE_REGEX).matcher(zipcode).matches();
	}
	
	static String UK_ZIPCODE_REGEX = "^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$";
	
	
	public static Boolean isValidUKZipcodeFormat(String zipcode) {
		if(zipcode==null || zipcode.length()==0) {
			return false;
		}
		return Pattern.compile(UK_ZIPCODE_REGEX).matcher(zipcode).matches();
	}
}
