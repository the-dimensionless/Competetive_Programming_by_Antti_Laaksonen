package range_queries;

public class Static_Sum_Query {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,8,6,1,4,2};
		
		int leftEnd = 2;
		int rightEnd = 5;
		
		// leftEnd non inclusive, right end inclusive
		findMinQuery(arr, leftEnd, rightEnd);
	}

	private static void findMinQuery(int[] arr, int leftEnd, int rightEnd) {
		int prefixArr[] = new int[arr.length];
		prefixArr[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			prefixArr[i] = prefixArr[i-1] + arr[i];
		}
		
		System.out.println("Sum between the "+leftEnd+" and "+rightEnd+" is :");
		System.out.println(prefixArr[rightEnd]-prefixArr[leftEnd]);
		
	}

}
