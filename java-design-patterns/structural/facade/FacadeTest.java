package facade;

public class FacadeTest {

	public static void main(String[] args) {
		CustomerFacade facade = new CustomerFacadeService();

		facade.pickItem(new Item("sdf8sdf", "131354654213", "Soap", 12.15));
		facade.pickItem(new Item("dfsd333", "131323334113", "Cereal", 5.56));
		facade.pickItem(new Item("523sdfs", "132323232313", "Shoes", 30.50));

		System.out.println();
		facade.buyItems();

		System.out.println();
		facade.getItems();
	}

}
