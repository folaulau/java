package chapter4_polymorphism;

public class Main {

	public static void main(final String[] args) {
		System.out.println("http://beginnersbook.com/2013/03/polymorphism-in-java/");

		final Animal dog = new Dog();
		final Animal chick = new Chicken();

		dog.cry();
		chick.cry();

		final Trout trout = new Trout();

		trout.swim();
		trout.swim(100);
		trout.swim("North");
		trout.swim(100, "North");

		final Fish fish = new Trout();
		fish.talk();
		((Trout) fish).talk("trash");
	}
}
