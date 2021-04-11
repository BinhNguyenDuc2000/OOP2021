package geometry.surface;

import geometry.plane.Plane;
import geometry.point.Point;

public class Surface extends Plane{
	Point a,b,c,d;
	//Constructors
	public Surface(Point a, Point b, Point c, Point d) {
		super(a,b,c);
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
	
	//Functions with surface
	
	//With point
	@Override
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mot mat
		//To do
		return true;
	}

}
