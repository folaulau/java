package treeset;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet
 * a. maintains its order.
 * */
public class MyTreeSet {
	public static void main(final String[] args) {
		final MyTreeSet set = new MyTreeSet();
		set.run();
		set.useComparable();
	}

	public void run() {
		final TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(34);
		tree.add(45);
		tree.add(45);
		tree.add(63);
		tree.add(12);
		// tree.add(null); // this throws a NullPointException.
		final Iterator<Integer> iterator = tree.iterator();
		System.out.println("Tree set data: ");

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("Tree: " + tree);
		System.out.println();
	}

	public void useComparable() {
		final TreeSet<User> tree = new TreeSet<User>();
		tree.add(new User(20));
		tree.add(new User(25));
		tree.add(new User(5));
		tree.add(new User(30));
		tree.add(new User(15));
		tree.add(new User(10));
		final Iterator<User> iterator = tree.iterator();
		System.out.println("Tree set data: ");

		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("Tree: " + tree);
	}
}
