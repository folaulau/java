package list;

public class User {
	private int age;

	@Override
	public String toString() {
		return "User [age=" + this.age + "]";
	}

	public User(final int age) {
		this.age = age;
	}

	public User() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}
}
