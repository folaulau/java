package chapter6_inheritance;

public class Employee extends User {
	private int salary;
	private int pay;

	public Employee(final int salary) {
		this.setPay(salary);
		this.sayHi();
	}

	public Employee() {
		this.sayHi();
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(final int salary) {
		this.salary = salary;
		this.setPay(salary);
	}

	public int getPay() {
		return this.pay;
	}

	private void setPay(final int salary) {
		this.pay = (salary / 52) * 2;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	private void sayHi() {
		System.out.println("Hi from Employee class - private method().");
	}

	public static void sayBye() {
		System.out.println("Hi from Employee class.");
	}

	@Override
	public int calculateAge(final int year) {
		System.out.println("calculateAge() in Employee");
		return 2016 - year;
	}
}
