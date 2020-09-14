package d3p4;

class StringChecker {

	public static void main(String[] args) {
		String str = "A Lannister always pays his debts";
		
		/* str is the object, and everything after "." is method related to the class String.  */
		System.out.println("The string is:  " + str);
		System.out.println("The length of this string:  " + str.length());
		System.out.println("The character at position 6:  " + str.charAt(6));
		System.out.println("The substring from 12 5to 18:  " + str.substring(12, 18));
		System.out.println("The index of the first 't':  " + str.indexOf('t'));
		System.out.println("The index of the beginning of the " + "substring \"debts\":  " + str.indexOf("debts"));
		System.out.println("The string in uppercase:  " + str.toUpperCase());
		
		int accountBalance = 5005;
		/* Convert to money format.  */
		System.out.format("Balance:  $%,d%n", accountBalance);
		
		double pi = Math.PI;
		/* Round to 11th decimal places.  */
		System.out.format("%.11f%n", pi);

	}
	
}
