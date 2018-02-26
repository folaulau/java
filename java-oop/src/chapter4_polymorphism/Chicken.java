package chapter4_polymorphism;

public class Chicken implements Animal {
	@Override
	public void cry() {
		System.out.println("cry() - Chicken");
	}

}
