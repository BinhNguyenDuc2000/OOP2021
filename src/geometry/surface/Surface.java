package geometry.surface;

import geometry.line.Line;
import geometry.plane.Plane;
import geometry.point.Point;
import geometry.vector.Vector;
import math3d.Math3D;

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
		
		if(newPoint==null)
			return false;
		
		//Kiem tra diem co nam tren mat phang
		if(!super.hasPoint(newPoint))
			return false;
		
		//Kiem tra diem co nam giua 4 diem gioi han
		double sABO = 0.5*Math3D.computeCrossProduct(new Vector(getPoint1(), newPoint), new Vector(point2, newPoint)).getLength();
		double sBCO = 0.5*Math3D.computeCrossProduct(new Vector(point2, newPoint), new Vector(point3, newPoint)).getLength();
		double sCDO = 0.5*Math3D.computeCrossProduct(new Vector(point3, newPoint), new Vector(point4, newPoint)).getLength();
		double sDAO = 0.5*Math3D.computeCrossProduct(new Vector(point4, newPoint), new Vector(getPoint1(), newPoint)).getLength();
		double sABCD = Math3D.computeCrossProduct(new Vector(getPoint1(), point2), new Vector(point2, point3)).getLength();
		if ((sABO+sBCO+sCDO+sDAO)!=sABCD)
			return false;
		return true;
	}
	
	
	//With line
	public boolean hasIntersection(Line newLine) {
		//Kiem tra mot doan thang co di qua mot mat
		return (hasPoint(getIntersection(newLine))) ? true : false;
	}

}
