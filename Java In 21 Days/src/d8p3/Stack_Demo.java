package d8p3;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<String>();
		
		s.push("One");
		s.push("Two");
		s.push("Three");
		s.push("Four");
		s.push("Five");
		s.push("Six");
		
		/* Gets and removes the top element, which is "Six".  */
		String s1 = s.pop();
		System.out.println(s1);
		
		/* Gets and removes the top element, which is "Five".  */
		String s2 = s.pop();
		System.out.println(s2);
		
		/* Gets but does not remove the top element, which is "Four".  */
		String s3 = s.peek();
		System.out.println(s3);
		
		/* Since "Two" is the third element from the top, search() will return 3.  */
		int i = s.search("Two");
		System.out.println(i);
		
		/* "Seven" is not in the stack, so search() will return -1.  */
		int j = s.search("Seven");
		System.out.println(j);
		
	}
	
}
