package complete_search;

import java.util.ArrayList;

/**
 * 
 * We ﬁrst consider the problem of generating all subsets of a set of n elements. 
 * For example, the subsets of {0,1,2} are;, {0}, {1}, {2}, {0,1}, {0,2}, {1,2} and {0,1,2}. 
 * @author sumitsingh
 *
 */
public class GenerateSubsets {
	
	public static void main(String[] args) {
		
		int n = 3;
		Integer arr[] = {0, 1, 2};
		
		System.out.println("<---Generating using recursion--->");
		gen_recursively(arr, n, 0, new ArrayList<Integer>());
		gen_usingBits(arr, n, 0);
	}

	private static void gen_usingBits(Integer[] arr, int n, int i) {
		
		System.out.println("<---Generating using bitwise--->");
		
		for (int j = 0; j < (1<<n); j++) {	//generate 2^n combination values
			
			System.out.print("[");
			for (int j2 = 0; j2 < n; j2++) {
				int val = 1<<j2;
				if ( (j&val) > 0) {
					System.out.print(arr[j2]);
				}
			}
			System.out.print("]"+"\n");
		}
	}

	private static void gen_recursively(Integer[] arr, int n, int index, ArrayList<Integer> list) {
		
		if (index > n) {
			return;
		}
		
		if (n == index) {
			System.out.println(list);
		} else {
			list.add(arr[index]);
			gen_recursively(arr, n, index+1, list);
			list.remove(arr[index]);
			gen_recursively(arr, n, index+1, list);
		}
		
	}

	
}
