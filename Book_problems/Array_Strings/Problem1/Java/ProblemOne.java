public class ProblemOne {
	
	// The string is in ASCII
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Invalid input, please enter a String in ASCII format");
			return;
		}
		if(isUnique(args[0]))
			System.out.println("The String contains only unique characters");
		else
			System.out.println("The String contains at least on duplicate");
	}
	
	
	private boolean isUnique(String word) {
		boolean[] characters = boolean[256];
		int wordLength = word.length();
		int asciiValue;
		for(int i = 0; i < wordLength; i++) {
			asciiValue = (int)word.charAt(i);
			if (characters[asciiValue])
				return false;
			else
				characters[asciiValue] = true;
		}
		return true;
	}
	
	

}