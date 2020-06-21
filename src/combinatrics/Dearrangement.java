package combinatrics;

/**
 * 
 * Permutation such that no element remains in it's original place.
 * 
 * @author sumitsingh
 *
 */
public class Dearrangement {
	
	public static void main(String[] args) {
		
		int n = 3;
		
		System.out.println(findDearrangementByRecursion (n));
		System.out.println(findDearrangementByDP (n));
	}
	
	private static int findDearrangementByDP(int n) {
		int arr [] = new int[n+1];
		
		arr[0] = 1;
		arr[1] = 0;
		arr[2] = 1;
		
		for (int i = 3; i < arr.length; i++) {
			arr[i] = (i-1) * (arr[i-1] + arr[i-2]);
		}
		return arr[n];
	}

	private static int findDearrangementByRecursion (int n) {
		
		if (n == 0)
			return 1;
		if (n == 1) 
			return 0;
		if (n == 2)
			return 1;
		
		return (n-1) *  (findDearrangementByRecursion(n-1) + findDearrangementByRecursion(n-2));
	}

}
