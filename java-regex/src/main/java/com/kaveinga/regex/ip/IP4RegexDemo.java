package com.kaveinga.regex.ip;

public class IP4RegexDemo {

	public static void main(String[] args) {
		String ip4 = "000.12.234.23.23";
		
		boolean valid = IPRegex.isValidIP4Format(ip4);
		
		System.out.println(ip4+" is a valid ip4 = "+valid);
	}
}
