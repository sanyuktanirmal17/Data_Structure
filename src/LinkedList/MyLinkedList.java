public class MyLinkedList {
	INode head;
	INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
		
	}

	public void add(INode newNode) {
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			INode temp = this.head;
			this.head = newNode;
			this.head.setNext(temp);
		}
		
	}
	public void append(INode newnode) {
		if(this.head == null) {
			this.head = newnode;
		}
		if(this.tail == null) {
			this.tail = newnode;
		}else {
			this.tail.setNext(newnode); 
			this.tail = newnode;
		}
	}	
	
	
	public void printMyNodes() {
		StringBuffer mynodes =new StringBuffer("My nodes: ");
		INode temp = head;
		while (temp.getNext() != null) {
			mynodes.append(temp.getKey());
			if(!temp.equals(tail)) mynodes.append("->");
			temp = temp.getNext();
		}
		mynodes.append(temp.getKey());
		System.out.println(mynodes);
	}
	

}