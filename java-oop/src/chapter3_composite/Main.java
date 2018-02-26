package chapter3_composite;

public class Main {

	public static void main(final String[] args) {
		System.out.println("http://beginnersbook.com/2013/05/association/");
		final Heart heart = new Heart();
		heart.setType("Strong");
		final Body body = new Body("Male", 23, heart);
		heart.setBody(body);

		System.out.println(body.toString());
	}

}
