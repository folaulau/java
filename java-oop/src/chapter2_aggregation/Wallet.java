package chapter2_aggregation;

public class Wallet {
	@Override
	public String toString() {
		return "Wallet [money=" + this.money.toString() + ", brand=" + this.brand + ", compartment=" + this.compartment + "]";
	}

	private Money money;
	private String brand;
	private int compartment;

	public Wallet(final Money money, final String brand, final int compartment) {
		super();
		this.money = money;
		this.brand = brand;
		this.compartment = compartment;
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Money getMoney() {
		return this.money;
	}

	public void setMoney(final Money money) {
		this.money = money;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(final String brand) {
		this.brand = brand;
	}

	public int getCompartment() {
		return this.compartment;
	}

	public void setCompartment(final int compartment) {
		this.compartment = compartment;
	}

}
