package facade;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Item> items;
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	public void addItem(Item item) {
		if(this.items==null) this.items = new ArrayList<>();
		
		this.items.add(item);
	}

	
	@Override
	public String toString() {
		return "Order [items=" + items+"]";
	}
}
