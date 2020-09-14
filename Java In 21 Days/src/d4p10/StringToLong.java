package d4p10;

public class StringToLong {

	public static void main(String args[]) {
		
		String[] numbers_S = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		int[] numbers_I = new int[numbers_S.length];
		
		for (int i = 0; i < numbers_S.length; i++) {
			switch (numbers_S[i]) {
				case "one":
					numbers_I[i] = 1;
					break;
				case "two":
					numbers_I[i] = 2;
					break;
				case "three":
					numbers_I[i] = 3;
					break;
				case "four":
					numbers_I[i] = 4;
					break;
				case "five":
					numbers_I[i] = 5;
					break;
				case "six":
					numbers_I[i] = 6;
					break;
				case "seven":
					numbers_I[i] = 7;
					break;
				case "eight":
					numbers_I[i] = 8;
					break;
				case "nine":
					numbers_I[i] = 9;
					break;
				case "ten":
					numbers_I[i] = 10;
					break;
				default:
					break;
			}
		}
		
		for (int i = 0; i < numbers_I.length; i++) {
			System.out.print(numbers_I[i] + " ");
		}
	}
	
}
