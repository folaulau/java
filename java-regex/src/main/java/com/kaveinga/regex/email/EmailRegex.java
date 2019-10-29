package com.kaveinga.regex.email;

import java.util.regex.Pattern;

public class EmailRegex {
	static String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	
	public static Boolean isValidEmailFormat(String email) {
		if(email==null || email.length()==0) {
			return false;
		}
		return Pattern.compile(regex).matcher(email).matches();
	}
}
