import java.util.LinkedList;
import java.util.ListIterator;

public class ProblemFive{
	
	
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("Please input two integer numbers to calculate the sum");
			return;
		}
		LinkedList<Integer> first = new LinkedList<>();
		LinkedList<Integer> second = new LinkedList<>();
		String firstNumber = args[0];
		String secondNumber = args[1];
		for(int i = 0; i < firstNumber.length(); i++){
			first.addFirst(Integer.valueOf(firstNumber.charAt(i) - '0'));
		}
		for(int i=0; i<secondNumber.length(); i++){
			second.addFirst(Integer.valueOf(secondNumber.charAt(i) - '0'));
		}
		LinkedList<Integer> sum = add(first, second);
		ListIterator<Integer> iterator = sum.listIterator(0);
		while(iterator.hasNext())
			System.out.println(iterator.next().toString());
	}
	
	
	private static LinkedList<Integer> add(LinkedList<Integer> first, LinkedList<Integer> second) {
		int sumDigit = 0;
		int extra = 0;
		int sum = 0;
		LinkedList<Integer> result = new LinkedList<>();
		ListIterator<Integer> firstSumand = first.listIterator(0);
		ListIterator<Integer> secondSumand = second.listIterator(0);
		while(firstSumand.hasNext() && secondSumand.hasNext()){
			sum = (firstSumand.next()).intValue() + (secondSumand.next()).intValue() + extra;
			sumDigit = sum % 10;
			extra = sum / 10;
			result.add(Integer.valueOf(sumDigit));
		}
		if(firstSumand.hasNext())
			result.addAll(addRest(firstSumand, extra));
		else if(secondSumand.hasNext())
			result.addAll(addRest(secondSumand, extra));
		else if(extra != 0)
			result.add(Integer.valueOf(extra));
		return result;
		
	}
	
	
	private static LinkedList<Integer> addRest(ListIterator<Integer> sumand, int extra){
		LinkedList<Integer> result = new LinkedList<Integer>();
		int digit = 0;
		int sum = 0;
		while(sumand.hasNext()){
			sum = (sumand.next()).intValue() + extra;
			digit = sum % 10;
			extra = sum / 10;
			result.add(Integer.valueOf(digit));
		}
		return result;
	}
	
}
		
		