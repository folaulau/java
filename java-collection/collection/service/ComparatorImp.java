package service;

import java.util.Comparator;

// take two objects of the same type and sort them.
public class ComparatorImp implements Comparator<User> {

	public int compare(final User obj1, final User obj2) {
		if (obj1.getAge() == obj2.getAge()) {
			return 0;
		} else if (obj1.getAge() > obj2.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}
