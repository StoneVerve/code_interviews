public class ProblemFive{
	
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Please provide a string to compress");
			return;
		}
		String compressedString = compressString(args[0]);
		System.out.println(compressedString);
	}
	
	
	private static String compressString(String string){
		StringBuilder compressedString = new StringBuilder();
		int stringSize = string.length();
		char currentChar = string.charAt(0);
		int i = 0;
		int apparitions = 0;
		while(i < stringSize) {
			if(string.charAt(i) == currentChar){
				apparitions++;
			} else {
				compressedString.append(currentChar);
				compressedString.append(Integer.toString(apparitions));
				currentChar = string.charAt(i);
				apparitions = 1;
				// If the size of the compressed String is bigger than the original we return the original string
				if(compressedString.length() >= stringSize)
					return string;
			}
			i++;
		}
		compressedString.append(currentChar);
		compressedString.append(Integer.toString(apparitions));
		return compressedString.toString();
	}
	
}