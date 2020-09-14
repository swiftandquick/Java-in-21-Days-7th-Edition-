package d4p1;

class HalfDollars {

	public static void main(String args[]) {
		int[] denver = { 1_700_000, 4_600_000, 2_100_000 };
		/* Size of philadelphia and total arrays is the same as denver array.  */
		int[] philadelphia = new int[denver.length];
		int[] total = new int[denver.length];
		
		int average;
		
		/* Assigning value to each philadelphia index.  */
		philadelphia[0] = 1_800_000;
		philadelphia[1] = 5_000_000;
		philadelphia[2] = 2_500_000;
		
		/* Assigning value to each total index.  */
		total[0] = denver[0] + philadelphia[0];
		total[1] = denver[1] + philadelphia[1];
		total[2] = denver[2] + philadelphia[2];
		average = (total[0] + total[1] + total[2]) / 3;
		
		System.out.print("2012 production:  ");
		System.out.format("%,d%n", total[0]);
		System.out.print("2013 production:  ");
		System.out.format("%,d%n", total[1]);
		System.out.print("2014 production:  ");
		System.out.format("%,d%n", total[2]);
		System.out.print("Average production:  ");
		System.out.format("%,d%n", average);
	}
	
}
