package utility_classes;

import static org.junit.Assert.*;

import org.junit.Test;

public class FormatterTest {

	/**
	 * %d	Displays a decimal (base 10 ) integer
	 * %f	Display a floating point value in decimal format
	 * %e or %E	Display a floating point number in exponential notation
	 * %c or %C	Display characters
	 * %s or %S	Display Strings
	 * %b or %B	Display boolean values
	 * %%	Display a % sign
	 */
	
	@Test
	public void testPrintF() {
		String name = "Folau";
		System.out.printf("My name is: %s", name); 
		
		
		int day = 9;
		String month = "March";
		int year = 1993;
		char grade='A';
		int marks=99;
	}
	
	/*
	 * %% is used to display a % sign
	 * */
	@Test
	public void testPrintFormat() {
		int day = 9;
		String month = "March";
		int year = 1993;
		char grade='A';
		int marks=99;
		
		System.out.printf("Born on %dth %s, %d\n", day,month,year);
		System.out.printf("Secured %d%% marks and %c grade", marks,grade);
	}

}
