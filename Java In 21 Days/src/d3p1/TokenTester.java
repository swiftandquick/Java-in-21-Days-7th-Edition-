package d3p1;

import java.util.StringTokenizer;

class TokenTester {

	public static void main(String[] args) {
		
		/* Divides string into tokens by applying a character or characters as a limiter.  
		 * StringTokenizer is an object.  */
		StringTokenizer st1, st2;
		
		String quote1 = "GOOG 530.80 -9.98";
		/* Token is separate by " ".  */
		st1 = new StringTokenizer(quote1);
		
		/* nextToken() is a method from StringTokenizer class.  */
		System.out.println("Token 1:  " + st1.nextToken());
		System.out.println("Token 2:  " + st1.nextToken());
		System.out.println("Token 3:  " + st1.nextToken());
		
		String quote2 = "RHT@75.00@0.22";
		/* Token is separate by "@".  */
		st2 = new StringTokenizer(quote2, "@");

		System.out.println("Token 1:  " + st2.nextToken());
		System.out.println("Token 2:  " + st2.nextToken());
		System.out.println("Token 3:  " + st2.nextToken());
	}
	
}
