package d5p1;

public class RangeLister {

	/* Takes two int variables, returns an array.  */
	int[] makeRange(int lower, int upper) {
		int[] range = new int[(upper - lower) + 1];
		for (int i = 0; i < range.length; i++) {
			range[i] = lower++;
		}
		return range;
	}
	
	public static void main(String[] args) {
		int[] range;
		/* Create a object of RangeLister instance, lister.  */
		RangeLister lister = new RangeLister();		
		/* Set the empty range of the array equal the returned array from makeRange method.  */
		range = lister.makeRange(4, 13);
		System.out.print("The array:  [ ");
		for (int i = 0; i < range.length; i++) {
			System.out.print(range[i] + " ");
		}
		System.out.println("]");
	}
	
}
