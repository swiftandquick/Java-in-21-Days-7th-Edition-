package d5p11;

import java.awt.Point;

public class FourPoint extends Point {

	int z, t;
	
	FourPoint(int x, int y, int z, int t) {
		/* Calls the constructor of superclass and pass in x and y variable.  */
		super(x, y);
		this.z = z;
		this.t = t;
	}
	
	/* Overloading constructor, this one takes in a Point object as argument as well.  */
	FourPoint(Point p, int z, int t) {
		super(p.x, p.y);
		this.z = z;
		this.t = t;
	}
	
	public String toString() {
		return "[x = " + x + ", y = " + y + ", z " + z + ", t = " + t + "]";
	}
	
	public static void main(String[] args) {
		FourPoint fp = new FourPoint(4, 2, 5, 8);
		System.out.println(fp);
		
		FourPoint fp2 = new FourPoint(new Point(6, 3), 7, 1);
		System.out.println(fp2);
	}
	
}
