package range_queries;

/**
 * Kind of like Dynamic version of prefix sum array.
 * The advantage of a binary indexed tree is that it allows us to efﬁciently update
 *  array values between sum queries. This would not be possible using a preﬁx sum array, because after each update, 
 *  it would be necessary to build the whole preﬁx sum array again in O(n) time.
 *
 */
public class BinaryIndexedTree {
	
	static int tree[];
	static int n;

	public static int getSum(int index) {
		int sum = 0;
		 index = index + 1; 
	        while(index>0) 
	        {   sum += tree[index]; 
	            index -= index & (-index); 
	        } 
	        return sum; 
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,8,1,4,2};
		tree = new int[1000];
		n = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			tree[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			update(arr.length, i, arr[i]);
		}
		System.out.println(getSum(5));
		arr[3] += 6;
		update(n,3,6);
		System.out.println(getSum(5));
	}
	
	public static void update(int n, int i, int val) {
		i = i+1;
		
		while (i <= n) {
			tree[i] += val;
			i += i&-i;
		}
	}
	

}
