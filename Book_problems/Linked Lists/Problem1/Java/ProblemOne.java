import java.util.LinkedList;
import java.util.ListIterator;
import java.util.HashMap;

public class ProblemOne{
	
	
	public static void main(String[] args){
		LinkedList<Integer> list = new LinkedList<>();
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(2));
		list.add(Integer.valueOf(2));
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(5));
		list = removeDuplicates(list);
		for(Integer num: list)
			System.out.println(num.toString());
	}
	
	
	private static <T> LinkedList<T> removeDuplicates(LinkedList<T> list){
		ListIterator<T> iterator = list.listIterator(1);
		HashMap<T,Boolean> table = new HashMap<>();
		Boolean seen;
		T element = list.element();
		while(iterator.hasNext()){
			seen = table.get(element);
			if(seen == null)
				table.put(element, Boolean.valueOf(true));
			else if (seen.booleanValue()){
				iterator.remove();
			} else
				table.replace(element, Boolean.valueOf(true));
			element = iterator.next();
		}
		return list;
	}
	
	
}