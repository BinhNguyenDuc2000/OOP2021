package geometry.line;
import geometry.point.Point;
import geometry.vector.Vector;

//Duong thang duoc tao boi mot vector phap tuyen va 1 diem
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
		double distanceP;
		double x1;
		double x2;
		
		x1 = Math.sqrt(Math.pow(LineSegment.x, 2) + Math.pow(LineSegment.y, 2));
		x2 = Math.abs(LineSegment.a * newPoint.getX() + LineSegment.b * newPoint.getY() + LineSegment.c);
		distanceP = x2/x1;
		
		return distanceP;
	}
	
	//With vector
	public double getAngle(Vector newVector) {
		//Lay goc giua duong thang va mot vector
		return 90-vector.getAngleS(newVector);
	}
	
	//With line
	public double getAngle(Line newLine) {
		//Lay goc giua 2 duong thang
		return vector.getAngleS(newLine.getVector());
	}
	public double getDistance(Line newlLine) {
		//Lay khoang cach giua 2 duong thang
		//To do
		double distanceL = 0;
		
		return distanceL;
	}
	public Point getIntersection(Line newLine) {
		//Lay giao diem giua duong thang va mot duong thang, tra ve null neu khong co
		//To do
		
		return null;
	}
	
}
