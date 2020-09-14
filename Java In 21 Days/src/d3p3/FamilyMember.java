package d3p3;

class FamilyMember {

	static String surname = "Mendoza";
	String name;
	int age;
	
	public static void main(String args[]) {
		FamilyMember dad = new FamilyMember();
		
		/* Use object name (dad) to retrieve the surname value.  */
		System.out.println("Family's surname is:  " + dad.surname);

		/* Because surname is a static variable, I can just use the class 
		 * name (FamilyMember) to retrieve the surname value.  Because surname 
		 * is a static variable, it's preferred to use class name to retrieve 
		 * that variable.  */
		System.out.println("Family's surname is:  " + FamilyMember.surname);
	}
	
}
