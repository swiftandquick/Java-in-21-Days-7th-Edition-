package d3p6;

class EqualsTester {
	
	public static void main(String[] args) {
		String str1, str2;
		str1 = "Boy, that escalated quickly.  ";
		str2 = str1;
		
		/* str1 and str2 are String literal, so they are equal.  */
		System.out.println("String1:  " + str1);
		System.out.println("String1:  " + str2);
		System.out.println("Same object?  " + (str1 == str2));
		
		str2 = new String(str1);
		
		System.out.println("String1:  " + str1);
		System.out.println("String2:  " + str2);
		System.out.println("Same object?  " + (str1 == str2));
		System.out.println("Same value?  " + (str1.equals(str2)));
		
		/* "Texas" is a subclass of String, returns true.  */
		boolean check1 = "Texas" instanceof String;
		System.out.println(check1);
		
		/* obiwan isn't a subclass of String, return false.  */
		Object obiwan = new Object();
		boolean check2 = obiwan instanceof String;
		System.out.println(check2);
	}

}
