package facade;
/**
 * The customer has no idea what is going on in the background.
 * CustomerFacade provides an interface between customers and their orders. 
 * Customers do not have to know about Order class, Billing class, or Shipping class. They only know 
 * what the facade can do. 
 * @author fkaveinga
 *
 */
public class CustomerFacadeService implements CustomerFacade {
	
	private Order order;
	private Billing billing;
	private Shipping shipping;
	
	public CustomerFacadeService() {
		order = new Order();
		billing = new Billing();
		shipping = new Shipping();
	}

	@Override
	public void pickItem(Item item) {
		System.out.println("pick item, "+item.getName());
		order.addItem(item);
	}

	@Override
	public void buyItems() {
		System.out.println("buy items");
		order.getItems().forEach(System.out::println);
		billing.setOrder(order);
		billing.setUser("Folau Kaveinga");
		billing.setAddress("123 iate rd, El Segundo CA.");
		
		billing.charge();
	}

	@Override
	public void getItems() {
		System.out.println("get items");
		order.getItems().forEach(System.out::println);
		shipping.setOrder(order);
		shipping.setUser(billing.getUser());
		shipping.setAddress(billing.getAddress());
		shipping.shipOrder();
	}
}
