package vector;

import java.util.Iterator;
import java.util.Vector;

public class MyVector {
	public static void main(final String[] args) {
		final MyVector vector = new MyVector();
		vector.run();
		vector.runWithString();
	}

	private void run() {
		final Vector<User> vector = new Vector<User>(3, 2);
		System.out.println("original size: " + vector.size());
		vector.add(new User("Folau"));
		vector.add(new User("Fusi"));
		vector.add(new User("Anna"));
		vector.add(new User("Laulau"));
		final Iterator it = vector.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(vector);
	}
	
	private void runWithString(){
		final Vector<String> vector = new Vector<String>(5, 1);
		System.out.println("original size: " + vector.size());
		vector.add("Folau");
		vector.add("Fusi");
		vector.add("Anna");
		vector.add("Laulau");
		final Iterator it = vector.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(vector);
	}
}
