package geometry.surface;

import geometry.point.Point;

public class SurfaceTest {

	public static void main(String[] args) {
		Point point1 = new Point(0,0,0);
		Point point2 = new Point(1,0,0);
		Point point3 = new Point(1,1,0);
		Point point4 = new Point(0,1,0);
		
		Point point5 = new Point(3,2,1);
		Point point6 = new Point(0.5,0.5,0);
		
		Surface newSurface = new Surface(point1,point2,point3,point4);
		System.out.println(newSurface.hasPoint(point4));
		System.out.println(newSurface.hasPoint(point5));
		System.out.println(newSurface.hasPoint(point6));
		
	}

}
