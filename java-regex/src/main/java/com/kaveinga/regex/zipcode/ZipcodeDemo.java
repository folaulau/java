package com.kaveinga.regex.zipcode;

import java.util.ArrayList;
import java.util.List;

public class ZipcodeDemo {

	public static void main(String[] args) {
		
		List<String> zips = new ArrayList<String>();
	       
		//Valid ZIP codes
		zips.add("12345"); 
		zips.add("12345-6789"); 
		 
		//Invalid ZIP codes
		zips.add("123456"); 
		zips.add("1234"); 
		zips.add("12345-678");
		 
		zips.add("12345-67890");
		 
		for (String zip : zips)
		{
			boolean valid = ZipcodeRegex.isValidUSZipcodeFormat(zip);
			System.out.println(zip+" is a valid US zipcode? "+valid);
		}
		 
		
		
	}
}
