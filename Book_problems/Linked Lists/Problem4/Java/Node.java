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
			output = output + new String(Integer.toString(current.data)) + '\n';
		}
		return output;
	}
	
	/*
	 * Places all the elemets smaller than j before the node with element j and all the
	 * elements greater or equal than j after the node with element j
	 */
	public Node rebalancedList(int j){
		Node bPoint = null;
		Node iterator = this;
		while(iterator != null){
			if(iterator.data == j){
				bPoint = iterator;
				break;
			} else {
				iterator = iterator.next;
			}
		}
		if(bPoint == null)
			return null;
		Node header = bPoint;
		boolean seen = false;
		Node iteratorSecond = bPoint.next;
		Node  tail = bPoint;
		iterator = this;
		Node nextElement = iterator;
		while(iterator != null){
			if(!seen && iterator.data == bPoint.data){
				iterator = iteratorSecond;
				nextElement = iteratorSecond;
				seen = true;
			} else {
				nextElement = nextElement.next;
				if(iterator.data < bPoint.data){
					iterator.next = header;
					header = iterator;
				} else {
					tail.next = iterator;
					tail = iterator;
				}
				iterator = nextElement;
			}
		}
		return header;
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