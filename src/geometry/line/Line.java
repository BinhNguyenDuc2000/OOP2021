package geometry.line;
import geometry.point.Point;
import geometry.vector.Vector2D;
import math3d.Math3D;

//Duong thang duoc tao boi mot vector chi phuong va 1 diem
public class Line {
	private Point point1;
	private Vector2D vector;
	
	//Constructors
	public Line() {
	}
	
	public Line(Point point1,Vector2D vector) {
		this.point1 = point1;
		this.vector = vector;
	}
	
	public Line(double x, double y, double z,Point point1) {
		this.point1 = point1;
		this.vector = new Vector2D(x,y,z);
	}
	
	public Line(Point a,Point b) {
		//To do
		this.point1 = a;
		this.vector = new Vector2D(a,b);
		
	}

	//Getters and Setters
	public Point getPoint1() {
		return point1;
	}
	public void setPoint(Point point) {
		this.point1 = point;
	}
	
	public Vector2D getVector() {
		return vector;
	}

	public void setVector(Vector2D vector) {
		this.vector = vector;
	}
	//Functions with a line

	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra duong thang co chua diem
		return Math3D.isClose(getDistance(newPoint),0) ? true : false;
	}
	public double getDistance(Point newPoint) {
		//Lay khoang cach giua duong thang va mot diem
		if (this.getVector()==null)
			return 0;
		Vector2D newVector = Math3D.computeCrossProduct(new Vector2D(this.getPoint1(),newPoint), this.getVector());
		double space = newVector.getLength();
		double bottom = this.getVector().getLength();
		return space/bottom;
	}
	
	//With line
	 
	public boolean isSame(Line newLine) {
		//Kiem tra 2 duong thang co trung nhau
		if (this.getVector().isParallel(newLine.getVector()) && newLine.hasPoint(this.getPoint1())){
			return true;
		}
		return false;
	}
	
	
	
}
