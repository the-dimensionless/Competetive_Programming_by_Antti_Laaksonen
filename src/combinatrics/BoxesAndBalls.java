package combinatrics;

/**
 * ”Boxes and balls” is a useful model, where we count the ways to place k balls in n boxes. 
 * 
 * @author sumitsingh
 *
 */
public class BoxesAndBalls {

	public static void main(String[] args) {
		
		int n = 5;
		int k = 2;
		
		// Scenario 1: Each box can contain at most one ball. nCk
		System.out.println("Scenario 1: "+nCk (n, k));
		
		// Scenario 2 : A box can contain multiple balls. k+n-1Ck
		System.out.println("Scenario 2: "+nCk (n+k-1, k));
		
		// Scenario 3: Each box may contain at most one ball, 
	    //				and in addition, no two adjacent boxes may both contain a ball.
		/*nCk (n-k+1, n-2k+1)
		In this scenario, we can assume that k balls are initially placed in boxes 
		and there is an empty box between each two adjacent boxes. 
		The remaining task is to choose the positions for the remaining 
		empty boxes. There are n−2k+1 such boxes and k+1 positions for them.*/ 
						
		System.out.println("Scenario 3: "+nCk (n-k+1, n-2*k+1));
		
	}
	
	static int nCk (int n, int k) {
		
		if (k == 0 || n == k)
			return 1;
		
		return nCk (n-1, k-1) + nCk (n-1, k);
	}
}
