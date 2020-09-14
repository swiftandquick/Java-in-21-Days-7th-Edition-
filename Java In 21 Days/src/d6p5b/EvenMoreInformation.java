package d6p5b;

import d6p5a.*;

/* Inherits duration, rate, and quantity from MoreInformation, 
 * float cannot be inherited because it's a default instance variables.  
 * Default variables cannot be inherited by any classes outside of the same package.  */
public class EvenMoreInformation extends MoreInformation {

	public int quantity = 9;

	EvenMoreInformation() {
		super();
		int i1 = duration;
		float i2 = rate;
		// float i3 = average;
	}
	
}
