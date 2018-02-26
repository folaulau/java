package chapter4_polymorphism;

public class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("cry() - Dog");
	}

}
