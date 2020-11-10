package com.kaveinga.io;

import java.io.Console;

import org.junit.jupiter.api.Test;

public class ConsoleTest {
	
	@Test
	public void test() {
		try {
			Console console = System.console();
			
			String str = console.readLine("Enter a string: ");
			console.printf("Here is your string: %s\n", str);
		} catch (Exception e) {
			System.out.println("Exception, msg: "+e.getMessage());
		}
	}


}
