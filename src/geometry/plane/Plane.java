package geometry.plane;

import geometry.line.Line;
import geometry.point.Point;
import geometry.vector.Vector2D;

//Mot mat phang duoc tao ra tu mot diem va mot vector phap tuyen
public class Plane {
	private Point point1;
	private Vector2D vector;
	public static final String invalidPlane="Invalid plane";
	public static final String invalidLine="Invalid line";
	public static final String belongToPlane="Line belong to the plane";
	public static final String parallelToPlane="Line is parallel to the plane";
	public static final String hasIntersection="The line has a intersection with the plane";
	
	//Constructors
	public Plane() {
	}
	public Plane(Point point1,Vector2D vector) {
		this.point1 = point1;
		this.vector = vector;
	}
	public Plane(double x,double y,double z,Point point1) {
		this.point1 = point1;
		this.vector = new Vector2D(x,y,z);
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
	public Vector2D getVector() {
		return vector;
	}
	public void setVector(Vector2D vector) {
		this.vector = vector;
	}
	public double getD() {
		double Ax0=vector.getX()*point1.getX();
		double By0=vector.getY()*point1.getY();
		double Cz0=vector.getZ()*point1.getZ();
		return -Ax0-By0-Cz0;
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
	public String getPosition(Line newLine) {
		if(vector.getLength()==0)
			return invalidPlane;
		if(newLine.getVector().getLength()==0)
			return invalidLine;
		double Aa=vector.getX()*newLine.getVector().getX();
		double Bb=vector.getY()*newLine.getVector().getY();
		double Cc=vector.getZ()*newLine.getVector().getZ();
		double Dd=Aa+Bb+Cc;
		if (Dd==0) {
			if (newLine.getPoint1()==null) {
				return invalidLine;
			}
			double Ax0 = vector.getX()*newLine.getPoint1().getX();
			double By0 = vector.getY()*newLine.getPoint1().getY();
			double Cz0 = vector.getZ()*newLine.getPoint1().getZ();
			if (Ax0+By0+Cz0+getD()==0) {
				return belongToPlane;
			}
			else {
				return parallelToPlane;
			}
		}
		else {
			return hasIntersection;
		}
		
	}
	
	public Point getIntersection(Line newLine) {
		//Lay giao diem giua mat phang va mot duong thang, tra ve null neu khong co
		//Cong thuc xem tai https://hayhochoi.vn/cac-dang-toan-ve-phuong-trinh-duong-thang-trong-khong-gian-oxyz-va-bai-tap-toan-lop-12.html
		if(getPosition(newLine)!=hasIntersection)
			return null;
		else {
			double Aat= vector.getX()*newLine.getVector().getX();
			double Bbt= vector.getY()*newLine.getVector().getY();
			double Cct= vector.getZ()*newLine.getVector().getZ();
			double Ax0= vector.getX()*newLine.getPoint1().getX();
			double Bx0= vector.getY()*newLine.getPoint1().getY();
			double Cx0= vector.getZ()*newLine.getPoint1().getZ();
			double t=(-Ax0-Bx0-Cx0-getD())/(Aat+Bbt+Cct);
			double x=t*newLine.getVector().getX()+newLine.getPoint1().getX();
			double y=t*newLine.getVector().getY()+newLine.getPoint1().getY();
			double z=t*newLine.getVector().getZ()+newLine.getPoint1().getZ();
			return new Point(x,y,z);
		}
	}
}
