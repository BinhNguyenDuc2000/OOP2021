package geometry.line;

import geometry.point.Point;

public class LineTest {
	public static void main(String[] args) {
		//To do
		Point a = new Point(0,0,0);
		Point b = new Point(1,0,0);
		Line c = new Line(a,b);
		System.out.println(c.getDistance(new Point(0,1,0)));
		
	}

}
