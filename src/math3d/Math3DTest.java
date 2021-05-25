package math3d;

import geometry.point.Point;
import geometry.vector.Vector;

public class Math3DTest {
	public static void main(String[] args) {
		// Test Math3D
		System.out.println(math3d.isBetween(3.0, 4.3, 1.0));
		System.out.println(math3d.isBetween(3.0, 1.1, 3.0));
		System.out.println(math3d.isBetween(3.0, 3.1, 4.0));
		System.out.println(math3d.isBetween(3.0, 3.5, 4.0));
		// To do
		
		Point x = new Point(1,2,3);
		Point y = new Point(3,2,1);
		Point z = new Point(2,1,3);
		
		Vector a = new Vector(x,y);
		Vector b = new Vector(y,z);
		Vector c = new Vector(z,x);

		System.out.println(math3d.computeCrossProduct(a, b));
		System.out.println(math3d.computeCrossProduct(b, c));
		System.out.println(math3d.computeCrossProduct(c, a));
		
		System.out.println(math3d.computeDotProduct(a, b));
		System.out.println(math3d.computeDotProduct(b, c));
		System.out.println(math3d.computeDotProduct(c, a));
	}
}
