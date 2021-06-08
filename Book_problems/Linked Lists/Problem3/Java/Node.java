public class Node{
	
	private Node next = null;
	private int data;
	
	public Node(int d){
		this.data = d;
	}
	
	
	public void appendToLast(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public String toString(){
		Node current = this;
		String output = new String(Integer.toString(current.data));
		while(current.next != null){
			current = current.next;
			output = output + new String(Integer.toString(current.data));
		}
		return output;
	}
	
	
	private Node kthNode(int j){
		if(j >9 || j < 0)
			return null;
		int i = 0;
		Node kthNode = this;
		while(i < j){
			kthNode = kthNode.next;
			i++;
		}
		return kthNode;
	}
	
	/*
	 * Does not delete the last element 9 or element 0
	 */
	public void removeNode(int l){
		if (l == 0 || l == 9) {
			return;
		}
		Node prev = this.kthNode(l-1);
		if(prev == null)
			return;
		Node rem = prev.next;
		rem.data = rem.next.data;
		rem.next = rem.next.next;
	}
	
}