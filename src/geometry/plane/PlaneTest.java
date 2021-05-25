package geometry.plane;

import geometry.line.Line;
import geometry.point.Point;
import geometry.vector.Vector;

public class PlaneTest {
	public static void main(String[] args) {
		//To do
	Plane newPlane = new Plane(new Point(1.0,0.0,0.0),new Vector(0.0,0.0,1.0));
	Line newLine = new Line(new Point(1.0,1.0,1.0),new Vector(1.0,0.0,1.0));
	System.out.println(newPlane.getPosition(newLine));
	
	}

}
