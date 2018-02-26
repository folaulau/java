package stack;

import java.util.Iterator;
import java.util.Stack;

public class MyStack {
	public static void main(final String[] args) {
		final MyStack stack = new MyStack();
		stack.run();
	}

	private void run() {
		final Stack<User> stack = new Stack<User>();
		stack.push(new User("Folau"));
		stack.push(new User("Fusi"));
		stack.push(new User("Laulau"));

		System.out.println(stack.search(new User("Folau")));

		final Iterator it = stack.listIterator(1);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}