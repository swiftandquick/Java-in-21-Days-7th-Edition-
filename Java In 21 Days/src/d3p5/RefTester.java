package d3p5;

import java.awt.Point;

class RefTester {

	public static void main(String[] args) {
		Point pt1, pt2;
		
		/* Set p1's x and y to 100.  */
		pt1 = new Point(100, 100);
		
		/* Creates reference from pt2 to pt1 rather than the other way around.  */
		pt2 = pt1;
		
		System.out.println("Point 1:  " + pt1.x + ", " + pt1.y);
		System.out.println("Point 2:  " + pt2.x + ", " + pt2.y);
		
		
		/* Set attributes x and y of pt1 to 200, since pt2 is a reference to pt1, 
		 * the variable changes as well.  */
		pt1.x = 200;
		pt1.y = 200;
		
		System.out.println("Point 1:  " + pt1.x + ", " + pt1.y);
		System.out.println("Point 2:  " + pt2.x + ", " + pt2.y);
		
		
		/* When pt2 changes, pt1 changes as well.  */
		pt2.x = 300;
		pt2.y = 300;
		
		System.out.println("Point 1:  " + pt1.x + ", " + pt1.y);
		System.out.println("Point 2:  " + pt2.x + ", " + pt2.y);
	}
	
}
