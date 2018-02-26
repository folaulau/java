package service;

import java.util.Iterator;
import java.util.TreeSet;

public class MyService {

	public static void main(final String[] args) {
		final MyService service = new MyService();
		service.run();
	}

	private void run() {
		final TreeSet<User> tree = new TreeSet<User>(new ComparatorImp());
		tree.add(new User(10));
		tree.add(new User(15));
		tree.add(new User(5));
		final Iterator<User> iterator = tree.iterator();
		System.out.println("Tree set data: ");

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("Tree: " + tree);
	}
}
