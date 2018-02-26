package utility_classes;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ScannerTest {

	@Test
	public void testScannerConsoleInput() {
		System.out.print("What is your name? ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hi, "+name+"!");
		scanner.close();
	}

	@Test
	public void testScannerString() {
		String str = "I dont like to,waste my time ,doing nothing.";
		
		// try resource
		try (Scanner scanner = new Scanner(str)) {
			scanner.useDelimiter(",");
			while(scanner.hasNext()){
				String token = scanner.next();
				System.out.println("token: "+token);
			}
		} catch (Exception e) {
			System.out.println("Exception, msg: "+e.getMessage());
		}
	}
	
	// if string exists, it will return the string, else return null.
	@Test
	public void testScannerFindInLine() {
		String str = "I dont like to,waste my time ,doing nothing.";
		
		// try resource
		try (Scanner scanner = new Scanner(str)) {
			String var = scanner.findInLine("waste my time");
			System.out.println(var);
		} catch (Exception e) {
			System.out.println("Exception, msg: "+e.getMessage());
		}
	}
	
	// if string exists, it will return the string, else return null.
	@Test
	public void testScannerFindWithinHorizon() {
		String str = "I dont like to,waste my time ,doing nothing.";
		
		// try resource
		try (Scanner scanner = new Scanner(str)) {
			String var = scanner.findWithinHorizon("waste my time", 0);
			System.out.println(var);
		} catch (Exception e) {
			System.out.println("Exception, msg: "+e.getMessage());
		}
	}
}
