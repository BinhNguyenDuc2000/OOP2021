package geometry.line;

import geometry.point.Point;
//Doan thang duoc tao boi mot duong thang va hai diem
public class LineSegment extends Line{
	private Point b;
	//Constructor
	public LineSegment() {
		super();
	}
	public LineSegment(double x, double y, double z,Point a,Point b) {
		super(x,y,z,a);
		this.b = b;
	}
	public LineSegment(Point a,Point b) {
		super(a,b);
		this.setA(a);
		this.b = b;
	}
	
	//Getter and Setter
	public Point getB() {
		return b;
	}
	public void setB(Point b) {
		this.b = b;
	}
	
	//Functions with Line Segment
	
	//With point
	@Override
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mot doan thang
		//To do
		return true;
	}
}
