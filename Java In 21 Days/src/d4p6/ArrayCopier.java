package d4p6;

class ArrayCopier {

	public static void main(String[] args) {
		int[] array1 = { 7, 4, 8, 1, 4, 1, 4};
		/* Since we are copying array1 onto array2, they have the same size.  */
		float[] array2 = new float[array1.length];
		
		System.out.print("array1:  [ ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println("]");
		
		/* array2 copies indices from array1.  */
		System.out.print("array2:  [ ");
		int count = 0;
		/* Copy values until there is an index with value of 1.  */
		while (count < array1.length && array1[count] != 1) {
			/* Convert int to float.  */
			array2[count] = (float) array1[count];
			System.out.print(array2[count++] + " ");
		}
		System.out.println("]");
	}
	
}
