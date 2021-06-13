package com.Queue;

/*
 * Queue operations 
 */
public class QueueList {
		int[] queue = new int[3];
		int front;
		int rear;
		int size;
		/*
		 * method add element 
		 */

		public void enQueue(int data) {
			queue[rear] = data;
			rear = (rear + 1) % 3;
			size = size + 1;
		}
		
//		/*
//		 * for deletion 
//		 */
//		public int deQueue() {
//			int data = queue[front];
//			if (!isEmpty()) {
//
//				front = (front + 1) % 5;
//				size = size - 1;
//
//			} else {
//				System.out.println("Queue is empty nothing to delete");
//			}
//
//			return data;
//
//		}
		/*
		 * show method 
		 */
		
		public void show() {
			System.out.print("Element : ");
			int length = queue.length;
			int count = rear;
		if (isFull()) {
			while (length > 0) {
					System.out.print(queue[count] + " ");
					count++;
					if (count == 3) {
						count = 0;
					}
					length--;
				}
			} else {
				for (int i = 0; i < size; i++) {
					System.out.print(queue[(front + i) % 3] + " ");
				}
			   }
			}

		

		public int getSize() {
			return size;
		}

		public boolean isFull() {
			return getSize() == 5;
		}

		public boolean isEmpty() {
			return getSize() == 0;
		}
	}


