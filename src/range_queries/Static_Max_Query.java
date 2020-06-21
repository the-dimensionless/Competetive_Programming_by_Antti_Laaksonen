package range_queries;

public class Static_Max_Query {
	public static void main(String[] args) {
		int arr[] = {1,3,4,8,6,1,4,2};
		int left = 0;
		int right = 3;
		
		System.out.println(findMaxQuery(arr, left, right));
	}

	private static int findMaxQuery(int[] arr, int left, int right) {
		int k = (right - left + 1)/2;
		return Math.max(Math.max(arr[left], arr[left+k-1]), Math.max(arr[left+k], arr[right]));
	}

}
