package com.kaveinga.regex.isbn;

import java.util.ArrayList;
import java.util.List;

public class RegexISNBDemo {

	public static void main(String[] args) {
		List<String> isbns = new ArrayList<String>();
	       
		//Valid ISBNs
		isbns.add("0-596-52068-9"); 
		isbns.add("0 512 52068 9"); 
		isbns.add("ISBN-10 0-596-52068-9");
		isbns.add("ISBN-10: 0-596-52068-9");
		 
		//Invalid ISBNs
		isbns.add("0-5961-52068-9"); 
		isbns.add("11 5122 52068 9"); 
		isbns.add("ISBN-13 0-596-52068-9");
		isbns.add("ISBN-10- 0-596-52068-9");
		
		isbns.forEach((isbn)->{
			boolean valid = RegexISNB.isValidISBNFormat(isbn);
			System.out.println("is "+isbn+" a valid ISBN? "+valid);
		});
	}

}
