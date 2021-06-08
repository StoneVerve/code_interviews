


public class ProblemThree{
	
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("Provide a number between 0 and 9");
			return;
		}
		NodeP3 list = new Node(0);
		for(int i=1; i<10;i++){
			list.appendToLast(i);
		}
		System.out.println(list.toString());
		list.removeNode(Integer.parseInt(args[0]));
		System.out.println(list.toString());
	}
}