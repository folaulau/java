package com.kaveinga.regex.ip;

import java.util.regex.Pattern;

public class IPRegex {
	static String ip4regex = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
	
	static String ip6regex = "(?<![:.\\w])(?:[A-F0-9]{1,4}:){7}[A-F0-9]{1,4}(?![:.\\w])";
	
	public static Boolean isValidIP4Format(String ip4) {
		if(ip4==null || ip4.isEmpty()) {
			return false;
		}
		return Pattern.compile(ip4regex).matcher(ip4).matches();
	}
	
	public static Boolean isValidIP6Format(String ip6) {
		if(ip6==null || ip6.isEmpty()) {
			return false;
		}
		return Pattern.compile(ip6regex).matcher(ip6).matches();
	}
}
