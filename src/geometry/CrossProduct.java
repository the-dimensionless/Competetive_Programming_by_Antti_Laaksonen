package geometry;

public class CrossProduct {
	
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		
		int cp = multiply(new Point(2,3), new Point(4,6));
		System.out.println("Vector mag: "+cp);
		 // cp <0 turn right
	    // cp >0 turn left
	   // cp==0 go straight
	}
	
	 private static int multiply (Point p1, Point p2) {
		return (p1.x * p2.y) - (p2.x * p1.y);
	}
}
