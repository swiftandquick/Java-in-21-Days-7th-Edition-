package d5p9;

public class BiggerValue extends BigValue {

	BiggerValue(int a, int b, int c) {
		/* Step 2:  Calls the constructor BigValue and passes a and b (2 and 3) as arguments.  */
		super(a, b);
		/* Step 6:  Calls calculateResult in this class (BiggerValue), passes in 4 as argument.  */
		/* Step 8:  Since result is not a private variable, it can be used in the subclass.  
		 * New result is set equal to 312.  */
		result = calculateResult(c);
	}
	
	/* Step 7:  Current result is 26, returns (4 * 3) * 26, which is 312.  */
	float calculateResult(int c) {
		return (c * 3) * result;
	}
	
}
