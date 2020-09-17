package d7p3;

import java.io.IOException;

public class throwAndThrows {
	
	public static void main(String[] args) {
		int[] ages = { 12, 14, 22, 25 };
		
		for (int age : ages) {
			try {
				if (age < 18) {
					/* Even though it's not an ArithmeticException, I create a condition 
					 * where I can make it an exception when age < 18.  */
					throw new ArithmeticException();
				}
				else {
					System.out.println("Eligible for voting.  ");
				}
			}
			/* Catches the thrown exception.  */
			catch (ArithmeticException e) {
				System.out.println("Not old enough to vote.  ");
			}
		}
		
		int[] ages2 = { 17, 28, 53, 77 };
		
		for (int age2 : ages2) {
			try {
				checkAge(age2);
			}
			/* Catches the exceptions that are from the checkAge() method.  */
			catch(ArithmeticException e) {
				System.out.println("You are young.  ");
			}
			catch(IOException e) {
				System.out.println("You are not young and not old.  ");
			}
		}
	}
	
	/* Unlike "throw", "throws" is used in the method.  I can throw multiple exceptions with throws.  */
	public static void checkAge(int age2) throws ArithmeticException, IOException {
		/* age2 less than 18 will throw IOException.  */
		if (age2 < 18) {
			throw new ArithmeticException();
		}
		/* age2 between 18 and 60 will throw IOException.  */
		else if (age2 >= 18 && age2 <= 60) {
			throw new IOException();
		}
		/* Otherwise, just print out the statement.  */
		else {
			System.out.println("You are old.  ");
		}
	}

}
