package math3d;

import geometry.point.Point;
import geometry.vector.Vector2D;

public class Math3D {
	// Tich co huong
	public static Vector2D computeCrossProduct(Vector2D v1, Vector2D v2) {
		if (v1==null||v2==null)
			return null;
		Vector2D crossProduct = new Vector2D();

		crossProduct.setX(v1.getY()*v2.getZ()-v2.getY()*v1.getZ());
		crossProduct.setY(v1.getZ()*v2.getX()-v2.getZ()*v1.getX());
		crossProduct.setZ(v1.getX()*v2.getY()-v2.getX()*v1.getY());
		return crossProduct;
	}
	
	// Tich vo huong
	public static double computeDotProduct(Vector2D v1,Vector2D v2) {
		if (v1==null||v2==null)
			return 0;
		return v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ();
	}
	
	// Kiem tra mot so nam giua 2 so
	// kiem tra c co nam giua a va b 
	public static boolean isBetweenDouble(Double a, Double b, Double c) {
		if (a < b) {
			if (a <= c && c <= b)
				return true;
		} else {
			if (b <= c && c <= a) {
				return true;			
			}
		}
		return false;
	}
	
	// Kiem tra mot diem co nam giua 2 diem
	// Kiem tra C co nam giua A va B 
	public static boolean isBetweenPoint(Point a, Point b, Point c) {
		if (!isBetweenDouble(a.getX(), b.getX(), c.getX()))
			return false;
		if (!isBetweenDouble(a.getY(), b.getY(), c.getY()))
			return false;
		if (!isBetweenDouble(a.getZ(), b.getZ(), c.getZ()))
			return false;
		return true;
	}
	
	// Tim diem o giua 4 diem
	public static Point getCenterPoint(Point point1,Point point2,Point point3,Point point4) {
		if (point1==null||point2==null||point3==null||point4==null)
			return null;
		double x = (point1.getX() + point2.getX() + point3.getX() + point4.getX())/4;
		double y = (point1.getY() + point2.getY() + point3.getY() + point4.getY())/4;
		double z = (point1.getZ() + point2.getZ() + point3.getZ() + point4.getZ())/4;
		return new Point(x,y,z);
	}
}
