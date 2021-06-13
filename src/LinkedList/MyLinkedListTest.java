package LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void given3NUmbersWhenAddedToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> MyFirstnode = new MyNode<>( 70);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstnode);
		myLinkedList.add(MySecondnode);
		myLinkedList.add(MyThirdnode);
		myLinkedList.printMyNodes();
	
		boolean result = myLinkedList.head.equals(MyThirdnode) &&
				myLinkedList.head.getNext().equals(MySecondnode) &&
				myLinkedList.tail.equals(MyFirstnode);
		Assert.assertTrue(result);
		
	}
	@Test
	public void given3NUmbersWhenAppendedToLinkedListShouldBeAddedToBottom() {
		MyNode<Integer> MyFirstnode = new MyNode<>( 56);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstnode);
		myLinkedList.append(MySecondnode);
		myLinkedList.append(MyThirdnode);
		myLinkedList.printMyNodes();
	
		boolean result = myLinkedList.head.equals(MyFirstnode) &&
				myLinkedList.head.getNext().equals(MySecondnode) &&
				myLinkedList.tail.equals(MyThirdnode);
		Assert.assertTrue(result);
		
	}
	


}
