
public class StackList {

		int stack[] = new int[3];
		int top = 0;
		
		/*
		 * push the elements inside
		 */

		public void push(int data) {
				stack[top] = data;
				top++;
			}
					
		/*
		 * pop the element out
		 */
		
		public int pop() {
			int data=0;
				top--;
				data = stack[top];
				stack[top] = 0;
				return data;
			}
					
		/*
		 * fetch the first element of the Stack or 
		 * show present element  at the top of the Stack
		 */

		public int peek() {
			int data;
			data = stack[top - 1];
			return data;
		}

		/*
		 * show element 
		 */
		public void show() {
			for (int num : stack) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

		/*
		 * check size of array 
		 */
		public int size() {
			return top;
		}
		
	}

