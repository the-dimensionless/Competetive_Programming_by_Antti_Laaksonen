package geometry;

/**
 * x1y2−x2y1+x2y3−x3y2+x3y4−x4y3+x4y1−x1y4
 * 
 * generalize to all polygons
 * 
 * @author sumitsingh
 *
 */
public class AreaOfQuads {
	
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
	}
	
	public static void main(String[] args) {
		
		Point p1 = new Point(3,4);
		Point p2 = new Point(1,2);
		Point p3 = new Point(5,6);
		Point p4 = new Point(4,7);
		
		int area1 = (p1.x * p2.y) - (p2.x * p1.y);
		int area2 = (p2.x * p3.y) - (p3.x * p2.y);
		int area3 = (p3.x * p4.y) - (p4.x * p3.y);
		int area4 = (p4.x * p1.y) - (p1.x * p4.y);
		
		System.out.println("Area is : " + (area1 + area2 +area3 + area4));
	
	}

}
