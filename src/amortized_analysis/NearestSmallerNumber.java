package amortized_analysis;

import java.util.Stack;

/**
 * Find the first smaller element that precedes the element in the array.
 * @author sumitsingh
 *
 */
public class NearestSmallerNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int arr[] = {1,3,4,2,5,3,4,2};
		Stack<Integer> st = new Stack<Integer>();
		
		int i = 0;
		int x = 0;
		int count = 0;
		
		while (i < arr.length) {
			/*System.out.println("Stack is -> " + st);*/
			if (!st.isEmpty()) {
				while (st.peek() > arr[i]) {
					x = st.pop();
					count ++;
				}
				System.out.println(arr[i] + " -> " + st.peek());
			}
			st.push(arr[i]);
			i++;
		}
		System.out.println("running "+(count)+" times");
	}
}
