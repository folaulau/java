package list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		basic();

		randomInsert();
	}

	private static void basic() {
		System.out.println("basic()");
		List<String> names = new ArrayList<>();
		names.add("Folau");
		names.add("Lisa");
		names.add("Laulau");
		names.add("Kinga");
		names.add("Fusi");
		names.add("Lisa");

		// replace Kinga
		names.add(4, "Nesi");

		System.out.println(names);

		// indexOf
		System.out.println("Lisa is at indexOf " + names.indexOf("Lisa"));

		System.out.println("Lisa is at lastIndexOf " + names.lastIndexOf("Lisa"));
	}

	private static void randomInsert() {
		System.out.println("randomInsert()");
		int initialCapacity = 10;
		List<String> names = new ArrayList<>(initialCapacity);
		names.add("Folau");
		names.add("Lisa");
		
		// throw an exception because of the index.
		names.add(3, "Nesi");
		names.add("Fusi");

		System.out.println(names);
	}
}
