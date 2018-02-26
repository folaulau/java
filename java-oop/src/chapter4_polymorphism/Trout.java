package chapter4_polymorphism;

public class Trout extends Fish {

	public void swim() {
		System.out.println("Just swimming");
	}

	// parameter list
	public void swim(final int speed) {
		System.out.println("swimming at " + speed + " MPH");
	}

	// 1. parameter datatype
	// 2. return type different
	public String swim(final String direction) {
		System.out.println("swimming going " + direction);
		return "";
	}

	// 1. different access modifier
	// 2. parameter list
	// 3. parameter data type
	protected void swim(final int speed, final String direction) {
		System.out.println("swimming at " + speed + " MPH going " + direction);
	}

	// overloading in two classes.
	public void talk(final String speech) {
		System.out.println("Talking " + speech);
	}
}
