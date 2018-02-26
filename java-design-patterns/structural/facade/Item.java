package facade;

public class Item {
	String id;
	String barcode;
	String name;
	double price;
	
	
	public Item(String id, String barcode, String name, double price) {
		super();
		this.id = id;
		this.barcode = barcode;
		this.name = name;
		this.price = price;
	}
	
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", barcode=" + barcode + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
