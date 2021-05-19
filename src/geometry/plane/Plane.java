package geometry.plane;

import geometry.line.Line;
import geometry.point.Point;
import geometry.vector.Vector;

//Mot mat phang duoc tao ra tu mot diem va mot vector phap tuyen
public class Plane {
	private Point point1;
	private Vector vector;
	
	//Constructors
	public Plane() {
	}
	public Plane(double x,double y,double z,Point point1) {
		this.point1 = point1;
		this.vector = new Vector(x,y,z);
	}
	public Plane(Point a,Point b,Point c) {
		//To do
	}
	//Getters and Setters
	public Point getPoint1() {
		return point1;
	}
	public void setPoint(Point point1) {
		this.point1 = point1;
	}
	public Vector getVector() {
		return vector;
	}
	public void setVector(Vector vector) {
		this.vector = vector;
	}
	public double getD() {
		double ax0=vector.getX()*point1.getX();
		double by0=vector.getY()*point1.getY();
		double cz0=vector.getZ()*point1.getZ();
		return -ax0-by0-cz0;
	}
	//Functions with a plane
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mat phang
		return getDistance(newPoint)==0 ? true : false;
	}
	public double getDistance(Point newPoint) {
		//Lay khoang cach giua mat phang va mot diem
		//Tra ve -1 neu co loi
		if (vector.getLength()==0) {
			return -1;
		}
		double ax=vector.getX()*newPoint.getX();
		double by=vector.getY()*newPoint.getY();
		double cz=vector.getZ()*newPoint.getZ();
		return Math.abs(ax+by+cz+getD())/vector.getLength();
	}
	
	//With line 
	public Point getIntersection(Line newLine) {
		//Lay giao diem giua mat phang va mot duong thang, tra ve null neu khong co
		//To double
		if(vector.getLength()==0)
			return null;
		if(newLine.getVector().getLength()==0)
			return null;
		double Aa=vector.getX()*newLine.getVector().getX();
		double Bb=vector.getY()*newLine.getVector().getY();
		double Cc=vector.getZ()*newLine.getVector().getZ();
		if (Aa+Bb+Cc==0)
			return null;
		return null;
	}
}
