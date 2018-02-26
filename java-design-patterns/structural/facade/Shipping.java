package facade;

public class Shipping {
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
	
	public boolean shipOrder(){
		System.out.println("order has been shipped to "+user+" at "+address);
		System.out.println(order.toString());
		return true;
	}
}
