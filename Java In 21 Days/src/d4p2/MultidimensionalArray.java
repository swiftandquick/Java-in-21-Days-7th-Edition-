package d4p2;

public class MultidimensionalArray {

	public static void main(String args[]) {
		int[][][] cen = new int[100][52][7];
		System.out.println("Elements in 1st dimension:  " + cen.length);
		System.out.println("Elements in 2nd dimension:  " + cen[0].length);
		System.out.println("Elements in 3rd dimension:  " + cen[0][0].length);
	}
	
}
