package geometry.line;

import geometry.point.Point;

public class LineTest {
	public static void main(String[] args) {
		//To do
		Point a = new Point(0,0,0);
		Point b = new Point(1,0,0);
		Line c = new Line(a,b);
		System.out.println(c.getDistance(new Point(0,1,0)));

		Point x = new Point(1,2,3);
		Point y = new Point(3,2,1);
		Point z = new Point(2,1,3);

		Line d = new Line(x,z);
		System.out.println(d.getDistance(y));
		
		System.out.println(d.hasPoint(z));
		
		System.out.println(d.isSame(c));
	}

}
