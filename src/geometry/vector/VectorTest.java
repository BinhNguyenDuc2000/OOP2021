package geometry.vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector2D vector1 = new Vector2D(1,1,1);
		Vector2D vector2 = new Vector2D(2,2,2);
		Vector2D vector3 = new Vector2D(1,0,1);
		Vector2D vector4 = new Vector2D(4,0,4);
		System.out.println(vector1.isParallel(vector2));
		System.out.println(vector1.isParallel(vector3));
		System.out.println(vector3.isParallel(vector4));
		System.out.println(vector4.isParallel(vector3));
		System.out.println(vector4.isParallel(vector4));
	}
}
