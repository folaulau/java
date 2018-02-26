package chapter2_aggregation;

public class Main {

	public static void main(final String[] args) {
		System.out.println("http://beginnersbook.com/2013/05/aggregation/");
		final Wallet trayvex = new Wallet(new Money("Dollar", 100), "Trayvex", 5);
		System.out.println(trayvex.toString());
	}

}
