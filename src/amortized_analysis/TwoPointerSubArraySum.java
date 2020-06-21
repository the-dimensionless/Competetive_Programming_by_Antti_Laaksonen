package amortized_analysis;

/**
 * Astheﬁrstexample,consideraproblemwherewearegivenanarrayof npositive 
 * integers and a target sum x, and we want to ﬁnd a subarray whose sum 
 * is x or report that there is no such subarray. 
 * @author sumitsingh
 *
 */
public class TwoPointerSubArraySum {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,2,5,1,1,2,3};
		int targetSum = 8;
		
		int i = 0;
		int j = 2;
		
		int init = 0;
		
		int sum = 0;
		
		while (sum != targetSum && j < arr.length) {
			
			sum += arr[i];
			System.out.println("Sum: "+sum+",  i: "+i+", j : "+j+" ");
			
			if (sum == targetSum) {
				System.out.println("Found between index : "+(init)+" and index : "+(j));
				for (int k=init;k<j;k++) {
					System.out.print(arr[k]+"|");
				}
				System.out.println();
			}
			
			
			if (i+1 == j) {
				sum = 0;
				init = i+1;
				i = i + 1;
				j = j + 3;
			} else {
				/*sum += arr[i+1];*/
				i = i + 1;
			}
			
		}
	}

}
