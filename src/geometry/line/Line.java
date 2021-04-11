package geometry.line;
import geometry.point.Point;
import geometry.vector.Vector;

//Duong thang duoc tao boi mot vector phap tuyen va 1 diem
public class Line extends Vector {
	private Point a;
	
	//Constructors
	public Line() {
		super();
	}
	
	public Line(double x, double y, double z,Point a) {
		super(x, y, z);
		this.a = a;
	}
	
	public Line(Point a,Point b) {
		super(a,b);
		this.a = a;
	}

	//Getters and Setters
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	//Functions with a line
	
	//With point
	public boolean hasPoint(Point newPoint) {
		//Kiem tra duong thang co chua diem
		//To do
		return getDistance(newPoint)==0 ? true : false;
	}
	public double getDistance(Point newPoint) {
		//Lay khoang cach giua duong thang va mot diem
		//To do
		return 0;
	}
	
	//With vector
	@Override
	public double getAngle(Vector newVector) {
		//Lay goc giua duong thang va mot vector
		return 90-super.getAngle(newVector);
	}
	
	//With line
	public double getAngle(Line newLine) {
		//Lay goc giua 2 duong thang
		return super.getAngle(newLine);
	}
	public double getDistance(Line newlLine) {
		//Lay khoang cach giua 2 duong thang
		//To do
		return 0;
	}
	public Point getIntersection(Line newLine) {
		//Lay giao diem giua duong thang va mot duong thang, tra ve null neu khong co
		//To do
		return null;
		
	}
	
}
