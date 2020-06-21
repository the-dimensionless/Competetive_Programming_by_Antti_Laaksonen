package combinatrics;

/**
 * General Usage :
 * The Catalan number Cn equals the number of valid parenthesis expressions that 
 * consist of n left parentheses and n right parentheses.
 * 
 * C(n) Binary Tress of node n
 * 
 * C(n-1) rooted trees of node n
 * 
 * @author sumitsingh
 *
 */
public class CatalanNumbers {
	
	public static void main(String[] args) {
		
		int n = 3;
		System.out.println("Catalan number:  C(" + n + ") : " + catalanBCFormula(n));
	}
	
	private static int catalanBCFormula (int n) {
		return ( ByFormulaOfBC (2 * n, n) ) / (n + 1);
	}
	
	private static int ByFormulaOfBC (int n, int k) {
		if (n == k || k == 0)
			return 1;
		return ByFormulaOfBC (n-1, k-1) + ByFormulaOfBC (n-1, k);
	}

}
