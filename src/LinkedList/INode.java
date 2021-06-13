package LinkedList;

public interface INode<K> {
	
	public K getKey();
	public void setKey(K key);
	
	INode getNext();
	void setNext(INode next);
	
	

}


