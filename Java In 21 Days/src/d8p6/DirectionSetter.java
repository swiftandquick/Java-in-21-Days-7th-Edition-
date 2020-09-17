package d8p6;

public class DirectionSetter {

	/* Instance variable current.  */
	Compass current;
	
	/* Takes the Compass type variable "WEST" as argument, 
	 * then set current equal to "WEST" (dir).  */
	public void setDirection(Compass dir) {
		current = dir;
	}
	
	public static void main(String[] args) {
		/* Create an object app to call the setDirection() method.  */
		DirectionSetter app = new DirectionSetter();
		/* WEST is one of the variables in enum Compass, call the method setDirection, 
		 * and pass the variable WEST to setDirection.  */
		app.setDirection(Compass.WEST);
		/* Prints out the current variable.  */
		System.out.println(app.current);
	}
	
}
