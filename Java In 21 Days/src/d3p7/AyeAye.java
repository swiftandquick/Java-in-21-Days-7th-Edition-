package d3p7;

public class AyeAye {

	int i = 40;
	int j;
	
	public AyeAye() {
		setValue(i++);
	}
	
	void setValue(int inputValue) {
		/* Regardless of what happened outside, i is set to 20 here, so value of j is 21.  */
		int i = 20;
		j = i + 1;
		System.out.println("j = " + j);
	}
	
	public static void main(String args[]) {

		new AyeAye();
	}
	
}
