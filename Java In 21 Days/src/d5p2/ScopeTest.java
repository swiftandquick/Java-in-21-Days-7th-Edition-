package d5p2;

public class ScopeTest {

	int test = 10;
	
	void printTest() {
		/* Local (innermost) variable test overwrites instance variable test.  */
		int test = 20;
		System.out.println("Test:  " + test);
	}
	
	public static void main(String[] args) {
		ScopeTest st = new ScopeTest();
		st.printTest();
	}
	
}
