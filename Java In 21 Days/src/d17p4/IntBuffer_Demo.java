package d17p4;

import java.nio.*;

public class IntBuffer_Demo {

	public static void main(String[] args) {
		
		int[] temps = { 90, 85, 87, 78, 80, 75, 70, 79, 85, 92, 99 };

		/* Creates a tempBuffer object with IntBuffer instance, the size is equivalent 
		 * to the size of the temps array via allocate(int).  */
		IntBuffer tempBuffer = IntBuffer.allocate(temps.length);
		
		/* Converts fahrenheit to celsius, then stores the current celsius value at 
		 * the current position of tempBuffer via put(int).  */
		for (int i = 0; i < temps.length; i++) {
			float celsius = ((float) (temps[i] - 32) / 9 * 5);
			tempBuffer.put((int) celsius);
		}
		
		/* Reset tempBuffer's current position to 0, which is at the start.  */		
		tempBuffer.position(0);

		/* Prints out tempBuffer elements, starting from position 0.  */
		for (int i = 0; tempBuffer.remaining() > 0; i++) {
			System.out.println(tempBuffer.get());
		}
		
	}
	
}
