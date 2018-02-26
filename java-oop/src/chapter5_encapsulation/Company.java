package chapter5_encapsulation;

import java.util.List;

public class Company {
	private String name;
	private List<Employee> employees;

	public Company(final String name, final List<Employee> employees) {
		super();
		this.name = name;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [name=" + this.name + ", employees=" + this.employees + "]";
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(final List<Employee> employees) {
		this.employees = employees;
	}

}
