package geometry.vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector vector1 = new Vector(1,1,1);
		Vector vector2 = new Vector(2,2,2);
		Vector vector3 = new Vector(1,0,1);
		Vector vector4 = new Vector(4,0,4);
		System.out.println(vector1.isParallel(vector2));
		System.out.println(vector1.isParallel(vector3));
		System.out.println(vector3.isParallel(vector4));
		System.out.println(vector4.isParallel(vector3));
		System.out.println(vector4.isParallel(vector4));
	}
}
