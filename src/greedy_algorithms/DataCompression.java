package greedy_algorithms;

import java.util.HashMap;

/**
 * A binary code assigns for each character of a string a codeword that 
 * consists of bits. We can compress the string using the binary code by 
 * replacing each character by the corresponding codeword
 * @author sumitsingh
 *
 */
public class DataCompression {
	
	public static void main(String[] args) {
		constantLength();
		variableLength();
	}
	
	public static void constantLength() {
		HashMap<Character, String> hm = new HashMap<Character, String>();
		
		hm.put('A', "00");
		hm.put('B', "01");
		hm.put('C', "10");
		hm.put('D', "11");
		
		String t = "AABACDACA"; 
		
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			System.out.print(hm.get(ch));
		}
		
		System.out.println(); // 18digits in this case
	}
	
	public static void variableLength() {
		HashMap<Character, String> hm = new HashMap<Character, String>();
		
		hm.put('A', "0");
		hm.put('B', "110");
		hm.put('C', "10");
		hm.put('D', "111");
		
		String t = "AABACDACA"; 
		
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			System.out.print(hm.get(ch));
		}
		
		System.out.println(); //15 digits in this case
		
	}
}
		
