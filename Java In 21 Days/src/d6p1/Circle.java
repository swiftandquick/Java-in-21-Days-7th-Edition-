package d6p1;

public class Circle {

	/* Class variable.  */
	public static double PI = 3.14159265F;
	
	/* Instance variable.  */
	public double radius;
	
	public double area() {
		radius = 5;
		return PI * radius * radius;
	}
	
	public static void main(String args[]) {
		Circle circle = new Circle();
		System.out.println(circle.area());
	}
	
}
