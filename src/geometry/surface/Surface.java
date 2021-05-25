package geometry.surface;

import geometry.line.Line;
import geometry.plane.Plane;
import geometry.point.Point;
import geometry.vector.Vector;

public class Surface extends Plane {
	private Point point2,point3,point4;
	//Constructors
	public Surface(Point point1,Point point2, Point point3, Point point4) {
		super(point1,math3d.Math3D.computeCrossProduct(new Vector(point1,point2), new Vector(point1,point3)));
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}
	//Getters and Setters
	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public Point getPoint4() {
		return point4;
	}

	public void setPoint4(Point point4) {
		this.point4 = point4;
	}

	
	//Functions with surface
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mot mat
		if(!super.hasPoint(newPoint))
			return false;
		return true;
	}
	
	
	//With line
	public boolean hasIntersection(Line newLine) {
		//Kiem tra mot doan thang co di qua mot mat
		return (hasPoint(getIntersection(newLine))) ? true : false;
	}

}
