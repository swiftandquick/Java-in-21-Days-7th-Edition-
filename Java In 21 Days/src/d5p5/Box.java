package d5p5;

import java.awt.Point;

class Box {

	/* Instance variables.  */
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;
	
	Box buildBox(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		return this; /* this is current object, which is Box.  */
	}
	
	/* Method overloading, same name, different signature because different arguments.  */
	Box buildBox(Point topLeft, Point bottomRight) {
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = bottomRight.x;
		y2 = bottomRight.y;
		return this;
	}
	
	/* Another way to set up the Box attributes with width and height.  */
	Box buildBox(Point topLeft, int w, int h) {
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = (x1 + w);
		y2 = (y1 + h);
		return this;
	}
	
	void printBox() {
		System.out.print("Box:  <" + x1 + ", " + y1);
		System.out.println(", " + x2 + ", " + y2 + ">");
	}
	
	public static void main(String[] arg) {
		Box rect = new Box();
		
		System.out.println("Calling buildBox with coordinates (25, 25) and (50, 50):  ");
		/* Call the first buildBox method, the method that takes 4 int variables as argument.  */
		rect.buildBox(25, 25, 50, 50);
		rect.printBox();
		
		System.out.println("\nCalling buildBox with points (10, 10) and (20, 20):  ");
		/* Point is an imported class with public attributes of x and y.  
		 * Call the second buildBox method, the method that takes 2 Point variables as argument.  */
		rect.buildBox(new Point(10, 10), new Point(20, 20));
		rect.printBox();
		
		System.out.println("\nCalling buildBox with point (10, 10), width 50, and height 50:  ");
		/* Call the third buildBox method, the method that takes one Point variable and two int variables as argument.  */
		rect.buildBox(new Point(10, 10), 50, 50);
		rect.printBox();
	}
	
}