package range_queries;

public class Static_Min_Query {
	
	public static void main(String[] args) {
		// find min(a,b) = b-a+1
		
		int arr[] = {1,3,4,8,6,1,4,2};
		int left = 3;
		int right = 4;
		int ans = findMinQuery(arr, left, right);
		System.out.println("answer is "+ans);
	}

	private static int findMinQuery(int[] arr, int left, int right) {
		int k = (right - left + 1)/2;
		return Math.min(Math.min(arr[left], arr[left+k-1]), Math.min(arr[left+k], arr[right]));
	}

}
