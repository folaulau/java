package linkedlist;

import java.util.LinkedList;

public class MyLinkedList {
	public static void main(final String[] args) {
		final MyLinkedList list = new MyLinkedList();
		list.run();
	}

	private void run() {
		final LinkedList<User> list = new LinkedList<User>();
		list.push(new User("Folau"));
		list.push(new User("Laulau"));
		list.push(new User("Fusi"));

		System.out.println("POP(): " + list.pop().toString());
		System.out.println("PEEK(): " + list.peek().toString());
		for (final User user : list) {
			System.out.println(user.toString());
		}

		System.out.println("peekLast(): " + list.peekLast().toString());

	}
}
