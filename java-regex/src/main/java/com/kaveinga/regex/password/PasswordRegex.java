package com.kaveinga.regex.password;

import java.util.regex.Pattern;

public class PasswordRegex {
	
	
	static String regex = "((?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{6,16})";
	
	/*
	 * (?=.*[a-z])     : This matches the presence of at least one lowercase letter.
     * (?=.*d)         : This matches the presence of at least one digit i.e. 0-9.
     * (?=.*[@#$%])    : This matches the presence of at least one special character.
     * ((?=.*[A-Z])    : This matches the presence of at least one capital letter.
     * {6,16}          : This limits the length of password from minimum 6 letters to maximum 16 letters.
	 */

	public static Boolean isValidPasswordFormat(String password) {
		if(password==null || password.length()==0) {
			return false;
		}
		return Pattern.compile(regex).matcher(password).matches();
	}
}
