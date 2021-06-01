package math3d;

import geometry.point.Point;
import geometry.vector.Vector2D;

public class Math3DTest {
	public static void main(String[] args) {
		// Test Math3D
		System.out.println(Math3D.isBetweenDouble(3.0, 4.3, 1.0));
		System.out.println(Math3D.isBetweenDouble(3.0, 1.1, 3.0));
		System.out.println(Math3D.isBetweenDouble(3.0, 3.1, 4.0));
		System.out.println(Math3D.isBetweenDouble(3.0, 3.5, 4.0));
		// To do
		// Point test
		System.out.println("--------------------------------------------------");
		System.out.println("Given points");
		Point w = new Point(0,0,0);
		Point x = new Point(1,2,3);
		Point y = new Point(3,2,1);
		Point z = new Point(2,1,3);
		System.out.println(Point.getPointString(w));
		System.out.println(Point.getPointString(x));
		System.out.println(Point.getPointString(y));
		System.out.println(Point.getPointString(z));
		System.out.println("--------------------------------------------------");
		System.out.println("Getting centerpoint");
		System.out.println(Point.getPointString(Math3D.getCenterPoint(w, x, y, z)));
		System.out.println("--------------------------------------------------");
		// Vetor test
		System.out.println("Given vector");
		Vector2D a = new Vector2D(x,y);
		Vector2D b = new Vector2D(y,z);
		Vector2D c = new Vector2D(z,x);
		System.out.println(Vector2D.getVectorString(a));
		System.out.println(Vector2D.getVectorString(b));
		System.out.println(Vector2D.getVectorString(c));

		System.out.println("--------------------------------------------------");
		System.out.println("Cross Product");
		System.out.println(Vector2D.getVectorString(Math3D.computeCrossProduct(a, b)));
		System.out.println(Vector2D.getVectorString(Math3D.computeCrossProduct(b, c)));
		System.out.println(Vector2D.getVectorString(Math3D.computeCrossProduct(c, a)));
		
		System.out.println("--------------------------------------------------");
		System.out.println("Dot Product");
		System.out.println(Math3D.computeDotProduct(a, b));
		System.out.println(Math3D.computeDotProduct(b, c));
		System.out.println(Math3D.computeDotProduct(c, a));
		System.out.println("--------------------------------------------------");
	}
}
