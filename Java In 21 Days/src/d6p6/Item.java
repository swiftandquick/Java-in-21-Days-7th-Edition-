package d6p6;

/* Implements an interface Comparable, which is used to compare objects.  */ 
public class Item implements Comparable {

	private String id;
	private String name;
	private double retail;
	private int quantity;
	private double price;
	private boolean noDiscount;
	
	/* Constructor sets the instance variables.  */
	Item(String idIn, String nameIn, String retailIn, String qIn, boolean dIn) {
		id = idIn;
		name = nameIn;
		/* Converts String to double.  */
		retail = Double.parseDouble(retailIn);
		/* Converts String to int.  */
		quantity = Integer.parseInt(qIn);
		noDiscount = dIn;
		price = calcPrice(retail, quantity, noDiscount);
	}
		
	
	/* Having implemented Comparable, the compareTo method is 
	 * generated and must be overridden.  This sorting order determines 
	 * how item variables in catalog (LinkedList) is sorted.  Here, 
	 * items are sorted by price from highest to lowest.  */
	@Override
	public int compareTo(Object obj) {
		/* Converts obj (Object) to temp (Item), it's convertible because 
		 * Object is the superclass of all objects.  */
		Item temp = (Item) obj;
		/* If current (this) object's price is less than compared (temp) object's price, 
		 * return 1, and sort the current (this) object below the compared (temp) object.  */
		if (this.price < temp.price) {
			return 1;
		}
		/* If current (this) object's price is more than compared (temp) object's price, 
		 * return -1, and sort the current (this) object above the compared (temp) object.  */
		else if (this.price > temp.price) {
			return -1;
		}
		/* If two objects are equal, return 0.  */
		return 0;
	}

	
	/* Getters.  */
	public String getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public double getRetail() {
		return retail;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public boolean getDiscount() {
		return noDiscount;
	}
	
	
	/* Price calculation does not work.  */
	public double calcPrice(double retailIn, int quantityIn, boolean noDiscountIn) {
		
		double priceR;
		
		/* Calculate the new price according to discount rules if there is a discount (noDiscount = false).  */
		/* Price depends on quantity.  The lower the quantity, the more expensive. */		
		if (noDiscountIn = false) {
			if (quantityIn > 400) {
				priceR = retailIn * 0.5;
			} 
			else if (quantityIn > 200) {
				priceR = retailIn * 0.6;
			} 
			else {
				priceR = retailIn * 0.7;
			}
		}
		/* If there is no discount (noDiscount = true), then set price equal to retail price.  */
		else {
			priceR = retailIn;
		}
		/* Round to 2 decimal places.  */
		priceR = Math.floor(priceR * 100 + 0.5) / 100;
		
		return priceR;
	}
	
}