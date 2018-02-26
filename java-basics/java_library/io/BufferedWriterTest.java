package io;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class BufferedWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("file_writer.txt"); BufferedWriter w = new BufferedWriter(fw)){
			w.write("Hi file writer. This is buffered writer");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
