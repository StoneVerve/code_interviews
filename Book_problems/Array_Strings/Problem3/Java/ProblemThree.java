
public class ProblemThree {
	
	
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Invalid Input, please provide two strings");
			return;
		}
		if (isPermutation(args[0], args[1]))
			System.out.println("The second string is a permutation of the first one");
		else
			System.out.println("The second string is not a permutation of the first one");
	}
	
	/*
	 * The method is case sensitive
	 */
	private static boolean isPermutation(String word1, String word2) {
		if(word1.length() != word2.length())
			return false;
		int stringsSize = word1.length();
		int[] caracters = new int[256];
		int ascciValue;
		for(int i = 0; i < stringsSize; i++){
			ascciValue = (int)word1.charAt(i);
			caracters[ascciValue] = caracters[ascciValue] + 1;
		}
		for(int j=0; j < stringsSize; j++) {
			ascciValue= (int)word2.charAt(j);
			caracters[ascciValue] = caracters[ascciValue] - 1;
			if (caracters[ascciValue] < 0)
				return false;
		}
		for(int i = 0; i < stringsSize; i++) {
			ascciValue= (int)word1.charAt(i);
			if(caracters[ascciValue] != 0)
				return false;
		}
		return true;
	}
	

}