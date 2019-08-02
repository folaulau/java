package com.kaveinga.io.write;

import static org.junit.Assert.*;

import java.io.FileWriter;

import org.junit.Test;

public class FileWriterTest {

	@Test
	public void testFileWriter() {
		try (FileWriter fw = new FileWriter("file_writer.txt", true)){
			fw.write("Hi file writer, hey hey");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
