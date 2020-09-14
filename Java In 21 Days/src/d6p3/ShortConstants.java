package d6p3;

/* I import static members from the Math class.  */
import static java.lang.Math.*;

public class ShortConstants {

	public static void main(String[] args) {
		/* Because PI is a member from the Math class, it can be accessed 
		 * here without using Math class to call the variable.  */
		System.out.println("PI:  " + PI);
		System.out.println("" + (PI * 3));
	}
	
}
