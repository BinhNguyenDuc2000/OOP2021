package math3d;

import geometry.vector.Vector;

public class math3d {
	// Tich co huong
	public static Vector computeCrossProduct(Vector v1, Vector v2) {
		Vector crossProduct = new Vector();

		crossProduct.setX(v1.getY()*v2.getZ()-v2.getY()*v1.getZ());
		crossProduct.setY(v1.getZ()*v2.getX()-v2.getZ()*v1.getX());
		crossProduct.setZ(v1.getX()*v2.getY()-v2.getX()*v1.getY());
		return crossProduct;
	}
	
	// Tich vo huong
	public static Double computeDotProduct(Vector v1,Vector v2) {		
		return v1.getX()*v2.getX() + v1.getY()*v2.getY() + v1.getZ()*v2.getZ();
	}
	
	// Kiem tra mot so nam giua 2 so
	public static boolean isBetween(double a,double b,double c) {
		if (a<b) {
			if (a<=c && c<=b)
				return true;
		}
		if (b<=c && c<=a)
			return true;
		return false;
		
	}
}
