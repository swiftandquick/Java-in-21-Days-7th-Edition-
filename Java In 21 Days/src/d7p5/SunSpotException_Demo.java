package d7p5;

public class SunSpotException_Demo {

	public static void main(String[] args) {
		int n = 5;
		
		try {
			if (n == 5) {
				/* Throws my custom exception.  */
				throw new SunSpotException();
			}
			else {
				System.out.println("n != 5");
			}
		}
		/* Catches my custom exception.  */
		catch (SunSpotException e) {
			System.out.println("n = 5");
		}
	}
	
}
