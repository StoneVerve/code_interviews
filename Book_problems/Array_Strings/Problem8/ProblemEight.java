public class ProblemEight {
	
	
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Incorrect Input, please provide two strings");
			return;
		}
		if(isRotation(args[0], args[1]))
			System.out.println("The String " + args[1] + " is a rotation of string " + args[0]);
		else
			System.out.println("The String " + args[1] + " is not a rotation of string " + args[0]);		
	}
	
	private static boolean isRotation(String phrase, String phraseRotated) {
		char startChar = phrase.charAt(0);
		int phraseSize = phrase.length();
		char endChar = phrase.charAt(phraseSize - 1);
		for(int i=0; i<(phraseSize-1); i++){
			if(phraseRotated.charAt(i) == endChar && 
			phraseRotated.charAt(i+1) == startChar) {
				String start = phraseRotated.substring(i+1);
				String end = phraseRotated.substring(0, i);
				return phrase.contains(start + end);
			}
		}
		if(phraseRotated.charAt(0) == startChar &&
		phraseRotated.charAt(phraseSize-1) == endChar){
			return phrase.contains(phraseRotated);
		}
		return false;
	}
			   
}