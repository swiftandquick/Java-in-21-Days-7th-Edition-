package d5p9;

class BigValue {

	float result;
	
	public BigValue(int a, int b) {
		/* Step 3:  Constructor calls method calculateResult.  
		 * Step 5:  Sets result as 26.  */
		result = calculateResult(a, b);
	}
	
	/* calculateResult takes a and b (2 and 3) as argument as returns 26 as result.  */
	float calculateResult(int a, int b) {
		return (a * 10) + (b * 2);
	}
	
	public static void main(String[] args) {
		/* Step 1:  Calls the constructor BiggerValue passes 2, 3, 4 as arguments.  */
		BiggerValue bgr = new BiggerValue(2, 3, 4);
		/* The object bgr of the inst ance BiggerValue calls for the instance attribute 
		 * result, which will print out 312.  */
		System.out.println("The result is " + bgr.result);
	}
	
}
