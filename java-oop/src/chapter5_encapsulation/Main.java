package chapter5_encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(final String[] args) {
		System.out.println("http://beginnersbook.com/2013/05/encapsulation-in-java/");
		final List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Folau", 95000));
		employees.add(new Employee("Thomas", 110000));
		final Company columbus = new Company("Columbus", employees);
		for (final Employee emp : columbus.getEmployees()) {
			System.out.println(emp.getName() + " is getting paid $" + emp.getPay());
		}
	}

}
