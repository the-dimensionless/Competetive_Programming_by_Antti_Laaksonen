package greedy_algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Huffman coding2 is a greedy algorithm that constructs an optimal code for 
 * compressing a given string. The algorithm builds a binary tree based on 
 * the frequencies of the characters in the string, and each character’s codeword 
 * can be read by following a path from the root to the corresponding node. 
 * A move to the left corresponds to bit 0, and a move to the right corresponds to bit 1. 
 * 
 * @author sumitsingh
 *
 */
public class HuffmanCoding {
	
	static class HuffmanNode {
		int data;
		char ch;
		
		HuffmanNode left;
		HuffmanNode right;
		
		public HuffmanNode(int d, char c) {
			this.data = d;
			this.ch = c;
		}
	}
	
	static class CustomComp implements Comparator<HuffmanNode> {
		public int compare(HuffmanNode x, HuffmanNode y) {
			return x.data - y.data;
		}
	}
	
	public static void printPreview(HuffmanNode root, String s) {
		if (root.left == null && root.right == null && Character.isLetter(root.ch)) {
			System.out.println(root.ch+" : "+s);
			return;
		}
		
		printPreview(root.left, s+"0");
		printPreview(root.right, s+"1");
	}
	
	public static void main(String[] args) {
		
		int distinct = 4;
		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(distinct, new CustomComp());
		
		q.add(new HuffmanNode(5,'A'));
		q.add(new HuffmanNode(1,'B'));
		q.add(new HuffmanNode(2,'C'));
		q.add(new HuffmanNode(1,'D'));
		
		buildHuffmanTree(q);
	}
	
	public static void buildHuffmanTree(PriorityQueue<HuffmanNode> q) {
		HuffmanNode root = null;
		
		while (q.size() > 1) {
			
			//extraction of minimum node
			HuffmanNode a = q.poll();
			System.out.println("Extracted node is : "+a.ch);
			//extraction of second minimum node
			HuffmanNode b = q.poll();
			System.out.println("Extracted node is : "+b.ch);
			
			//create a new Node
			HuffmanNode joint = new HuffmanNode(a.data+b.data,'-');
			joint.left = a;
			joint.right = b;
			
			root = joint;
			
			q.add(joint);
		}
		
		printPreview(root, "");
	}
}
 