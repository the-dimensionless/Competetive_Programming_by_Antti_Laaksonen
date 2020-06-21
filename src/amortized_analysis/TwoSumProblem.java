package amortized_analysis;

import java.util.Arrays;
import java.util.HashMap;

/**
 *  2SUM problem: given an array of n numbers 
 *  and a target sum x, ﬁnd two array values such 
 *  that their sum is x, or report that no such values exist.
 * @author sumitsingh
 *
 */
public class TwoSumProblem {
	
	public static void main(String[] args) {
		
		int arr[] = {1,4,5,6,7,9,9,10};
		/*int arr[] = {1,4,5,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,6,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,9,9,10};*/
		int target = 12;
		
		long start = System.currentTimeMillis();
		findByTwoPointerMethod(arr, target);
		long end = System.currentTimeMillis();
		System.out.println("Worked in "+(end-start));
		
		start = System.currentTimeMillis();
		findByHashMapMethod(arr, target);
		end = System.currentTimeMillis();
		System.out.println("Worked in HashMap "+(end-start));
		
	}

	private static void findByHashMapMethod(int[] arr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey((target-arr[i]))) {
				System.out.println("Found hashmap "+arr[i]+"|"+(target-arr[i]));
				break;
			}
		}
	}

	private static void findByTwoPointerMethod(int[] arr, int target) {
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;
		
		while (i<=j) {
			/*System.out.println("arr[i] "+arr[i]+ " and arr[j] "+arr[j]);*/
			if (arr[i]+arr[j] == target) {
				System.out.println("Found "+arr[i]+"|"+arr[j]);
				break;
			}
			if (arr[i]+arr[j] < target) {
				i++;
			} else {
				j--;
			}
		}
	}

}
