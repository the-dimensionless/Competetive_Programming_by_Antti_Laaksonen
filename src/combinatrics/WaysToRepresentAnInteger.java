package combinatrics;

import java.util.Scanner;

/**
 * # of ways to represent an integer as a sum of positive 
 * integers. 
 * 4 -> [ {1,1,1,1}, {1,2,1}, {3,1}, {4}, {1,1,2}, {2,1,1}, {1,3}, {2,2} ] = 8 ways
 * 
 * @author sumitsingh
 *
 */
public class WaysToRepresentAnInteger {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int test = kb.nextInt();
		
		System.out.println(byFormula(test));
		kb.close();
	}

	
	private static int byFormula (int test) {
		return (int) Math.pow(2, test-1);
	}
}
