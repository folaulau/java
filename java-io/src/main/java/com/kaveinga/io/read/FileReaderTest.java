package com.kaveinga.io.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.springframework.util.ResourceUtils;

public class FileReaderTest {
	
	// https://howtodoinjava.com/core-java/io/read-file-from-resources-folder/#resourceutils

	@Test
	public void testFileReader() {
		try(FileReader fr = new FileReader(new File("drug-condition-mapping-dev.csv"))) {
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
	
	@Test
	public void testResourceUtils() {
		// file in resources folder
		try(FileReader fr = new FileReader( ResourceUtils.getFile("classpath:drug-condition-mapping-dev.csv"))) {

			int c = 0;
			StringBuilder str = new StringBuilder();
			while((c = fr.read()) != -1){
				str.append((char) c);
			}
			System.out.println(str.toString());
			
		} catch (IOException e) {
			System.err.println("IOException, msg: {}"+e.getMessage());
		}
	}
	
	

}
