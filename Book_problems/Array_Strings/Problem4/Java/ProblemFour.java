public class ProblemFour{
		
	
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Please provide a word and the number of spaces");
			return;
		}
		String output = replaceSpaces(args[0], Integer.parseInt(args[1]));
		System.out.println(output);
	}
	
	/*
	 * The method works on the assumption that the number of spaces provided is accurate
	 */
	private static String replaceSpaces(String string, int numSpaces){
		int phraseSize = string.length();
		char[] formatedString = new char[phraseSize + (2*numSpaces)];
		char[] phrase = string.toCharArray();
		int readerCounter = phraseSize - 1;
		int writerCounter = phraseSize + (2*numSpaces) -1;
		char currentChar;
		for(int i=0; i < phraseSize; i++) {
			currentChar = phrase[readerCounter - i];
			if (currentChar == ' ') {
				formatedString[writerCounter - i] = '0';
				formatedString[writerCounter - 1 - i] = '2';
				formatedString[writerCounter - 2 - i] = '%';
				writerCounter -= 2;
			} else {
				formatedString[writerCounter -i] = currentChar;
			}
		}
		return new String(formatedString);
	}
}