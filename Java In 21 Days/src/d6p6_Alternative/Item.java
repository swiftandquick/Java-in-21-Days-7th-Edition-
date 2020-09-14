package d6p6_Alternative;

public class Item implements Comparable {
    private final String id;
    private final String name;
    private final double retail;
    private final int quantity;
    private double price;
    private final boolean noDiscount;

    Item(String idIn, String nameIn, String retailIn, String quanIn, String discountIn) {
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(quanIn);
        noDiscount = discountIn.equals("TRUE");
        
        if (quantity > 400) {
            price = retail * .5D;
        } else if (quantity > 200) {
            price = retail * .6D;
        } else {
            price = retail * .7D;
        }
        price = Math.floor( price * 100 + .5 ) / 100;
        if (noDiscount) {
            price = retail;
        }
    }

    public int compareTo(Object obj) {
        Item temp = (Item)obj;
        if (this.price < temp.price) {
            return 1;
        } else if (this.price > temp.price) {
            return -1;
        }
        return 0; 
    }

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
}