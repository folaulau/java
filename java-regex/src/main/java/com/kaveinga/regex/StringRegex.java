package com.kaveinga.regex;

import java.util.regex.Pattern;

public class StringRegex {

	public static Boolean isValidLength(String str, int length) {
		String regex = "^\\W*(?:\\w+\\b\\W*){0,"+length+"}$";
		return Pattern.compile(regex).matcher(str).matches();
	}
	
	/*
	 * \A          # Assert position at the beginning of the string.
     * (?>         # Group but don't capture or keep backtracking positions:
     * [^\r\n]*    # Match zero or more characters except CR and LF.
     * (?>         # Group but don't capture or keep backtracking positions:
     * \r\n?       # Match a CR, with an optional following LF (CRLF).
     * |           # Or:
     * \n          # Match a standalone LF character.
     * )           # End the noncapturing, atomic group.
     * ){0,4}      # End group; repeat between zero and four times.
     * [^\r\n]*    # Match zero or more characters except CR and LF.
     * \z          # Assert position at the end of the string.


	 CR : Carriage Return (\r\n)
	 LF : Line Feed (\n)
	 */
	public static Boolean isValidLines(String str, int length) {
		String regex = "\\A(?>[^\r\n]*(?>\r\n?|\n)){0,"+length+"}[^\r\n]*\\z";
		return Pattern.compile(regex).matcher(str).matches();
	}
	
	
}
