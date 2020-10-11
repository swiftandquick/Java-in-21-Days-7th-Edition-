package d16p6;

public class ClassType {

	public static void main(String[] args) {
		/* Creates an object of String type.  */
		Class c = String.class;
		try {
			/* newInstance() is used to create a new instance of that class.  
			 * Object is the superclass of String, so I instantiate o as 
			 * String type as well.  */
			Object o = c.newInstance();
			/* Tests whether the object is an instance of the specified type 
			 * (class, subclass, or interface).  */
			if (o instanceof String) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}