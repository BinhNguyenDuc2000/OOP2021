package geometry.vector;

import geometry.point.Point;

public class Vector {
	private double x;
	private double y;
	private double z;
	
	//Constructors
	public Vector() {
		super();
	}
	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector(Point a,Point b) {
		super();
		//To do
	}
	
	
	//Getter and Setter
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	//Functions with a vector
	public boolean isZero() {
		if (x==0 && y==0 && z==0) {
			return true;
		}
		return false;
	}
	public double getAngle(Vector newVector) {
		//Lay goc giua 2 vector
		//To do
		return 0;	
	}
}
