package treeset;

public class User implements Comparable<User> {
	private int age;

	@Override
	public String toString() {
		return "User [age=" + this.age + "]";
	}

	public User(final int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.age;
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final User other = (User) obj;
		if (this.age != other.age) {
			return false;
		}
		return true;
	}

	public User() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(final int age) {
		this.age = age;
	}

	public int compareTo(final User obj) {
		final int diff = this.age - obj.age;

		if (diff == 0) {
			return 0;
		} else if (diff > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
