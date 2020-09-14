package d6p2;

public class InstanceCounter {

	/* Private class variables used to count how many objects created, starts at 0.  */
	private static int numInstances = 0;
	
	/* Because it's called from a static method (main method), so this method is also static.  */
	protected static int getCount() {
		return numInstances;
	}
	
	/* Because it's called from a static method (main method), so this method is also static.  */
	private static void addInstance() {
		numInstances++;
	}
	
	/* Constructor adds 1 to numInstances every time it's called.  */
	InstanceCounter() {
		InstanceCounter.addInstance();
	}
	
	public static void main(String[] args) {
		System.out.println("Starting with " + InstanceCounter.getCount() + " objects.  ");
		/* ++i means i is returned after incrementing.  */
		for (int i = 0; i < 500; ++i) {
			/* Creates an object for each iteration.  */
			new InstanceCounter();
		}
		System.out.println("Created " + InstanceCounter.getCount() + " objects.  ");
	}
	
}
