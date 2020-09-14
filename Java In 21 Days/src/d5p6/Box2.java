package d5p6;

import java.awt.Point;

public class Box2 {

	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	Box2(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/* Method overloading, same method but different argument.  
	 * Set current object's attributes (x1, y1, x2, y2) equivalent to 
	 * topLeft.x, topLeft.y, bottomRight.x, bottomRight.y respectively.  */
	Box2(Point topLeft, Point bottomRight) {
		this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
	}

	Box2(Point topLeft, int w, int h) {
		this(topLeft.x, topLeft.y, topLeft.x + w, topLeft.y + h);
	}
	
	void printBox() {
		System.out.print("Box:  <" + x1 + ", " + y1);
		System.out.println(", " + x2 + ", " + y2 + ">");
	}
	
	public static void main(String[] args) {
		Box2 rect;
		
		System.out.println("Calling Box2 with coordinates (25, 25) and (50, 50):  ");
		/* Unlike Box.java.  Here, I create constructor and pass argument rather than calling method.  */
		rect = new Box2(25, 25, 50, 50);
		rect.printBox();
		
		System.out.println("\nCalling Box2 with points (10, 10) and (20, 20):  ");
		/* Create anonymous objects with new keyword.  Example:  new Point(10, 10).  */
		rect = new Box2(new Point(10, 10), new Point(20, 20));
		rect.printBox();
		
		System.out.println("\nCalling Box2 with 1 point (10, 10), width 50 and height 50:  ");
		rect = new Box2(new Point(10, 10), 50, 50);
		rect.printBox();
	}
	
}
