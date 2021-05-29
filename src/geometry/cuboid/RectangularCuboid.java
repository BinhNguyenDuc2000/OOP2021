package geometry.cuboid;

import java.util.ArrayList;

import geometry.line.Line;
import geometry.plane.Plane;
import geometry.point.Point;
import geometry.surface.Surface;

public class RectangularCuboid {
	private Point a,b,c,d;	//4 dinh thuoc mat day
	private Point e,f,g,h;	//4 dinh thuoc mat tren
	private double height;
	private Surface ABCD;
	private Surface ABFE;
	private Surface BCGF;
	private Surface CDHG;
	private Surface DAEH;
	private Surface EFGH;
	//Ham lay dinh thuoc mat tren
	private Point getPoint(Point oldPoint) {
		Point newPoint = new Point();
		newPoint.setX(oldPoint.getX());
		newPoint.setY(oldPoint.getY());
		newPoint.setZ(oldPoint.getZ()+height);
		return newPoint;
	}
	//Constructor
	public RectangularCuboid() {
	}
	public RectangularCuboid(Point a,Point b,Point c,Point d,double height) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=getPoint(a);
		this.f=getPoint(b);
		this.g=getPoint(c);
		this.h=getPoint(h);
		this.height=height;
		ABCD = new Surface(a, b, c, d);
		ABFE = new Surface(a, b, f, e);
		BCGF = new Surface(b, c, g, f);
		CDHG = new Surface(c, d, h, g);
		DAEH = new Surface(d, a, e, h);
		EFGH = new Surface(e, f, g, h);
		
	}
	
	public RectangularCuboid(Point a, Point b, Point c, Point d, Point e, Point f, Point g, Point h) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
		this.h = h;
		height = this.a.getZ()-this.e.getZ();
		ABCD = new Surface(a, b, c, d);
		ABFE = new Surface(a, b, f, e);
		BCGF = new Surface(b, c, g, f);
		CDHG = new Surface(c, d, h, g);
		DAEH = new Surface(d, a, e, h);
		EFGH = new Surface(e, f, g, h);
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
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Point getE() {
		return e;
	}
	public void setE(Point e) {
		this.e = e;
	}
	public Point getF() {
		return f;
	}
	public void setF(Point f) {
		this.f = f;
	}
	public Point getG() {
		return g;
	}
	public void setG(Point g) {
		this.g = g;
	}
	public Point getH() {
		return h;
	}
	public void setH(Point h) {
		this.h = h;
	}
	//Function with rectangular cuboid
	public boolean isValid() {
		//Kiem tra xem khoi da cho co dung la hinh hop chu nhat
		//To do
		return true;
	}
	
//	//With point
//	public boolean hasPoint(Point newPoint) {
//		//Kiem tra mot diem co nam trong hop
//		if (new Surface(a, b, c, d).hasPoint(newPoint))
//			return true;
//		if (new Surface(a, b, f, e).hasPoint(newPoint))
//			return true;
//		if (new Surface(e, f, g, f).hasPoint(newPoint))
//			return true;
//		if (new Surface(c, d, h, g).hasPoint(newPoint))
//			return true;
//		if (new Surface())
//		return false;
//	}
//	
	//With line
	public ArrayList<Point> getIntersection(Line newLine) {
		//Lay tap cac giao diem cua hop voi duong thang
		ArrayList<Point> intersectionList = new ArrayList<Point>();
		if (ABCD.getPosition(newLine)==Plane.hasIntersection) {
			Point intersectionPoint = ABCD.getIntersection(newLine);
			if (ABCD.hasPoint(intersectionPoint))
				intersectionList.add(intersectionPoint);
		}
		if (ABFE.getPosition(newLine)==Plane.hasIntersection) {
			Point intersectionPoint = ABFE.getIntersection(newLine);
			if (ABFE.hasPoint(intersectionPoint))
				intersectionList.add(intersectionPoint);
		}
		if (BCGF.getPosition(newLine)==Plane.hasIntersection) {
			Point intersectionPoint = BCGF.getIntersection(newLine);
			if (BCGF.hasPoint(intersectionPoint))
				intersectionList.add(intersectionPoint);
		}
		if (CDHG.getPosition(newLine)==Plane.hasIntersection) {
			Point intersectionPoint = CDHG.getIntersection(newLine);
			if (CDHG.hasPoint(intersectionPoint))
				intersectionList.add(intersectionPoint);
		}
		if (DAEH.getPosition(newLine)==Plane.hasIntersection) {
			Point intersectionPoint = DAEH.getIntersection(newLine);
			if (DAEH.hasPoint(intersectionPoint))
				intersectionList.add(intersectionPoint);
		}
		if (EFGH.getPosition(newLine)==Plane.hasIntersection) {
			Point intersectionPoint = EFGH.getIntersection(newLine);
			if (EFGH.hasPoint(intersectionPoint))
				intersectionList.add(intersectionPoint);
		}
		return intersectionList;
	}
}
