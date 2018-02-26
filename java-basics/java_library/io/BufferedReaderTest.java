package io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class BufferedReaderTest {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader(new File("print_stream.txt")); BufferedReader f = new BufferedReader(fr)) {
			int c = 0;
			StringBuilder str = new StringBuilder();
			while ((c = f.read()) != -1) {
				str.append((char) c);
			}
			System.out.println(str.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
