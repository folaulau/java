package chapter6_inheritance;

public class User {
	protected String name;
	protected int age;

	private void sayHi() {
		System.out.println("Hi from User class - private method().");
	}

	public User() {
		this.sayHi();
	}

	public static void sayBye() {
		System.out.println("Hi from User class.");
	}

	public int calculateAge(final int year) {
		System.out.println("calculateAge() in User");
		return 2016 - year;
	}
}
