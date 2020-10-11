package d17p7;

import java.nio.*;

public class ReadTemps {

	public static void main(String[] args) {
		int[] temperatures = { 78, 80, 75, 70, 79, 85, 92, 99, 90 };
		IntBuffer tempBuffer = IntBuffer.wrap(temperatures);
		/* moreTemperatures puts 3 integers in place of the first three positions of the 
		 * buffer, which means the String became {65, 44, 74, 70 ... }.  In short, 65, 44, 
		 * and 71 replaces 78, 80, and 75.  So currently, the buffer is in index 3, when 
		 * get() is called, return the next int, which is 70.  */
		int[] moreTemperatures = { 65, 44, 71 };
		tempBuffer.put(moreTemperatures);
		System.out.println("First int:  " + tempBuffer.get());
	}
	
}
