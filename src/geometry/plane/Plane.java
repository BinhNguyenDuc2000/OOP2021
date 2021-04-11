package geometry.plane;

import geometry.line.Line;
import geometry.point.Point;
import geometry.vector.Vector;

//Mot mat phang duoc tao ra tu mot diem va mot vector phap tuyen
public class Plane extends Vector{
	private Point a;
	
	//Constructors
	public Plane() {
		super();
	}
	public Plane(double x,double y,double z,Point a) {
		super(x,y,z);
		this.a = a;
	}
	public Plane(Point a,Point b,Point c) {
		//To do
	}
	//Getters and Setters
	public Point getA() {
		return a;
	}
	public void setA(Point a) {
		this.a = a;
	}
	
	//Functions with a plane
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mat phang
		return getDistance(newPoint)==0 ? true : false;
	}
	public double getDistance(Point newPoint) {
		//Lay khoang cach giua mat phang va mot diem
		//To do
		return 0;
	}
	
	//With vector
	@Override
	public double getAngle(Vector newVector) {
		//Lay goc giua mat phang va mot vector
		return 90-super.getAngle(newVector);
	}
	
	//With line 
	public double getAngle(Line newLine) {
		//Lay goc giua mat phang va mot duong thang
		//To do
		return 90-newLine.getAngle(this);
	}
	public Point getIntersection(Line newLine) {
		//Lay giao diem giua mat phang va mot duong thang, tra ve null neu khong co
		//To do
		return null;
	}
}
