package geometry.vector;

import geometry.point.Point;

public class Vector {
	private double x;
	private double y;
	private double z;
	
	//Constructors
	public Vector() {
	}
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector(Point a,Point b) {
		//To do
		this.x = a.getX()-b.getX();
		this.y = a.getY()-b.getY();
		this.z = a.getZ()-b.getZ();
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
	
	public double getLength() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	//Functions with a vector
	public boolean isZero() {
		if (x==0 && y==0 && z==0) {
			return true;
		}
		return false;
	}
	public double getAngle(Vector newVector) {
		//Lay goc giua 2 vector trong khoang tu 0 den 180
		//To do
		return 0;	
	}
	public double getAngleS(Vector newVector) {
		//Lay goc giua 2 vector trong khoang tu 0 den 90
		double angle = this.getAngle(newVector);
		if(angle>180) angle = 180-angle;
		return angle;
	}
}
