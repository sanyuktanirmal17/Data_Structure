package LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	//method to add element at top of list
	public void given3NUmbersWhenAddedToLinkedListShouldBeAddedToTop() {
		System.out.println("Adding element to top");
		MyNode<Integer> MyFirstnode = new MyNode<>( 70);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 56);
		MyLinkedList myLinkedList = new MyLinkedList(); //creating an object of class MyLinkedList
		myLinkedList.add(MyFirstnode); //calling function add() of MyLinkedList
		myLinkedList.add(MySecondnode);
		myLinkedList.add(MyThirdnode);
		myLinkedList.printMyNodes();//calling print function to print
	
		boolean result = myLinkedList.head.equals(MyThirdnode) &&
				myLinkedList.head.getNext().equals(MySecondnode) &&
				myLinkedList.tail.equals(MyFirstnode);//test condition
		Assert.assertTrue(result);
		
	}
	@Test
	//method to append at bottom of list
	public void given3NUmbersWhenAppendedToLinkedListShouldBeAddedToBottom() {
		System.out.println("Appending element to bottom");
		MyNode<Integer> MyFirstnode = new MyNode<>( 56);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(MyFirstnode); //calling append function
		myLinkedList.append(MySecondnode);
		myLinkedList.append(MyThirdnode);
		myLinkedList.printMyNodes();
	
		boolean result = myLinkedList.head.equals(MyFirstnode) &&
				myLinkedList.head.getNext().equals(MySecondnode) &&
				myLinkedList.tail.equals(MyThirdnode);
		Assert.assertTrue(result);
		
	}
	@Test
	//method to insert element in between 2 elements
	public void insertANumberBetween2NumbersInLinkedList() {
		System.out.println("Inserting element in between");
		MyNode<Integer> MyFirstnode = new MyNode<>( 56);
		MyNode<Integer> MySecondnode = new MyNode<>( 30);
		MyNode<Integer> MyThirdnode = new MyNode<>( 70);
		MyLinkedList mylinkedList = new MyLinkedList();
		mylinkedList.add(MyFirstnode); //adding first element at top
		mylinkedList.append(MyThirdnode); //appending other element
		mylinkedList.printMyNodes(); //printing
		mylinkedList.insert(MyFirstnode, MySecondnode);//calling insert method 
		mylinkedList.printMyNodes(); //printing
		boolean result = mylinkedList.head.equals(MyFirstnode) &&
				mylinkedList.head.getNext().equals(MySecondnode) &&
				mylinkedList.tail.equals(MyThirdnode);
		Assert.assertTrue(result);
	}
	

}