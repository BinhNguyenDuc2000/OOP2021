package geometry.line;

import geometry.point.Point;
//Doan thang duoc tao boi mot duong thang va hai diem
public class LineSegment extends Line{
	private Point point2;
	//Constructor
	public LineSegment() {
		super();
	}
	public LineSegment(double x, double y, double z,Point point1,Point point2) {
		super(point1, point2);
		this.point2 = point2;
	}
	public LineSegment(Point point1,Point point2) {
		super(point1, point2);
		this.point2 = point2;
	}
	
	//Getter and Setter
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	//Functions with Line Segment
	
	
	//With point
	@Override
	public boolean hasPoint(Point newPoint) {
		//Kiem tra mot diem co nam tren mot doan thang
		if (!super.hasPoint(newPoint))
			return false;
		//Kiem tra diem do nam giua 2 diem point 1 va 2
		//B nam giua A va C neu AB+BC=CA
		double ab = this.getPoint1().getDistance(newPoint);
		double bc = this.getPoint2().getDistance(newPoint);
		double ac = this.getPoint1().getDistance(this.getPoint2());
		if (ab+bc==ac)
			return true;
		return false;
	}
}


                     
