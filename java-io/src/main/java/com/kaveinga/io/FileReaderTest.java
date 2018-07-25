package com.kaveinga.io;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class FileReaderTest {

	@Test
	public void testFileReader() {
		try(FileReader fr = new FileReader(new File("print_stream.txt"))) {
			int c = 0;
			StringBuilder str = new StringBuilder();
			while((c = fr.read()) != -1){
				str.append((char) c);
			}
			System.out.println(str.toString());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
