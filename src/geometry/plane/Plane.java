package geometry.plane;

import geometry.line.Line;
import geometry.point.Point;
import geometry.vector.Vector;

//Mot mat phang duoc tao ra tu mot diem va mot vector phap tuyen
public class Plane {
	private Point point;
	private Vector vector;
	
	//Constructors
	public Plane() {
	}
	public Plane(double x,double y,double z,Point point) {
		this.point = point;
		this.vector = new Vector(x,y,z);
	}
	public Plane(Point a,Point b,Point c) {
		//To do
	}
	//Getters and Setters
	public Point getPoint() {
		return point;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
	public Vector getVector() {
		return vector;
	}
	public void setVector(Vector vector) {
		this.vector = vector;
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
	public double getAngle(Vector newVector) {
		//Lay goc giua mat phang va mot vector
		return 90-vector.getAngleS(newVector);
	}
	
	//With line 
	public double getAngle(Line newLine) {
		//Lay goc giua mat phang va mot duong thang		
		return 90-vector.getAngleS(newLine.getVector());
	}
	public Point getIntersection(Line newLine) {
		//Lay giao diem giua mat phang va mot duong thang, tra ve null neu khong co
		//To do
		return null;
	}
}
