package linkedlist;

public class User {
	private String name;

	@Override
	public String toString() {
		return "User [name=" + this.name + "]";
	}

	public User(final String name) {
		this.name = name;
	}

	public User() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}
}
