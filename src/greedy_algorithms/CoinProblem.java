package greedy_algorithms;

/**
 * As a ﬁrst example, we consider a problem where we are given a set of coins 
 * and our task is to form a sum of money n using the coins. The values of the 
 * coins are coins={c1,c2,...,ck}, and each coin can be used as many times we 
 * want. What is the minimum number of coins needed?
 * 
 * @author sumitsingh
 *
 */
public class CoinProblem {
	
	public static void main(String[] args) {
		
		int targetSum = 520;
		// Assuming they are sorted
		int coinValues[]  = {1,2,5,10,20,50,100,200} ;
		System.out.println("Minimum number of coins needed = "+findMin(coinValues, targetSum, 0, coinValues.length-1));
		
	}

	private static int findMin(int[] coinValues, int targetSum, int currentSum, int position) {
		
		if (currentSum == targetSum || position < 0) {
			return 0;
		}
		
		int val = coinValues[position];
		
		while(val + currentSum > targetSum) {
			val = coinValues[--position];
		}
		
		System.out.println("Selected Coin is "+val);
		return 1 + findMin(coinValues, targetSum, currentSum+val, position);
	}
 
}
