package geometry.line;

import geometry.point.Point;
//Doan thang duoc tao boi mot duong thang va hai diem
public class LineSegment extends Line{
	private Point point1;
	private Point point2;
	private Line line;
	//Constructor
	public LineSegment() {
		super();
	}
	public LineSegment(double x, double y, double z,Point point1,Point point2) {
		this.line = new Line(x,y,z,point1);
		this.point1 = point1;
		this.point2 = point2;
	}
	public LineSegment(Point point1,Point point2) {
		this.line = new Line(point1,point2);
		this.point1 = point1;
		this.point2 = point2;
	}
	
	//Getter and Setter
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	//Functions with Line Segment
	
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mot doan thang
		//To do
		return true;
	}
}
