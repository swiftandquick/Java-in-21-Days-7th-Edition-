package d6p4;

public class GiftShop {

	public static void main(String[] args) {
		
		/* Creates the object store with the instance of Storefront.  */
		Storefront store = new Storefront();
		
		/* Object store calls the addItem method.  */
		store.addItem("C01", "MUG", "9.99", "150");
		store.addItem("C02", "LG MUG", "12.99", "82");
		store.addItem("C03", "MOUSEPAD", "10.49", "800");
		store.addItem("D01", "T SHIRT", "16.99", "90");
		
		/* Object store calls the sort method.  */
		store.sort();
		
		for (int i = 0; i < store.getSize(); i++) {
			/* Gets the item of a specific index from catalog, a LinkedList.  
			 * Equate the Item object with getItem() method.  */
			Item show = (Item) store.getItem(i);
			/* Use getters to retrieve each item's instance variables.  */
			System.out.println("\nItem ID:  " + show.getId() + 
					"\nName:  " + show.getName() + 
					"\nRetail Price:  $" + show.getRetail() + 
					"\nPrice:  $" + show.getPrice() + 
					"\nQuantity:  " + show.getQuantity());
		}
	}
	
}
