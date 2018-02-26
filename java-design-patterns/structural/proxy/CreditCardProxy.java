package proxy;

public class CreditCardProxy implements Payment {

	private Payment realPayment;
	
	@Override
	public void charge() {
		System.out.println("charge proxy...");
		this.realPayment = new Fund();
		this.realPayment.prep();
		realPayment.charge();
	}

	@Override
	public void prep() {
		System.out.println("prep proxy...");
	}

}
