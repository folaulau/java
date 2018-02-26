package chapter6_inheritance;

public class Main {

	public static void main(final String[] args) {
		System.out.println("http://beginnersbook.com/2013/05/encapsulation-in-java/");

		final Employee folau = new Employee(95000);
		folau.setName("Folau");
		final User lisa = new Employee(55000);
		lisa.name = "Lisa";
		final User fusi = new User();
		fusi.name = "Fusi";

		System.out.println("Hi my name is " + folau.getName() + ", I get $" + folau.getPay());
		System.out.println("Hi my name is " + ((Employee) lisa).getName() + ", I get $" + ((Employee) lisa).getPay());
		System.out.println("Hi my name is " + fusi.name);
		// overide
		System.out.println(((Employee) lisa).getName() + "'s age " + lisa.calculateAge(1987));
		System.out.println(folau.getName() + "'s age " + folau.calculateAge(1986));
		System.out.println(fusi.name + "'s age " + fusi.calculateAge(2015));
		User.sayBye();
		Employee.sayBye();
	}
}
