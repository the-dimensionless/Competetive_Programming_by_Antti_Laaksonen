package combinatrics;

public class BinomialCoefficients {
	
	public static void main(String[] args) {
		int n = 5;
		int k = 3;
		
		System.out.println(findBC(n, k));
	}
	
	public static int findBC (int n, int k) {
		if (n == k || k == 0) {
			return 1;
		}
		return findBC (n-1, k-1) + findBC (n-1, k);
	}

}
