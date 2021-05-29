package obstacle;

import geometry.cuboid.RectangularCuboid;
import geometry.point.Point;

public class Obstacle extends RectangularCuboid{
	
	public Obstacle(Point a, Point b, Point c, Point d, Point e, Point f, Point g, Point h) {
		super(a, b, c, d, e, f, g, h);
		// TODO Auto-generated constructor stub
	}

	public boolean isLegit() {
		//Ham kiem tra vat co hop ly hay khong
		//To do
		return true;
	}

}
