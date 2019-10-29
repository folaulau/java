package com.kaveinga.regex.password;

import java.util.ArrayList;
import java.util.List;

public class PasswordRegexDemo {

	public static void main(String[] args) {
		List<String> passwords = new ArrayList<String>();
		passwords.add("Test1234!");
		passwords.add("Test1");
		passwords.add("test1234!");
		passwords.add("test");
		
		passwords.forEach((password)->{
			boolean valid = PasswordRegex.isValidPasswordFormat(password);
			System.out.println("is "+password+" a valid password? "+valid);
		});
		
		
	}

}
