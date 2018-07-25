package com.kaveinga.io;

import static org.junit.Assert.*;

import java.io.FileWriter;

import org.junit.Test;

public class FileWriterTest {

	@Test
	public void testFileWriter() {
		try (FileWriter fw = new FileWriter("file_writer.txt")){
			fw.write("Hi file writer");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
