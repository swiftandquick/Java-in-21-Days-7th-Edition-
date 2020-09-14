package d6p4;

import java.util.*;

public class Storefront {

	/* A LinkedList used to store items.  */
	private LinkedList<Item> catalog = new LinkedList<Item>();
	
	
	public void addItem(String id, String name, String price, String quant) {
		/* Creates an item object with instance of Item class, call the Item constructor
		 	and passes in id, name, price, and quant as arguments.  */
		Item item = new Item(id, name, price, quant);
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
		/* Sorts a data structure based on natural order.  Keep in mind that catalog contains item, 
		 * and it's impossible to sort by items, so we need to sort by the item's attribute(s).  
		 * compareTo() method is Item.java determines the sorting order.  */
		Collections.sort(catalog);
	}
	
}
