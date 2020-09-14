package d4p7;

public class LabeledLoop {

	public static void main(String args[]) {
		
		/* The for loop's name is out.  */
		out:  for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				/* If product of i and j > 400, then break the for loop out.  */
				if (i * j > 400) {
					break out;
				}
				/* If i or j is 0, skips an iteration.  */
				if (i == 0 || j == 0) {
					continue;
				}
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}
	}
	
}
