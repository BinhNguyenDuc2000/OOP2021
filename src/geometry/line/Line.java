package geometry.line;
import geometry.point.Point;
import geometry.vector.Vector;
import math3d.math3d;

//Duong thang duoc tao boi mot vector chi phuong va 1 diem
public class Line {
	private Point point;
	private Vector vector;
	
	//Constructors
	public Line() {
		
	}
	
	public Line(double x, double y, double z,Point point) {
		this.point = point;
		this.vector = new Vector(x,y,z);
	}
	
	public Line(Point a,Point b) {
		//To do
		this.point = a;
		this.vector = new Vector(a,b);
		
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
	//Functions with a line

	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra duong thang co chua diem
		return getDistance(newPoint)==0 ? true : false;
	}
	public double getDistance(Point newPoint) {
		//Lay khoang cach giua duong thang va mot diem
		//To do
		if (this.getVector()==null)
			return 0;
		Vector newVector = math3d.computeCrossProduct(new Vector(this.getPoint(),newPoint), this.getVector());
		double space = newVector.getLength();
		double bottom = this.getVector().getLength();
		return space/bottom;
	}
	
	//With vector
	public double getAngle(Vector newVector) {
		//Lay goc giua duong thang va mot vector
		return vector.getAngleS(newVector);
	}
	
	//With line
	public double getAngle(Line newLine) {
		//Lay goc giua 2 duong thang
		return vector.getAngleS(newLine.getVector());
	}
	 
	public boolean isSame(Line newLine) {
		//Kiem tra 2 duong thang co trung nhau
		if (this.getVector().equals(newLine.getVector()) && newLine.hasPoint(this.getPoint())){
			return true;
		}
		return false;
	}
	
	
	
}
