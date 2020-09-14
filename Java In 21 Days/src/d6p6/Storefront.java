package d6p6;

import java.util.*;

public class Storefront {

	/* A LinkedList used to store items.  */
	private LinkedList<Item> catalog = new LinkedList<Item>();
	
	
	public void addItem(String id, String name, String price, String quant, boolean noDiscount) {
		/* Creates an item object with instance of Item class, call the Item constructor
		 	and passes in id, name, price, and quant as arguments.  */
		Item item = new Item(id, name, price, quant, noDiscount);
		/* Adds the item object to the LinkedList catalog.  */
		catalog.add(item);
	}
	
	
	public Item getItem(int i) {
		/* Returns the item of a specific index.  */
		return (Item) catalog.get(i);
	}
	
	
	public int getSize() {
		return catalog.size();
	}
	
	
	public void sort() {
		Collections.sort(catalog);
	}
	
}
