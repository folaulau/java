package chapter2_aggregation;

public class Money {
	@Override
	public String toString() {
		return "Money [currency=" + this.currency + ", amount=" + this.amount + "]";
	}

	private String currency;
	private int amount;

	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Money(final String currency, final int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(final int amount) {
		this.amount = amount;
	}

}
