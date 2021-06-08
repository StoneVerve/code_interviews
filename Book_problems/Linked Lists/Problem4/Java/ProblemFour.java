public class ProblemFour{
	
	
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Please enter a number between 0 and 9");
			return;
		}
		Node list = new Node(0);
		list.appendToLast(4);
		list.appendToLast(5);
		list.appendToLast(9);
		list.appendToLast(1);
		list.appendToLast(24);
		list.appendToLast(56);
		list.appendToLast(3);
		list.appendToLast(2);
		list.appendToLast(6);
		list.appendToLast(78);
		list.appendToLast(787);
		list.appendToLast(8);
		list.appendToLast(12312);
		list.appendToLast(3453);
		list.appendToLast(7);
		list.appendToLast(345346);
		System.out.println(list.toString());
		Node balanced = list.rebalancedList(Integer.parseInt(args[0]));
		System.out.println(balanced.toString());
	}
}
		