package facade;

public class Billing {
	private Order order;
	private String user;
	private String address;
	
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean charge(){
		System.out.println("order has been placed.");
		System.out.println(order.toString());
		return true;
	}
}
