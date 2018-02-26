package io;

import static org.junit.Assert.*;

import java.io.Console;

import org.junit.Test;

public class ConsoleTest {
	
	public static void main(String[] args) {
		try {
			Console console = System.console();
			
			String str = console.readLine("Enter a string: ");
			console.printf("Here is your string: %s\n", str);
		} catch (Exception e) {
			System.out.println("Exception, msg: "+e.getMessage());
		}
	}


}
