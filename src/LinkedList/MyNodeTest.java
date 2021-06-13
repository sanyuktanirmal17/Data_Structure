package LinkedList 

import org.junit.Test;

import junit.framework.Assert;

public class MyNodeTest {
	@Test
	public void given3NumbersWhenLinkedshouldPassedLinkedListTest() {
		MyNode<Integer> MyFirstnode = new MyNode<Integer>( 56);
		MyNode<Integer> MySecondnode = new MyNode<Integer>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<Integer>( 70);
		MyFirstnode.setNext(MySecondnode);
		MySecondnode.setNext(MyThirdnode);
		boolean result = MyFirstnode.getNext().equals(MySecondnode) &&
				MySecondnode.getNext().equals(MyThirdnode);
		Assert.assertTrue(result);
		
		
	}

}