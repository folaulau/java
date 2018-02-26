package chapter5_encapsulation;

public class Employee {
	private String name;
	private int salary;
	private int pay;

	public Employee(final String name, final int salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.setPay(salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", salary=" + this.salary + ", pay=" + this.pay + "]";
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
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

	private void setPay(final int pay) {
		this.pay = (pay / 52) * 2;
	}

}
