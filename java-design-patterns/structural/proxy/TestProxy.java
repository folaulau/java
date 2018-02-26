package proxy;

public class TestProxy {

	public static void main(String[] args) {
		System.out.println("test proxy");

		Payment proxy = new CreditCardProxy();
		proxy.prep();
		proxy.charge();
	}

}
