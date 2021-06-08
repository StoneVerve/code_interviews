import java.util.LinkedList;
import java.util.ListIterator;

public class ProblemTwo{
	
	public static void main(String[] args){
		if(args.length != 1) {
			System.out.println("Please provide the index of the element from last that you wish");
			return;
		}
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0; i<10;i++) {
			list.add(Integer.valueOf(i));
			System.out.println(list.get(i).toString());
		}
		int kth = Integer.parseInt(args[0]);
		Integer kthElement = removeElement(kth, list);
		System.out.println(kthElement.toString());
	}
	
	
	
	private static <T> T removeElement(int kth, LinkedList<T> list){
		ListIterator<T> kPointer = list.listIterator(0);
		ListIterator<T> endPointer = list.listIterator(0);
		for(int i = 1; i<kth;i++) {
			if(endPointer.hasNext())
				endPointer.next();
			else
				return null;
		}
		T kthElement = list.peek();
		while(endPointer.hasNext()){
			endPointer.next();
			kthElement = kPointer.next();
		}
		return kthElement;
	}
}