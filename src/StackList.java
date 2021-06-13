
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

