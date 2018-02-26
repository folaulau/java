package hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*  HashSet
 * 	a.	Contain only unique elements.
 *	b.	No order.
 *	c.	Allows only one value.
 * */
public class MyHashSet {
	public static void main(final String[] args) {
		final MyHashSet set = new MyHashSet();
		set.run();
		set.throwConcurrentModificationException();
		set.synchronizeHashSet();
		set.implementHashCodeEquals();
	}

	public void run() {
		System.out.println("run()");
		final HashSet<Object> hashSet = new HashSet<Object>(10, 1);
		hashSet.add("Folau");
		hashSet.add("Lisa");
		hashSet.add("Folaulau");
		hashSet.add("Kinga");
		hashSet.add("Fusi");
		hashSet.add("Fusi");
		hashSet.add(null);
		hashSet.add(20);
		hashSet.add(null);
		final Iterator<Object> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hashSet);
		System.out.println();
	}

	/*
	 * use hashcode and equals on objects within the hashset to ensure that each
	 * object is unique.
	 */
	public void implementHashCodeEquals() {
		System.out.println("implementHashCodeEquals()");
		final HashSet<User> hashSet = new HashSet<User>(10, 1);
		final User folau = new User("Folau", 29);
		hashSet.add(new User("Folau", 29));
		hashSet.add(new User("Lisa", 29));
		hashSet.add(new User("Fusi", 1));
		hashSet.add(new User("Folau", 29));
		final Iterator<User> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hashSet);
		System.out.println();
	}

	/*
	 * HashSet is not synchronized but there is a way.
	 */
	public void synchronizeHashSet() {
		System.out.println("synchronizeHashSet()");
		final Set<Object> hashSet = Collections.synchronizedSet(new HashSet<Object>());
		hashSet.add("Folau");
		hashSet.add("Lisa");
		hashSet.add("Folaulau");
		hashSet.add("Kinga");
		final Iterator<Object> it = hashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hashSet);
		System.out.println();
	}

	/*
	 * If HashSet is modified at any time after the iterator is created except
	 * through iterator's own remove method, iterator will throw a
	 * ConcurrentModificationException, fail quickly and cleanly.
	 */
	public void throwConcurrentModificationException() {
		System.out.println("throwConcurrentModificationException()");
		final HashSet<Object> hashSet = new HashSet<Object>();
		hashSet.add("Folau");
		hashSet.add("Lisa");
		hashSet.add("Folaulau");
		final Iterator<Object> it = hashSet.iterator();
		// hashSet.remove(null);// will throw ConcurrentModificationException

		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(hashSet);
		System.out.println();
	}

}
