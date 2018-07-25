package com.kaveinga.io;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.junit.Test;

public class PrintStreamTest {

	@Test
	public void testPrintStream() {
		try {
			PrintStream stream = new PrintStream(new File("print_stream.txt"));
			stream.println("Hello print stream!!!");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}
