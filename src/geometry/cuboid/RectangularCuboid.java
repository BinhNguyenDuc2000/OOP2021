package geometry.cuboid;

import geometry.line.Line;
import geometry.point.Point;

public class RectangularCuboid {
	private Point a,b,c,d;	//4 dinh thuoc mat day
	private Point e,f,g,h;	//4 dinh thuoc mat tren
	private double height;
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
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam trong hop
		//To do
		return true;
	}
	
	//With line
	public boolean hasLine(Line newLine) {
		//Kiem tra mot duong thang co di qua hop
		//To do
		return true;
	}
}
