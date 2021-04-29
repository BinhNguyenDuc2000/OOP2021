package geometry.surface;

import geometry.line.Line;
import geometry.plane.Plane;
import geometry.point.Point;

public class Surface{
	public Point a,b,c,d;
	public Plane plane;
	//Constructors
	public Surface(Point a, Point b, Point c, Point d) {
		this.plane = new Plane(a,b,c);
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	//Getters and Setters
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	public Point getC() {
		return c;
	}
	public void setC(Point c) {
		this.c = c;
	}
	public Point getD() {
		return d;
	}
	public void setD(Point d) {
		this.d = d;
	}
	public Plane getPlane() {
		return plane;
	}
	public void setPlane(Plane plane) {
		this.plane = plane;
	}
	
	//Functions with surface
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mot mat
		//To do
		return true;
	}
	
	//With line
	public boolean hasIntersection(Line newLine) {
		//Kiem tra mot doan thang co di qua mot mat
		return (hasPoint(plane.getIntersection(newLine))) ? true : false;
	}

}
