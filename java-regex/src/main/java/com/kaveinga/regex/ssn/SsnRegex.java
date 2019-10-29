package com.kaveinga.regex.ssn;

import java.util.regex.Pattern;

public class SsnRegex {

	/*
	 * 
	 * United States Social Security numbers are nine-digit numbers in the format AAA-GG-SSSS with following rules.

	 * 1. The first three digits called the area number. The area number cannot be 000, 666, or between 900 and 999.
     * 2. Digits four and five are called the group number and range from 01 to 99.
     * 3. The last four digits are serial numbers from 0001 to 9999.
	 * 
	 */
	
	static String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";

	public static Boolean isValidSSNFormat(String ssn) {
		if(ssn==null || ssn.length()==0) {
			return false;
		}
		return Pattern.compile(regex).matcher(ssn).matches();
	}
}
