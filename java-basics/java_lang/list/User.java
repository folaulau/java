package list;

public class User implements Comparable<User> {

	private String name;
	private int age;
	private String phone;
	private String gender;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(User u) {
		// age
		int order = this.getAge() - u.getAge();

		// name
		if (order == 0) {

			// if they have the same age, sort by name.
			// name is sorting in desc order
			order = this.getName().compareTo(u.getName());
		}

		// gender
		if (order == 0) {
			order = this.getGender().compareTo(u.getGender());
		}

		return order;
	}

}
