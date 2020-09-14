package d2p2;

public class Weather {

	public static void main(String[] args) {
		float fah = 86;
		System.out.println(fah + " degrees Fahrenheit is ...");
		
		/* To convert Fahrenheit into Celsius.  */
		System.out.println(((fah - 32) / 9 * 5) + " degrees Celsius.  \n");
		
		float cel = 33;
		System.out.println(cel + " degrees Celsius is ...");
		
		/* To convert Celsius to Fahrenheit.  */
		System.out.println((cel * 9 / 5 + 32) + " degrees Fahrenheit.  \n");
	}
	
}
