package geometry;

public class PointSide {
	
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static int multiply(Point p,Point p1, Point p2) {
		
		Point newp1 = new Point(p.x - p1.x, p.y - p1.y);
		Point newp2 = new Point(p.x - p2.x, p.y - p1.y);
		
		return (newp1.x * newp2.y) - (newp2.x * newp1.y);
	}
	
	public static void main(String[] args) {
		
		Point test = new Point(2,4);
		
		Point linep1 = new Point(1,3);
		Point linep2 = new Point(-1,6);
		
		System.out.println("Value : "+multiply(test, linep1, linep2));
		
		/*<0 => on the right side
		>0 => on the left side
		=0 => on the line*/
	}

}
